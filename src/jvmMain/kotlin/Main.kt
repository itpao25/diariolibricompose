import androidx.compose.foundation.LocalScrollbarStyle
import androidx.compose.foundation.defaultScrollbarStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.lifecycle.LifecycleController
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import ui.root.RootComponent
import ui.root.mainContent

@OptIn(ExperimentalDecomposeApi::class)
fun main() {

    val lifecycle = LifecycleRegistry()
    val root =
        RootComponent(
            componentContext = DefaultComponentContext(lifecycle = lifecycle)
        )

    application {
        val windowState = rememberWindowState(width = 1500.dp, height = 800.dp)

        // Bind the registry to the life cycle of the window
        LifecycleController(lifecycle, windowState)

        Window(
            onCloseRequest = ::exitApplication,
            title = "Diario Libri",
            state = windowState,
        ) {
            MaterialTheme(
                // colorScheme = colors
            ) {
                CompositionLocalProvider(LocalScrollbarStyle provides defaultScrollbarStyle()) {
                    Children(root.childStack) {
                        when (val child = it.instance) {
                            is RootComponent.Child.MainChild -> mainContent(child.component)
                            else -> {}
                        }
                    }
                }
            }
        }
    }
}