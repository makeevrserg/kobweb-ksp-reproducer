package kspreproducer.feature.wiki.presentation.model

sealed interface WikiItem {
    class Section(val title: String) : WikiItem
    class Text(val text: String) : WikiItem

    sealed interface Item : WikiItem {
        class Expandable(val title: String, vararg val texts: String) : Item {
            companion object {
                operator fun invoke(title: String, builderAction: MutableList<String>.() -> Unit): Expandable {
                    val list = buildList(builderAction).toTypedArray()
                    return Expandable(title, texts = list)
                }
            }
        }

        class Card(vararg val texts: String) : Item {
            companion object {
                operator fun invoke(builderAction: MutableList<String>.() -> Unit): Card {
                    val list = buildList(builderAction).toTypedArray()
                    return Card(texts = list)
                }
            }
        }
    }
}
