package com.example.forvora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.forvora.ui.screen.Todo
import com.example.forvora.ui.theme.ForvoraTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		WindowCompat.setDecorFitsSystemWindows(window, false)
		setContent {
			ForvoraTheme(darkTheme = true) {
				Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
					App()
				}
			}
		}
	}
}

@Composable
fun App() {
	Column(Modifier.padding(top = 20.dp)) {
		Todo()
	}
}

@Preview(showBackground = true)
@Composable
fun ForvoraPreview() {
	ForvoraTheme(darkTheme = true) {
		Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
			Todo()
		}
	}
}