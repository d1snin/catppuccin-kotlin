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

package com.catppuccin.kotlin.util

import com.catppuccin.kotlin.Color
import com.catppuccin.kotlin.Palette
import com.catppuccin.kotlin.color.PaletteColor
import com.catppuccin.kotlin.color.RosewaterPaletteColor
import kotlin.test.Test
import kotlin.test.assertEquals

class ColorSelectorTest {

    private val mockColors = listOf(
        Color(0x1),
        Color(0x2),
        Color(0x3),
        Color(0x4)
    )

    private val latteMockColor = mockColors[0]

    private val frappeMockColor = mockColors[1]

    private val macchiatoMockColor = mockColors[2]

    private val mochaMockColor = mockColors[3]

    @Test
    fun mustSelectLatteBasedColor() {
        val paletteColor = RosewaterPaletteColor(Palette.Latte)

        assertEquals(latteMockColor, paletteColor.testWhenPalette())
    }

    @Test
    fun mustSelectFrappeBasedColor() {
        val paletteColor = RosewaterPaletteColor(Palette.Frappe)

        assertEquals(frappeMockColor, paletteColor.testWhenPalette())
    }

    @Test
    fun mustSelectMacchiatoBasedColor() {
        val paletteColor = RosewaterPaletteColor(Palette.Macchiato)

        assertEquals(macchiatoMockColor, paletteColor.testWhenPalette())
    }

    @Test
    fun mustSelectMochaBasedColor() {
        val paletteColor = RosewaterPaletteColor(Palette.Mocha)

        assertEquals(mochaMockColor, paletteColor.testWhenPalette())
    }

    private fun PaletteColor.testWhenPalette() = whenPalette(
        latte = latteMockColor,
        frappe = frappeMockColor,
        macchiato = macchiatoMockColor,
        mocha = mochaMockColor
    )
}
