import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import guiSections.containerWithMenu

@OptIn(ExperimentalMaterial3Api::class)
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Diario Libri",
        state = rememberWindowState(width = 1500.dp, height = 800.dp),
    ) {
        MaterialTheme {
            containerWithMenu()
        }
    }
}