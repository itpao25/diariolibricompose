package components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.arkivanov.decompose.ComponentContext

class TodoListComponent(
    private val componentContext: ComponentContext,
    private val onItemSelected: (String) -> Unit
) : ComponentContext by componentContext {

    private val _model = mutableStateOf(Model())
    val model: State<Model> = _model

    fun onItemClicked(item: String) {
        onItemSelected(item)
    }

    fun onTextChanged(text: String) {
        changeState { copy(text = text) }
    }

    fun onAddClicked() {
        changeState { copy(items = items + text, text = "") }
    }

    private inline fun changeState(reducer: Model.() -> Model) {
        _model.value = model.value.reducer()
    }

    data class Model(
        val items: List<String> = emptyList(),
        val text: String = "",
    )
}