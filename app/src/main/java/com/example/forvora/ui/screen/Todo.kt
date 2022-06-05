package com.example.forvora.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Todo() {
	Scaffold(
		floatingActionButton = {
			FloatingActionButton(
				modifier = Modifier.padding(end = 20.dp, bottom = 20.dp),
				onClick = { /* ... */ }) {
				Icon(imageVector = Icons.Rounded.Add, contentDescription = "Add")
			}
		}
	) {
		Text("Hello")
	}
}