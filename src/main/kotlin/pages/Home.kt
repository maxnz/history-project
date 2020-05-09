package pages

import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder

object Home : Page() {
    override val title = "Home"
    override val navigationOptions = listOf<NavigationOption>()

    override fun RBuilder.render() {
        +"Hi"
    }
}