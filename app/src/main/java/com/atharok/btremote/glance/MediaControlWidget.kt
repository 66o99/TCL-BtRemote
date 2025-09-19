package com.atharok.btremote.glance

import android.bluetooth.BluetoothHidDevice
import android.content.Context
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.ImageProvider
import androidx.glance.LocalContext
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.SizeMode
import androidx.glance.appwidget.action.actionSendBroadcast
import androidx.glance.appwidget.action.actionStartActivity
import androidx.glance.appwidget.components.CircleIconButton
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.width
import com.atharok.btremote.R
import com.atharok.btremote.domain.usecases.BluetoothHidUseCase
import com.atharok.btremote.presentation.activities.MainActivity
import com.atharok.btremote.presentation.services.NotificationBroadcastReceiver
import com.atharok.btremote.presentation.services.NotificationBroadcastReceiver.Companion.ACTION_MULTIMEDIA_NEXT
import com.atharok.btremote.presentation.services.NotificationBroadcastReceiver.Companion.ACTION_MULTIMEDIA_PLAY_PAUSE
import com.atharok.btremote.presentation.services.NotificationBroadcastReceiver.Companion.ACTION_MULTIMEDIA_PREVIOUS
import com.atharok.btremote.presentation.services.NotificationBroadcastReceiver.Companion.ACTION_VOLUME_DEC
import com.atharok.btremote.presentation.services.NotificationBroadcastReceiver.Companion.ACTION_VOLUME_INC
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MediaControlWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = MediaControlWidget()
}

class MediaControlWidget : GlanceAppWidget(), KoinComponent {
    override val sizeMode: SizeMode = SizeMode.Exact

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        val bluetoothHidUseCase by inject<BluetoothHidUseCase>()
        provideContent {
            GlanceTheme {
                val state by bluetoothHidUseCase.getDeviceHidConnectionState().collectAsState()
                if (state.state != BluetoothHidDevice.STATE_CONNECTED) {
                    AppLauncher()
                } else {
                    MediaControls()
                }
            }
        }
    }

    @Composable
    private fun AppLauncher() {
        val context = LocalContext.current
        Box(
            modifier = GlanceModifier.fillMaxSize().background(GlanceTheme.colors.widgetBackground),
            contentAlignment = Alignment.Center,
        ) {
            Button(
                context.getString(R.string.connect),
                onClick = actionStartActivity(Intent(context, MainActivity::class.java))
            )
        }
    }

    @Composable
    private fun MediaControls() {
        val context = LocalContext.current
        Column(
            modifier = GlanceModifier.fillMaxSize().background(GlanceTheme.colors.widgetBackground),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = GlanceModifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(GlanceModifier.defaultWeight())
                CircleIconButton(
                    ImageProvider(R.drawable.round_skip_previous_24),
                    contentDescription = context.getString(R.string.previous),
                    onClick = mediaControlAction(context, ACTION_MULTIMEDIA_PREVIOUS),
                    backgroundColor = null
                )
                Spacer(GlanceModifier.defaultWeight())
                CircleIconButton(
                    ImageProvider(R.drawable.round_play_pause_24),
                    contentDescription = context.getString(R.string.play),
                    onClick = mediaControlAction(context, ACTION_MULTIMEDIA_PLAY_PAUSE),
                    backgroundColor = null
                )
                Spacer(GlanceModifier.defaultWeight())
                CircleIconButton(
                    ImageProvider(R.drawable.round_skip_next_24),
                    contentDescription = context.getString(R.string.next),
                    onClick = mediaControlAction(context, ACTION_MULTIMEDIA_NEXT),
                    backgroundColor = null
                )
                Spacer(GlanceModifier.defaultWeight())
            }
            Row(
                modifier = GlanceModifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircleIconButton(
                    ImageProvider(R.drawable.round_volume_down_24),
                    contentDescription = context.getString(R.string.previous),
                    onClick = mediaControlAction(context, ACTION_VOLUME_DEC),
                    backgroundColor = null
                )
                Spacer(GlanceModifier.width(24.dp))
                CircleIconButton(
                    ImageProvider(R.drawable.round_volume_up_24),
                    contentDescription = context.getString(R.string.next),
                    onClick = mediaControlAction(context, ACTION_VOLUME_INC),
                    backgroundColor = null
                )
            }
        }
    }

    private fun mediaControlAction(context: Context, action: String) =
        actionSendBroadcast(Intent(context, NotificationBroadcastReceiver::class.java).apply { setAction(action) })
}
