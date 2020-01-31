package com.unmapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fakultas.*

class Fakultas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fakultas)

        button_psikologi.setOnClickListener{
            val url = "http://psikologi.unm.ac.id/"
            val webviewPsikologi= Intent(this, webview::class.java)
            webviewPsikologi.putExtra("url", url)
            startActivity(webviewPsikologi)
        }
        button_ilmu_pendidikan.setOnClickListener{
            val url = "http://fip.unm.ac.id/"
            val webviewfip= Intent(this, webview::class.java)
            webviewfip.putExtra("url", url)
            startActivity(webviewfip)
        }
        button_mipa.setOnClickListener{
            val url = "http://fmipa.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
        button_teknik.setOnClickListener{
            val url = "http://ft.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
        button_bastra.setOnClickListener{
            val url = "http://fbs.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
        button_fik.setOnClickListener{
            val url = "http://fik.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
        button_fis.setOnClickListener{
            val url = "http://fis.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
        button_fsd.setOnClickListener{
            val url = "http://fsd.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
        button_fe.setOnClickListener{
            val url = "http://fe.unm.ac.id/"
            val webview= Intent(this, webview::class.java)
            webview.putExtra("url", url)
            startActivity(webview)
        }
    }
}
