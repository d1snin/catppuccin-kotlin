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

import com.catppuccin.kotlin.Palette
import com.catppuccin.kotlin.rosewater
import kotlin.test.Test
import kotlin.test.assertEquals

class PaletteColorFactoryTest {

    private val mockDefinition = rosewater
    private val mockDefinitions = listOf(mockDefinition)

    private val mockPalette = Palette.Latte

    private val expectedPaletteColor = RosewaterPaletteColor(Palette.Latte)
    private val expectedPaletteColors = listOf(expectedPaletteColor)

    @Test
    fun paletteColorOfFunctionMustReturnValidPaletteColor() {
        val actualPaletteColor = paletteColorOf(mockDefinition, mockPalette)

        assertEquals(expectedPaletteColor, actualPaletteColor)
    }

    @Test
    fun paletteColorsOfFunctionMustReturnValidPaletteColors() {
        val actualPaletteColors = paletteColorsOf(mockDefinitions, mockPalette)

        assertEquals(expectedPaletteColors, actualPaletteColors)
    }

    @Test
    fun paletteColorsOfFunctionWithVarargMustReturnValidPaletteColors() {
        val actualPaletteColors = paletteColorsOf(*mockDefinitions.toTypedArray(), palette = mockPalette)

        assertEquals(expectedPaletteColors, actualPaletteColors)
    }

    @Test
    fun ofFunctionMustReturnValidPaletteColor() {
        val actualPaletteColor = mockDefinition of mockPalette

        assertEquals(expectedPaletteColor, actualPaletteColor)
    }

    @Test
    fun ofFunctionMustReturnValidPaletteColors() {
        val actualPaletteColors = mockDefinitions of mockPalette

        assertEquals(expectedPaletteColors, actualPaletteColors)
    }

    @Test
    fun rosewaterPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.rosewater, RosewaterPaletteColor(mockPalette))
    }

    @Test
    fun flamingoPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.flamingo, FlamingoPaletteColor(mockPalette))
    }

    @Test
    fun pinkPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.pink, PinkPaletteColor(mockPalette))
    }

    @Test
    fun mauvePaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.mauve, MauvePaletteColor(mockPalette))
    }

    @Test
    fun redPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.red, RedPaletteColor(mockPalette))
    }

    @Test
    fun maroonPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.maroon, MaroonPaletteColor(mockPalette))
    }

    @Test
    fun peachPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.peach, PeachPaletteColor(mockPalette))
    }

    @Test
    fun yellowPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.yellow, YellowPaletteColor(mockPalette))
    }

    @Test
    fun greenPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.green, GreenPaletteColor(mockPalette))
    }

    @Test
    fun tealPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.teal, TealPaletteColor(mockPalette))
    }

    @Test
    fun skyPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.sky, SkyPaletteColor(mockPalette))
    }

    @Test
    fun sapphirePaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.sapphire, SapphirePaletteColor(mockPalette))
    }

    @Test
    fun bluePaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.blue, BluePaletteColor(mockPalette))
    }

    @Test
    fun lavenderPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.lavender, LavenderPaletteColor(mockPalette))
    }

    @Test
    fun textPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.text, TextPaletteColor(mockPalette))
    }

    @Test
    fun subtext0PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.subtext0, Subtext0PaletteColor(mockPalette))
    }

    @Test
    fun subtext1PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.subtext1, Subtext1PaletteColor(mockPalette))
    }

    @Test
    fun overlay0PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.overlay0, Overlay0PaletteColor(mockPalette))
    }

    @Test
    fun overlay1PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.overlay1, Overlay1PaletteColor(mockPalette))
    }

    @Test
    fun overlay2PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.overlay2, Overlay2PaletteColor(mockPalette))
    }

    @Test
    fun surface0PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.surface0, Surface0PaletteColor(mockPalette))
    }

    @Test
    fun surface1PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.surface1, Surface1PaletteColor(mockPalette))
    }

    @Test
    fun surface2PaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.surface2, Surface2PaletteColor(mockPalette))
    }

    @Test
    fun basePaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.base, BasePaletteColor(mockPalette))
    }

    @Test
    fun mantlePaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.mantle, MantlePaletteColor(mockPalette))
    }

    @Test
    fun crustPaletteExtensionMustReturnValidPaletteColor() {
        assertEquals(mockPalette.crust, CrustPaletteColor(mockPalette))
    }

    @Test
    fun colorsPaletteExtensionMustReturnValidPaletteColors() {
        val colors = mockPalette.colors

        colors.forEach { color ->
            assertEquals(mockPalette, color.palette, "$color doesn't belong to the expected palette: $mockPalette")
        }
    }
}
