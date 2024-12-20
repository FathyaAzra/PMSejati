package net.fazra.pmsejati.Activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import net.fazra.pmsejati.Adapter.OngoingAdapter
import net.fazra.pmsejati.ViewModel.MainViewModel
import net.fazra.pmsejati.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use binding.root instead of layout ID

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val ongoingAdapter = OngoingAdapter(mainViewModel.loadData())

        binding.viewOngoing.apply {
            adapter = ongoingAdapter
            layoutManager = GridLayoutManager(this@DashboardActivity, 2)
        }
    }
}
