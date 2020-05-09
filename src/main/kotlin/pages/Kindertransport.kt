package pages

import Page
import react.RBuilder
import react.dom.h1
import react.dom.img

object Kindertransport : Page() {
    override val title = "Kindertransport (Child Transport)"
    override fun RBuilder.render() {
        h1 {
            +"Kindertransport"
        }
        img {
            attrs {
                src = "https://encyclopedia.ushmm.org/images/large/fa16bc48-df16-431c-bb5c-226fb3b9b499.jpg"
            }
        }
    }
}