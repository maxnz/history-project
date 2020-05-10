package pages

import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder
import react.ReactElement
import react.dom.p
import styled.styledDiv

object ExamplePage : Page() {
    override val title = "Example"
    override val navigationOptions = listOf<NavigationOption>()
    override fun RBuilder.addContent(): ReactElement =
        styledDiv {
            p {
                +"Another example page"
            }
        }

}