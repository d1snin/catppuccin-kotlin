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

import kotlin.test.Test
import kotlin.test.assertEquals

class ColorValueTest {

    @Test
    fun rosewaterColorValuesMustBeValid() {
        assertEquals("Rosewater", ColorValue.ROSEWATER_LABEL, "Rosewater color label")
        assertEquals(0xdc8a78, ColorValue.ROSEWATER_LATTE_HEX, "Rosewater color. Palette: Latte")
        assertEquals(0xf2d5cf, ColorValue.ROSEWATER_FRAPPE_HEX, "Rosewater color. Palette: Frappe")
        assertEquals(0xf4dbd6, ColorValue.ROSEWATER_MACCHIATO_HEX, "Rosewater color. Palette: Macchiato")
        assertEquals(0xf5e0dc, ColorValue.ROSEWATER_MOCHA_HEX, "Rosewater color. Palette: Mocha")
    }

    @Test
    fun flamingoColorValuesMustBeValid() {
        assertEquals("Flamingo", ColorValue.FLAMINGO_LABEL, "Flamingo color label")
        assertEquals(0xdd7878, ColorValue.FLAMINGO_LATTE_HEX, "Flamingo color. Palette: Latte")
        assertEquals(0xeebebe, ColorValue.FLAMINGO_FRAPPE_HEX, "Flamingo color. Palette: Frappe")
        assertEquals(0xf0c6c6, ColorValue.FLAMINGO_MACCHIATO_HEX, "Flamingo color. Palette: Macchiato")
        assertEquals(0xf2cdcd, ColorValue.FLAMINGO_MOCHA_HEX, "Flamingo color. Palette: Mocha")
    }

    @Test
    fun pinkColorValuesMustBeValid() {
        assertEquals("Pink", ColorValue.PINK_LABEL, "Pink color label")
        assertEquals(0xea76cb, ColorValue.PINK_LATTE_HEX, "Pink color. Palette: Latte")
        assertEquals(0xf4b8e4, ColorValue.PINK_FRAPPE_HEX, "Pink color. Palette: Frappe")
        assertEquals(0xf5bde6, ColorValue.PINK_MACCHIATO_HEX, "Pink color. Palette: Macchiato")
        assertEquals(0xf5c2e7, ColorValue.PINK_MOCHA_HEX, "Pink color. Palette: Mocha")
    }

    @Test
    fun mauveColorValuesMustBeValid() {
        assertEquals("Mauve", ColorValue.MAUVE_LABEL, "Mauve color label")
        assertEquals(0x8839ef, ColorValue.MAUVE_LATTE_HEX, "Mauve color. Palette: Latte")
        assertEquals(0xca9ee6, ColorValue.MAUVE_FRAPPE_HEX, "Mauve color. Palette: Frappe")
        assertEquals(0xc6a0f6, ColorValue.MAUVE_MACCHIATO_HEX, "Mauve color. Palette: Macchiato")
        assertEquals(0xcba6f7, ColorValue.MAUVE_MOCHA_HEX, "Mauve color. Palette: Mocha")
    }

    @Test
    fun redColorValuesMustBeValid() {
        assertEquals("Red", ColorValue.RED_LABEL, "Red color label")
        assertEquals(0xd20f39, ColorValue.RED_LATTE_HEX, "Red color. Palette: Latte")
        assertEquals(0xe78284, ColorValue.RED_FRAPPE_HEX, "Red color. Palette: Frappe")
        assertEquals(0xed8796, ColorValue.RED_MACCHIATO_HEX, "Red color. Palette: Macchiato")
        assertEquals(0xf38ba8, ColorValue.RED_MOCHA_HEX, "Red color. Palette: Mocha")
    }

    @Test
    fun maroonColorValuesMustBeValid() {
        assertEquals("Maroon", ColorValue.MAROON_LABEL, "Maroon color label")
        assertEquals(0xe64553, ColorValue.MAROON_LATTE_HEX, "Maroon color. Palette: Latte")
        assertEquals(0xea999c, ColorValue.MAROON_FRAPPE_HEX, "Maroon color. Palette: Frappe")
        assertEquals(0xee99a0, ColorValue.MAROON_MACCHIATO_HEX, "Maroon color. Palette: Macchiato")
        assertEquals(0xeba0ac, ColorValue.MAROON_MOCHA_HEX, "Maroon color. Palette: Mocha")
    }

