package pages

import G_H_JOURNAL
import JEW_MUE_LON
import pages.pageutils.Page
import react.RBuilder
import react.ReactElement
import react.dom.h1
import react.dom.p
import styled.styledDiv

object Refugees : Page() {
    override val title = "Immigration of Refugees"

    override fun RBuilder.addContent(): ReactElement =
        styledDiv {
            h1 {
                +"Refugees in Britain"
            }
            p {
                +"""
                    In 1939, the Central British Fund for German Jewry (CBF) was set up.
                    It guaranteed to the government that it would bear all costs of 
                     maintaining Jewish refugees.
                    In September, 70,000 Jews were granted refuge, mainly in North-West London.
                    Men were able to get transit visas to re-emigrate to other countries.
                    Women were able to get visas to come work as domestic servants.
                    Children were able to come without visas on Kindertransports.
                    They also were typically "young, educated and productive" members of society.
                    Refugees were encouraged to use Britain as only an intermediary point 
                     on their way to other countries.
                    
                """.trimIndent()
            }
            sources {
                addSourceInfo(JEW_MUE_LON)
                addSourceInfo(G_H_JOURNAL)
            }
        }
}