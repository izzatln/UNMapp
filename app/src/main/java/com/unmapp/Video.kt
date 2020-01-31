package com.unmapp

import android.content.pm.ActivityInfo
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class Video : YouTubeBaseActivity(),
YouTubePlayer.OnInitializedListener{

    lateinit var yb : YouTubePlayerView

    

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean)
    {
        p1!!.setFullscreen(true)
        p1.cueVideo("F1k9KgJIxDQ")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        yb = findViewById(R.id.youtubePlayer)
        yb.initialize("AIzaSyDZmma0IT7TE2Bdj8iR8vBadO6VNamKoFQ", this)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
        if (p1!!.isUserRecoverableError){
        p1.getErrorDialog(this, 1).show()
    }
    }
}
