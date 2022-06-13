package jp.techacademy.kojo.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_calc_app_second.*
import kotlinx.android.synthetic.main.activity_main.*

class CalcAppSecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_app_second)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val value3 = intent.getStringExtra("BTNNUM")

        Log.d("kotlintest", "$value1")
        Log.d("kotlintest", "$value2")
        Log.d("kotlintest", "$value3")

            if (value3 == "足し算") {
                    Answer.text = "${value1 + value2}"
            }
            if (value3 == "引き算") {
                    Answer.text = "${value1 - value2}"
            }
            if (value3 == "掛け算") {
                    Answer.text = "${value1 * value2}"
            }
            if (value3 == "割り算") {
                    Answer.text = "${value1 / value2}"
            }
         }

}