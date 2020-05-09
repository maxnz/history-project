package pages

import Page
import react.RBuilder
import react.dom.p

object ExamplePage : Page() {
    override val title = "Example"
    override fun RBuilder.render() {
        p {
            +"An example page"
        }
    }
}