    @Test
    fun peachColorValuesMustBeValid() {
        assertEquals("Peach", ColorValue.PEACH_LABEL, "Peach color label")
        assertEquals(0xfe640b, ColorValue.PEACH_LATTE_HEX, "Peach color. Palette: Latte")
        assertEquals(0xef9f76, ColorValue.PEACH_FRAPPE_HEX, "Peach color. Palette: Frappe")
        assertEquals(0xf5a97f, ColorValue.PEACH_MACCHIATO_HEX, "Peach color. Palette: Macchiato")
        assertEquals(0xfab387, ColorValue.PEACH_MOCHA_HEX, "Peach color. Palette: Mocha")
    }

    @Test
    fun yellowColorValuesMustBeValid() {
        assertEquals("Yellow", ColorValue.YELLOW_LABEL, "Yellow color label")
        assertEquals(0xdf8e1d, ColorValue.YELLOW_LATTE_HEX, "Yellow color. Palette: Latte")
        assertEquals(0xe5c890, ColorValue.YELLOW_FRAPPE_HEX, "Yellow color. Palette: Frappe")
        assertEquals(0xeed49f, ColorValue.YELLOW_MACCHIATO_HEX, "Yellow color. Palette: Macchiato")
        assertEquals(0xf9e2af, ColorValue.YELLOW_MOCHA_HEX, "Yellow color. Palette: Mocha")
    }

    @Test
    fun greenColorValuesMustBeValid() {
        assertEquals("Green", ColorValue.GREEN_LABEL, "Green color label")
        assertEquals(0x40a02b, ColorValue.GREEN_LATTE_HEX, "Green color. Palette: Latte")
        assertEquals(0xa6d189, ColorValue.GREEN_FRAPPE_HEX, "Green color. Palette: Frappe")
        assertEquals(0xa6da95, ColorValue.GREEN_MACCHIATO_HEX, "Green color. Palette: Macchiato")
        assertEquals(0xa6e3a1, ColorValue.GREEN_MOCHA_HEX, "Green color. Palette: Mocha")
    }

    @Test
    fun tealColorValuesMustBeValid() {
        assertEquals("Teal", ColorValue.TEAL_LABEL, "Teal color label")
        assertEquals(0x179299, ColorValue.TEAL_LATTE_HEX, "Teal color. Palette: Latte")
        assertEquals(0x81c8be, ColorValue.TEAL_FRAPPE_HEX, "Teal color. Palette: Frappe")
        assertEquals(0x8bd5ca, ColorValue.TEAL_MACCHIATO_HEX, "Teal color. Palette: Macchiato")
        assertEquals(0x94e2d5, ColorValue.TEAL_MOCHA_HEX, "Teal color. Palette: Mocha")
    }

    @Test
    fun skyColorValuesMustBeValid() {
        assertEquals("Sky", ColorValue.SKY_LABEL, "Sky color label")
        assertEquals(0x04a5e5, ColorValue.SKY_LATTE_HEX, "Sky color. Palette: Latte")
        assertEquals(0x99d1db, ColorValue.SKY_FRAPPE_HEX, "Sky color. Palette: Frappe")
        assertEquals(0x91d7e3, ColorValue.SKY_MACCHIATO_HEX, "Sky color. Palette: Macchiato")
        assertEquals(0x89dceb, ColorValue.SKY_MOCHA_HEX, "Sky color. Palette: Mocha")
    }

    @Test
    fun sapphireColorValuesMustBeValid() {
        assertEquals("Sapphire", ColorValue.SAPPHIRE_LABEL, "Sapphire color label")
        assertEquals(0x209fb5, ColorValue.SAPPHIRE_LATTE_HEX, "Sapphire color. Palette: Latte")
        assertEquals(0x85c1dc, ColorValue.SAPPHIRE_FRAPPE_HEX, "Sapphire color. Palette: Frappe")
        assertEquals(0x7dc4e4, ColorValue.SAPPHIRE_MACCHIATO_HEX, "Sapphire color. Palette: Macchiato")
        assertEquals(0x74c7ec, ColorValue.SAPPHIRE_MOCHA_HEX, "Sapphire color. Palette: Mocha")
    }

    @Test
    fun blueColorValuesMustBeValid() {
        assertEquals("Blue", ColorValue.BLUE_LABEL, "Blue color label")
        assertEquals(0x1e66f5, ColorValue.BLUE_LATTE_HEX, "Blue color. Palette: Latte")
        assertEquals(0x8caaee, ColorValue.BLUE_FRAPPE_HEX, "Blue color. Palette: Frappe")
        assertEquals(0x8aadf4, ColorValue.BLUE_MACCHIATO_HEX, "Blue color. Palette: Macchiato")
        assertEquals(0x89b4fa, ColorValue.BLUE_MOCHA_HEX, "Blue color. Palette: Mocha")
    }

