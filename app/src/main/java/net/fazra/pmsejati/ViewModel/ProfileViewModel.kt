package net.fazra.pmsejati.ViewModel

import androidx.lifecycle.ViewModel
import net.fazra.pmsejati.Repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository):ViewModel() {
    constructor() : this(ProfileRepository())

    fun loadDataMyteam()=repository.myteamItems
    fun loadDataArchive()=repository.archiveItems
}