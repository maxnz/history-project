
import kotlinx.css.LinearDimension
import kotlinx.css.height
import kotlinx.css.width
import react.dom.render
import styled.css
import styled.styledDiv
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        styledDiv {
            css {
                height = LinearDimension.fillAvailable
                width = LinearDimension.fillAvailable
            }
            child(App::class) {}
        }
    }
}