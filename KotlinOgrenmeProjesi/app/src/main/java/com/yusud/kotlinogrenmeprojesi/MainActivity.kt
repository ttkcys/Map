package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Map
        println("---------------Map---------------")

        //Anahtar Kelime - Değer (Key - Value Pairing)

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",200)
        yemekKaloriMap.put("Tavuk",300)

        println(yemekKaloriMap.get("Et"))

        yemekKaloriMap.forEach {
            println(it)
        }

        val benimMapim = HashMap<String, String>()
        benimMapim.put("Yusufhan","Keleş")
        benimMapim.put("Gözde","Demir")

        val yeniMap = hashMapOf<String, Int>("Oğuzhan" to 40, "Bayram" to 50)
        println(yeniMap.get("Bayram"))


    }
}