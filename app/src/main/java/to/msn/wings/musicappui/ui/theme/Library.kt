package to.msn.wings.musicappui.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import to.msn.wings.musicappui.Lib
import to.msn.wings.musicappui.libraries

@Composable
fun Library() {
    LazyColumn() {
        items(libraries) {
            lib ->
            LibItem(lib)
        }
    }
}

@Composable
fun LibItem(lib: Lib) {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = lib.icon), contentDescription = lib.name,
                    modifier = Modifier.padding(horizontal = 8.dp))
                Text(text = lib.name)
            }
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
        }
    }
    Divider(color = Color.LightGray)
}