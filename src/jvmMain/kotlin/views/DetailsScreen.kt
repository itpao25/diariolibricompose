package views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.ComponentContext

class TodoDetailsComponent(
    componentContext: ComponentContext,
    val text: String,
    private val onFinished: () -> Unit
) : ComponentContext by componentContext {

    fun onBackClicked() {
        onFinished()
    }
}

@Composable
fun TodoDetailsContent(component: TodoDetailsComponent) {
    Column {
        TopAppBar(
            title = { Text(text = "Details") },
            navigationIcon = {
                IconButton(onClick = component::onBackClicked) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back button")
                }
            }
        )

        Text(
            text = component.text,
            fontSize = 20.sp,
            modifier = Modifier.padding(16.dp).weight(1F),
        )
    }
}