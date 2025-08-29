@file:OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)

package com.uvg.teamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uvg.teamapp.model.FakeTeamRepository
import com.uvg.teamapp.model.TeamMember
import com.uvg.teamapp.ui.theme.TeamAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TeamAppTheme {
                Scaffold(
                    topBar = { TopAppBar(title = { Text("TeamApp") }) }
                ) { innerPadding ->
                    TeamListScreen(
                        members = FakeTeamRepository.getTeamMembers(),
                        contentPadding = innerPadding
                    )
                }
            }
        }
    }
}

/* ----------- UI dentro del mismo archivo ----------- */

@Composable
fun TeamListScreen(
    members: List<TeamMember>,
    contentPadding: PaddingValues
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(contentPadding)
            .padding(16.dp)
    ) {
        // 👇 esta es la firma correcta
        items(members) { m ->
            TeamMemberItem(member = m)
        }
    }
}

@Composable
fun TeamMemberItem(member: TeamMember) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = member.name, style = MaterialTheme.typography.titleMedium)
        Text(text = member.description, style = MaterialTheme.typography.bodyMedium)
    }
}
