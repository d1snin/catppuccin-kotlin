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

public data class Hex(public val intValue: Int) {

    /**
     * String representation of a hexadecimal color value.
     *
     * Example usage:
     *
     * ```kotlin
     * Hex(0x2d5e4c).formatted // "2d5e4c"
     * ```
     *
     * @see formattedWithHashPrefix
     */
    public val formatted: String = run {
        val stringValue = intValue.toULong().toString(16)

        normalizeStringValue(stringValue)
    }

    /**
     * String representation of a hexadecimal color value with hash symbol as prefix.
     *
     * Example usage:
     *
     * ```kotlin
     * Hex(0x2d5e4c).formattedWithHashPrefix // "#2d5e4c"
     * ```
     *
     * @see formatted
     */
    public val formattedWithHashPrefix: String = "#$formatted"

    // 0x023d4b.toULong().toString(16) returns "34d4b" which is not a valid
    // hexadecimal color value. normalizeStringValue fixes this problem by
    // putting '0' at the start of a string value if it is not already
    // 6 characters long
    private fun normalizeStringValue(value: String) = value.padStart(6, '0')
}
