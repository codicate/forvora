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
import com.example.forvora.ui.screen.TodoList
import com.example.forvora.ui.theme.ForvoraTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ForvoraTheme(darkTheme = true) {
				Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
					TodoList()
				}
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun ForvoraPreview() {
	ForvoraTheme(darkTheme = true) {
		Surface(modifier = Modifier.fillMaxSize(), color = Color.Black) {
			TodoList()
		}
	}
}