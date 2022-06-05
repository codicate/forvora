package com.example.forvora.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.forvora.ui.component.Todo

@Composable
fun TodoList() {
	val focusManager = LocalFocusManager.current
	var todos by remember {
		mutableStateOf(
			arrayOf<String>(

			)
		)
	}
	var input by remember { mutableStateOf("") }

	Scaffold(
		modifier = Modifier.fillMaxHeight(),
		bottomBar = {
			BottomAppBar(
				backgroundColor = Color.Transparent,
				modifier = Modifier.padding(horizontal = 10.dp)
			) {
				TextField(
					value = input,
					onValueChange = { input = it },
					placeholder = {
						Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
							Icon(Icons.Rounded.Add, contentDescription = "add")
							Text("New Todo")
						}
					},
					colors = TextFieldDefaults.textFieldColors(
						focusedIndicatorColor = Color.Transparent,
						disabledIndicatorColor = Color.Transparent,
						unfocusedIndicatorColor = Color.Transparent,
						backgroundColor = Color(0xEE222222),
					),
					shape = RoundedCornerShape(5.dp),
					modifier = Modifier
						.fillMaxWidth(),
					singleLine = true,
					keyboardOptions = KeyboardOptions(
						keyboardType = KeyboardType.Text,
						imeAction = ImeAction.Done
					),
					keyboardActions = KeyboardActions(onDone = {
						todos += input
						input = ""
						focusManager.clearFocus()
					}),
				)
			}
		}
	) {
		Column(
			verticalArrangement = Arrangement.spacedBy(4.dp),
			modifier = Modifier
				.fillMaxSize()
				.verticalScroll(rememberScrollState())
				.padding(horizontal = 15.dp)
				.pointerInput(Unit) {
					detectTapGestures(onTap = {
						focusManager.clearFocus()
					})
				}
		) {
			todos.forEach { Todo(it) }
		}
	}
}