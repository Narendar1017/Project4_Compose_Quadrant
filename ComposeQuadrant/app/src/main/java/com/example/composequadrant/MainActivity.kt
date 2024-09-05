package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding()
                ){
                    QuadrantView()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun QuadrantViewPreview(){
    QuadrantView()
}

@Composable
fun QuadrantCard(header:String, description:String, clr:Long, modifier: Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(clr))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = header,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            color = Color.Black,
        )
        Text(
            text = description,
            fontSize = 12.sp,
            textAlign = TextAlign.Justify,
            color = Color.Black
        )
    }
}

@Composable
fun QuadrantView(){
    Column {
        Row(
            modifier = Modifier.fillMaxSize().weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            QuadrantCard(
                header = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                clr = 0xFFEADDFF, modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                header = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                clr = 0xFFD0BCFF, modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.fillMaxSize().weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            QuadrantCard(
                header = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                clr = 0xFFB69DF8, modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                header = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                clr = 0xFFF6EDFF, modifier = Modifier.weight(1f)
            )
        }
    }
}