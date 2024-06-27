package com.example.login_project

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    val TAG = "SignInActivity_Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        Log.i(TAG, "onCreate()")

        val idEditText = findViewById<EditText>(R.id.editId)
        val pwEditText = findViewById<EditText>(R.id.editPw)

        val btn1 = findViewById<Button>(R.id.btn_signin)

        btn1.setOnClickListener {

            if (idEditText.text.isEmpty()) {
                Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            } else if (pwEditText.text.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            } else {
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        val btn_data = findViewById<Button>(R.id.btn_signin)

        btn_data.setOnClickListener {
            val idInput = findViewById<EditText>(R.id.editId)
            val strData = idInput.text.toString()

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("dataFromFirstActivity", strData)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.btn_signup1)

        btn2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            resultLauncher.launch(intent)
        }

        resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if(result.resultCode == RESULT_OK) {
                val ID = result.data?.getStringExtra("ID")?: ""
                val PW = result.data?.getStringExtra("PW")?: ""

                idEditText.setText(ID)
                pwEditText.setText(PW)
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