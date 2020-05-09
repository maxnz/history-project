package pages

import Page
import react.RBuilder

object Home : Page() {
    override val title = "Home"
    override fun RBuilder.render() {
        +"Hi"
    }
}