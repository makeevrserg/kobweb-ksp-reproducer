package kspreproducer.feature.wiki.presentation.model

sealed interface WikiItem {
    class Section(val title: String) : WikiItem
    class Text(val text: String) : WikiItem
}
