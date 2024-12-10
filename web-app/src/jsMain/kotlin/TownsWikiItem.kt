@file:Suppress("MaxLineLength")

val townsWiki = buildList {
    listOf("").run(::add)
    listOf(
            "  ,       Towny.   -    ."
        )
        .run(::add)
    listOf("  -  -   /towny menu")
        .run(::add)
    // Section ------------------------------------------------------------------
    listOf("").run(::add)
    "        https://map.empireprojekt.ru"
        .run(::add)
    listOf(
        "/towny universe -  ,  ,   ." +
                "/town list -  " +
                "/nation list -  " +
                "/towny prices -      ." +
                "/town -     " +
                "/town plots -     " +
                "/towny time -       "
    ).run(::add)
    // Section ------------------------------------------------------------------
    listOf(" ").run(::add)
    "⚠️️       "
        .run(::add)
    "⚠️️      .  F3+G   "
        .run(::add)
    "⚠️️    "
        .run(::add)
    listOf(
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
    listOf("").run(::add)
    listOf("   -  .     .")
        .run(::add)
    listOf("  /town          ")
        .run(::add)
    listOf(
            "     -  .      .     /town   .     -        !"
        )
        .run(::add)
    listOf(
            "⚠\uFE0F    .  ,        . " +
                    ",      10\$ -   5       100\$. " +
                    "        100\$     . " +
                    "           ."
        ).run(::add)
    listOf("⚠\uFE0F,    ,     !")
        .run(::add)
    listOf("⚠\uFE0F,    ,     !")
    ("⚠\uFE0F,          ")
        .run(::add)
    listOf("⚠\uFE0F,    ,     !")
    (
        "/town deposit  -    " +
                "/town withdraw  -    " +
                "/town set tax  -    " +
                "/town toggle taxpercent -    .    %   "
    ).run(::add)
    listOf("⚠\uFE0F,    ,     !")
    ("      ")
        .run(::add)
    listOf("⚠\uFE0F,    ,     !")
    (
        "/t set plottax  -      "
    ).run(::add)

    // Section ------------------------------------------------------------------
    listOf(" ").run(::add)
    listOf("⚠\uFE0F,    ,     !")
    (
            "     .       -     ,    ."
        )
        .run(::add)
    listOf(
        "/plot fs  -    " +
                "/plot nfs -    "
    ).run(::add)

    // Section ------------------------------------------------------------------
    listOf("").run(::add)
    listOf(
        "/t set perm off -     " +
                "/plot toggle  - /  ,   ." +
                "/plot set perm off -          " +
                "/t set perm resident build on -    ,       ." +
                "/t set perm    -   .  .   ,   " +
                "/plot set perm    -      .   ,   " +
                "/plot perm hud - /   "
    ).run(::add)

    // Section ------------------------------------------------------------------
    listOf(" ").run(::add)
    listOf(
        buildString {
            append("    . ")
            append(",        -. ")
            append(" . ")
            append("        .")
        }
    ).run(::add)
    listOf(
        "/plot set _ -    .     " +
                "/plot set farm - .   .     /towny map"
    ).run(::add)
}
