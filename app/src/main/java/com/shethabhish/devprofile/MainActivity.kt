package com.shethabhish.devprofile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // to make rounded corners use this codev
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val round = RoundedBitmapDrawableFactory.create(resources, bitmap)
        round.cornerRadius = 15f
//        round.isCircular = true   to make the logo completely round, use this line
        logo.setImageDrawable(round)
    }
}
