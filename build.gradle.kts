/*
 * Copyright (c) 2021 Catppuccin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
    id("org.jetbrains.kotlinx.kover")
    id("com.github.ben-manes.versions")
    id("io.deepmedia.tools.deployer")
}

buildscript {
    dependencies {
        val dokkaVersion: String by project

        classpath("org.jetbrains.dokka:dokka-base:$dokkaVersion")
    }
}

val ciBuild = System.getenv("CATPPUCCIN_CI_BUILD").toBoolean()

val projectGroup: String by project
val projectVersion: String by project

group = projectGroup
version = projectVersion

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = JavaVersion.VERSION_17.majorVersion
        }

        withJava()
    }

    js {
        browser {
            testTask {
                useKarma {
                    useFirefox()
                }
            }
        }

        nodejs()
    }

    sourceSets {
        val commonMain by getting

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val jvmMain by getting

        val jsMain by getting
    }

    explicitApi()
}

tasks.withType<DokkaTask>().configureEach {
    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        footerMessage = "Copyright (c) 2021 Catppuccin"
    }
}

deployer {
    defaultSpec {
        projectInfo {
            name.set("Catppuccin for Kotlin")
            description.set("Catppuccin color palette support for Kotlin/Multiplatform.")

            url.set("https://github.com/catppuccin/kotlin")

            license(apache2)

            developer("d1snin", "me@d1s.dev")
        }
    }

    if (ciBuild) {
        sonatypeSpec {
            auth {
                val userSecret = secret("OSSRH_USERNAME")
                val passwordSecret = secret("OSSRH_PASSWORD")

                user.set(userSecret)
                password.set(passwordSecret)
            }

            signing {
                val keySecret = secret("MAVEN_GPG_PRIVATE_KEY")
                val passwordSecret = secret("MAVEN_GPG_PASSPHRASE")

                key.set(keySecret)
                password.set(passwordSecret)
            }
        }
    }
}
