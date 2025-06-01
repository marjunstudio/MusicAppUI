package to.msn.wings.musicappui.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import to.msn.wings.musicappui.R

@Composable
fun BrowseScreen() {

    val categories = listOf("Hits", "Happy","Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories) { cat ->
            Card(modifier = Modifier.padding(16.dp).width(100.dp).height(200.dp), elevation = 4.dp) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ) {
                    Text(text = cat)
                    Image(painter = painterResource(id = R.drawable.ic_browse), contentDescription = cat)

                }
            }
        }
    }
}

@Preview
@Composable
fun BrowseScreenPreview() {
    BrowseScreen()
}