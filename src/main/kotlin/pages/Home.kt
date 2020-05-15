package pages

import kotlinx.css.LinearDimension
import kotlinx.css.width
import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder
import react.dom.i
import react.dom.p
import styled.css
import styled.styledDiv
import styled.styledP

object Home : Page() {
    override val title = "Home"
    override val navigationOptions = listOf<NavigationOption>()

    override fun RBuilder.addContent() =
        styledDiv {
            styledP {
                css {
                    width = LinearDimension("100%")
                }
                +"This project has researched the effects of Jewish immigration into Britain shortly before, during, and shortly after World War II."
            }
            p {
                +"To navigate through this site, click on the navigation buttons above."
            }
            p {
                +"This site was made using Kotlin/JS and React."
            }
            i {
                +"Created by Max Narvaez and Katie Richter"
            }
        }
}