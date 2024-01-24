package com.example.dogprofilepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
        modifier = Modifier.fillMaxSize().padding(16.dp)) {
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
            modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Column {
                Text(text = "Followers")
                Text(text = "200 000")
            }
            Column {
                Text(text = "Following")
                Text(text = "30")
            }
            Column {
                Text(text = "Posts")
                Text(text = "9")
            }
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Follow")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Send Message")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview(){
    ProfilePage()
}