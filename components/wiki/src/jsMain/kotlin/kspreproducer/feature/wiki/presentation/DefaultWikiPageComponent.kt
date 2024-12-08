package kspreproducer.feature.wiki.presentation

import kspreproducer.feature.wiki.presentation.page.adminRulesWiki
import kspreproducer.feature.wiki.presentation.page.baseWikiPage
import kspreproducer.feature.wiki.presentation.page.commandsWikiPage
import kspreproducer.feature.wiki.presentation.page.economicsWikiPage
import kspreproducer.feature.wiki.presentation.page.rulesWIki
import kspreproducer.feature.wiki.presentation.page.townsWiki
import kspreproducer.feature.wiki.presentation.page.wipesWikiPage
import kotlinx.coroutines.flow.MutableStateFlow

class DefaultWikiPageComponent : WikiPageComponent {
    override val pages: List<WikiPageComponent.Model> = listOf(
        WikiPageComponent.Model.Page.MainWikiPage,
        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "core",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = baseWikiPage,
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "wipes",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = wipesWikiPage
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = rulesWIki
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules_mod",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = adminRulesWiki
                ),
            )
        ),

        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "economy",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = economicsWikiPage
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "commands",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = commandsWikiPage
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "towns",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = townsWiki
        ),

        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "towns",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = townsWiki,
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "towns",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = townsWiki
                ),
                WikiPageComponent.Model.Page.WikiWithSubPageModel(
                    fragmentInternal = "towns",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = townsWiki,
                    pages = listOf(
                        WikiPageComponent.Model.Page.WikiPageModel(
                            fragmentInternal = "towns",
                            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                            contents = townsWiki,
                        ),
                        WikiPageComponent.Model.Page.WikiWithSubPageModel(
                            fragmentInternal = "towns",
                            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                            contents = townsWiki,
                            pages = listOf(
                                WikiPageComponent.Model.Page.WikiPageModel(
                                    fragmentInternal = "towns",
                                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                                    contents = townsWiki
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
