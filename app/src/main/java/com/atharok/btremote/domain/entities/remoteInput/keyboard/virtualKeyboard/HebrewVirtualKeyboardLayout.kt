package com.atharok.btremote.domain.entities.remoteInput.keyboard.virtualKeyboard

import com.atharok.btremote.common.utils.KEYBOARD_INPUT_NONE
import com.atharok.btremote.common.utils.getKeyboardReport
import com.atharok.btremote.domain.entities.remoteInput.keyboard.KeyboardKey

class HebrewVirtualKeyboardLayout : VirtualKeyboardLayout() {

    protected override val keyboardInputs: Map<Char, ByteArray> by lazy {
        mapOf(
            ' ' to KEYBOARD_KEY_SPACE_BAR,

            ';' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_00.byte),
            '1' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_01.byte),
            '2' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_02.byte),
            '3' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_03.byte),
            '4' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_04.byte),
            '5' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_05.byte),
            '6' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_06.byte),
            '7' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_07.byte),
            '8' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_08.byte),
            '9' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_09.byte),
            '0' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_10.byte),
            '-' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_11.byte),
            '=' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_12.byte),

            '/' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_00.byte),
            '\'' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_01.byte),
            'ק' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_02.byte),
            'ר' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_03.byte),
            'א' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_04.byte),
            'ט' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_05.byte),
            'ו' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_06.byte),
            'ן' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_07.byte),
            'ם' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_08.byte),
            'פ' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_09.byte),
            ']' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_10.byte),
            '[' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_11.byte),

            'ש' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_00.byte),
            'ד' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_01.byte),
            'ג' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_02.byte),
            'כ' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_03.byte),
            'ע' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_04.byte),
            'י' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_05.byte),
            'ח' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_06.byte),
            'ל' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_07.byte),
            'ך' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_08.byte),
            'ף' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_09.byte),
            ',' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_10.byte),
            '\\' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_11.byte),

            //'\\' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_00.byte),
            'ז' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_01.byte),
            'ס' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_02.byte),
            'ב' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_03.byte),
            'ה' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_04.byte),
            'נ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_05.byte),
            'מ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_06.byte),
            'צ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_07.byte),
            'ת' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_08.byte),
            'ץ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_09.byte),
            '.' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_10.byte),

            // ---- Shift ----

            '~' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_00.byte),
            '!' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_01.byte),
            '@' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_02.byte),
            '#' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_03.byte),
            '$' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_04.byte),
            '%' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_05.byte),
            '^' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_06.byte),
            '&' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_07.byte),
            '*' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_08.byte),
            ')' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_09.byte),
            '(' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_10.byte),
            '_' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_11.byte),
            '+' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_12.byte),

            'Q' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_00.byte),
            'W' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_01.byte),
            'E' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_02.byte),
            'R' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_03.byte),
            'T' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_04.byte),
            'Y' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_05.byte),
            'U' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_06.byte),
            'I' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_07.byte),
            'O' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_08.byte),
            'P' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_09.byte),
            '}' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_10.byte),
            '{' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_11.byte),

            'A' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_00.byte),
            'S' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_01.byte),
            'D' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_02.byte),
            'F' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_03.byte),
            'G' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_04.byte),
            'H' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_05.byte),
            'J' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_06.byte),
            'K' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_07.byte),
            'L' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_08.byte),
            ':' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_09.byte),
            '"' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_10.byte),
            '|' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_11.byte),

            'Z' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_01.byte),
            'X' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_02.byte),
            'C' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_03.byte),
            'V' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_04.byte),
            'B' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_05.byte),
            'N' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_06.byte),
            'M' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_07.byte),
            '>' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_08.byte),
            '<' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_09.byte),
            '?' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_10.byte)
        )
    }

    protected override val extraInputs: Map<Char, ByteArray> by lazy {
        mapOf(
            '¹' to (keyboardInputs['1'] ?: KEYBOARD_INPUT_NONE),
            '²' to (keyboardInputs['2'] ?: KEYBOARD_INPUT_NONE),
            '³' to (keyboardInputs['3'] ?: KEYBOARD_INPUT_NONE),
            '₪' to (keyboardInputs['4'] ?: KEYBOARD_INPUT_NONE)
        )
    }
}