import react.RComponent
import react.RProps

abstract class Page : RComponent<RProps, AppState>() {
    abstract val title: String
}