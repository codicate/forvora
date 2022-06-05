package com.example.forvora.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Todo(name: String) {
	var isCompleted by remember { mutableStateOf(false) }

	Row(
		horizontalArrangement = Arrangement.spacedBy(8.dp),
		modifier = Modifier
			.fillMaxWidth()
			.background(color = Color.DarkGray, shape = RoundedCornerShape(4.dp))
			.padding(all = 10.dp)
			.clickable(onClick = {
				isCompleted = !isCompleted
			})
	) {
		if (isCompleted) Icon(imageVector = Icons.Rounded.CheckCircle, contentDescription = "completed")
		else Icon(imageVector = Icons.Rounded.AddCircle, contentDescription = "not completed")
		Text(name)
	}
}