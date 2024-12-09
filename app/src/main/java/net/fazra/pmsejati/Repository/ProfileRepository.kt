package net.fazra.pmsejati.Repository

import net.fazra.pmsejati.Domain.OngoingDomain
import net.fazra.pmsejati.Domain.TeamDomain

class ProfileRepository {

    val myteamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Area15 Medley", "Project in Progress"),
        TeamDomain("Area15 Game", "Project in Progress"),
        TeamDomain("Produktif App", "Completed"),
        TeamDomain("AI x App", "Project in Progress"),
    )

    val archiveItems: MutableList<String> = mutableListOf(
        "UI/UX ScreenShot",
        "Kotlin Source Code",
        "Source Codes"
    )
}