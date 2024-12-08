@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val rulesWIki = buildList {
    var i = 1
    val index = {
        "${i++}."
    }

    WikiItem.Item.Card("${index.invoke()}       ")
        .run(::add)

    WikiItem.Item.Card("${index.invoke()}     !")
        .run(::add)

    WikiItem.Item.Card(
        "${index.invoke()}    ,      !"
    ).run(::add)

    WikiItem.Item.Card(
        "${index.invoke()}     ,           "
    ).run(::add)

    WikiItem.Item.Card("${index.invoke()}            ")
        .run(::add)

    WikiItem.Item.Card("${index.invoke()}    ")
        .run(::add)

    WikiItem.Item.Card("${index.invoke()}  .         ")
        .run(::add)

    WikiItem.Item.Expandable("${index.invoke()}   ") {
        "  ,            "
            .run(::add)
    }.run(::add)

    WikiItem.Item.Expandable("${index.invoke()}  ") {
        "           "
            .run(::add)
        "        -     //  "
            .run(::add)
        "     . ,   ,       "
            .run(::add)
    }.run(::add)

    WikiItem.Item.Expandable("${index.invoke()}    ") {
        "   ,     "
            .run(::add)
        "  ,        "
            .run(::add)
        "   ,         "
            .run(::add)
        "          "
            .run(::add)
        "      ,      "
            .run(::add)
    }.run(::add)

    WikiItem.Section("  ")
        .run(::add)

    WikiItem.Item.Expandable("${index.invoke()}   ") {
        add(
            " ,     ,    -        "
        )
        add("      .")
        add("    .")
    }.run(::add)

    WikiItem.Item.Expandable(
        "${index.invoke()}   ",
        "      .        .      . "
    ).run(::add)

    WikiItem.Item.Card("${index.invoke()}   TOS    ")
        .run(::add)

    WikiItem.Item.Expandable("${index.invoke()}   ") {
        add("     .      ")
        add("      -      ")
        add("   NSFW   -  NSFW  -")
    }.run(::add)
}
