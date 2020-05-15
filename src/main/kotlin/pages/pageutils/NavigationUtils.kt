package pages.pageutils

import App
import imports.DropdownButton
import imports.DropdownItem
import imports.Link
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import pageList
import react.RBuilder
import react.ReactElement
import react.dom.button
import react.dom.li
import react.dom.ul
import react.setState
import styled.css
import styled.styledDiv

//private fun RBuilder.navBarDropdown(pageGroup: PageGroup, app: App): ReactElement =
//    DropdownButton {
//        attrs {
//            title = pageGroup.toString()
//        }
//        for (subPage in pageGroup.pages) {
//            DropdownItem {
//                attrs {
//                    `as` = "button"
//                    onClick = {
//                        app.setState {
//                            page = subPage
//                        }
//                    }
//                }
//                +subPage.title
//            }
//        }
//    }

private fun RBuilder.navBarButton(linkedPage: Page, app: App): ReactElement =
    button {
        attrs["class"] = "btn btn-primary"
        attrs {
            onClickFunction = {
                app.setState {
                    page = linkedPage
                }
            }
        }
        +linkedPage.title
    }

fun RBuilder.addTopNavigation(app: App): ReactElement =
    styledDiv {
        css {
            display = Display.flex
            flexDirection = FlexDirection.row
            backgroundColor = Color("#007bff")
        }

        for (page in pageList)
            navBarButton(page, app)
    }

fun RBuilder.addSideNavigation(page: Page): ReactElement? =
    if (page.navigationOptions.isNotEmpty())
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
                width = LinearDimension("15%")
            }
            ul {
                for (navOpt in page.navigationOptions)
                    li {
                        Link {
                            attrs {
                                to = navOpt.destination
                                smooth = true
                            }
                            +navOpt.name
                        }
                    }
            }
        }
    else null