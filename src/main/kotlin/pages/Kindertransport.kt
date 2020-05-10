package pages

import kotlinx.css.*
import pages.pageutils.ImageInfo
import pages.pageutils.Page
import pages.pageutils.VideoInfo
import react.RBuilder
import react.ReactElement
import react.dom.h1
import react.dom.h3
import react.dom.p
import styled.css
import styled.styledDiv

object Kindertransport : Page() {
    override val title = "Kindertransport (Child Transport)"

    private const val HISTORY_COM_URL = "https://www.history.com/news/holocaust-child-refugees-kindertransport-britain"
    private const val HISTORY_COM_NAME = "History.com"

    private const val USHMM_URL = "https://encyclopedia.ushmm.org/content/en/article/kindertransport-1938-40"
    private const val USHMM_NAME = "United States Holocaust Memorial Museum"

    override val mediaURLs = listOf(
        ImageInfo(  // Crossing tracks
            url = "https://encyclopedia.ushmm.org/images/large/fa16bc48-df16-431c-bb5c-226fb3b9b499.jpg",
            sourceURL = USHMM_URL,
            sourceName = USHMM_NAME
        ),
        ImageInfo(  // Boarding train
            url = "https://www.history.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTYwNjUyMDExNTM1MDgyNjY3/kindertransport-getty-56464302.webp",
            sourceURL = HISTORY_COM_URL,
            sourceName = HISTORY_COM_NAME
        ),
        ImageInfo(  // Ship
            url = "https://www.history.com/.image/ar_266:100%2Cc_fill%2Ccs_srgb%2Cg_faces:center%2Cq_auto:good%2Cw_2560/MTYwNjUyMDExMjY2NjQ3MjEx/kindertransport-getty-3364204.webp",
            sourceURL = HISTORY_COM_URL,
            sourceName = HISTORY_COM_NAME
        ),
        ImageInfo(  // Disembarking ship
            url = "https://www.history.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_300/MTYwNjUyMDExNTM1MDgzMDU0/kindertransport-getty-3431856.webp",
            sourceURL = HISTORY_COM_URL,
            sourceName = HISTORY_COM_NAME
        ),
        ImageInfo(  // Homes
            url = "https://encyclopedia.ushmm.org/images/large/52df7736-cdd2-4358-85cf-7b6098dba4d7.jpg",
            sourceURL = USHMM_URL,
            sourceName = USHMM_NAME
        ),
        ImageInfo(  // Statue
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Kindertransport-Meisler.jpg/800px-Kindertransport-Meisler.jpg",
            sourceURL = "https://en.wikipedia.org/wiki/History_of_the_Jews_in_England",
            sourceName = "Wikipedia"
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/a4311865-f687-455a-a60f-16916c800d4f.mp4",
            sourceURL = USHMM_URL,
            sourceName = USHMM_NAME
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/9da0b500-3acb-4c8f-a3ca-05dfbbd00e3f.mp4",
            sourceURL = USHMM_URL,
            sourceName = USHMM_NAME
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/a911382e-d923-4918-a893-d9a1e3b9451f.mp4",
            sourceURL = USHMM_URL,
            sourceName = USHMM_NAME
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/64c8afd2-d83a-4f62-94ee-98d6fd20e9fb.mp4",
            sourceURL = USHMM_URL,
            sourceName = USHMM_NAME
        )
    )

    override fun RBuilder.addContent(): ReactElement =
        styledDiv {
            css {
                display = Display.block
                marginRight = LinearDimension("2%")
            }
            h1 {
                +"Kindertransport"
            }
            p {
                +"""
                    The Kindertransport (translates to Child transport) was a program where Jewish children from
                     Germany, Austria and Czech lands were taken to Great Britain.
                     The children were taken in by families, with each child having mixed results due to 
                     lenient to nonexistent vetting of the families.
                     Priority was given to orphans, homeless children and children whose parents were in concentration camps.
                     Some children were sent by their families too.
                """.trimIndent()
            }
            h3 {
                +"Why"
            }
            p {
                +"""
                    Kristallnacht brought attention to how the Jews were being treated in Nazi Germany.
                     Public opinion shifted to welcome more refugees, prompting the British government to relax its
                     immigration laws.
                """.trimIndent()
            }
            h3 {
                +"Effect"
            }
            p {
                +"""
                    The transports helped increase anti-Semitic views in Britain.
                     These views led to the passing of legislation that permitted internment of "enemy aliens".
                """.trimIndent()
            }
            styledDiv {
                css {
                    width = LinearDimension.fillAvailable
                }
                addSourceInfo(USHMM_URL, USHMM_NAME)
                addSourceInfo(HISTORY_COM_URL, HISTORY_COM_NAME)
            }
        }
}