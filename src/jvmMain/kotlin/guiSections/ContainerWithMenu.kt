package guiSections

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun ContainerWithMenu() {
    return Row {
        Box(
            modifier = Modifier.width(320.dp).fillMaxHeight()
        ) {
            NavigationDrawerItem(
                icon = { Icon(Icons.Default.Add, contentDescription = null) },
                label = { Text("prova") },
                onClick = {
                    print("ciao")
                },
                selected = false
            )
        }
        Box() {
            Text("prova")
        }
    }
}