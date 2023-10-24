package kr.ac.kumoh.ce.s20190893.s23w03lotto2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.ce.s20190893.s23w03lotto2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        Log.i("lifecycle!!!", "onStart()")

        main.btnGenerate.setOnClickListener {
            main.num1.text = Random.nextInt(1, 46).toString()
            main.num2.text = Random.nextInt(1, 46).toString()
            main.num3.text = Random.nextInt(1, 46).toString()
            main.num4.text = Random.nextInt(1, 46).toString()
            main.num5.text = Random.nextInt(1, 46).toString()
            main.num6.text = Random.nextInt(1, 46).toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle!!!", "onStart()")
    }


}