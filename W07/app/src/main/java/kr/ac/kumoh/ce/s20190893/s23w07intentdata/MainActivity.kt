package kr.ac.kumoh.ce.s20190893.s23w07intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import kr.ac.kumoh.ce.s20190893.s23w07intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    companion object{
        const val  IMAGE_NAME = "image name"
        const val  IMAGE_RESULT = "image result"


        const val KEY_NAME = "lacation"
        const val  MOUNTAIN = "mountain"
        const val  SEA = "sea"
    }

    private lateinit var main: ActivityMainBinding
    override fun onClick(p0: View?) {
        val intent = Intent(this, ImageActivity::class.java)
        val value = when (p0?.id) {S
            main.btnMountain.id -> {
                Toast.makeText(this,
                    "산 이미지",
                    Toast.LENGTH_SHORT).show()
                MOUNTAIN
            }
            main.btnSea.id -> {
                Toast.makeText(this,
                    "바다 이미지",
                    Toast.LENGTH_SHORT).show()
                SEA
            }
            else -> return
        }
        intent.putExtra(KEY_NAME, value)
        startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        val intent = Intent()
        val value = when (v?.id){
            main.btnLike.id -> LIKE
            main.btnDislike.id -> DISLIKE
            else -> NONE
    }
    //TODO : Image_NAME  putExtra() 필요
        intent.putExtra(MainActivity.KEY_NAME, value)
        startActivity(intent)
        finish()
    }
}