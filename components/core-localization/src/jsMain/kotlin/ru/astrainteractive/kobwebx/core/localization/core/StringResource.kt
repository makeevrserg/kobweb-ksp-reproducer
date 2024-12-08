package ru.astrainteractive.kobwebx.core.localization.core

import ru.astrainteractive.kobwebx.core.localization.model.Localization

class StringResource(
    private val default: () -> String,
    private val russian: () -> String = default,
) {
    fun localized(language: Localization): String {
        return when (language) {
            Localization.RU -> russian.invoke()
            Localization.EN -> default.invoke()
        }
    }
}
