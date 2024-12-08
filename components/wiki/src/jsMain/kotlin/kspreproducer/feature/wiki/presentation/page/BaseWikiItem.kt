@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val baseWikiPage = buildList {
    add(WikiItem.Section("йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Section("FAQ"))
    add(WikiItem.Item.Expandable("йцукенгшщзхъфывапролджэячсмитьбю", "йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Item.Expandable("йцукенгшщзхъфывапролджэячсмитьбю", "10  йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Item.Expandable("йцукенгшщзхъфывапролджэячсмитьбю", "йцукенгшщзхъфывапролджэячсмитьбю"))
    add(WikiItem.Item.Expandable("йцукенгшщзхъфывапролджэячсмитьбю", "йцукенгшщзхъфывапролджэячсмитьбю"))
    add(
        WikiItem.Item.Expandable(
            "йцукенгшщзхъфывапролджэячсмитьбю",
            "йцукенгшщзхъфывапролджэячсмитьбю"
        )
    )
    add(
        WikiItem.Item.Expandable(
            "йцукенгшщзхъфывапролджэячсмитьбю",
            "йцукенгшщзхъфывапролджэячсмитьбю#\uD83C\uDFAEㆍ-,       ,      ."
        )
    )
}
