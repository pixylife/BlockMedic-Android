package com.iit.blockmedic.model

import android.os.Parcel
import android.os.Parcelable

data class Hospital(var name : String?,var image :String?,var place_id : String?) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(image)
        parcel.writeString(place_id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Hospital> {
        override fun createFromParcel(parcel: Parcel): Hospital {
            return Hospital(parcel)
        }

        override fun newArray(size: Int): Array<Hospital?> {
            return arrayOfNulls(size)
        }
    }
}