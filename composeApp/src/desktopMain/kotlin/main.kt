import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.compose.resources.painterResource

import kmpdesktopapp.composeapp.generated.resources.Res
import kmpdesktopapp.composeapp.generated.resources.icon
import ui.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP Desktop App",
        icon = painterResource(Res.drawable.icon)
    ) {
        App()
    }
}