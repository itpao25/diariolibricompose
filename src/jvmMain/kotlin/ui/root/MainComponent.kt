package ui.root

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import guiSections.containerWithMenu

interface MainComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mainContent(component: MainComponent) {
    return containerWithMenu()
}