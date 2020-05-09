package pages.pageutils

import kotlinx.css.*
import kotlinx.html.id
import react.*
import react.dom.a
import react.dom.caption
import react.dom.h3
import styled.css
import styled.styledDiv
import styled.styledImg

abstract class Page : RComponent<RProps, RState>() {
    abstract val title: String
    abstract val navigationOptions: List<NavigationOption>
    open val mediaURLs: List<ImageInfo> = listOf()

    fun RBuilder.addMediaSection(): ReactElement =
        styledDiv {
            attrs {
                id = "media"
            }
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
            }
            h3 {
                +"Media"
            }
            addImages()
        }

    fun RBuilder.addImages() {
        for (media in mediaURLs)
            addImage(media)
    }

    fun RBuilder.addImage(imageInfo: ImageInfo): ReactElement =
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
            }
            styledImg {
                css {
                    width = LinearDimension("50%")
                }
                attrs {
                    src = imageInfo.url
                }
            }
            caption {
                +"Source: "
                a {
                    attrs {
                        href = imageInfo.sourceURL
                    }
                    +imageInfo.sourceName
                }
            }
        }
}