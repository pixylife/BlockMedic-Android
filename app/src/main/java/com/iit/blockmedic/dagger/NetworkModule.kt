package com.iit.blockmedic.dagger


import com.iit.blockmedic.network.APIInterface
import com.iit.blockmedic.util.ServiceGenerator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideApiInterface(): APIInterface? {
        return ServiceGenerator.getClient()?.create(APIInterface::class.java)
    }


}
