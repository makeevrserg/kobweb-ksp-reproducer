@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val wipesWikiPage = buildList {

    add(WikiItem.Item.Card("     .  1.15 -> 1.16 -> 1.17 -> 1.18"))
    add(WikiItem.Item.Card("     "))
    add(WikiItem.Item.Card("    ~14 "))
    add(WikiItem.Item.Card("      2023"))
    add(
        WikiItem.Item.Card.invoke {
            add("  ?   !")
            add("   ,  SMP .   -     ")
            add("         ,    -  ")
        }
    )
    add(
        WikiItem.Item.Card.invoke {
            add("       ?     !")
            add(
                "   :    , , , , Essentials"
            )
            add(
                "     ItemsAdder,      -    "
            )
            add("   ,      ")
            add("   ,  ")
            add(" ( 4- )!")
            add(
                "    ,   !            !"
            )
        }
    )
}
