package com.example.project2.data.datastore

import com.example.project2.Data.model.MarUpiContent
import com.example.project2.R
import com.example.project2.data.model.Content

class dataStore {
    val list = listOf(
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.check, "20", "0.0045","Success"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.check, "20", "0.0045","Success"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.check, "20", "0.0045","Success"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.check, "20", "0.0045","Success"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.processing, "20", "0.0045","Success"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.processing, "20", "0.0045","Processing"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.processing, "20", "0.0045","Processing"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.processing, "20", "0.0045","Processing"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.processing, "20", "0.0045","Processing"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.cross, "20", "0.0045","Failed"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.cross, "20", "0.0045","Failed"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.cross, "20", "0.0045","Failed"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.cross, "20", "0.0045","Failed"),
        Content("Manual Buy", "7.00 PM", "Sep 10", R.drawable.cross, "20", "0.0045","Failed"),

    )
}

class datastore2(){
    val list2: List<MarUpiContent> = listOf(
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.check, "20","Success","Sent"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.process0, "20","process","Receive"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.cross, "20","failed","Receive"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.check, "20","Success","Sent"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.process0, "20","process","Receive"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.cross, "20","failed","Sent"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.check, "20","Success","Sent"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.process0, "20","process","Sent"),
        MarUpiContent("Akshay Varma", "something@gmail.com","7.00 PM", "Sep 10", R.drawable.cross, "20","failed","Sent"),
//    )
    )
}