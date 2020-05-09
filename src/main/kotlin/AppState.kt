import pages.Home
import pages.Kindertransport
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

enum class Page(
    val component: KClass<out RComponent<RProps, *>>,
    val title: String
) {
    HOME(
        component = Home::class,
        title = "Home"
    ),
    KINDERTRANSPORT(
        component = Kindertransport::class,
        title = "Kindertransport (Child Transport)"
    )
}

enum class PageGroup(
    val title: String,
    val pages: List<Page>
) {
    YRS_1940_1944("1940-1944", listOf(Page.KINDERTRANSPORT))
}

external interface AppState : RState {
    var page: Page?
    var headerImageURL: String?
}