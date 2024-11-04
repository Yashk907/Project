package com.example.project2

import android.graphics.drawable.Icon
//import androidx.annotation.DrawableRes

data class content(val Name :String,
                   val Time :String,
                   val Date : String,
                   val image : Int,
                   val price : String,
                   val weight : String)

class datastore{
    val list = listOf(
        content("Manual Buy","7.00 PM","Sep 10",R.drawable.check,"20","0.0045"),
        content("Manual Buy","7.00 PM","Sep 10",R.drawable.clock,"200","0.0045"),
//        content("Manual Buy","7.00 PM","Sep 10",R.drawable.user,"695","0.0045")
    )
}