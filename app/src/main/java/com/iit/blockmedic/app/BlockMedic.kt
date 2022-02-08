package com.iit.blockmedic.app

import android.app.Application
import com.iit.blockmedic.dagger.AppComponent
import com.iit.blockmedic.dagger.AppModule
import com.iit.blockmedic.dagger.DaggerAppComponent


class BlockMedicApplication : Application() {

    protected fun initDagger(application: BlockMedicApplication): AppComponent {
        return DaggerAppComponent.builder()
            .appModule(AppModule(application))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger(this)
    }
    private var appComponent: AppComponent? = null

    fun getAppComponent(): AppComponent? {

        return appComponent
    }

}

