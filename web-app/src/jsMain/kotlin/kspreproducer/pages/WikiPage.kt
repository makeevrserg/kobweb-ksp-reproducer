package kspreproducer.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import kspreproducer.feature.wiki.ui.WikiPageContent

@Page("/wiki")
@Composable
fun WikiPage() {
    val ctx = rememberPageContext()
    val fragment = ctx.route.fragment
    WikiPageContent(fragment.orEmpty())
}
