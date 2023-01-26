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

package com.catppuccin.kotlin

import com.catppuccin.kotlin.color.*

public typealias ColorDefinitions = Iterable<ColorDefinition>

public val rosewater: ColorDefinition = ColorDefinition(ColorValue.ROSEWATER_LABEL, ::RosewaterPaletteColor)

public val flamingo: ColorDefinition = ColorDefinition(ColorValue.FLAMINGO_LABEL, ::FlamingoPaletteColor)

public val pink: ColorDefinition = ColorDefinition(ColorValue.PINK_LABEL, ::PinkPaletteColor)

public val mauve: ColorDefinition = ColorDefinition(ColorValue.MAUVE_LABEL, ::MauvePaletteColor)

public val red: ColorDefinition = ColorDefinition(ColorValue.RED_LABEL, ::RedPaletteColor)

public val maroon: ColorDefinition = ColorDefinition(ColorValue.MAROON_LABEL, ::MaroonPaletteColor)

public val peach: ColorDefinition = ColorDefinition(ColorValue.PEACH_LABEL, ::PeachPaletteColor)

public val yellow: ColorDefinition = ColorDefinition(ColorValue.YELLOW_LABEL, ::YellowPaletteColor)

public val green: ColorDefinition = ColorDefinition(ColorValue.GREEN_LABEL, ::GreenPaletteColor)

public val teal: ColorDefinition = ColorDefinition(ColorValue.TEAL_LABEL, ::TealPaletteColor)

public val sky: ColorDefinition = ColorDefinition(ColorValue.SKY_LABEL, ::SkyPaletteColor)

public val sapphire: ColorDefinition = ColorDefinition(ColorValue.SAPPHIRE_LABEL, ::SapphirePaletteColor)

public val blue: ColorDefinition = ColorDefinition(ColorValue.BLUE_LABEL, ::BluePaletteColor)

public val lavender: ColorDefinition = ColorDefinition(ColorValue.LAVENDER_LABEL, ::LavenderPaletteColor)

public val text: ColorDefinition = ColorDefinition(ColorValue.TEXT_LABEL, ::TextPaletteColor)

public val subtext0: ColorDefinition = ColorDefinition(ColorValue.SUBTEXT0_LABEL, ::Subtext0PaletteColor)

public val subtext1: ColorDefinition = ColorDefinition(ColorValue.SUBTEXT1_LABEL, ::Subtext1PaletteColor)

public val overlay0: ColorDefinition = ColorDefinition(ColorValue.OVERLAY0_LABEL, ::Overlay0PaletteColor)

public val overlay1: ColorDefinition = ColorDefinition(ColorValue.OVERLAY1_LABEL, ::Overlay1PaletteColor)

public val overlay2: ColorDefinition = ColorDefinition(ColorValue.OVERLAY2_LABEL, ::Overlay2PaletteColor)

public val surface0: ColorDefinition = ColorDefinition(ColorValue.SURFACE0_LABEL, ::Surface0PaletteColor)

public val surface1: ColorDefinition = ColorDefinition(ColorValue.SURFACE1_LABEL, ::Surface1PaletteColor)

public val surface2: ColorDefinition = ColorDefinition(ColorValue.SURFACE2_LABEL, ::Surface2PaletteColor)

public val base: ColorDefinition = ColorDefinition(ColorValue.BASE_LABEL, ::BasePaletteColor)

public val mantle: ColorDefinition = ColorDefinition(ColorValue.MANTLE_LABEL, ::MantlePaletteColor)

public val crust: ColorDefinition = ColorDefinition(ColorValue.CRUST_LABEL, ::CrustPaletteColor)

public val allColors: ColorDefinitions = listOf(
    rosewater,
    flamingo,
    pink,
    mauve,
    red,
    maroon,
    peach,
    yellow,
    green,
    teal,
    sky,
    sapphire,
    blue,
    lavender,
    text,
    subtext0,
    subtext1,
    overlay0,
    overlay1,
    overlay2,
    surface0,
    surface1,
    surface2,
    base,
    mantle,
    crust
)

public fun colors(definitions: ColorDefinitions): ColorDefinitions = definitions

public fun colors(vararg definitions: ColorDefinition): ColorDefinitions = definitions.asIterable()
