package com.example.rongpuluh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "Setya Neng Rahayu",
        "Siti Agnia Amalia",
        "Tiara Bintang Liswanda",
        "Wahyu Eka Prasetya",
        "Zahrotun Niswah",
        "Zuliana",
        "Adinda Widia Choirunnisa",
        "Andreas Adi Minarso",
        "Anita Sari",
        "Ardian Muhammad Iqbal",
        "Bagas Saputra",
    )

    val listNis = arrayOf(
        "3030",
        "3032",
        "3034",
        "3036",
        "3038",
        "3040",
        "2972",
        "2994",
        "2975",
        "2976",
        "2978",
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i],listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}