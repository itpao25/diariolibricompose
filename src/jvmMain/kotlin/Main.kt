import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.lifecycle.LifecycleController
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import utils.TodoRootComponent
import utils.TodoRootContent

@OptIn(ExperimentalDecomposeApi::class)
fun main() {

    val lifecycle = LifecycleRegistry()
    val root = TodoRootComponent(componentContext = DefaultComponentContext(lifecycle = lifecycle))

    application {
        val windowState = rememberWindowState(width = 1500.dp, height = 800.dp)

        // Bind the registry to the life cycle of the window
        LifecycleController(lifecycle, windowState)

        Window(
            onCloseRequest = ::exitApplication,
            title = "Diario Libri",
            state = windowState,
        ) {
            Surface(modifier = Modifier.fillMaxSize()) {
                MaterialTheme {
                    TodoRootContent(root)
                }
            }
        }
    }
}