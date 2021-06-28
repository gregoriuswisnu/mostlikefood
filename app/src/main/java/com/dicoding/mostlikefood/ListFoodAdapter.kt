package com.dicoding.mostlikefood

import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val listFood: ArrayList<Food>): RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetails: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvHow: TextView = itemView.findViewById(R.id.tv_item_bahan)
        var tvStep: TextView = itemView.findViewById(R.id.tv_item_step)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_list,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.tvDetails.text = food.detail
        holder.tvHow.text = food.recipe
        holder.tvStep.text = food.step

        holder.itemView.setOnClickListener{
            val context = holder.itemView.context
            val foodIntent = Intent(context, DetailActivity::class.java)
            foodIntent.putExtra(DetailActivity.NAMA, food.name)
            foodIntent.putExtra(DetailActivity.DETAIL, food.detail)
            foodIntent.putExtra(DetailActivity.GAMBAR, food.photo)
            foodIntent.putExtra(DetailActivity.RECIPE, food.recipe)
            foodIntent.putExtra(DetailActivity.STEP, food.step)
            context.startActivities(arrayOf(foodIntent))
        }


    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Food)
    }
}