package com.atharok.btremote.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import com.atharok.btremote.R
import com.atharok.btremote.ui.components.MoreOverflowMenu
import com.atharok.btremote.ui.components.TextMedium
import com.atharok.btremote.ui.components.TextNormalSecondary
import com.atharok.btremote.ui.components.UnpairDropdownMenuItem

@Composable
fun DeviceItemView(
    name: String,
    macAddress: String,
    icon: ImageVector,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Image(
            imageVector = icon,
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
                .padding(dimensionResource(id = R.dimen.padding_standard)),
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary)
        )

        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            TextMedium(text = name)
            TextNormalSecondary(text = macAddress)
        }
    }
}

@Composable
fun DeviceItemView(
    name: String,
    macAddress: String,
    icon: ImageVector,
    unpair: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        DeviceItemView(
            name, macAddress, icon, Modifier.weight(1f)
        )

        Box(contentAlignment = Alignment.CenterEnd) {
            MoreOverflowMenu { closeDropdownMenu: () -> Unit ->
                UnpairDropdownMenuItem(
                    unpair = {
                        unpair()
                        closeDropdownMenu()
                    }
                )
            }
        }
    }
}