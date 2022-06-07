package jp.techacademy.kojo.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val buttonNum = intent.getBooleanArrayExtra("Button", )



        fun  showAnswer (ans: View) {

            if (ans.id == R.id.button1) {
                Answer.text = "${value1 + value2}"
            }
            if (ans.id == R.id.button2) {
                Answer.text = "${value1 - value2}"
            }
            if (ans.id == R.id.button3)  {
                Answer.text = "${value1 * value2}"
            }
            if (ans.id == R.id.button4) {
                Answer.text = "${value1 / value2}"
            }
        }
    }
}