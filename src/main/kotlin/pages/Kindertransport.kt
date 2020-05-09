package pages

import pages.pageutils.ImageInfo
import pages.pageutils.NavigationOption
import pages.pageutils.Page
import react.RBuilder
import react.dom.h1

object Kindertransport : Page() {
    override val title = "Kindertransport (Child Transport)"
    override val navigationOptions = listOf(NavigationOption("Media", "media"))

    override val mediaURLs = listOf(
        ImageInfo(
            url = "https://encyclopedia.ushmm.org/images/large/fa16bc48-df16-431c-bb5c-226fb3b9b499.jpg",
            sourceURL = "https://encyclopedia.ushmm.org/content/en/article/kindertransport-1938-40",
            sourceName = "United State Holocaust Memorial Museum"
        ),
        ImageInfo(
            url = "https://www.history.com/.image/ar_266:100%2Cc_fill%2Ccs_srgb%2Cg_faces:center%2Cq_auto:good%2Cw_2560/MTYwNjUyMDExMjY2NjQ3MjEx/kindertransport-getty-3364204.webp",
            sourceURL = "https://www.history.com/news/holocaust-child-refugees-kindertransport-britain",
            sourceName = "History.com"
        )
    )



    override fun RBuilder.render() {
        h1 {
            +"Kindertransport"
        }
        addMediaSection()
    }
}