
import pages.pageutils.Page
import react.RState

external interface AppState : RState {
    var page: Page?
}