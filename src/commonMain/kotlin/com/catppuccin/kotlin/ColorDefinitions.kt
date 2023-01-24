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

public val rosewater: ColorDefinition = ColorDefinition(ColorValues.ROSEWATER_LABEL, ::RosewaterPaletteColor)

public val flamingo: ColorDefinition = ColorDefinition(ColorValues.FLAMINGO_LABEL, ::FlamingoPaletteColor)

public val pink: ColorDefinition = ColorDefinition(ColorValues.PINK_LABEL, ::PinkPaletteColor)

public val mauve: ColorDefinition = ColorDefinition(ColorValues.MAUVE_LABEL, ::MauvePaletteColor)

public val red: ColorDefinition = ColorDefinition(ColorValues.RED_LABEL, ::RedPaletteColor)

public val maroon: ColorDefinition = ColorDefinition(ColorValues.MAROON_LABEL, ::MaroonPaletteColor)

public val peach: ColorDefinition = ColorDefinition(ColorValues.PEACH_LABEL, ::PeachPaletteColor)

public val yellow: ColorDefinition = ColorDefinition(ColorValues.YELLOW_LABEL, ::YellowPaletteColor)

public val green: ColorDefinition = ColorDefinition(ColorValues.GREEN_LABEL, ::GreenPaletteColor)

public val teal: ColorDefinition = ColorDefinition(ColorValues.TEAL_LABEL, ::TealPaletteColor)

public val sky: ColorDefinition = ColorDefinition(ColorValues.SKY_LABEL, ::SkyPaletteColor)

public val sapphire: ColorDefinition = ColorDefinition(ColorValues.SAPPHIRE_LABEL, ::SapphirePaletteColor)

public val blue: ColorDefinition = ColorDefinition(ColorValues.BLUE_LABEL, ::BluePaletteColor)

public val lavender: ColorDefinition = ColorDefinition(ColorValues.LAVENDER_LABEL, ::LavenderPaletteColor)

public val text: ColorDefinition = ColorDefinition(ColorValues.TEXT_LABEL, ::TextPaletteColor)

public val subtext0: ColorDefinition = ColorDefinition(ColorValues.SUBTEXT0_LABEL, ::Subtext0PaletteColor)

public val subtext1: ColorDefinition = ColorDefinition(ColorValues.SUBTEXT1_LABEL, ::Subtext1PaletteColor)

public val overlay0: ColorDefinition = ColorDefinition(ColorValues.OVERLAY0_LABEL, ::Overlay0PaletteColor)

public val overlay1: ColorDefinition = ColorDefinition(ColorValues.OVERLAY1_LABEL, ::Overlay1PaletteColor)

public val overlay2: ColorDefinition = ColorDefinition(ColorValues.OVERLAY2_LABEL, ::Overlay2PaletteColor)

public val surface0: ColorDefinition = ColorDefinition(ColorValues.SURFACE0_LABEL, ::Surface0PaletteColor)

public val surface1: ColorDefinition = ColorDefinition(ColorValues.SURFACE1_LABEL, ::Surface1PaletteColor)

public val surface2: ColorDefinition = ColorDefinition(ColorValues.SURFACE2_LABEL, ::Surface2PaletteColor)

public val base: ColorDefinition = ColorDefinition(ColorValues.BASE_LABEL, ::BasePaletteColor)

public val mantle: ColorDefinition = ColorDefinition(ColorValues.MANTLE_LABEL, ::MantlePaletteColor)

public val crust: ColorDefinition = ColorDefinition(ColorValues.CRUST_LABEL, ::CrustPaletteColor)

public val allColors: List<ColorDefinition> = listOf(
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
