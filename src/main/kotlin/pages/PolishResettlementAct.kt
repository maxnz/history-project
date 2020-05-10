package pages

import kotlinx.css.LinearDimension
import kotlinx.css.width
import pages.pageutils.ImageInfo
import pages.pageutils.MediaInfo
import pages.pageutils.Page
import react.RBuilder
import react.ReactElement
import react.dom.h1
import react.dom.h3
import react.dom.p
import styled.css
import styled.styledDiv

object PolishResettlementAct : Page() {
    override val title: String = "Polish Resettlement Act (1947)"

    private const val FM_REVIEW_URL = "https://www.fmreview.org/resettlement/blaszczyk"
    private const val FM_REVIEW_NAME = "Forced Migration Review"

    private const val YNET_NEWS_URL = "https://www.ynetnews.com/articles/0,7340,L-3302233,00.html"
    private const val YNET_NEWS_NAME = "ynet News"

    private const val UK_GOV_URL = "http://www.legislation.gov.uk/ukpga/Geo6/10-11/19"
    private const val UK_GOV_NAME = "UK Public General Acts: 1947 CHAPTER 19 10 and 11 Geo 6"

    override val mediaURLs: List<MediaInfo> = listOf(
        ImageInfo(
            url = "https://upload.wikimedia.org/wikipedia/commons/5/5c/Winston_Churchill_reviewing_Polish_troops_in_England.PNG",
            sourceURL = "https://en.wikipedia.org/wiki/Poles_in_the_United_Kingdom",
            sourceName = "Wikipedia"
        )
    )

    override fun RBuilder.addContent(): ReactElement =
        styledDiv {
            h1 {
                +"Polish Resettlement Act of 1947"
            }
            p {
                +"""
                    The Polish Resettlement Act of 1947 was passed to give Polish forces and refugees abroad a 
                     place to live and work.
                     Over 10,000 of the Polish forces were Jewish.
                """.trimIndent()
            }
            h3 {
                +"Why"
            }
            p {
                +"""
                    Because of the occupation of Poland by the USSR, many Poles unable to return to their homeland.
                     The Free Polish Army fought under British command, thus its soldiers were seen as influenced
                     by western ideals and were forced to remain in exile from their (now communist) homeland.
                """.trimIndent()
            }
            h3 {
                +"Effect"
            }
            p {
                +"""
                    By allowing the Polish community to become UK citizens, Britain gave itself a new workforce that
                     could help it to rebuild financially and physically.
                     It allowed the thousands of Poles housed in Polish Resettlement Corps camps to settle in
                     places such as London.
                """.trimIndent()
            }
            styledDiv {
                css {
                    width = LinearDimension.fillAvailable
                }
                addSourceInfo(FM_REVIEW_URL, FM_REVIEW_NAME)
                addSourceInfo(YNET_NEWS_URL, YNET_NEWS_NAME)
                addSourceInfo(UK_GOV_URL, UK_GOV_NAME)
            }
        }

}