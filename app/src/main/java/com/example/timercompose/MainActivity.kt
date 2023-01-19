package com.example.timercompose


import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.timercompose.model.TimerViewModel
import com.example.timercompose.ui.theme.MyTheme
import com.example.timercompose.ui.theme.TimerHomeScreen

class MainActivity : AppCompatActivity() {
    @ExperimentalAnimationApi
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                TimerHomeScreen(viewModel = TimerViewModel())
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Text(text = "Ready... Set... GO!")
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}