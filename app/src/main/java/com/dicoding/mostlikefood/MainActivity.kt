package com.dicoding.mostlikefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),ListFoodAdapter.OnItemClickCallback {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var title: String ="Top 10 Recommendation"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)
        rvFoods = findViewById(R.id.rv_foods)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onItemClicked(data:Food){

    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.about->{
                title = "Top 10 Recommendation"
                aboutLink()
            }
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }
    private fun showRecyclerList(){
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listFoodAdapter
    }

    private fun aboutLink(){
        val linkIntent = Intent(this,About::class.java)
        startActivity(linkIntent)
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}