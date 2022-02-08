package com.iit.blockmedic.util

import android.content.Context
import android.net.ConnectivityManager


class NetworkStatus {


    /**
     * Check device network status
     * @param context
     * @return
     */
    fun isConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val activeNetwork = cm.activeNetworkInfo

        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }
}

