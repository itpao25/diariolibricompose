package ui.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

class RootComponent(componentContext: ComponentContext) {

    val childStack: Value<ChildStack<*, Child>> = TODO()

    sealed class Child {
        data class MainChild(val component: MainComponent) : Child()
    }
}