package pages

import FM_REVIEW
import UK_GOV_PRA
import UK_NAT_ARCH_POLISH
import WIKI_POLE_UK
import YNET_NEWS
import pages.pageutils.ImageInfo
import pages.pageutils.MediaInfo
import pages.pageutils.Page
import react.RBuilder
import react.ReactElement
import react.dom.h1
import react.dom.h3
import react.dom.p
import styled.styledDiv

object PolishResettlementAct : Page() {
    override val title: String = "Polish Resettlement Act of 1947"


    override val mediaURLs: List<MediaInfo> = listOf(
        ImageInfo(
            url = "https://upload.wikimedia.org/wikipedia/commons/5/5c/Winston_Churchill_reviewing_Polish_troops_in_England.PNG",
            sourceInfo = WIKI_POLE_UK
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
                    In total, approximately 200,000 Poles were brought to Britain, including wives and children.
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
            sources {
                addSourceInfo(FM_REVIEW)
                addSourceInfo(YNET_NEWS)
                addSourceInfo(UK_GOV_PRA)
                addSourceInfo(UK_NAT_ARCH_POLISH)
            }
        }

}