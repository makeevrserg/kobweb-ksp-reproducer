package kspreproducer.feature.wiki.presentation

import kspreproducer.feature.wiki.presentation.model.WikiItem
import kotlinx.coroutines.flow.StateFlow

interface WikiPageComponent {
    val pages: List<Model>

    val currentPage: StateFlow<Model.Page>

    fun selectPage(page: Model.Page)

    sealed interface Model {

        sealed class Page(
            val fragment: String,
            val title: String,
        ) : Model {
            data object MainWikiPage : Page(
                fragment = "/wiki",
                title = "Вики EmpireSMP",
            )

            data class WikiPageModel(
                val fragmentInternal: String,
                val titleInternal: String,
                val contents: List<WikiItem>
            ) : Page(fragmentInternal, titleInternal)

            data class WikiWithSubPageModel(
                val fragmentInternal: String,
                val titleInternal: String,
                val contents: List<WikiItem>,
                val pages: List<Page>
            ) : Page(fragmentInternal, titleInternal)
        }
    }

    companion object {
        fun Model.Page.WikiWithSubPageModel.children(): List<Model> {
            return pages + pages
                .filterIsInstance<Model.Page.WikiWithSubPageModel>()
                .flatMap { it.children() }
        }

        fun WikiPageComponent.pagesWithChildren(): List<Model> {
            return pages + pages
                .filterIsInstance<Model.Page.WikiWithSubPageModel>()
                .flatMap { it.children() }
        }
    }
}
