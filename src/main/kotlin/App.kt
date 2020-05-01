import react.dom.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h1 {
            style {
                setProp("alignment", "center")
            }
            +"Jewish Immigration Into Britain"
        }
    }
}