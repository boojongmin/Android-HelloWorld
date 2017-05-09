package com.example.home.helloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.home.helloworld.fragment.ArticleFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val intent: Intent = Intent(this, DisplayMessageActivity::class.java)
        val editText: EditText = findViewById(R.id.edit_message) as EditText
        val message = editText.getText().toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    fun changeFragmentText(view: View) {
        val editText = findViewById(R.id.textView) as TextView
        editText.text = "hello fragment";
    }

    fun changeFragment(view: View) {
        val newFragment = ArticleFragment()
        val args = Bundle()
        newFragment.arguments = args

        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.article_fragment, newFragment)
//        val beforeFragment = supportFragmentManager.findFragmentById(R.id.article_fragment)
        transaction.add(R.id.article_fragment, newFragment).commit()
    }
}

