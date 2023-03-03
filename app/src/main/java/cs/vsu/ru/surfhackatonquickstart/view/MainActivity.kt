package cs.vsu.ru.surfhackatonquickstart.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cs.vsu.ru.surfhackatonquickstart.databinding.ActivityMainBinding
import cs.vsu.ru.surfhackatonquickstart.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}