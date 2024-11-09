package com.example.project2

import Screen1ViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.project2.presentation.Screen1
import com.example.project2.ui.theme.Project2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project2Theme {
                Screen1(screen1ViewModel = Screen1ViewModel())
            }
        }
    }
}

