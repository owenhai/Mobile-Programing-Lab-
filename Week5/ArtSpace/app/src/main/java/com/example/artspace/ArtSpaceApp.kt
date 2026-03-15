package com.example.artspace

import androidx.compose.runtime.*

data class Art(
    val image: Int,
    val title: String,
    val artist: String
)

@Composable
fun ArtSpaceApp() {

    val artList = listOf(
        Art(R.drawable.art1, "Hamster and Paris", "Owen (2021)"),
        Art(R.drawable.art2, "White Tulip", "Owen (2020)"),
        Art(R.drawable.art3, "Sakura Mountain", "Owen (2019)")
    )

    var index by remember { mutableStateOf(0) }

    ArtSpaceLayout(
        art = artList[index],
        onNext = {
            index = (index + 1) % artList.size
        },
        onPrevious = {
            index = if (index > 0) index - 1 else artList.lastIndex
        }
    )
}