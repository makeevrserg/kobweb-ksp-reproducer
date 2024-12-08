package ru.astrainteractive.kobwebx.core.localization.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import ru.astrainteractive.kobwebx.core.localization.core.StringResource
import ru.astrainteractive.kobwebx.core.localization.model.Localization

val LocalLanguage = compositionLocalOf { Localization.EN }

@Composable
fun StringResource.localized(): String {
    return localized(LocalLanguage.current)
}
