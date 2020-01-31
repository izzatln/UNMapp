package com.unmapp

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_organisasi.*

class Organisasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organisasi)

        imageView1.setOnClickListener {
            val bmp = (imageView1.drawable as BitmapDrawable).bitmap
            imagePreview(bmp)
        }
        imageStruktur2.setOnClickListener {
            val bmp = (imageStruktur2.drawable as BitmapDrawable).bitmap
            imagePreview(bmp)
        }
        imageStruktur3.setOnClickListener {
            val bmp = (imageStruktur3.drawable as BitmapDrawable).bitmap
            imagePreview(bmp)
        }
        imageStruktur4.setOnClickListener {
            val bmp = (imageStruktur4.drawable as BitmapDrawable).bitmap
            imagePreview(bmp)
        }
    }

    private fun imagePreview(bitmap : Bitmap){
        val view = LayoutInflater.from(this).inflate(R.layout.zoom_layout, null)
        val imageViewZoom = view.findViewById<ImageView>(R.id.imageZoom)
        imageViewZoom.setImageBitmap(bitmap)

        //alert dialog custom layout
        val alert = AlertDialog.Builder(this)
        alert.setView(view)
        alert.setPositiveButton("Tutup"){
                dialog, which ->
            dialog.dismiss()
        }
        alert.create().show()

    }

}
