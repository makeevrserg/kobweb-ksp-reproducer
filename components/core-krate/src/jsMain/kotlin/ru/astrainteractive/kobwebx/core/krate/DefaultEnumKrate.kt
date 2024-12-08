package ru.astrainteractive.kobwebx.core.krate

import kotlinx.browser.localStorage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlin.enums.EnumEntries

class DefaultEnumKrate<T : Enum<T>>(
    private val key: String,
    private val entries: () -> EnumEntries<T>
) : EnumKrate<T> {
    override val stateFlow by lazy { MutableStateFlow(load()) }

    override fun set(value: T) {
        localStorage.setItem(key, value.ordinal.toString())
        stateFlow.value = load()
    }

    override fun next() {
        val nextOrdinal = (stateFlow.value.ordinal + 1) % entries.invoke().size
        val nextTheme = entries.invoke()[nextOrdinal]
        set(nextTheme)
    }

    private fun load(): T {
        val storageItem = localStorage.getItem(key)?.toIntOrNull() ?: 0
        val theme = entries.invoke().getOrNull(storageItem) ?: entries.invoke().first()
        return theme
    }
}
