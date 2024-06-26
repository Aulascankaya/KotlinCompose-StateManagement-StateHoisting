/*package com.ulas.kotlincomposestatemanagement

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherScreen() {

    Surface(color = Color.LightGray) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            var myString = remember { mutableStateOf("android compose") }

            TextField(value = myString.value, onValueChange ={
                myString.value =it
            })


            Spacer(modifier = Modifier.padding(7.dp))

            var textString = remember{ mutableStateOf("Hello") }

            Text(
                text = textString.value,
                fontSize = 26.sp,
            )

            Spacer(modifier = Modifier.padding(7.dp))

            Button(onClick = {
                textString.value = "Android"
            })
            {
                Text(text = "Button")
                Spacer(modifier = Modifier.padding(7.dp))
                Text(text = "Test")
            }

            Spacer(modifier = Modifier.padding(7.dp))


            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.cartman),contentDescription = "cartman")

            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = "foreground")

            Image(painter = ColorPainter(Color.Yellow), contentDescription ="painter" , modifier = Modifier.size(25.dp,25.dp))

        }
    }



}

 */