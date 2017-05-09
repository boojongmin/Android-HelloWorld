package com.example.home.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.ViewGroup
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent = getIntent()
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = TextView(this)
        textView.setTextSize(40F);
        textView.setText(message);

        val layout = findViewById(R.id.activity_display_message) as ViewGroup
        Log.d("D", message);
        layout.addView(textView)
    }
}
