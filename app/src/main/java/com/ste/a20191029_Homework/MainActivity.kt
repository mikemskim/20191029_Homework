package com.ste.a20191029_Homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            var id = loginId.text.toString()
            var pwd = password.text.toString()
            var message = "ID : $id, PWD : $pwd"
            if (id == "admin" && pwd == "1234") {
                message = "관리자로 로그인하였습니다."
            }
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            val printStr = "ID는 ${id.toUpperCase()}이고 PWD는 ${pwd} 입니다."
            Toast.makeText(this, printStr, Toast.LENGTH_SHORT).show()
        }
    }
}
