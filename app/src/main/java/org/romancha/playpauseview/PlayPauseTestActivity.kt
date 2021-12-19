package org.romancha.playpauseview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.romancha.playpause.PlayPauseView

class PlayPauseTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_play_pause_test)

        val view = findViewById<PlayPauseView>(R.id.play_pause_view)

        view.setOnClickListener { view.toggle() }
    }
}