package com.atharok.btremote.domain.entities.remoteInput.keyboard.virtualKeyboard

import com.atharok.btremote.common.utils.KEYBOARD_INPUT_NONE
import com.atharok.btremote.common.utils.getKeyboardReport
import com.atharok.btremote.domain.entities.remoteInput.keyboard.KeyboardKey

// https://source.android.com/docs/core/interaction/input/keyboard-devices#hid-keyboard-and-keypad-page-0x07
abstract class VirtualKeyboardLayout {
    companion object {
        val KEYBOARD_KEY_ENTER by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_ENTER.byte) }
        val KEYBOARD_KEY_BACKSPACE by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_BACKSPACE.byte) }
        val KEYBOARD_KEY_SPACE_BAR by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_SPACE_BAR.byte) }
        val KEYBOARD_KEY_UP by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_UP_ARROW.byte) }
        val KEYBOARD_KEY_DOWN by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_DOWN_ARROW.byte) }
        val KEYBOARD_KEY_LEFT by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_LEFT_ARROW.byte) }
        val KEYBOARD_KEY_RIGHT by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_RIGHT_ARROW.byte) }
        val KEYBOARD_KEY_PRINT_SCREEN by lazy { getKeyboardReport(0x00, KeyboardKey.KEY_PRINT_SCREEN.byte) }
    }

    protected abstract val keyboardInputs: Map<Char, ByteArray>
    protected abstract val extraInputs: Map<Char, ByteArray>

    private val inputs: Map<Char, ByteArray> by lazy { keyboardInputs + extraInputs }

    fun getKeyboardKey(key: Char): ByteArray = inputs[key] ?: KEYBOARD_INPUT_NONE
}