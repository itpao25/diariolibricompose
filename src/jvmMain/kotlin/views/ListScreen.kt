package views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import components.TodoListComponent
import ui.Input
import ui.Item

@Composable
fun TodoListContent(component: TodoListComponent) {
    val state by component.model

    Column {
        TopAppBar(title = { Text(text = "Todo List") })

        LazyColumn(modifier = Modifier.weight(1F)) {
            items(state.items) { item ->
                Item(
                    text = item,
                    onClick = { component.onItemClicked(item) },
                )
            }
        }

        Input(
            text = state.text,
            onTextChanged = component::onTextChanged,
            onAddClicked = component::onAddClicked,
        )
    }
}