@file:Suppress("MaxLineLength")

package kspreproducer.feature.wiki.presentation.page

import kspreproducer.feature.wiki.presentation.model.WikiItem

val townsWiki = buildList {
    WikiItem.Section("").run(::add)
    WikiItem
        .Text(
            "  ,       Towny.   -    ."
        )
        .run(::add)
    WikiItem
        .Text("  -  -   /towny menu")
        .run(::add)
    // Section ------------------------------------------------------------------
    WikiItem.Section("").run(::add)
    "        https://map.empireprojekt.ru"
        .let(WikiItem::Text)
        .run(::add)
    WikiItem.Text(
        "/towny universe -  ,  ,   ." +
                "/town list -  " +
                "/nation list -  " +
                "/towny prices -      ." +
                "/town -     " +
                "/town plots -     " +
                "/towny time -       "
    ).run(::add)
    // Section ------------------------------------------------------------------
    WikiItem.Section(" ").run(::add)
    "⚠️️       "
        .let(WikiItem::Text)
        .run(::add)
    "⚠️️      .  F3+G   "
        .let(WikiItem::Text)
        .run(::add)
    "⚠️️    "
        .let(WikiItem::Text)
        .run(::add)
    WikiItem.Text(
        "/town new ___ -  .   ,  ,    , " +
                "/town _ -   " +
                "/resident _ -   " +
                "/t spawn -   " +
                "/town set spawn -         " +
                "/resident toggle constantplotborder -  F3+G" +
                "/town claim -   " +
                "/town map -     " +
                "/town buy bonus 1 -    " +
                "/town invite  -    " +
                "/town toggle open -   /  "
    ).run(::add)

    // Section ------------------------------------------------------------------
    WikiItem.Section("").run(::add)
    WikiItem
        .Text("   -  .     .")
        .run(::add)
    WikiItem
        .Text("  /town          ")
        .run(::add)
    WikiItem
        .Text(
            "     -  .      .     /town   .     -        !"
        )
        .run(::add)
    WikiItem
        .Text(
            "⚠\uFE0F    .  ,        . " +
                    ",      10\$ -   5       100\$. " +
                    "        100\$     . " +
                    "           ."
        ).run(::add)
    WikiItem
        .Text("⚠\uFE0F,    ,     !")
        .run(::add)
    WikiItem
        .Text("⚠\uFE0F,          ")
        .run(::add)
    WikiItem.Text(
        "/town deposit  -    " +
                "/town withdraw  -    " +
                "/town set tax  -    " +
                "/town toggle taxpercent -    .    %   "
    ).run(::add)
    WikiItem
        .Text("      ")
        .run(::add)
    WikiItem.Text(
        "/t set plottax  -      "
    ).run(::add)

    // Section ------------------------------------------------------------------
    WikiItem.Section(" ").run(::add)
    WikiItem
        .Text(
            "     .       -     ,    ."
        )
        .run(::add)
    WikiItem.Text(
        "/plot fs  -    " +
                "/plot nfs -    "
    ).run(::add)

    // Section ------------------------------------------------------------------
    WikiItem.Section("").run(::add)
    WikiItem.Text(
        "/t set perm off -     " +
                "/plot toggle  - /  ,   ." +
                "/plot set perm off -          " +
                "/t set perm resident build on -    ,       ." +
                "/t set perm    -   .  .   ,   " +
                "/plot set perm    -      .   ,   " +
                "/plot perm hud - /   "
    ).run(::add)

    // Section ------------------------------------------------------------------
    WikiItem.Section(" ").run(::add)
    WikiItem.Text(
        buildString {
            append("    . ")
            append(",        -. ")
            append(" . ")
            append("        .")
        }
    ).run(::add)
    WikiItem.Text(
        "/plot set _ -    .     " +
                "/plot set farm - .   .     /towny map"
    ).run(::add)
}
