package com.example.daftarfakultas

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class detail_faculty: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail fakultas"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvDetail: TextView = findViewById(R.id.details)
        val tvLocation: TextView = findViewById(R.id.location)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tLocation = intent.getStringExtra(EXTRA_LOCATION)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvDetail.text = tDetail
        tvLocation.text = tLocation
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_LOCATION = "extra_location"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}