package com.example.dogprofilepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ProfilePage(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(
            id = R.drawable.profile),
            contentDescription = "profile Picture",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.Green,
                    shape = CircleShape
                ),
            contentScale = ContentScale.Crop
            )
        Text("Andjic Djordje")
        Text(text = "Montenegro")

        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()) {
                Text(text = "Followers")
                Text(text = "200 000")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Follow")
                }
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()) {
                Text(text = "Followers")
                Text(text = "200 000")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()) {
                Text(text = "Followers")
                Text(text = "200 000")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview(){
    ProfilePage()
}