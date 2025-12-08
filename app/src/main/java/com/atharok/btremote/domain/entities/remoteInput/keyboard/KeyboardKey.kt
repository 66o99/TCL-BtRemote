package com.atharok.btremote.domain.entities.remoteInput.keyboard

enum class KeyboardKey(val byte: Byte) {
    ROW_1_KEY_00(0x35.toByte()), // `
    ROW_1_KEY_01(0x1E.toByte()), // 1
    ROW_1_KEY_02(0x1F.toByte()), // 2
    ROW_1_KEY_03(0x20.toByte()), // 3
    ROW_1_KEY_04(0x21.toByte()), // 4
    ROW_1_KEY_05(0x22.toByte()), // 5
    ROW_1_KEY_06(0x23.toByte()), // 6
    ROW_1_KEY_07(0x24.toByte()), // 7
    ROW_1_KEY_08(0x25.toByte()), // 8
    ROW_1_KEY_09(0x26.toByte()), // 9
    ROW_1_KEY_10(0x27.toByte()), // 0
    ROW_1_KEY_11(0x2D.toByte()), // -
    ROW_1_KEY_12(0x2E.toByte()), // =

    ROW_2_KEY_00(0x14.toByte()), // q
    ROW_2_KEY_01(0x1A.toByte()), // w
    ROW_2_KEY_02(0x08.toByte()), // e
    ROW_2_KEY_03(0x15.toByte()), // r
    ROW_2_KEY_04(0x17.toByte()), // t
    ROW_2_KEY_05(0x1C.toByte()), // y
    ROW_2_KEY_06(0x18.toByte()), // u
    ROW_2_KEY_07(0x0C.toByte()), // i
    ROW_2_KEY_08(0x12.toByte()), // o
    ROW_2_KEY_09(0x13.toByte()), // p
    ROW_2_KEY_10(0x2F.toByte()), // [
    ROW_2_KEY_11(0x30.toByte()), // ]

    ROW_3_KEY_00(0x04.toByte()), // a
    ROW_3_KEY_01(0x16.toByte()), // s
    ROW_3_KEY_02(0x07.toByte()), // d
    ROW_3_KEY_03(0x09.toByte()), // f
    ROW_3_KEY_04(0x0A.toByte()), // g
    ROW_3_KEY_05(0x0B.toByte()), // h
    ROW_3_KEY_06(0x0D.toByte()), // j
    ROW_3_KEY_07(0x0E.toByte()), // k
    ROW_3_KEY_08(0x0F.toByte()), // l
    ROW_3_KEY_09(0x33.toByte()), // ;
    ROW_3_KEY_10(0x34.toByte()), // '
    ROW_3_KEY_11(0x31.toByte()), // \

    ROW_4_KEY_00(0x64.toByte()), // <
    ROW_4_KEY_01(0x1D.toByte()), // z
    ROW_4_KEY_02(0x1B.toByte()), // x
    ROW_4_KEY_03(0x06.toByte()), // c
    ROW_4_KEY_04(0x19.toByte()), // v
    ROW_4_KEY_05(0x05.toByte()), // b
    ROW_4_KEY_06(0x11.toByte()), // n
    ROW_4_KEY_07(0x10.toByte()), // m
    ROW_4_KEY_08(0x36.toByte()), // ,
    ROW_4_KEY_09(0x37.toByte()), // .
    ROW_4_KEY_10(0x38.toByte()), // /

    KEY_F1(0x3A.toByte()),
    KEY_F2(0x3B.toByte()),
    KEY_F3(0x3C.toByte()),
    KEY_F4(0x3D.toByte()),
    KEY_F5(0x3E.toByte()),
    KEY_F6(0x3F.toByte()),
    KEY_F7(0x40.toByte()),
    KEY_F8(0x41.toByte()),
    KEY_F9(0x42.toByte()),
    KEY_F10(0x43.toByte()),
    KEY_F11(0x44.toByte()),
    KEY_F12(0x45.toByte()),
    KEY_PRINT_SCREEN(0x46.toByte()),
    KEY_ENTER(0x28.toByte()),
    KEY_ESCAPE(0x29.toByte()),
    KEY_BACKSPACE(0x2A.toByte()),
    KEY_TAB(0x2B.toByte()),
    KEY_CAPSLOCK(0x39.toByte()),
    KEY_SPACE_BAR(0x2C.toByte()),
    KEY_RIGHT_ARROW(0x4F.toByte()),
    KEY_LEFT_ARROW(0x50.toByte()),
    KEY_DOWN_ARROW(0x51.toByte()),
    KEY_UP_ARROW(0x52.toByte()),
    KEY_INSERT(0x49.toByte()),
    KEY_HOME(0x4A.toByte()),
    KEY_PAGE_UP(0x4B.toByte()),
    KEY_DELETE(0x4C.toByte()),
    KEY_END(0x4D.toByte()),
    KEY_PAGE_DOWN(0x4E.toByte()),

    // Modifier keys
    KEY_SHIFT_LEFT(0x02.toByte()),
    KEY_SHIFT_RIGHT(0x20.toByte()),
    KEY_META_LEFT(0x08.toByte()),
    KEY_META_RIGHT(0x80.toByte()),
    KEY_CTRL_LEFT(0x01.toByte()),
    KEY_CTRL_RIGHT(0x10.toByte()),
    KEY_ALT(0x04.toByte()),
    KEY_ALT_GR(0x40.toByte())
}