package guiSections

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun containerWithMenu() {
    return Row {
        menuDesktop()
        Box(
            modifier = Modifier.padding(PaddingValues(40.dp, 20.dp, 40.dp, 20.dp))
        ) {
            Text("prova")
        }
    }
}