package fpoly.namth.luyen_code_screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import fpoly.namth.luyen_code_screens.screens.ScoreboardScreen
import fpoly.namth.luyen_code_screens.ui.theme.Luyen_code_screensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Luyen_code_screensTheme {
                ScoreboardScreen()
            }
        }
    }
}
