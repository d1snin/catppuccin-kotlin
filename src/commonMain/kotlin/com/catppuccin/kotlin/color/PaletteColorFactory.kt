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

package com.catppuccin.kotlin.color

import com.catppuccin.kotlin.ColorDefinition
import com.catppuccin.kotlin.ColorDefinitions
import com.catppuccin.kotlin.Palette
import com.catppuccin.kotlin.allColors

public fun paletteColorOf(definition: ColorDefinition, palette: Palette): PaletteColor =
    definition.paletteColorCreator(palette)

public fun paletteColorsOf(definitions: ColorDefinitions, palette: Palette): PaletteColors =
    definitions.map {
        paletteColorOf(it, palette)
    }

public fun paletteColorsOf(vararg definitions: ColorDefinition, palette: Palette): PaletteColors =
    paletteColorsOf(definitions.asIterable(), palette)

public infix fun ColorDefinition.of(palette: Palette): PaletteColor =
    paletteColorOf(this, palette)

public infix fun ColorDefinitions.of(palette: Palette): PaletteColors =
    paletteColorsOf(this, palette)

public val Palette.rosewater: PaletteColor get() = RosewaterPaletteColor(this)

public val Palette.flamingo: PaletteColor get() = FlamingoPaletteColor(this)

public val Palette.pink: PaletteColor get() = PinkPaletteColor(this)

public val Palette.mauve: PaletteColor get() = MauvePaletteColor(this)

public val Palette.red: PaletteColor get() = RedPaletteColor(this)

public val Palette.maroon: PaletteColor get() = MaroonPaletteColor(this)

public val Palette.peach: PaletteColor get() = PeachPaletteColor(this)

public val Palette.yellow: PaletteColor get() = YellowPaletteColor(this)

public val Palette.green: PaletteColor get() = GreenPaletteColor(this)

public val Palette.teal: PaletteColor get() = TealPaletteColor(this)

public val Palette.sky: PaletteColor get() = SkyPaletteColor(this)

public val Palette.sapphire: PaletteColor get() = SapphirePaletteColor(this)

public val Palette.blue: PaletteColor get() = BluePaletteColor(this)

public val Palette.lavender: PaletteColor get() = LavenderPaletteColor(this)

public val Palette.text: PaletteColor get() = TextPaletteColor(this)

public val Palette.subtext0: PaletteColor get() = Subtext0PaletteColor(this)

public val Palette.subtext1: PaletteColor get() = Subtext1PaletteColor(this)

public val Palette.overlay0: PaletteColor get() = Overlay0PaletteColor(this)

public val Palette.overlay1: PaletteColor get() = Overlay1PaletteColor(this)

public val Palette.overlay2: PaletteColor get() = Overlay2PaletteColor(this)

public val Palette.surface0: PaletteColor get() = Surface0PaletteColor(this)

public val Palette.surface1: PaletteColor get() = Surface1PaletteColor(this)

public val Palette.surface2: PaletteColor get() = Surface2PaletteColor(this)

public val Palette.base: PaletteColor get() = BasePaletteColor(this)

public val Palette.mantle: PaletteColor get() = MantlePaletteColor(this)

public val Palette.crust: PaletteColor get() = CrustPaletteColor(this)

public val Palette.colors: PaletteColors get() = paletteColorsOf(allColors, this)
