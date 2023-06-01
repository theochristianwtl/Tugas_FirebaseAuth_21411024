package com.example.tugas_firebaseauth_21411024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KontenActivity : AppCompatActivity() {

    private lateinit var filmRecyclerView: RecyclerView
    private lateinit var filmList : ArrayList<film>
    private lateinit var filmAdapter : filmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konten)

        filmList = ArrayList()

        filmList.add(
            film(R.drawable.endgame, "Avengers: Endgame",
                "petualangan mandalorian.")
        )

        filmList.add(
            film(R.drawable.thor, "Thor: Love and Thunder",
                "petualangan boba fett.")
        )

        filmList.add(
            film(R.drawable.gotg3, "Guardians of The Galaxy 3",
                "kisah kanibal.")
        )

        filmList.add(
            film(R.drawable.spiderman, "Spiderman",
                "kisah superhero.")
        )

        filmList.add(
            film(R.drawable.shazam, "Shazam",
                "kisah superhero.")
        )

        filmRecyclerView = findViewById(R.id. filmRecyclerView)
        filmRecyclerView.setHasFixedSize(true)
        filmRecyclerView.layoutManager = LinearLayoutManager(this)

        filmAdapter =  filmAdapter(filmList)
        filmRecyclerView.adapter = filmAdapter
        filmAdapter.onItemClick = {
            val intent = Intent(this, DeskripsiActivity::class.java)
            intent.putExtra("film", it)
            startActivity(intent)
        }
    }
}