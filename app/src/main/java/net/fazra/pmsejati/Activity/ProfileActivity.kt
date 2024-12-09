package net.fazra.pmsejati.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import net.fazra.pmsejati.Adapter.ArchiveAdapter
import net.fazra.pmsejati.Adapter.MyTeamAdapter
import net.fazra.pmsejati.R
import net.fazra.pmsejati.ViewModel.ProfileViewModel
import net.fazra.pmsejati.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityProfileBinding
    val profileViewModel: ProfileViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val archiveAdapter by lazy { ArchiveAdapter(profileViewModel.loadDataArchive()) }
            viewArchive.apply {
                adapter = archiveAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }

            val myteamAdapter by lazy { MyTeamAdapter(profileViewModel.loadDataMyteam()) }
            viewTeam.apply {
                adapter = myteamAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
            }
        }

    }
}