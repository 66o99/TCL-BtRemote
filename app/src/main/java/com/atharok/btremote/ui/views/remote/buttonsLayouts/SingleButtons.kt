package com.atharok.btremote.ui.views.remote.buttonsLayouts

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.List
import androidx.compose.material.icons.rounded.ClosedCaption
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.PowerSettingsNew
import androidx.compose.material.icons.rounded.VolumeOff
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.atharok.btremote.R
import com.atharok.btremote.domain.entity.remoteInput.ChannelInput
import com.atharok.btremote.domain.entity.remoteInput.RemoteInput
import com.atharok.btremote.ui.components.AdaptiveText
import com.atharok.btremote.ui.components.DefaultElevatedCard
import com.atharok.btremote.ui.views.remoteButtons.RemoteButtonContentTemplate

@Composable
private fun SingleRemoteButton(
    bytes: ByteArray,
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    content: @Composable () -> Unit
) {
    DefaultElevatedCard(
        modifier = modifier,
        shape = shape
    ) {
        RemoteButtonContentTemplate(
            bytes = bytes,
            sendReport = sendReport,
            shape = shape,
            content = content
        )
    }
}

@Composable
private fun IconRemoteButton(
    bytes: ByteArray,
    sendReport: (ByteArray) -> Unit,
    image: ImageVector,
    contentDescription: String,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    SingleRemoteButton(
        bytes = bytes,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    ) {
        Icon(
            imageVector = image,
            contentDescription = contentDescription,
            modifier = Modifier.fillMaxSize(0.5f)
        )
    }
}

@Composable
private fun TextRemoteButton(
    text: String,
    bytes: ByteArray,
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
) {
    SingleRemoteButton(
        bytes = bytes,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    ) {
        AdaptiveText(
            text = text,
            percent = 0.45f,
            modifier = Modifier.fillMaxSize(),
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
    }
}

// ---- Specific ----

@Composable
fun BackButton(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    IconRemoteButton(
        bytes = RemoteInput.REMOTE_INPUT_BACK,
        sendReport = sendReport,
        image = Icons.AutoMirrored.Rounded.ArrowBack,
        contentDescription = stringResource(id = R.string.back),
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun HomeButton(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    IconRemoteButton(
        bytes = RemoteInput.REMOTE_INPUT_HOME,
        sendReport = sendReport,
        image = Icons.Rounded.Home,
        contentDescription = stringResource(id = R.string.home),
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun MenuButton(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    IconRemoteButton(
        bytes = RemoteInput.REMOTE_INPUT_MENU,
        sendReport = sendReport,
        image = Icons.AutoMirrored.Rounded.List,
        contentDescription = stringResource(id = R.string.menu),
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun PowerButton(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    IconRemoteButton(
        bytes = RemoteInput.REMOTE_INPUT_POWER,
        sendReport = sendReport,
        image = Icons.Rounded.PowerSettingsNew,
        contentDescription = stringResource(id = R.string.power),
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun VolumeMuteButton(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    IconRemoteButton(
        bytes = RemoteInput.REMOTE_INPUT_VOLUME_MUTE,
        sendReport = sendReport,
        image = Icons.Rounded.VolumeOff,
        contentDescription = stringResource(id = R.string.mute),
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ClosedCaptionsButton(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    IconRemoteButton(
        bytes = RemoteInput.REMOTE_INPUT_CLOSED_CAPTIONS,
        sendReport = sendReport,
        image = Icons.Rounded.ClosedCaption,
        contentDescription = stringResource(id = R.string.closed_captions),
        modifier = modifier,
        shape = shape
    )
}

// ---- Channel ----

@Composable
fun ChannelButton1(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "1",
        bytes = ChannelInput.CHANNEL_INPUT_1,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton2(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "2",
        bytes = ChannelInput.CHANNEL_INPUT_2,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton3(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "3",
        bytes = ChannelInput.CHANNEL_INPUT_3,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton4(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "4",
        bytes = ChannelInput.CHANNEL_INPUT_4,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton5(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "5",
        bytes = ChannelInput.CHANNEL_INPUT_5,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton6(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "6",
        bytes = ChannelInput.CHANNEL_INPUT_6,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton7(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "7",
        bytes = ChannelInput.CHANNEL_INPUT_7,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton8(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "8",
        bytes = ChannelInput.CHANNEL_INPUT_8,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton9(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "9",
        bytes = ChannelInput.CHANNEL_INPUT_9,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}

@Composable
fun ChannelButton0(
    sendReport: (ByteArray) -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    TextRemoteButton(
        text = "0",
        bytes = ChannelInput.CHANNEL_INPUT_0,
        sendReport = sendReport,
        modifier = modifier,
        shape = shape
    )
}