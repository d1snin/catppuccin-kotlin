<h3 align="center">
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/logos/exports/1544x1544_circle.png" width="100" alt="Logo"/><br/>
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
	Catppuccin for <a href="https://kotl.in">Kotlin/Multiplatform</a>
	<img src="https://raw.githubusercontent.com/catppuccin/catppuccin/main/assets/misc/transparent.png" height="30" width="0px"/>
</h3>

<p align="center">
	<a href="https://github.com/catppuccin/kotlin/stargazers"><img src="https://img.shields.io/github/stars/catppuccin/kotlin?colorA=363a4f&colorB=b7bdf8&style=for-the-badge"></a>
	<a href="https://github.com/catppuccin/kotlin/issues"><img src="https://img.shields.io/github/issues/catppuccin/kotlin?colorA=363a4f&colorB=f5a97f&style=for-the-badge"></a>
	<a href="https://github.com/catppuccin/kotlin/contributors"><img src="https://img.shields.io/github/contributors/catppuccin/kotlin?colorA=363a4f&colorB=a6da95&style=for-the-badge"></a>
  <a href="https://search.maven.org/artifact/com.catppuccin/catppuccin-kotlin"><img src="https://img.shields.io/maven-central/v/com.catppuccin/catppuccin-kotlin?colorA=363a4f&colorB=a6da95&style=for-the-badge"></a>
</p>

## Installation

```gradle
repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.catppuccin/catppuccin-kotlin
    implementation("com.catppuccin:catppuccin-kotlin:1.0.0")
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

## Contributing

If you are looking to contribute, please read through our 
[CONTRIBUTING.md](https://github.com/catppuccin/.github/blob/main/CONTRIBUTING.md) first!

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
The workflows are stored at [.github/workflows](.github/workflows)

## Thanks to

- [Mikhail Titov <me@d1s.dev>](https://github.com/d1snin)

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
