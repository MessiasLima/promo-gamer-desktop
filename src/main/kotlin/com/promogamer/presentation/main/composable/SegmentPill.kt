package com.promogamer.presentation.main.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun SegmentPill(
    modifier: Modifier = Modifier,
    selected: Boolean = false,
    text: String = "",
    onClick: () -> Unit
) {
    val backgroundColor = if (selected) MaterialTheme.colors.primary else Color.Transparent

    val contentColor =
        if (selected) MaterialTheme.colors.onPrimary else MaterialTheme.colors.onSurface

    val roundedCorner = MaterialTheme.shapes.large

    Box(
        modifier = modifier
            .clip(roundedCorner)
            .background(color = backgroundColor, shape = roundedCorner)
            .clickable { onClick() }
            .padding(4.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = text,
            textAlign = TextAlign.Center,
            color = contentColor
        )
    }
}