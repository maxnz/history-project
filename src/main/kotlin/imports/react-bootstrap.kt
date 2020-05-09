@file:JsModule("react-bootstrap")
@file:JsNonModule

package imports

import org.w3c.dom.events.Event
import react.RClass
import react.RProps

@JsName("DropdownButton")
external val DropdownButton: RClass<DropdownButtonProps>

@JsName("DropdownItem")
external val DropdownItem: RClass<DropdownItemProps>

external interface DropdownButtonProps : RProps {
    var title: String
}

external interface DropdownItemProps : RProps {
    var `as`: String
    var onClick: (Event) -> Unit
}
