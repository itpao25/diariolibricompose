package guiSections

import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun menuDesktop() {

    val defaultWidthMenu = 300.dp;
    val maxWidthMenu = 320.dp;
    val minWidthMenu = 100.dp;

    var sizeMenuHorizontal by remember { mutableStateOf(defaultWidthMenu) }

    return Box(
        modifier = Modifier.width(sizeMenuHorizontal).fillMaxHeight()
    ) {
        PermanentNavigationDrawer(
            modifier = Modifier.fillMaxHeight(),
            drawerContent = {
                Column(
                    Modifier.padding(PaddingValues(15.dp, 20.dp, 15.dp, 20.dp)),
                ) {
                    menuItems().forEach { item ->
                        item()
                    }
                }
            }
        ) { }

        val density = LocalDensity.current;
        Box(
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            menuDesktopResizer(
                onResize = rememberDraggableState {
                    val dp = with(density) { it.toDp(); }
                    val newWidth = sizeMenuHorizontal + dp;
                    if (newWidth in minWidthMenu..maxWidthMenu) {
                        sizeMenuHorizontal += dp;
                    }
                }
            )
        }
    }
}