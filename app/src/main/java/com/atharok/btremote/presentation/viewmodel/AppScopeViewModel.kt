package com.atharok.btremote.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.atharok.btremote.domain.entities.DeviceHidConnectionState
import com.atharok.btremote.domain.entities.settings.AppearanceSettings
import com.atharok.btremote.domain.usecases.AppScopeUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

class AppScopeViewModel(
    private val useCase: AppScopeUseCase
): ViewModel() {

    // ---- App Appearance ----

    val appearanceSettingsFlow: Flow<AppearanceSettings> = useCase.appearanceSettingsFlow

    // ---- Local Device Name ----

    val localDeviceName: String get() = useCase.getLocalDeviceName()

    // ---- Connection States ----

    val isBluetoothSupported: Boolean get() = useCase.isBluetoothSupported()

    val isBluetoothEnabled: Boolean get() = useCase.isBluetoothEnabled()

    val isBluetoothServiceRunning: StateFlow<Boolean> get() = useCase.isBluetoothServiceRunning()

    val isBluetoothHidProfileRegistered: StateFlow<Boolean> get() = useCase.isBluetoothHidProfileRegistered()

    val deviceHidConnectionState: StateFlow<DeviceHidConnectionState> get() = useCase.getDeviceHidConnectionState()
}