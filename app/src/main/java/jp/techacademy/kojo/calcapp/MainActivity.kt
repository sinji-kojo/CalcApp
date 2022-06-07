package jp.techacademy.kojo.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        public void onClick(View v) {
            if (v.getId() == R.id.btn1) {
                Snackbar.make(v, "ボタン１が押されました", Snackbar.LENGTH_SHORT).show();

            } else if (v.getId() == R.id.btn2) {
                Snackbar.make(v, "ボタン２が押されました", Snackbar.LENGTH_SHORT).show();

            } else if (v.getId() == R.id.btn3) {
                Snackbar.make(v, "ボタン３が押されました", Snackbar.LENGTH_SHORT).show();
            }
        }


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }
    //onClickメソッド内でSecondActivityに遷移させるよう記術
    override fun onClick(p0: View?) {

        if (edit1.text.toString() == "" || edit2.text.toString() == "") {
            val rootLayout: View = findViewById(android.R.id.content)
            val snackbar = Snackbar.make(rootLayout, "数字をいれてください", Snackbar.LENGTH_LONG)
            snackbar.show()

        } else {
            val intent = Intent(this, CalcAppSecond::class.java)

            //数値に変換
            val x: Double = edit1.text.toString().toDouble()
            val y: Double = edit2.text.toString().toDouble()

            intent.putExtra("VALUE1", x)
            intent.putExtra("VALUE2", y)
            intent.putExtra("ButtonNum", z)

            startActivity(intent)
        }
    }
}