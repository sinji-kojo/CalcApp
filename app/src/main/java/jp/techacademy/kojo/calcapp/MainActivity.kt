package jp.techacademy.kojo.calcapp

import android.accounts.AbstractAccountAuthenticator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
     override fun onClick(v: View) {
         if (edit1.text.toString() == "" || edit2.text.toString() == "") {
             val rootLayout: View = findViewById(android.R.id.content)
             val snackbar = Snackbar.make(rootLayout, "数字をいれてください", Snackbar.LENGTH_LONG)
             snackbar.show()
         } else {

             when (v.id) {
                 R.id.button1 -> {
                     val btn: String = "足し算"
                     val intent = Intent(this, CalcAppSecond::class.java)
                     val x: Double = edit1.text.toString().toDouble()
                     val y: Double = edit2.text.toString().toDouble()
                     intent.putExtra("VALUE1", x)
                     intent.putExtra("VALUE2", y)
                     intent.putExtra("BTNNUM", btn)
                     startActivity(intent)
                 }
                 R.id.button2 -> {
                     val btn: String = "引き算"
                     val intent = Intent(this, CalcAppSecond::class.java)
                     val x: Double = edit1.text.toString().toDouble()
                     val y: Double = edit2.text.toString().toDouble()
                     intent.putExtra("VALUE1", x)
                     intent.putExtra("VALUE2", y)
                     intent.putExtra("BTNNUM", btn)
                     startActivity(intent)

                 }
                 R.id.button3 -> {
                     val btn: String = "掛け算"
                     val intent = Intent(this, CalcAppSecond::class.java)
                     val x: Double = edit1.text.toString().toDouble()
                     val y: Double = edit2.text.toString().toDouble()
                     intent.putExtra("VALUE1", x)
                     intent.putExtra("VALUE2", y)
                     intent.putExtra("BTNNUM", btn)
                     startActivity(intent)

                 }
                 R.id.button4 -> {
                     val btn: String = "割り算"
                     val intent = Intent(this, CalcAppSecond::class.java)
                     val x: Double = edit1.text.toString().toDouble()
                     val y: Double = edit2.text.toString().toDouble()
                     intent.putExtra("VALUE1", x)
                     intent.putExtra("VALUE2", y)
                     intent.putExtra("BTNNUM", btn)
                     startActivity(intent)

                 }
             }
         }
    }
}