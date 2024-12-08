@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val economicsWikiPage = buildList {
    WikiItem.Section("").run(::add)
    WikiItem.Item.Card(
        "     ",
        "/ashop -  ",
        "/ashop qs -  "
    ).run(::add)

    WikiItem.Item.Card(
        "   ",
        "/amarket open -  ",
        "/amarket sell   -      ",
    ).run(::add)

    WikiItem.Item.Expandable("    !    ,    !") {
        "   ,     .     .".run(::add)
        "  ,       ".run(::add)
    }.run(::add)

    WikiItem.Section("").run(::add)

    WikiItem.Item.Card(
        "    :",
        "/amarket open -     ",
        "/ashop -     ",
        "    .    "
    ).run(::add)
}
