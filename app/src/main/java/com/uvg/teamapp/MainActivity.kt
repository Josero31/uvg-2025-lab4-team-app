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
import com.uvg.teamapp.ui.TeamListScreen
import com.uvg.teamapp.model.FakeTeamRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TeamAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Usar el repositorio para obtener los miembros del equipo
                    val members = FakeTeamRepository.getTeamMembers()
                    TeamListScreen(
                        members = members,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    TeamAppTheme {
        val members = com.uvg.teamapp.model.FakeTeamRepository.getTeamMembers()
        TeamListScreen(
            members = members
        )
    }
}
