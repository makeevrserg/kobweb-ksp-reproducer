@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val imagemapsWikiPage = buildList {
    add(WikiItem.Section("     "))
    add(WikiItem.Section(""))
    add(
        WikiItem.Item.Card {
            add("•     ")
            add("•     ")
            add(
                "•   .  IP  . -        ,    -      IP"
            )
        }
    )
    add(WikiItem.Section(""))
    add(
        WikiItem.Item.Card {
            add("/yamipa describe -    ")
            add("/yamipa download \"URL\" NAME -    . \"\" - !")
            add("/yamipa list PAGE -     PAGE")
            add("/yamipa place NAME WIDTH HEIGHT -     NAME  WIDTH   HEIGHT")
            add("/yamipa remove -   ")
        }
    )
    add(WikiItem.Section(""))
    add(
        WikiItem.Item.Card {
            add("/yamipa download \"https://www.example.com/a/b/c/1234.jpg\" imagename.jpg")
            add("/yamipa place imagename.jpg 3 2")
            add("/yamipa place imagename.jpg 3 2 +GLOW")
        }
    )
}
