package cs.vsu.ru.surfhackatonquickstart.di

import cs.vsu.ru.surfhackatonquickstart.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel()
    }
}