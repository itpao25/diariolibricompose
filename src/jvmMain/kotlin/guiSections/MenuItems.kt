package guiSections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun MenuItems() {
    return PermanentNavigationDrawer(
        modifier = Modifier
            .clip(RoundedCornerShape(0, 10, 10, 0))
            .background(color = Color.Black)
            .padding(PaddingValues(15.dp, 20.dp, 15.dp, 20.dp)),
        drawerContainerColor = Color.Transparent,
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