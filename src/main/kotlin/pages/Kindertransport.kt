package pages

import HISTORY_COM
import JEW_MUE_LON
import USHMM
import WIKI_HIST_JEW_BRIT
import kotlinx.css.Display
import kotlinx.css.LinearDimension
import kotlinx.css.display
import kotlinx.css.marginRight
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
    override val title = "Kindertransport"

    override val mediaURLs = listOf(
        ImageInfo(  // Crossing tracks
            url = "https://encyclopedia.ushmm.org/images/large/fa16bc48-df16-431c-bb5c-226fb3b9b499.jpg",
            sourceInfo = USHMM
        ),
        ImageInfo(  // Boarding train
            url = "https://www.history.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTYwNjUyMDExNTM1MDgyNjY3/kindertransport-getty-56464302.webp",
            sourceInfo = HISTORY_COM
        ),
        ImageInfo(  // Ship
            url = "https://www.history.com/.image/ar_266:100%2Cc_fill%2Ccs_srgb%2Cg_faces:center%2Cq_auto:good%2Cw_2560/MTYwNjUyMDExMjY2NjQ3MjEx/kindertransport-getty-3364204.webp",
            sourceInfo = HISTORY_COM
        ),
        ImageInfo(  // Disembarking ship
            url = "https://www.history.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_300/MTYwNjUyMDExNTM1MDgzMDU0/kindertransport-getty-3431856.webp",
            sourceInfo = HISTORY_COM
        ),
        ImageInfo(  // Homes
            url = "https://encyclopedia.ushmm.org/images/large/52df7736-cdd2-4358-85cf-7b6098dba4d7.jpg",
            sourceInfo = USHMM
        ),
        ImageInfo(  // Statue
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Kindertransport-Meisler.jpg/800px-Kindertransport-Meisler.jpg",
            sourceInfo = WIKI_HIST_JEW_BRIT
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/a4311865-f687-455a-a60f-16916c800d4f.mp4",
            sourceInfo = USHMM
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/9da0b500-3acb-4c8f-a3ca-05dfbbd00e3f.mp4",
            sourceInfo = USHMM
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/a911382e-d923-4918-a893-d9a1e3b9451f.mp4",
            sourceInfo = USHMM
        ),
        VideoInfo(
            url = "https://encyclopedia.ushmm.org/asset/64c8afd2-d83a-4f62-94ee-98d6fd20e9fb.mp4",
            sourceInfo = USHMM
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
                    Nearly 10,000 Jewish children were transported without visas.  
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
                    The transports increased anti-Semitic views in Britain.
                    These views led to the passing of legislation that permitted internment of "enemy aliens".
                """.trimIndent()
            }
            sources {
                addSourceInfo(USHMM)
                addSourceInfo(HISTORY_COM)
                addSourceInfo(JEW_MUE_LON)
            }
        }
}