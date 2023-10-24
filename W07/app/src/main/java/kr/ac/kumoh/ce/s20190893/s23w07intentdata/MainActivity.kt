package kr.ac.kumoh.ce.s20190893.s23w07intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.ce.s20190893.s23w07intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY_NAME = "lacation"
        const val  MOUNTAIN = "mountain"
        const val  SEA = "sea"
    }

    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        <Button
            android:id="@+id/myButton"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Click Me"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
        />

        <Button
        android:id="@+id/myButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        />

        main.btnMountain.setOnClickListener {
            Toast.makeText(this,
                "산 이미지"
                Toast.LENGTH_SHORT).show()
            val intent = intent(this,
                ImageActivity::class.java)
            startActicity(intent)
        }
        main.btnSea.setOnClickListener {
            Toast.makeText(this,
                "바다 이미지"
                Toast.LENGTH_SHORT).show()
            val intent = intent(this,
                ImageActivity::class.java)
            startActicity(intent)
        }
    }
}