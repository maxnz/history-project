
import kotlinx.css.*
import pages.Home
import pages.pageutils.addSideNavigation
import pages.pageutils.addTopNavigation
import react.RBuilder
import react.RComponent
import react.RProps
import styled.css
import styled.styledDiv
import styled.styledP

class App : RComponent<RProps, AppState>() {


    override fun RBuilder.render() {
        // Title
        styledP {
            css {
                background = "linear-gradient(rgba(255, 255, 255, 1), #007bff)"
                fontFamily = FONT
                fontSize = LinearDimension("2.5cm")
                marginBottom = LinearDimension("0")
                marginTop = LinearDimension("0")
                textAlign = TextAlign.center
            }
            +"Jewish Immigration Into Britain"
        }

        // Navigation bar
        addTopNavigation(this@App)

        // Page
        styledDiv {
            val page = state.page ?: Home

            css {
                display = Display.flex
                flexDirection = FlexDirection.row
            }

            // Page Side Navigation
            addSideNavigation(page)

            // Page Content
            styledDiv {
                css {
                    display = Display.block
                    width = LinearDimension("100%")
                }
                child(page::class) {}
            }
        }
    }
}