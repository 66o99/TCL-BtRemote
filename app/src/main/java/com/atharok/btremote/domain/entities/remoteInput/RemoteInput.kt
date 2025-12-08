package com.atharok.btremote.domain.entities.remoteInput

// https://source.android.com/docs/core/interaction/input/keyboard-devices#hid-consumer-page-0x0c
object RemoteInput {

    // Navigation
    val REMOTE_INPUT_MENU by lazy { byteArrayOf(0x40.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_MENU_PICK by lazy { byteArrayOf(0x41.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_MENU_UP by lazy { byteArrayOf(0x42.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_MENU_DOWN by lazy { byteArrayOf(0x43.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_MENU_LEFT by lazy { byteArrayOf(0x44.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_MENU_RIGHT by lazy { byteArrayOf(0x45.toByte(), 0x00.toByte()) }

    // Multimedia
    val REMOTE_INPUT_PLAY_PAUSE by lazy { byteArrayOf(0xCD.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_PREVIOUS by lazy { byteArrayOf(0xB4.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_NEXT by lazy { byteArrayOf(0xB3.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_CLOSED_CAPTIONS by lazy { byteArrayOf(0x61.toByte(), 0x00.toByte()) }

    // Volume
    val REMOTE_INPUT_VOLUME_INC by lazy { byteArrayOf(0xE9.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_VOLUME_DEC by lazy { byteArrayOf(0xEA.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_VOLUME_MUTE by lazy { byteArrayOf(0xE2.toByte(), 0x00.toByte()) }

    // Brightness
    val REMOTE_INPUT_BRIGHTNESS_INC by lazy { byteArrayOf(0x6F.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_BRIGHTNESS_DEC by lazy { byteArrayOf(0x70.toByte(), 0x00.toByte()) }

    // Channel
    val REMOTE_INPUT_CHANNEL_INC by lazy { byteArrayOf(0x9C.toByte(), 0x00.toByte()) }
    val REMOTE_INPUT_CHANNEL_DEC by lazy { byteArrayOf(0x9D.toByte(), 0x00.toByte()) }

    // Others
    val REMOTE_INPUT_HOME by lazy { byteArrayOf(0x23.toByte(), 0x02.toByte()) }
    val REMOTE_INPUT_BACK by lazy { byteArrayOf(0x24.toByte(), 0x02.toByte()) }
    val REMOTE_INPUT_POWER by lazy { byteArrayOf(0x30.toByte(), 0x00.toByte()) }

}