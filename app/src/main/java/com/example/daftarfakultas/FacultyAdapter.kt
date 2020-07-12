package com.example.daftarfakultas

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class FacultyAdapter(private val listFaculty: ArrayList<Faculty>):
    RecyclerView.Adapter<FacultyAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.faculty_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFaculty.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val faculty = listFaculty[position]

        Glide.with(holder.itemView.context)
            .load(faculty.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = faculty.name
        holder.tvLocation.text = faculty.location

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, detail_faculty::class.java)
            moveDetail.putExtra(detail_faculty.EXTRA_NAME, faculty.name)
            moveDetail.putExtra(detail_faculty.EXTRA_PHOTO, faculty.photo)
            moveDetail.putExtra(detail_faculty.EXTRA_DETAIL, faculty.detail)
            moveDetail.putExtra(detail_faculty.EXTRA_LOCATION, faculty.location)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_item_location)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
