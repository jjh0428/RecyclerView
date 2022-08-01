package sungil.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("생명주기", "onCreate : 앱 시작했어요")
    }

    override fun onPause() {
        super.onPause()
        Log.d("생명주기", "onPause : 일시정지")
    }

    override fun onResume() {
        super.onResume()
        Log.d("생명주기", "onResume : 재시작")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("생명주기", "onDestroy : 앱종료")
    }

}