package com.example.login_project

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    val TAG = "SignUpActivity_Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        Log.i(TAG, "onCreate()")

        val btn = findViewById<Button>(R.id.btn_signup2)

        btn.setOnClickListener {

            val nameEditText = findViewById<EditText>(R.id.editText)
            val idEditText = findViewById<EditText>(R.id.editText2)
            val pwEditText = findViewById<EditText>(R.id.editText3)

            if (nameEditText.text.isEmpty()) {
                Toast.makeText(this, "이름을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            } else if (idEditText.text.isEmpty()) {
                Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            } else if (pwEditText.text.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            } else {
                Toast.makeText(this, "회원가입 완료", Toast.LENGTH_SHORT).show()
                intent.putExtra("ID", idEditText.text.toString())
                intent.putExtra("PW", pwEditText.text.toString())
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
    }
}