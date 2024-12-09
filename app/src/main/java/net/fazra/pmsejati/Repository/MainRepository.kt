package net.fazra.pmsejati.Repository

import net.fazra.pmsejati.Domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Area15 Medley", "April 15, 2024", 20, "ongoing1"),
        OngoingDomain("Area15 Game", "April 15, 2025", 5, "ongoing2"),
        OngoingDomain("Produktif App", "Januari 1, 2024", 5, "ongoing3"),
        OngoingDomain("AI x App", "Februari 15, 2024", 5, "ongoing4"),
    )
}