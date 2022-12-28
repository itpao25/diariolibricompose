package guiSections

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
fun menuItems(): List<@Composable (ColumnScope.() -> Unit)> {
    return listOf(
        {
            NavigationDrawerItem(
                icon = { Icon(Icons.Default.Add, contentDescription = null) },
                label = { Text("prova") },
                onClick = {
                    print("ciao")
                },
                selected = false
            )
        },
        {
            Spacer(modifier = Modifier.height(10.dp))
        },
        {
            NavigationDrawerItem(
                icon = { Icon(Icons.Default.Add, contentDescription = null) },
                label = { Text("prova") },
                onClick = {
                    print("ciao")
                },
                selected = false
            )
        }
    )
}