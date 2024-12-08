@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val mechanicsWikiPage = buildList {
    WikiItem.Text(
        "    , , , ,    !"
    ).run(::add)
    WikiItem.Section(
        ":       "
    ).run(::add)
    WikiItem.Item.Expandable(
        " ?",
        "      ,    ,   /ia.      ,      .",
        "  ,       .     ,     ,   ё ,   .",
        "      ,   ё ."
    ).run(::add)
    WikiItem.Item.Expandable(
        "      ?",
        "     - .       ,  : , , .   ё  .",
        "  .    : ,   , ,     ,   ,         .",
        "   ,       -    .       ,         10 .               /spawn.",
        "     ,        ,     - ,  ,           .",
    ).run(::add)

    WikiItem.Item.Expandable(
        " ,      ",
        "       ,   .  2  :   .",
        "        .        ? !          .",
        " - ?  !         ,      !",
        "  ,                 ё     -  ,    .",
        ",   ,   - ,         ,   ,     .",
        "          !"
    ).run(::add)
    WikiItem.Section(
        ""
    ).run(::add)

    WikiItem.Item.Expandable(
        " ",
        "  .   , ,   ,     ,   .       .      4   4  .       ,        c 0  30 .",
    ).run(::add)
    WikiItem.Item.Expandable(
        " ",
        "  ,   ,       ,    .     ,       ё .      ,       .   -     ,  -    ,  -   .      .   ,     0  -64 .      - , ё         .        .     .",
    ).run(::add)
    WikiItem.Item.Expandable(
        " ",
        "  ,      ,     .       .   ,     0  -64 .   ,        -.",
    ).run(::add)
    WikiItem.Item.Expandable(
        " ",
        "  .       ,    ,     .    ,      .         .         .      4  ,        0  -64 .",
    ).run(::add)
    WikiItem.Section(
        ""
    ).run(::add)

    WikiItem.Item.Card(
        "   3  :  ,     .",
        "         4  : , ,   .",
        "    ,   .    2    1  . ",
        "     1  3  ,        . ",
        "   ,           . ",
        "      .     - 1 ,   - 2,   - 3,    - 4. ,    ё  .",
        "    ,     ,     /ia.            ."
    ).run(::add)
    WikiItem.Section(
        " "
    ).run(::add)

    WikiItem.Item.Card(
        "   ,       . ",
        "        . ",
        "   5  10 .      /kit level_[  5  10]   24 . ,       .",
    ).run(::add)
}
