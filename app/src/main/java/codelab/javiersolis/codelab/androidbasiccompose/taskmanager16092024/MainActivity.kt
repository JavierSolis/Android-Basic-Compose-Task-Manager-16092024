package codelab.javiersolis.codelab.androidbasiccompose.taskmanager16092024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import codelab.javiersolis.codelab.androidbasiccompose.taskmanager16092024.ui.theme.AndroidBasicComposeTaskManager16092024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicComposeTaskManager16092024Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CompleteScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CompleteScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(), // Ocupa todo el tamaño de la pantalla
        contentAlignment = Alignment.Center // Centra el contenido dentro del Box
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id =R.drawable.ic_task_completed ),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = stringResource(id = R.string.title),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 0.dp,top=24.dp,end=0.dp,bottom=8.dp)
            )
            Text(
                text = stringResource(id = R.string.subtitle),
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidBasicComposeTaskManager16092024Theme {
        CompleteScreen()
    }
}