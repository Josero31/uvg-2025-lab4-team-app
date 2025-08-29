package com.uvg.teamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.teamapp.ui.theme.TeamAppTheme
import ui.TeamListScreen
import model.TeamMember

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TeamAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Mostrar la lista de miembros del equipo
                    val sampleMembers = listOf(
                        TeamMember("Ana", "Desarrolladora Android"),
                        TeamMember("Luis", "Diseñador UI/UX"),
                        TeamMember("María", "Project Manager")
                    )
                    TeamListScreen(
                        members = sampleMembers,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
