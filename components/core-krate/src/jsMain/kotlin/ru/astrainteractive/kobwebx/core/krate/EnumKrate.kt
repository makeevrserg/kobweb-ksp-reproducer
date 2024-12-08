package ru.astrainteractive.kobwebx.core.krate

import kotlinx.coroutines.flow.StateFlow

interface EnumKrate<T : Enum<T>> {
    val stateFlow: StateFlow<T>
    fun set(value: T)
    fun next()
}
