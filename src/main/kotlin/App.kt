
import imports.DropdownButton
import imports.DropdownItem
import kotlinx.css.*
import react.*
import react.dom.div
import styled.css
import styled.styledP

class App : RComponent<RProps, AppState>() {
    private fun RBuilder.navBarDropdown(pageGroup: PageGroup): ReactElement =
        DropdownButton {
            attrs {
                title = pageGroup.title
            }
            for (subPage in pageGroup.pages) {
                DropdownItem {
                    attrs {
                        `as` = "button"
                        onClick = {
                            setState {
                                page = subPage
                            }
                        }
                    }
                    +subPage.title
                }
            }
        }

    override fun RBuilder.render() {
        child(Header::class) {}
        styledP {
            css {
                backgroundColor = Color.gray
                borderTopLeftRadius = LinearDimension("0.5cm")
                borderTopRightRadius = LinearDimension("0.5cm")
                fontFamily = FONT
                fontSize = LinearDimension("2.5cm")
                marginBottom = LinearDimension("0")
                marginTop = LinearDimension("0")
                textAlign = TextAlign.center
            }
            +"Jewish Immigration Into Britain"
        }

        // Navigation bar
        navBarDropdown(PageGroup.YRS_1940_1944)

        // Page
        div {
            when (state.page) {
                null -> {
                }
                else -> {
                    child(state.page!!.component) {}
                }
            }
        }
    }
}