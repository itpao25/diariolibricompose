package guiSections

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import java.awt.Cursor

@ExperimentalMaterial3Api
@Composable
fun MenuDesktop() {
    var sizeMenuHorizontal by remember { mutableStateOf(320.dp) }
    return Box(
        modifier = Modifier.width(sizeMenuHorizontal).fillMaxHeight()
    ) {
        MenuItems()

        Box(
            modifier = Modifier.width(5.dp).fillMaxHeight().background(Color.Green)
                .draggable(
                    orientation = Orientation.Horizontal,
                    state = rememberDraggableState { delta ->
                        val posHorizontal = sizeMenuHorizontal + Dp(delta)
                        if(posHorizontal <= 350.dp && posHorizontal > 100.dp) {
                            sizeMenuHorizontal += Dp(delta);
                        }
                    }
                ).align(Alignment.TopEnd).pointerHoverIcon(PointerIcon(Cursor(Cursor.E_RESIZE_CURSOR)))
        ) {}
    }
}