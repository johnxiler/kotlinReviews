package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.compose.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Relix",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun VerticalText(text: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        text.forEach { char ->
            Text(
                text = char.toString(),
                modifier = Modifier.padding(start = 400.dp, top = 20.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1.5F)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp)
            ) {
                Text(
                    text = "The Movies",
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(2F),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(R.string.hello_world),
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1F),
                    textAlign = TextAlign.Center
                )
            }
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                val memeCoins = listOf(
                    Memes(
                        image = R.drawable.memecoin_ia,
                        title = "meme coin"
                    ),
                    Memes(
                        image = R.drawable.meme_coin,
                        title = "same"
                    ),
                    Memes(
                        image = R.drawable.oip_in,
                        title = "Hello"
                    ),
                    Memes(
                        image = R.drawable.inu_corner,
                        title = "jain"
                    ),
                    Memes(
                        image = R.drawable.memecoin_ia,
                        title = "wait"
                    ),
                    Memes(
                        image = R.drawable.meme_coin,
                        title = "something"
                    ),
                    Memes(
                        image = R.drawable.oip_in,
                        title = "wtf"
                    ),
                    Memes(
                        image = R.drawable.inu_corner,
                        title = "gelatin"
                    )
                )
                val onlineImages = listOf(
                    Online("https://picsum.photos/id/1/200/300?random=1"),
                    Online("https://picsum.photos/id/2/200/300?random=2"),
                    Online("https://picsum.photos/id/3/200/300?random=3"),
                    Online("https://picsum.photos/id/4/200/300?random=4"),
                    Online("https://picsum.photos/id/5/200/300?random=5"),
                    Online("https://picsum.photos/id/6/200/300?random=6"),
                    Online("https://picsum.photos/id/7/200/300?random=7"),
                    Online("https://picsum.photos/id/8/200/300?random=8"),
                    Online("https://picsum.photos/id/9/200/300?random=9"),
                    Online("https://picsum.photos/id/10/200/300?random=10")
                )

                items(onlineImages) {
                    Box(
                        contentAlignment = Alignment.Center,
                    ) {
                        /*Image(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            painter = painterResource(it.image),
                            contentDescription = null,
                            alpha = 0.7F
                        )*/
                        AsyncImage(
                            modifier = Modifier
                                .padding(horizontal = 20.dp)
                                .size(width = 200.dp, height = 300.dp),
                            model = it.image,
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            alpha = 0.7F
                        )
                        /*Image(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            imageVector = Icons.Default.Build,
                            contentDescription = null
                        )*/
                        VerticalText("Hello")
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            Text(
                                text = "Hello",
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp,
                                color = Color.White
                            )
                        }
                    }
                }

            }

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 10.dp)
                .background(Color.Black)
                .weight(2F)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column {
                Text(
                    text = "Hello $name!",
                    modifier = modifier.padding(12.dp),
                    style = MaterialTheme.typography.displayMedium.copy(
                        color = Color.White
                    )
                )
            }
            Spacer(modifier = Modifier.height(35.dp))
            for (i in 1..10) {
                Text(
                    text = "Hello!",
                    modifier = modifier.padding(bottom = 35.dp),
                    style = MaterialTheme.typography.displayMedium.copy(
                        color = Color.Cyan,
                        fontSize = 35.sp
                    )
                )
//                Button(
//                    onClick = {
//
//                    },
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color.Green
//                    )
//                ) {

                Text(
                    text = "Hello!",
                    modifier = modifier,
                    style = MaterialTheme.typography.displayMedium
                )
            }
        }

    }
}
//}

@Preview(showSystemUi = true, showBackground = true, name = "RELIX")
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Relix")
    }
}

data class Memes(
    val image: Int,
    val title: String
)

data class Online(
    val image: String
)