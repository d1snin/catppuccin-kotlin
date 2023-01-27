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
import kotlin.test.Test
import kotlin.test.assertEquals

class ColorDefinitionsTest {

    @Test
    fun rosewaterColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.ROSEWATER_LABEL, ::RosewaterPaletteColor)

        assertEquals(expected, rosewater)
    }

    @Test
    fun flamingoColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.FLAMINGO_LABEL, ::FlamingoPaletteColor)

        assertEquals(expected, flamingo)
    }

    @Test
    fun pinkColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.PINK_LABEL, ::PinkPaletteColor)

        assertEquals(expected, pink)
    }

    @Test
    fun mauveColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.MAUVE_LABEL, ::MauvePaletteColor)

        assertEquals(expected, mauve)
    }

    @Test
    fun redColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.RED_LABEL, ::RedPaletteColor)

        assertEquals(expected, red)
    }

    @Test
    fun maroonColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.MAROON_LABEL, ::MaroonPaletteColor)

        assertEquals(expected, maroon)
    }

    @Test
    fun peachColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.PEACH_LABEL, ::PeachPaletteColor)

        assertEquals(expected, peach)
    }

    @Test
    fun yellowColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.YELLOW_LABEL, ::YellowPaletteColor)

        assertEquals(expected, yellow)
    }

    @Test
    fun greenColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.GREEN_LABEL, ::GreenPaletteColor)

        assertEquals(expected, green)
    }

    @Test
    fun tealColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.TEAL_LABEL, ::TealPaletteColor)

        assertEquals(expected, teal)
    }

    @Test
    fun skyColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SKY_LABEL, ::SkyPaletteColor)

        assertEquals(expected, sky)
    }

    @Test
    fun sapphireColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SAPPHIRE_LABEL, ::SapphirePaletteColor)

        assertEquals(expected, sapphire)
    }

    @Test
    fun blueColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.BLUE_LABEL, ::BluePaletteColor)

        assertEquals(expected, blue)
    }

    @Test
    fun lavenderColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.LAVENDER_LABEL, ::LavenderPaletteColor)

        assertEquals(expected, lavender)
    }

    @Test
    fun textColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.TEXT_LABEL, ::TextPaletteColor)

        assertEquals(expected, text)
    }

    @Test
    fun subtext0ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SUBTEXT0_LABEL, ::Subtext0PaletteColor)

        assertEquals(expected, subtext0)
    }

    @Test
    fun subtext1ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SUBTEXT1_LABEL, ::Subtext1PaletteColor)

        assertEquals(expected, subtext1)
    }

    @Test
    fun overlay0ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.OVERLAY0_LABEL, ::Overlay0PaletteColor)

        assertEquals(expected, overlay0)
    }

    @Test
    fun overlay1ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.OVERLAY1_LABEL, ::Overlay1PaletteColor)

        assertEquals(expected, overlay1)
    }

    @Test
    fun overlay2ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.OVERLAY2_LABEL, ::Overlay2PaletteColor)

        assertEquals(expected, overlay2)
    }

    @Test
    fun surface0ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SURFACE0_LABEL, ::Surface0PaletteColor)

        assertEquals(expected, surface0)
    }

    @Test
    fun surface1ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SURFACE1_LABEL, ::Surface1PaletteColor)

        assertEquals(expected, surface1)
    }

    @Test
    fun surface2ColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.SURFACE2_LABEL, ::Surface2PaletteColor)

        assertEquals(expected, surface2)
    }

    @Test
    fun baseColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.BASE_LABEL, ::BasePaletteColor)

        assertEquals(expected, base)
    }

    @Test
    fun mantleColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.MANTLE_LABEL, ::MantlePaletteColor)

        assertEquals(expected, mantle)
    }

    @Test
    fun crustColorDefinitionMustBeValid() {
        val expected = ColorDefinition(ColorValue.CRUST_LABEL, ::CrustPaletteColor)

        assertEquals(expected, crust)
    }

    @Test
    fun colorDefinitionListMustBeValid() {
        val expected = listOf(
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

        assertEquals(expected, allColors)
    }
}
