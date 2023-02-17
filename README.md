<h3 align="center">
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/logos/exports/1544x1544_circle.png" width="100" alt="Logo"/><br/>
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
	Catppuccin for <a href="https://kotl.in">Kotlin/Multiplatform</a>
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
</h3>

<p align="center">
	<a href="https://github.com/d1snin/catppuccin-kotlin/stargazers"><img src="https://img.shields.io/github/stars/d1snin/catppuccin-kotlin?colorA=363a4f&colorB=b7bdf8&style=for-the-badge"></a>
	<a href="https://github.com/d1snin/catppuccin-kotlin/issues"><img src="https://img.shields.io/github/issues/d1snin/catppuccin-kotlin?colorA=363a4f&colorB=f5a97f&style=for-the-badge"></a>
	<a href="https://github.com/d1snin/catppuccin-kotlin/contributors"><img src="https://img.shields.io/github/contributors/d1snin/catppuccin-kotlin?colorA=363a4f&colorB=a6da95&style=for-the-badge"></a>
  <br>
  <br>
  <a href="https://github.com/d1snin/catppuccin-kotlin"><img src="https://maven.d1s.dev/api/badge/latest/releases/com/catppuccin/catppuccin-kotlin?color=40c14a&name=maven.d1s.dev&prefix=v"></a>
</p>

## Installation

```gradle
repositories {
    maven(url = "https://maven.d1s.dev/releases")
}

dependencies {
    val catppuccinKotlinVersion: String by project

    implementation("com.catppuccin:catppuccin-kotlin:$catppuccinKotlinVersion")
}
```

## Example usage

```kotlin
import com.catppuccin.kotlin.*
import com.catppuccin.kotlin.color.*

// Get yellow color of palette Mocha
YellowPaletteColor(Palette.Mocha)
// or
paletteColorOf(yellow, mocha)
// or
yellow of mocha
// or
mocha.yellow

// Get yellow and rosewater colors of palette Latte
paletteColorsOf(yellow, rosewater, palette = latte)
// or
colors(yellow, rosewater) of latte

// Get all supported colors
allColors

// Get all palettes
allPalettes

// Get all colors of all palettes (basically every single color supported by Catppuccin)
allPaletteColors
```

## What targets are currently supported?
Currently supported targets are JVM and JS. Native targets are coming soon! Let me know if you miss the support of them.

## Contributing

If you are looking to contribute, please read through our
[CONTRIBUTING.md][contribution_guide] first!

### Development

The project can be built using the following command:

```shell
./gradlew build
```

If you want to publish to your local Maven repository:

```shell
./gradlew publishToMavenLocal
```

To run tests:

```shell
./gradlew test
```

## CI/CD

This project has a GitHub actions workflow to automatically build binaries and deploy to Maven Central repository.
The workflows are stored at [.github/workflows][workflows]

## Thanks to

- [Mikhail Titov][d1snin]

&nbsp;

<p align="center">
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/footers/gray0_ctp_on_line.svg?sanitize=true" />
</p>

<p align="center">
	Copyright &copy; 2021-present <a href="https://github.com/catppuccin" target="_blank">Catppuccin Org</a>
</p>

<p align="center">
	<a href="https://github.com/catppuccin/catppuccin/blob/main/LICENSE"><img src="https://img.shields.io/static/v1.svg?style=for-the-badge&label=License&message=MIT&logoColor=d9e0ee&colorA=363a4f&colorB=b7bdf8"/></a>
</p>

[contribution_guide]: https://github.com/d1snin/ktor-ws-events/blob/main/CONTRIBUTING.md
[workflows]: https://github.com/d1snin/ktor-ws-events/blob/main/.github/workflows
[d1snin]: https://github.com/d1snin
