package kspreproducer.feature.wiki.presentation

import kotlinx.coroutines.flow.MutableStateFlow
import kspreproducer.feature.wiki.presentation.page.adminRulesWiki

class DefaultWikiPageComponent : WikiPageComponent {
    override val pages: List<WikiPageComponent.Model> = listOf(
        WikiPageComponent.Model.Page.MainWikiPage,
        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "core",
            titleInternal = "Core",
            contents = adminRulesWiki,
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "wipes",
                    titleInternal = "Wipes",
                    contents = adminRulesWiki
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules",
                    titleInternal = "Rules-server",
                    contents = adminRulesWiki
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules_mod",
                    titleInternal = "Rules-moder",
                    contents = adminRulesWiki
                ),
            )
        ),

        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "economy",
            titleInternal = "Economy",
            contents = adminRulesWiki
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "commands",
            titleInternal = "Commands",
            contents = adminRulesWiki
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "towns",
            titleInternal = "Towns",
            contents = adminRulesWiki
        ),

        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "towns",
            titleInternal = "Towns1",
            contents = adminRulesWiki,
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "towns",
                    titleInternal = "towns 1-1",
                    contents = adminRulesWiki
                ),
                WikiPageComponent.Model.Page.WikiWithSubPageModel(
                    fragmentInternal = "towns",
                    titleInternal = "towns 1-2",
                    contents = adminRulesWiki,
                    pages = listOf(
                        WikiPageComponent.Model.Page.WikiPageModel(
                            fragmentInternal = "towns",
                            titleInternal = "towns 1-2-1",
                            contents = adminRulesWiki,
                        ),
                        WikiPageComponent.Model.Page.WikiWithSubPageModel(
                            fragmentInternal = "towns",
                            titleInternal = "towns 1-2-1-1",
                            contents = adminRulesWiki,
                            pages = listOf(
                                WikiPageComponent.Model.Page.WikiPageModel(
                                    fragmentInternal = "towns",
                                    titleInternal = "towns 1-2-1-2",
                                    contents = adminRulesWiki
                                ),
                            )
                        )
                    )
                )
            )
        ),
    )
    override val currentPage = MutableStateFlow(pages.filterIsInstance<WikiPageComponent.Model.Page>().first())

    override fun selectPage(page: WikiPageComponent.Model.Page) {
        currentPage.value = page
    }
}
