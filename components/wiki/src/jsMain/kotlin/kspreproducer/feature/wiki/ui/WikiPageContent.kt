package kspreproducer.feature.wiki.ui

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
//import kspreproducer.components.PlatformExt.isMobilePlatform
//import kspreproducer.components.layouts.PageLayout
//import kspreproducer.components.navbar.EmpireSmpDesktopNavBar
import kspreproducer.feature.wiki.ui.component.MainWikiLayout

//import ru.astrainteractive.kobwebx.core.theme.composable.LocalSitePalette

@Suppress("LongMethod")
@Composable
fun WikiPageContent(fragment: String) {
//    val theme = LocalSitePalette.current

//    PageLayout {
//        EmpireSmpDesktopNavBar()
        Row(
//            modifier = Modifier.fillMaxWidth().padding(topBottom = theme.dimens.L),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                Modifier
//                    .padding(left = theme.dimens.L, right = theme.dimens.L)
//                    .thenIf(isMobilePlatform, Modifier.width(95.percent))
//                    .thenIf(!isMobilePlatform, Modifier.width(80.percent)),
//                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MainWikiLayout()
            }
        }
//    }
}
