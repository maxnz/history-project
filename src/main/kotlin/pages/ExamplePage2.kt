package pages

import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder
import react.dom.p

object ExamplePage2 : Page() {
    override val title = "Another Example"
    override val navigationOptions = listOf<NavigationOption>()

    override fun RBuilder.render() {
        p {
            +"Another example page"
        }
    }
}