    @Test
    fun lavenderColorValuesMustBeValid() {
        assertEquals("Lavender", ColorValue.LAVENDER_LABEL, "Lavender color label")
        assertEquals(0x7287fd, ColorValue.LAVENDER_LATTE_HEX, "Lavender color. Palette: Latte")
        assertEquals(0xbabbf1, ColorValue.LAVENDER_FRAPPE_HEX, "Lavender color. Palette: Frappe")
        assertEquals(0xb7bdf8, ColorValue.LAVENDER_MACCHIATO_HEX, "Lavender color. Palette: Macchiato")
        assertEquals(0xb4befe, ColorValue.LAVENDER_MOCHA_HEX, "Lavender color. Palette: Mocha")
    }

    @Test
    fun textColorValuesMustBeValid() {
        assertEquals("Text", ColorValue.TEXT_LABEL, "Text color label")
        assertEquals(0x4c4f69, ColorValue.TEXT_LATTE_HEX, "Text color. Palette: Latte")
        assertEquals(0xc6d0f5, ColorValue.TEXT_FRAPPE_HEX, "Text color. Palette: Frappe")
        assertEquals(0xcad3f5, ColorValue.TEXT_MACCHIATO_HEX, "Text color. Palette: Macchiato")
        assertEquals(0xcdd6f4, ColorValue.TEXT_MOCHA_HEX, "Text color. Palette: Mocha")
    }

    @Test
    fun subtext0ColorValuesMustBeValid() {
        assertEquals("Subtext0", ColorValue.SUBTEXT0_LABEL, "Subtext0 color label")
        assertEquals(0x6c6f85, ColorValue.SUBTEXT0_LATTE_HEX, "Subtext0 color. Palette: Latte")
        assertEquals(0xa5adce, ColorValue.SUBTEXT0_FRAPPE_HEX, "Subtext0 color. Palette: Frappe")
        assertEquals(0xa5adcb, ColorValue.SUBTEXT0_MACCHIATO_HEX, "Subtext0 color. Palette: Macchiato")
        assertEquals(0xa6adc8, ColorValue.SUBTEXT0_MOCHA_HEX, "Subtext0 color. Palette: Mocha")
    }

    @Test
    fun subtext1ColorValuesMustBeValid() {
        assertEquals("Subtext1", ColorValue.SUBTEXT1_LABEL, "Subtext1 color label")
        assertEquals(0x5c5f77, ColorValue.SUBTEXT1_LATTE_HEX, "Subtext1 color. Palette: Latte")
        assertEquals(0xb5bfe2, ColorValue.SUBTEXT1_FRAPPE_HEX, "Subtext1 color. Palette: Frappe")
        assertEquals(0xb8c0e0, ColorValue.SUBTEXT1_MACCHIATO_HEX, "Subtext1 color. Palette: Macchiato")
        assertEquals(0xbac2de, ColorValue.SUBTEXT1_MOCHA_HEX, "Subtext1 color. Palette: Mocha")
    }

    @Test
    fun overlay0ColorValuesMustBeValid() {
        assertEquals("Overlay0", ColorValue.OVERLAY0_LABEL, "Overlay0 color label")
        assertEquals(0x9ca0b0, ColorValue.OVERLAY0_LATTE_HEX, "Overlay0 color. Palette: Latte")
        assertEquals(0x737994, ColorValue.OVERLAY0_FRAPPE_HEX, "Overlay0 color. Palette: Frappe")
        assertEquals(0x6e738d, ColorValue.OVERLAY0_MACCHIATO_HEX, "Overlay0 color. Palette: Macchiato")
        assertEquals(0x6c7086, ColorValue.OVERLAY0_MOCHA_HEX, "Overlay0 color. Palette: Mocha")
    }

    @Test
    fun overlay1ColorValuesMustBeValid() {
        assertEquals("Overlay1", ColorValue.OVERLAY1_LABEL, "Overlay1 color label")
        assertEquals(0x8c8fa1, ColorValue.OVERLAY1_LATTE_HEX, "Overlay1 color. Palette: Latte")
        assertEquals(0x838ba7, ColorValue.OVERLAY1_FRAPPE_HEX, "Overlay1 color. Palette: Frappe")
        assertEquals(0x8087a2, ColorValue.OVERLAY1_MACCHIATO_HEX, "Overlay1 color. Palette: Macchiato")
        assertEquals(0x7f849c, ColorValue.OVERLAY1_MOCHA_HEX, "Overlay1 color. Palette: Mocha")
    }

