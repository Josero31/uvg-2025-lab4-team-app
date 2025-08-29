package com.uvg.teamapp.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.teamapp.model.TeamMember

@Composable
fun TeamListScreen(
    members: List<TeamMember>,
    modifier: Modifier = Modifier,
    onMemberClick: (TeamMember) -> Unit = {}
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(members) { member ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { onMemberClick(member) }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = member.name, style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = member.description, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}

@Preview(showBackground = true)

@Composable
fun TeamListScreenPreview() {
    val sampleMembers = listOf(
        TeamMember("Ana", "Desarrolladora Android"),
        TeamMember("Luis", "Diseñador UI/UX"),
        TeamMember("María", "Project Manager")
    )
    TeamListScreen(members = sampleMembers)
}
