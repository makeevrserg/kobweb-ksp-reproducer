@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val adminRulesWiki = buildList {
    add(WikiItem.Text("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Text("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Text("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Text("йцукенгшщзхъфывапролджэячсмитьбю"))

    add(WikiItem.Item.Card("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Item.Card("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Item.Card("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Item.Card("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(
        WikiItem.Item.Card(
            "йцукенгшщзхъфывапролджэячсмитьбю"
        )
    )
    add(WikiItem.Item.Card("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(
        WikiItem.Item.Expandable("йцукенгшщзхъфывапролджэячсмитьбю") {
            add("йцукенгшщзхъфывапролджэячсмитьбю")
            add(
                "йцукенгшщзхъфывапролджэячсмитьбю"
            )
            add(
                "йцукенгшщзхъфывапролджэячсмитьбю"
            )
        }
    )
}
