package utils

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import views.TodoDetailsContent
import views.TodoListContent

@OptIn(ExperimentalDecomposeApi::class)
@Composable
fun TodoRootContent(component: TodoRootComponent) {
    Children(
        stack = component.stack
    ) {
        when (val child = it.instance) {
            is TodoRootComponent.Child.List -> TodoListContent(child.component)
            is TodoRootComponent.Child.Details -> TodoDetailsContent(child.component)
        }
    }
}