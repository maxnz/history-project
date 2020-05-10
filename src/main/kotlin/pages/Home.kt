package pages

import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder
import react.dom.p
import styled.styledDiv

object Home : Page() {
    override val title = "Home"
    override val navigationOptions = listOf<NavigationOption>()

    override fun RBuilder.addContent() =
        styledDiv {
            p {
                +"Hi"
            }
        }
}