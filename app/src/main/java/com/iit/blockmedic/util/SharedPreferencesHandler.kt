package com.iit.blockmedic.util

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.iit.blockmedic.app.BlockMedicApplication
import com.iit.blockmedic.app.Constants.Companion.TOKEN
import javax.inject.Inject


class SharedPreferencesHandler {
    @set:Inject
     var spEditor: SharedPreferences.Editor? = null


    //save SharedPreferences
    fun saveIntoSharedPreferences(context: Context, token: String?) {
        (context.applicationContext as BlockMedicApplication).getAppComponent()?.inject(this)
        spEditor!!.putString(TOKEN, token)
        spEditor!!.apply()
    }

    //clear SharedPreferences
    fun clearSharedPreferences(context: Context) {
        (context.applicationContext as BlockMedicApplication).getAppComponent()?.inject(this)
        spEditor!!.clear()
        spEditor!!.commit()
    }

    fun logoutClearSharedPref(context: Context) {
        (context.applicationContext as BlockMedicApplication).getAppComponent()?.inject(this)
        spEditor!!.remove(TOKEN)
        spEditor!!.commit()
    }


}