package com.example.tugas_firebaseauth_21411024

import android.os.Parcel
import android.os.Parcelable

data class film (val imageSource:Int, val ImageTitle: String, val imageDecs: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageSource)
        parcel.writeString(ImageTitle)
        parcel.writeString(imageDecs)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<film> {
        override fun createFromParcel(parcel: Parcel): film {
            return film(parcel)
        }

        override fun newArray(size: Int): Array<film?> {
            return arrayOfNulls(size)
        }
    }
}