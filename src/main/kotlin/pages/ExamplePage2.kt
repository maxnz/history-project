package pages

import Page
import react.RBuilder
import react.dom.p

object ExamplePage2 : Page() {
    override val title = "Another Example"
    override fun RBuilder.render() {
        p {
            +"Another example page"
        }
    }
}