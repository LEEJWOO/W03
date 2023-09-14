import com.example.W02Counter.databinding.ActivityMainBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.W02Counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)

        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.txtCount.text = "${++count}"
        }
        main.btnSub.setOnClickListener {
            if(count > 0)
                main.txtCount.text = "${--count}"
        }
        main.btnRes.setOnClickListener {
            count = 0
            main.txtCount.text = "$count"
        }
    }
}