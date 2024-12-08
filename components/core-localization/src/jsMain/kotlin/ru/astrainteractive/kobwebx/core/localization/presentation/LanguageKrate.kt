package ru.astrainteractive.kobwebx.core.localization.presentation

import ru.astrainteractive.kobwebx.core.krate.DefaultEnumKrate
import ru.astrainteractive.kobwebx.core.krate.EnumKrate
import ru.astrainteractive.kobwebx.core.localization.model.Localization

object LanguageKrate : EnumKrate<Localization> by DefaultEnumKrate(
    key = "LANG",
    entries = { Localization.entries }
)
