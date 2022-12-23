package guiSections

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import java.awt.Cursor

@ExperimentalMaterial3Api
@Composable
fun menuDesktop() {

    val defaultWidthMenu = 300.dp;
    val maxWidthMenu = 320.dp;
    var sizeMenuHorizontal by remember { mutableStateOf(defaultWidthMenu) }

    return Box(
        modifier = Modifier.width(sizeMenuHorizontal).fillMaxHeight()
    ) {
        PermanentNavigationDrawer(
            modifier = Modifier
                .background(color = Color(0xFF424242))
                .padding(PaddingValues(15.dp, 20.dp, 15.dp, 20.dp)),
            drawerContainerColor = Color.Transparent,
            drawerContent = {
                menuItems().forEach { item ->
                    item()
                }
            }
        ) {
        }

        val density = LocalDensity.current;
        Box(
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            menuDesktopResizer(
                onResize = rememberDraggableState {
                    val dp = with(density) {
                        it.toDp();
                    }
                    val newWidth = sizeMenuHorizontal + dp;
                    if(newWidth <= maxWidthMenu && newWidth >= 100.dp) {
                        sizeMenuHorizontal += dp;
                    }
                }
            )
        }
    }
}