package ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Item(
    text: String,
    onClick: () -> Unit
) {
    Column {
        Row(modifier = Modifier.clickable(onClick = onClick)) {
            Text(
                text = text,
                fontSize = 20.sp,
                modifier = Modifier.weight(1F).padding(16.dp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Divider()
    }
}