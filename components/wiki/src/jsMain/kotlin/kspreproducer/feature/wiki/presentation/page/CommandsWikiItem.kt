@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val commandsWikiPage = buildList {
    add(WikiItem.Section("йцукенгшщзхъфывапролджэячсмитьбю"))
    WikiItem.Item.Card(
        "Essentials",
        "йцукенгшщзхъфывапролджэячсмитьбю"
    ).run(::add)
    WikiItem.Item.Card(
        "",
        "йцукенгшщзхъфывапролджэячсмитьбю",
        "йцукенгшщзхъфывапролджэячсмитьбю"
    ).run(::add)
    WikiItem.Item.Card(
        " ",
        "/amarket -  йцукенгшщзхъфывапролджэячсмитьбю",
        "/amarket expired -  ё ",
        "/amarket sell йцукенгшщзхъфывапролджэячсмитьбю    ",
        "      "
    ).run(::add)
    WikiItem.Item.Card(
        " ",
        "/arating like/dislike йцукенгшщзхъфывапролджэячсмитьбю",
    ).run(::add)
    WikiItem.Item.Card(
        "",
        "/skin [ ]/[URL] -   ",
    ).run(::add)
//    WikiItem.Item.Card(
//        " ",
//        "/ia",
//    ).run(::add)
    WikiItem.Item.Card(
        "  ",
        "    .      -    ",
        "/souls -  ",
    ).run(::add)
}
