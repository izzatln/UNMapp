package com.unmapp

import android.os.Bundle
//import android.os.PersistableBundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
//import androidx.fragment.app.Fragment
//import androidx.recyclerview.widget.GridLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.google.android.gms.maps.GoogleMap
import kotlinx.android.synthetic.main.activity_galeri.*

class Galeri : AppCompatActivity() {

    private val imageList  = arrayListOf(
        "http://makassartoday.com/wp-content/uploads/2019/01/342-Mahasiswa-UNM-Drop-Out-Awal-2019.jpg",
        "https://www.bonepos.com/wp-content/uploads/2018/08/Kampus-UNM-Bonepos.jpeg",
        "http://kabarkampus.com/wp-content/uploads/2018/01/04-01-2017-FIS-UNM-Ilustrasi-e1515052615257.jpg",
        "http://matasulsel.com/wp-content/uploads/2017/06/20170608_105405-1-1000x600.jpg",
        "https://2.bp.blogspot.com/-dLw2U7ijXZM/WhCgcCjOlqI/AAAAAAAAEwo/80HlTigjm4c5x6zurpCNAsfnya98N9AFwCLcBGAs/s400/1509095216870.jpg,",
        "https://i0.wp.com/quipperhome.wpcomstaging.com/wp-content/uploads/2017/03/7892c-2.5-universitas-negeri-makassar.jpg?resize=800%2C533",
        "http://1.bp.blogspot.com/-vaoodShD9pc/UKEfN7sl-vI/AAAAAAAAA8w/TX3ggVbB8No/s320/Berita3.JPG",
        "https://img.kurio.network/WfrgkndtQCki-lXFOkYaHsdk6uk=/480x270/smart/filters:quality(85):format(jpeg)/https://kurio-img.kurioapps.com/19/06/21/0c600653-e243-4065-ba2d-0da5e5c4fe44.jpg"

    )

    private val judulzoom = arrayListOf(
        "Suasana Penerimaan Mahasiswa Baru",
        "Gedung Menara Phinisi",
        "Gedung FIS",
        "Gedung Teknol Fakultas Teknik",
        "Ruang Kelas",
        "Menara Phinisi",
        "Kolam Renang FIK",
        "Gedung Perpustakaan UNM"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        val adapter = GaleriAdapter (imageList, judulzoom)
        recyclerViewGaleri.adapter = adapter
    }
}

