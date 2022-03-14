package com.promogamer.presentation.main.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.appoutlet.karavel.Page

@Composable
fun Segment(
    modifier: Modifier = Modifier,
    items: List<SegmentItemModel> = emptyList(),
    selectedItemIndex: Int,
    onItemClicked: (SegmentItemModel, Int) -> Unit
) {
    Surface(
        modifier = modifier.padding(top = 8.dp, bottom = 16.dp).padding(horizontal = 16.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.large
    ) {
        Row {
            items.forEachIndexed { index, item ->
                SegmentPill(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp),
                    text = item.label,
                    onClick = { onItemClicked(item, index) },
                    selected = index == selectedItemIndex
                )
            }
        }
    }
}

data class SegmentItemModel(
    val label: String,
    val page: Page,
)