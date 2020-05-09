import imports.DropdownButton
import imports.DropdownItem
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import pages.Home
import react.*
import react.dom.button
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledP

class App : RComponent<RProps, AppState>() {
    private fun RBuilder.navBarDropdown(pageGroup: PageGroup): ReactElement =
        DropdownButton {
            attrs {
                title = pageGroup.toString()
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
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                backgroundColor = Color("#007bff")
            }
            button {
                attrs["class"] = "btn btn-primary"
                attrs {
                    onClickFunction = {
                        setState {
                            page = Home
                        }
                    }
                }
                +"Home"
            }
            for (group in PageGroup.values())
                navBarDropdown(group)
//            navBarDropdown(PageGroup.YRS_1940_1944)
//            navBarDropdown(PageGroup.YRS_1945_1949)
        }

        // Page
        div {
            if (state.page == null)
                state.page = Home
            child(state.page!!::class) {}
        }
    }
}