    @Test
    fun overlay2ColorValuesMustBeValid() {
        assertEquals("Overlay2", ColorValue.OVERLAY2_LABEL, "Overlay2 color label")
        assertEquals(0x7c7f93, ColorValue.OVERLAY2_LATTE_HEX, "Overlay2 color. Palette: Latte")
        assertEquals(0x949cbb, ColorValue.OVERLAY2_FRAPPE_HEX, "Overlay2 color. Palette: Frappe")
        assertEquals(0x939ab7, ColorValue.OVERLAY2_MACCHIATO_HEX, "Overlay2 color. Palette: Macchiato")
        assertEquals(0x9399b2, ColorValue.OVERLAY2_MOCHA_HEX, "Overlay2 color. Palette: Mocha")
    }

    @Test
    fun surface0ColorValuesMustBeValid() {
        assertEquals("Surface0", ColorValue.SURFACE0_LABEL, "Surface0 color label")
        assertEquals(0xccd0da, ColorValue.SURFACE0_LATTE_HEX, "Surface0 color. Palette: Latte")
        assertEquals(0x414559, ColorValue.SURFACE0_FRAPPE_HEX, "Surface0 color. Palette: Frappe")
        assertEquals(0x363a4f, ColorValue.SURFACE0_MACCHIATO_HEX, "Surface0 color. Palette: Macchiato")
        assertEquals(0x313244, ColorValue.SURFACE0_MOCHA_HEX, "Surface0 color. Palette: Mocha")
    }

    @Test
    fun surface1ColorValuesMustBeValid() {
        assertEquals("Surface1", ColorValue.SURFACE1_LABEL, "Surface1 color label")
        assertEquals(0xbcc0cc, ColorValue.SURFACE1_LATTE_HEX, "Surface1 color. Palette: Latte")
        assertEquals(0x51576d, ColorValue.SURFACE1_FRAPPE_HEX, "Surface1 color. Palette: Frappe")
        assertEquals(0x494d64, ColorValue.SURFACE1_MACCHIATO_HEX, "Surface1 color. Palette: Macchiato")
        assertEquals(0x45475a, ColorValue.SURFACE1_MOCHA_HEX, "Surface1 color. Palette: Mocha")
    }

    @Test
    fun surface2ColorValuesMustBeValid() {
        assertEquals("Surface2", ColorValue.SURFACE2_LABEL, "Surface2 color label")
        assertEquals(0xacb0be, ColorValue.SURFACE2_LATTE_HEX, "Surface2 color. Palette: Latte")
        assertEquals(0x626880, ColorValue.SURFACE2_FRAPPE_HEX, "Surface2 color. Palette: Frappe")
        assertEquals(0x5b6078, ColorValue.SURFACE2_MACCHIATO_HEX, "Surface2 color. Palette: Macchiato")
        assertEquals(0x585b70, ColorValue.SURFACE2_MOCHA_HEX, "Surface2 color. Palette: Mocha")
    }

    @Test
    fun baseColorValuesMustBeValid() {
        assertEquals("Base", ColorValue.BASE_LABEL, "Base color label")
        assertEquals(0xeff1f5, ColorValue.BASE_LATTE_HEX, "Base color. Palette: Latte")
        assertEquals(0x303446, ColorValue.BASE_FRAPPE_HEX, "Base color. Palette: Frappe")
        assertEquals(0x24273a, ColorValue.BASE_MACCHIATO_HEX, "Base color. Palette: Macchiato")
        assertEquals(0x1e1e2e, ColorValue.BASE_MOCHA_HEX, "Base color. Palette: Mocha")
    }

    @Test
    fun mantleColorValuesMustBeValid() {
        assertEquals("Mantle", ColorValue.MANTLE_LABEL, "Mantle color label")
        assertEquals(0xe6e9ef, ColorValue.MANTLE_LATTE_HEX, "Mantle color. Palette: Latte")
        assertEquals(0x292c3c, ColorValue.MANTLE_FRAPPE_HEX, "Mantle color. Palette: Frappe")
        assertEquals(0x1e2030, ColorValue.MANTLE_MACCHIATO_HEX, "Mantle color. Palette: Macchiato")
        assertEquals(0x181825, ColorValue.MANTLE_MOCHA_HEX, "Mantle color. Palette: Mocha")
    }

    @Test
    fun crustColorValuesMustBeValid() {
        assertEquals("Crust", ColorValue.CRUST_LABEL, "Crust color label")
        assertEquals(0xdce0e8, ColorValue.CRUST_LATTE_HEX, "Crust color. Palette: Latte")
        assertEquals(0x232634, ColorValue.CRUST_FRAPPE_HEX, "Crust color. Palette: Frappe")
        assertEquals(0x181926, ColorValue.CRUST_MACCHIATO_HEX, "Crust color. Palette: Macchiato")
        assertEquals(0x11111b, ColorValue.CRUST_MOCHA_HEX, "Crust color. Palette: Mocha")
    }
}
