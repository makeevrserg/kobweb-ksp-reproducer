@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val adminRulesWiki = buildList {
    add(WikiItem.Text("blablalbabbalblablabl"))
    add(WikiItem.Text("blablalbabbalblablabl"))
    add(WikiItem.Text("blablalbabbalblablabl"))
    add(WikiItem.Text("blablalbabbalblablabl"))

    add(WikiItem.Item.Card("blablalbabbalblablabl"))
    add(WikiItem.Item.Card("blablalbabbalblablabl"))
    add(WikiItem.Item.Card("blablalbabbalblablabl"))
    add(WikiItem.Item.Card("blablalbabbalblablabl"))
    add(
        WikiItem.Item.Card(
            "blablalbabbalblablabl"
        )
    )
    add(WikiItem.Item.Card("blablalbabbalblablabl"))
    add(
        WikiItem.Item.Expandable("blablalbabbalblablabl") {
            add("blablalbabbalblablabl")
            add(
                "blablalbabbalblablabl"
            )
            add(
                "blablalbabbalblablabl"
            )
        }
    )
}
