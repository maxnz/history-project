@file:JsModule("react-scroll")
@file:JsNonModule

package imports

import org.w3c.dom.events.Event
import react.RClass
import react.RProps


@JsName("Link")
external val Link: RClass<LinkProps>

external interface LinkProps : RProps {
    var activeClass: String?
    var to: String?
    var spy: Boolean?
    var hashSpy: Boolean?
    var smooth: Boolean?
    var offset: Int?
    var duration: Int?
    var delay: Int?
    var isDynamic: Boolean?
    var onSetActive: ((Event) -> Unit)?
    var onSetInactive: ((Event) -> Unit)?
    var ignoreCancelEvents: Boolean?
}