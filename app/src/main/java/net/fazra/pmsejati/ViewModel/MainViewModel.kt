package net.fazra.pmsejati.ViewModel

import androidx.lifecycle.ViewModel
import net.fazra.pmsejati.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())
    fun loadData()= repository.items
}