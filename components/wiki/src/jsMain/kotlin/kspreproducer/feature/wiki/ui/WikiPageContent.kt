package kspreproducer.feature.wiki.ui

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import kspreproducer.feature.wiki.ui.component.MainWikiLayout

@Suppress("LongMethod")
@Composable
fun WikiPageContent(fragment: String) {
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            Modifier
        ) {
            MainWikiLayout()
        }
    }
}
