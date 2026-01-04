package com.atharok.btremote.data.bluetooth

import android.bluetooth.BluetoothAdapter

class BluetoothStatus(
    private val adapter: BluetoothAdapter?
) {
    fun isBluetoothSupported(): Boolean = adapter != null
    fun isBluetoothEnabled(): Boolean = adapter?.isEnabled == true
}