package kspreproducer.feature.wiki.ui.component

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.style.breakpoint.ResponsiveValues
// import empiresmp.components.hrefcard.HrefCard
// import ru.astrainteractive.kobwebx.core.resource.Hrefs
// import ru.astrainteractive.kobwebx.core.resource.Resources

@Composable
fun MainWikiLayout() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        SimpleGrid(ResponsiveValues(1, 1, 2, 2, 3)) {
//            HrefCard(Resources.iconVk.path, "Вконтакте", Hrefs.VK)
//            HrefCard(Resources.iconTelegram.path, "Telegram", Hrefs.TELEGRAM)
//            HrefCard(Resources.iconDiscord.path, "Дисокрд", Hrefs.DICSORD)
//            HrefCard(Resources.iconYoutube.path, "Youtube", Hrefs.YOUTUBE)
//            HrefCard(Resources.iconGithub.path, "Github", Hrefs.GITHUB)
//            HrefCard(Resources.iconResourcePack.path, text = "Ресурс-пак", href = Hrefs.RESOURCE_PACK)
        }
//        HrefCard(text = "Вики переехала сюда", href = "https://astra-interactive.github.io/EmpireNetwork/")
    }
}
