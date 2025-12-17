package com.atharok.btremote.domain.entities.remoteInput.keyboard.virtualKeyboard

import com.atharok.btremote.common.utils.getKeyboardReport
import com.atharok.btremote.domain.entities.remoteInput.keyboard.KeyboardKey

class PersianVirtualKeyboardLayout : VirtualKeyboardLayout() {

    protected override val keyboardInputs: Map<Char, ByteArray> by lazy {
        mapOf(
            ' ' to KEYBOARD_KEY_SPACE_BAR,

            '÷' to getKeyboardReport(0x00, KeyboardKey.ROW_1_KEY_00.byte),
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

            'ض' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_00.byte),
            'ص' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_01.byte),
            'ث' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_02.byte),
            'ق' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_03.byte),
            'ف' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_04.byte),
            'غ' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_05.byte),
            'ع' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_06.byte),
            'ه' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_07.byte),
            'خ' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_08.byte),
            'ح' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_09.byte),
            'ج' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_10.byte),
            'چ' to getKeyboardReport(0x00, KeyboardKey.ROW_2_KEY_11.byte),

            'ش' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_00.byte),
            'س' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_01.byte),
            'ی' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_02.byte),
            'ب' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_03.byte),
            'ل' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_04.byte),
            'ا' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_05.byte),
            'ت' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_06.byte),
            'ن' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_07.byte),
            'م' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_08.byte),
            'ک' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_09.byte),
            'گ' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_10.byte),
            'پ' to getKeyboardReport(0x00, KeyboardKey.ROW_3_KEY_11.byte),

            'پ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_00.byte),
            'ظ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_01.byte),
            'ط' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_02.byte),
            'ز' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_03.byte),
            'ر' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_04.byte),
            'ذ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_05.byte),
            'د' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_06.byte),
            'ئ' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_07.byte),
            'و' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_08.byte),
            '.' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_09.byte),
            '/' to getKeyboardReport(0x00, KeyboardKey.ROW_4_KEY_10.byte),

            // ---- Shift ----

            '×' to getKeyboardReport(0x02, KeyboardKey.ROW_1_KEY_00.byte),
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

            'ً' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_00.byte),
            'ٌ' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_01.byte),
            'ٍ' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_02.byte),
            '﷼' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_03.byte),
            '،' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_04.byte),
            '؛' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_05.byte),
            ',' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_06.byte),
            ']' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_07.byte),
            '[' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_08.byte),
            '\\' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_09.byte),
            '}' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_10.byte),
            '{' to getKeyboardReport(0x02, KeyboardKey.ROW_2_KEY_11.byte),

            'َ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_00.byte),
            'ُ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_01.byte),
            'ِ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_02.byte),
            'ّ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_03.byte),
            'ۀ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_04.byte),
            'آ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_05.byte),
            'ـ' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_06.byte),
            '«' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_07.byte),
            '»' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_08.byte),
            ':' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_09.byte),
            '"' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_10.byte),
            '|' to getKeyboardReport(0x02, KeyboardKey.ROW_3_KEY_11.byte),

            'ة' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_01.byte),
            'ي' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_02.byte),
            'ژ' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_03.byte),
            'ؤ' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_04.byte),
            'أ' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_05.byte),
            'إ' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_06.byte),
            'ء' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_07.byte),
            '<' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_08.byte),
            '>' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_09.byte),
            '؟' to getKeyboardReport(0x02, KeyboardKey.ROW_4_KEY_10.byte),

            // ---- Alt Gr ----

            '۱' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_01.byte),
            '۲' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_02.byte),
            '۳' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_03.byte),
            '۴' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_04.byte),
            '۵' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_05.byte),
            '۶' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_06.byte),
            '۷' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_07.byte),
            '۸' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_08.byte),
            '۹' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_09.byte),
            '۰' to getKeyboardReport(0x40, KeyboardKey.ROW_1_KEY_10.byte)
        )
    }

    override val extraInputs: Map<Char, ByteArray> = emptyMap()
}