package com.example.recycler_13_hanif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Kumpulan>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.qingxin,
            R.drawable.callalilly,
            R.drawable.cecilia,
            R.drawable.silkflower,
            R.drawable.snapdragon,
            R.drawable.sweetflower,
            R.drawable.windwheelaster,
            R.drawable.wondrouslovelyflower
        )

        heading = arrayOf(
            "Qingxin, a translucent white flower that only grows on the highest stone peaks.",
            "Calla Lily, a flower that grows near water sources.",
            "Cecilia, a beautiful flower that only grows where harsh winds blow.",
            "Silk flower, a crimson flower that blooms like the rainbow clouds in Liyue.",
            "Snapdragon, can be eaten once cooked. As a spice it can bring wonderful flavor to dishes.",
            "Sweet flower, a particularly fragrant flowers. Can be found easily even in the dark, just follow the scent.",
            "Windwheel Aster, a plant that adores the wind.",
            "Wondrous flower, created using alchemy, with Starsilver as its main component"
        )

        newRecyclerView = findViewById(R.id.recyvlerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Kumpulan>()
        getUserdata()
    }
    private fun getUserdata() {

        for(i in imageId.indices){
            val kumpulan = Kumpulan(imageId[i],heading[i])
            newArrayList.add(kumpulan)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}