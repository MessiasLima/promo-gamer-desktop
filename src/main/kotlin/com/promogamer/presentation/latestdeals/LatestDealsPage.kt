package com.promogamer.presentation.latestdeals

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.promogamer.presentation.latestdeals.model.LatestDealUiModel
import io.appoutlet.karavel.Page
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class LatestDealsPage : Page(), KoinComponent {
    private val viewModel by inject<LatestDealsViewModel>()

    @Composable
    override fun content() {
        LatestDealsScreen(viewModel)
    }
}

@Composable
fun LatestDealsScreen(viewModel: LatestDealsViewModel) {
    val uiState by viewModel.uiModel.collectAsState(initial = LatestDealsUiState.Loading)

    when (uiState) {
        LatestDealsUiState.Error -> Error()
        LatestDealsUiState.Loading -> Loading()
        is LatestDealsUiState.Success -> LatestDeals((uiState as LatestDealsUiState.Success).uiModels)
    }
}

@Composable
fun Loading() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        CircularProgressIndicator(modifier = Modifier.size(80.dp), strokeWidth = 6.dp)
    }
}

@Composable
fun Error() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Error when loading deals", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun LatestDeals(uiModels: List<LatestDealUiModel>) {
    LazyColumn {
        item {
            Spacer(Modifier.padding(top = 48.dp))
        }

        items(uiModels) { item ->
            Text(text = item.title, style = MaterialTheme.typography.h1)
        }
    }
}