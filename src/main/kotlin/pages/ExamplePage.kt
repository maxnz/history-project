package pages

import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder
import react.dom.p

object ExamplePage : Page() {
    override val title = "Example"
    override val navigationOptions = listOf<NavigationOption>()

    override fun RBuilder.render() {
        p {
            +"An example page"
        }
    }
}