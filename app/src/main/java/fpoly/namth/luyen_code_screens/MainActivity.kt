package fpoly.namth.luyen_code_screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import fpoly.namth.luyen_code_screens.screens.ChattingScreen
import fpoly.namth.luyen_code_screens.screens.ElectricCarScreen
import fpoly.namth.luyen_code_screens.screens.NFTMobileScreen
import fpoly.namth.luyen_code_screens.screens.TeslaScreen
import fpoly.namth.luyen_code_screens.screens.TwitterProfileScreen
import fpoly.namth.luyen_code_screens.ui.theme.Luyen_code_screensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Luyen_code_screensTheme {
                HealthUIScreen()
            }
        }
    }
}
