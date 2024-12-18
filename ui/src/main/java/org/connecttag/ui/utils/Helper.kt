package org.connecttag.ui.utils


import androidx.activity.ComponentActivity
import androidx.compose.runtime.staticCompositionLocalOf



val LocalActivity = staticCompositionLocalOf<ComponentActivity> {
    noLocalProvidedFor("LocalActivity")
}

private fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}
