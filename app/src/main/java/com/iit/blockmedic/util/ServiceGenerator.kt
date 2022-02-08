package com.iit.blockmedic.util

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import okhttp3.OkHttpClient
import org.koin.android.BuildConfig


class ServiceGenerator {

    companion object {
        private var retrofit: Retrofit? = null
        fun getClient(): Retrofit? {
            if (retrofit == null) {
                val interceptor = HttpLoggingInterceptor()
                interceptor.level = HttpLoggingInterceptor.Level.BODY
                val httpClientBuilder = OkHttpClient.Builder()
                httpClientBuilder.addInterceptor(interceptor)
                retrofit = Retrofit.Builder()
                    .baseUrl("")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClientBuilder.build())
                    .build()
            }
            return retrofit
        }


        private var rft: Retrofit? = null
        fun getWeatherClient(): Retrofit? {
            if (rft == null) {
                val interceptor = HttpLoggingInterceptor()
                interceptor.level = HttpLoggingInterceptor.Level.BODY
                val httpClientBuilder = OkHttpClient.Builder()
                httpClientBuilder.addInterceptor(interceptor)
                rft = Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClientBuilder.build())
                    .build()
            }
            return rft
        }

        private var rr: Retrofit? = null
        fun getGoogleMapsClient(): Retrofit? {
            if (rr == null) {
                val interceptor = HttpLoggingInterceptor()
                interceptor.level = HttpLoggingInterceptor.Level.BODY
                val httpClientBuilder = OkHttpClient.Builder()
                httpClientBuilder.addInterceptor(interceptor)
                rr = Retrofit.Builder()
                    .baseUrl("https://maps.googleapis.com/")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClientBuilder.build())
                    .build()
            }
            return rr
        }
    }
}

