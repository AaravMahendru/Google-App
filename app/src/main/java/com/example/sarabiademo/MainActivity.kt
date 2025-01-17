package com.example.sarabiademo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sarabiademo.ui.theme.SARABIADEMOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SARABIADEMOTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen(navController) }
            composable("second") { SecondScreen(navController) }
            composable("page1") { Page1Screen(navController) }
            composable("page2") { Page2Screen(navController) }
            composable("page3") { Page3Screen(navController) }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Sarabia App",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Button(onClick = { navController.navigate("second") }) {
            Text(text = "Go to Second Page")
        }
    }
}

@Composable
fun SecondScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Back Button at the Top Left
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text(text = "Back")
        }

        // Centered Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome to Sarabia Canvas",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 32.dp)
            )

            // Buttons directly under Sarabia Canvas
            Button(
                onClick = { navController.navigate("page1") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            ) {
                Text(text = "Formula Booklet")
            }
            Button(
                onClick = { navController.navigate("page2") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            ) {
                Text(text = "Syllabus")
            }
            Button(
                onClick = { navController.navigate("page3") },
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
            ) {
                Text(text = "Mission Statement")
            }
        }
    }
}

@Composable
fun Page1Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()) // Allow scrolling
            .padding(16.dp)
    ) {
        // Back Button
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text(text = "Back")
        }

        Spacer(modifier = Modifier.height(16.dp)) // Space between the back button and the text

        // Text at the top
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Formula Booklet",
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = "HL AA Math",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Use Mouse Click to Scroll",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
        // Images stacked on top of each other
        Image(
            painter = painterResource(id = R.drawable.formula1),
            contentDescription = "Formula 1",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula2),
            contentDescription = "Formula 2",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula3),
            contentDescription = "Formula 3",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula4),
            contentDescription = "Formula 4",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula5),
            contentDescription = "Formula 5",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula6),
            contentDescription = "Formula 6",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula7),
            contentDescription = "Formula 7",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula8),
            contentDescription = "Formula 8",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula9),
            contentDescription = "Formula 9",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula10),
            contentDescription = "Formula 10",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula11),
            contentDescription = "Formula 11",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.formula12),
            contentDescription = "Formula 12",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp)
        )
    }
}

@Composable
fun Page2Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Back Button
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text(text = "Back")
        }

        // Centered Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "This is Page 2",
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun Page3Screen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Full-screen Image
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "IB Mission Statement",
            modifier = Modifier.fillMaxSize()
        )

        // Back Button
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Text(text = "Back")
        }
    }
}
