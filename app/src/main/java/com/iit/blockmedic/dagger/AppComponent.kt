package com.iit.blockmedic.dagger

import com.iit.blockmedic.ui.user.LoginActivity
import com.iit.blockmedic.util.PresenterModule
import com.iit.blockmedic.util.SharedPreferencesHandler
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, PresenterModule::class])
interface AppComponent {
    fun inject(target: LoginActivity)
    fun inject(target: SharedPreferencesHandler)
}

