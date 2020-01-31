package com.unmapp

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_galeri_adapter.view.*

class GaleriAdapter (private val daftarGambar : ArrayList<String>, private val judulGambar : ArrayList<String>) : RecyclerView.Adapter<GaleriAdapter.ViewHolder>(){
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val gambar   =itemView.gambar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_galeri_adapter, parent, false))
    }

    override fun getItemCount(): Int {
        return daftarGambar.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val progress = CircularProgressDrawable(holder.itemView.context)
        Glide.with(holder.itemView.context).load(daftarGambar.get(position))
            .into(holder.gambar)

        holder.itemView.setOnClickListener {
            imagePreview(daftarGambar.get(position),holder.itemView.context, judulGambar.get(position))
        }
    }

    private fun  imagePreview(url: String, context: Context, judul: String) {
        val view = LayoutInflater.from(context).inflate(R.layout.zoom_layout, null)
        val imageViewZoom = view.findViewById<ImageView>(R.id.imageZoom)
        val judulzoom = view.findViewById<TextView>(R.id.txt_card)
        judulzoom.text=judul
        Glide.with(context).load(url).into(imageViewZoom)

        val alert = AlertDialog.Builder(context)
        alert.setView(view)
        alert.setPositiveButton("TUTUP") {dialog, which ->
            dialog.dismiss()
        }
        alert.create().show()
    }


}
