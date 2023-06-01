package com.example.tugas_firebaseauth_21411024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DeskripsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val film = intent.getParcelableExtra<film>("film")
        if (film != null) {
            val imageView: ImageView = findViewById(R.id._imageDetail)
            val textViewTitle: TextView = findViewById(R.id.imageTitle)
            val textViewDesc: TextView = findViewById(R.id.imageDesc)

            imageView.setImageResource(film.imageSource)
            textViewTitle.text = film.ImageTitle
            textViewDesc.text = film.imageDecs
        }
    }
}