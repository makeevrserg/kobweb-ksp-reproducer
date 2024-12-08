package kspreproducer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.App

@App
@Composable
fun Application(content: @Composable () -> Unit) {
    content.invoke()
}
