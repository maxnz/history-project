package pages

import G_H_JOURNAL
import JEW_MUE_LON
import UK_NAT_ARCH_INTERNMENT
import pages.pageutils.ImageInfo
import pages.pageutils.MediaInfo
import pages.pageutils.Page
import react.RBuilder
import react.ReactElement
import react.dom.h1
import react.dom.h3
import react.dom.p
import styled.styledDiv

object Internment : Page() {
    override val title = "Internment in Britain"


    override val mediaURLs: List<MediaInfo> = listOf(
        ImageInfo(
            url = "https://cdn.nationalarchives.gov.uk/blog/wp-content/uploads/2015/06/01155541/HO-213_10531.jpg",
            sourceInfo = UK_NAT_ARCH_INTERNMENT
        )
    )

    override fun RBuilder.addContent(): ReactElement =
        styledDiv {
            h1 {
                +"Internment of Jews in Britain"
            }
            p {
                +"""
                    Once World War II started, a large distrust of refugees formed.
                    At first, enemy aliens were subject to curfews and other restrictions.
                    The fall of France prompted the start of internment camps for refugees,
                     designed to get potential Nazi sympathizers off the streets and out of trouble.
                    This may sound similar to the concentration camps in German-occupied europe, but they were quite
                     different in terms of how they treated their internees.
                    Britain recognized that innocent people would be caught by the large net cast to catch all Nazis,
                     so they treated all prisoners the same, with a high level of respect.
                    One inmate recounts an incident where they were being moved to another camp and a guard tells them
                     "faster, faster".
                    This inmate told the guard that the man in front of him was 70, and the guard stopped, quite the
                     opposite of what we would expect from a stereotypical guard at a Nazi concentration camp.
                    A lot of the occasional cruelty or rudeness of the guards was caused by carelessness or ignorance.
                    Their behavior would become more gentlemanly once they were reminded of the "common decencies
                     of humanity".
                """.trimIndent()
            }
            h3 {
                +"Effect"
            }
            p {
                +"""
                    The anti-alien sentiment passed, especially by mid-1940.
                    The sinking of a deportation transport, the Arandora Star, by a German submarine prompted a
                     public outcry that caused the government to initiate policy change.
                    Many of the refugees were needed to help keep the war machine going, allowing them to prove their
                     loyalty to their new country.
                    Refugees were welcomed to join the non-combatant Pioneer Corps and multiple branches of Her
                     Majesty's Forces.
                    But to the refugees, the level of distrust was disappointing.
                    This prompted them to move on to other countries after the war, in search of a home that would
                     accept them.
                """.trimIndent()
            }
            sources {
                addSourceInfo(G_H_JOURNAL)
                addSourceInfo(JEW_MUE_LON)
            }
        }
}