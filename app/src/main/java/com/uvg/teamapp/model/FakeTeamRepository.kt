package com.uvg.teamapp.model

object FakeTeamRepository {
    fun getTeamMembers(): List<TeamMember> {
        return listOf(
            TeamMember("Jose sanchez", "Desarrolladora Kotlin"),
            TeamMember("Diego Sandoval", "Diseñador UI/UX"),
            TeamMember("Denis Rodriguez", "Tester"),
            TeamMember("Ximena Aguilar", "Documentación")
        )
    }
}
