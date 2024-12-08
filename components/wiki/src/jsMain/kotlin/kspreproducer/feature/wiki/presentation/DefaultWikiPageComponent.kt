package kspreproducer.feature.wiki.presentation

import kotlinx.coroutines.flow.MutableStateFlow
import kspreproducer.feature.wiki.presentation.page.townsWiki

class DefaultWikiPageComponent : WikiPageComponent {
    override val pages: List<WikiPageComponent.Model> = listOf(
        WikiPageComponent.Model.Page.MainWikiPage,
        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "core",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = townsWiki,
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "wipes",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = townsWiki
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = townsWiki
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules_mod",
                    titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
                    contents = townsWiki
                ),
            )
        ),

        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "economy",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = townsWiki
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "commands",
            titleInternal = "йцукенгшщзхъфывапролджэячсмитьбю",
            contents = townsWiki
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
