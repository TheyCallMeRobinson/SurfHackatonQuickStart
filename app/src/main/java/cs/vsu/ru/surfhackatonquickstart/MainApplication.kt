package cs.vsu.ru.surfhackatonquickstart

import android.app.Application
import cs.vsu.ru.surfhackatonquickstart.di.appModule
import cs.vsu.ru.surfhackatonquickstart.di.dataModule
import cs.vsu.ru.surfhackatonquickstart.di.domainModule
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainApplication : Application() {

    private val BASE_URL = "http://relax.server.org/"
    private lateinit var retrofit: Retrofit

    override fun onCreate() {
        super.onCreate()

        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().build())
            .build()

        startKoin {
            AndroidLogger(Level.DEBUG)
            androidContext(this@MainApplication)
            modules(listOf(appModule, dataModule, domainModule))
        }
    }
}