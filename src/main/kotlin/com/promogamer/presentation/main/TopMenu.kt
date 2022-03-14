package com.promogamer.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.promogamer.presentation.latestdeals.LatestDealsPage
import com.promogamer.presentation.main.composable.Segment
import com.promogamer.presentation.main.composable.SegmentItemModel
import com.promogamer.presentation.saveddeals.SavedDealsPage
import com.promogamer.presentation.search.SearchPage
import io.appoutlet.karavel.Karavel

@Composable
fun TopMenu(mainScreenKaravel: Karavel) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        var selectedItem: Int by remember { mutableStateOf(0) }

        val mainMenu = listOf(
            SegmentItemModel(label = "Latest deals", LatestDealsPage()),
            SegmentItemModel("Saved deals", SavedDealsPage()),
            SegmentItemModel("Search", SearchPage()),
        )

        Segment(modifier = Modifier.width(500.dp), items = mainMenu, selectedItemIndex = selectedItem) { item, index ->
            mainScreenKaravel.navigate(item.page)
            selectedItem = index
        }
    }
}