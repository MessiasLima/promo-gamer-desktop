package com.promogamer.core.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import com.promogamer.core.ui.theme.Shapes

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(content = content, shapes = Shapes)
}