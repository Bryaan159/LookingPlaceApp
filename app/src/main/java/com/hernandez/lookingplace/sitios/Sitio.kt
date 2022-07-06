package com.hernandez.lookingplace.sitios

import android.os.Parcel
import android.os.Parcelable

data class Sitio (
    val nombre: String,
    val descripcion: String,
    val ubicacion: String,
    val foto: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(descripcion)
        parcel.writeString(ubicacion)
        parcel.writeString(foto)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Sitio> {
        override fun createFromParcel(parcel: Parcel): Sitio {
            return Sitio(parcel)
        }

        override fun newArray(size: Int): Array<Sitio?> {
            return arrayOfNulls(size)
        }
    }
}