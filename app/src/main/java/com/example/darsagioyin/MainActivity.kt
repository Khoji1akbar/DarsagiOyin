 package com.example.darsagioyin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.darsagioyin.adapter.RvAdapter
import com.example.darsagioyin.databinding.ActivityMainBinding
import com.example.darsagioyin.databinding.ItemRvBinding
import com.example.darsagioyin.models.Mytodo

 class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
     lateinit var rvAdapter: RvAdapter
     private  lateinit var list : ArrayList<Mytodo>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadDate()
        rvAdapter = RvAdapter(list)
        binding.rv.adapter = rvAdapter

    }

     private fun loadDate() {
         list = ArrayList()
         val itemrv = ItemRvBinding.inflate(layoutInflater)
         for (i in 1..100) {
             list.add(Mytodo("ism $i ","$i $i $i $i"))
         }
     }
 }