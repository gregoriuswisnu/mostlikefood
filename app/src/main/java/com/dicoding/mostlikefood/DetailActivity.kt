package com.dicoding.mostlikefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object{

        const val NAMA = "nama_food"
        const val DETAIL = "detail_food"
        const val GAMBAR = "data_gambar"
        const val RECIPE = "recipe_food"
        const val STEP = "step_food"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_details)

        val foodNameData: TextView = findViewById(R.id.tv_item_name)
        val foodDetailData: TextView = findViewById(R.id.tv_item_detail)
        val foodGambarData: ImageView = findViewById(R.id.img_item_photo)
        val foodRecipeDate: TextView = findViewById(R.id.tv_item_bahan)
        val foodStepData: TextView = findViewById(R.id.tv_item_step)

        val nama = intent.getStringExtra(NAMA)
        val detail = intent.getStringExtra(DETAIL)
        val gambar = intent.getIntExtra(GAMBAR,0)
        val recipe = intent.getStringExtra(RECIPE)
        val step = intent.getStringExtra(STEP)

        foodNameData.text = nama
        foodDetailData.text = detail
        foodRecipeDate.text = recipe
        foodStepData.text = step

        Glide.with(this)
                .load(gambar)
                .apply(RequestOptions())
                .into(foodGambarData)

    }


}