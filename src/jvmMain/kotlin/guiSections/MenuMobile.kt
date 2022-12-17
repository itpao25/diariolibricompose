package guiSections

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@ExperimentalMaterial3Api
@Composable
fun MenuMobile() {
    return ModalNavigationDrawer(
        drawerContent = {
            NavigationDrawerItem(
                icon = { Icon(Icons.Default.Add, contentDescription = null) },
                label = { Text("prova") },
                onClick = {
                    print("ciao")
                },
                selected = false
            )
            NavigationDrawerItem(
                icon = { Icon(Icons.Default.Add, contentDescription = null) },
                label = { Text("prova") },
                onClick = {
                    print("ciao")
                },
                selected = false
            )
        }
    ) {};
}