package kspreproducer.feature.wiki.presentation

import kotlinx.coroutines.flow.MutableStateFlow

class DefaultWikiPageComponent : WikiPageComponent {
    override val pages: List<WikiPageComponent.Model> = listOf(
        WikiPageComponent.Model.Page.MainWikiPage,
        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "core",
            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
            contents = emptyList(),
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "wipes",
                    titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                    contents = emptyList()
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules",
                    titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                    contents = emptyList()
                ),
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "rules_mod",
                    titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                    contents = emptyList()
                ),
            )
        ),

        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "economy",
            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
            contents = emptyList()
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "commands",
            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
            contents = emptyList()
        ),
        WikiPageComponent.Model.Page.WikiPageModel(
            fragmentInternal = "towns",
            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
            contents = emptyList()
        ),

        WikiPageComponent.Model.Page.WikiWithSubPageModel(
            fragmentInternal = "towns",
            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
            contents = emptyList(),
            pages = listOf(
                WikiPageComponent.Model.Page.WikiPageModel(
                    fragmentInternal = "towns",
                    titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                    contents = emptyList()
                ),
                WikiPageComponent.Model.Page.WikiWithSubPageModel(
                    fragmentInternal = "towns",
                    titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                    contents = emptyList(),
                    pages = listOf(
                        WikiPageComponent.Model.Page.WikiPageModel(
                            fragmentInternal = "towns",
                            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                            contents = emptyList(),
                        ),
                        WikiPageComponent.Model.Page.WikiWithSubPageModel(
                            fragmentInternal = "towns",
                            titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                            contents = emptyList(),
                            pages = listOf(
                                WikiPageComponent.Model.Page.WikiPageModel(
                                    fragmentInternal = "towns",
                                    titleInternal = "qwertyuiopasdfghjkkllzxcvbnm",
                                    contents = emptyList()
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
