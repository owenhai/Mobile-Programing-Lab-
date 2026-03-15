package com.example.artspace

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ArtSpaceLayout(
    art: Art,
    onNext: () -> Unit,
    onPrevious: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(art.image),
                contentDescription = art.title,
                modifier = Modifier
                    .padding(24.dp)
                    .height(350.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(art.title, style = MaterialTheme.typography.titleMedium)
                Text(art.artist)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {

            Button(onClick = onPrevious) {
                Text("Previous")
            }

            Button(onClick = onNext) {
                Text("Next")
            }
        }
    }
}