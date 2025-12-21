package com.atharok.btremote.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import com.atharok.btremote.R

@Composable
@ReadOnlyComposable
fun surfaceElevationLow(): Dp = dimensionResource(id = R.dimen.surface_elevation_low)

@Composable
@ReadOnlyComposable
fun surfaceElevationMedium(): Dp = dimensionResource(id = R.dimen.surface_elevation_medium)

@Composable
@ReadOnlyComposable
fun surfaceElevationHigh(): Dp = dimensionResource(id = R.dimen.surface_elevation_high)

@Composable
@ReadOnlyComposable
fun surfaceElevationShadow(): Dp = dimensionResource(id = R.dimen.surface_elevation_shadow)