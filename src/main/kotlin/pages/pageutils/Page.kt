package pages.pageutils

import imports.ReactPlayer
import kotlinx.css.*
import kotlinx.html.id
import react.*
import react.dom.a
import react.dom.h3
import styled.css
import styled.styledDiv
import styled.styledImg
import styled.styledP

abstract class Page : RComponent<RProps, RState>() {
    abstract val title: String
    open val navigationOptions: List<NavigationOption> = listOf()
    open val mediaURLs: List<MediaInfo> = listOf()

    abstract fun RBuilder.addContent(): ReactElement

    override fun RBuilder.render() {
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                marginLeft = LinearDimension("1%")
                marginRight = LinearDimension("1%")
            }
            addContent()
            if (mediaURLs.isNotEmpty())
                addMediaSection()
        }
    }

    private fun RBuilder.addMediaSection(): ReactElement =
        styledDiv {
            css {
                width = LinearDimension.fillAvailable
                marginLeft = LinearDimension("2%")
            }
            styledDiv {
                attrs {
                    id = "media"
                }
                css {
                    display = Display.flex
                    flexDirection = FlexDirection.column
                    alignItems = Align.center
                }
                h3 {
                    +"Media"
                }
                addMedia()
            }
        }

    private fun RBuilder.addMedia() {
        for (media in mediaURLs)
            when (media) {
                is ImageInfo -> addImage(media)
                is VideoInfo -> addVideo(media)
            }
    }

    fun RBuilder.addSourceInfo(url: String, name: String): ReactElement =
        styledP {
            css {
                width = LinearDimension.fillAvailable
                color = Color("#6c757d")
            }
            +"Source: "
            a {
                attrs {
                    href = url
                }
                +name
            }
        }

    fun RBuilder.addImage(imageInfo: ImageInfo): ReactElement =
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
            }
            styledImg {
                css {
                    width = LinearDimension("100%")
                }
                attrs {
                    src = imageInfo.url
                }
            }
            addSourceInfo(imageInfo.sourceURL, imageInfo.sourceName)
        }

    fun RBuilder.addVideo(videoInfo: VideoInfo): ReactElement =
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.column
            }
            ReactPlayer {
                attrs.url = videoInfo.url
                attrs.controls = true
            }
            addSourceInfo(videoInfo.sourceURL, videoInfo.sourceName)
        }
}
