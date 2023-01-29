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

import com.catppuccin.kotlin.*
import kotlin.test.Test
import kotlin.test.assertEquals

class Surface0PaletteColorTest : PaletteColorTestBase(::Surface0PaletteColor) {

    @Test
    fun mustReturnValidDefinition() {
        assertEquals(surface0, instantiatePaletteColor().definition)
    }

    @Test
    fun mustReturnValidLatteColor() {
        testPaletteColor(
            palette = latte,
            expectedColor = Color(ColorValue.SURFACE0_LATTE_HEX)
        )
    }

    @Test
    fun mustReturnValidFrappeColor() {
        testPaletteColor(
            palette = frappe,
            expectedColor = Color(ColorValue.SURFACE0_FRAPPE_HEX)
        )
    }

    @Test
    fun mustReturnValidMacchiatoColor() {
        testPaletteColor(
            palette = macchiato,
            expectedColor = Color(ColorValue.SURFACE0_MACCHIATO_HEX)
        )
    }

    @Test
    fun mustReturnValidMochaColor() {
        testPaletteColor(
            palette = mocha,
            expectedColor = Color(ColorValue.SURFACE0_MOCHA_HEX)
        )
    }
}
