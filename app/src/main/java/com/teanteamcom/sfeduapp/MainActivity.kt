package com.teanteamcom.sfeduapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.ktx.Firebase
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.*
import kotlin.coroutines.CoroutineContext



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contextM: CoroutineContext = Job() + Dispatchers.Main
        val scopeM: CoroutineScope = CoroutineScope(contextM)

/*

        fun login () {
            val emailTxt = findViewById<View>(R.id.emailTxt) as EditText
            var email = emailTxt.text.toString()
            val passwordTxt = findViewById<View>(R.id.passwordTxt) as EditText
            var password = passwordTxt.text.toString()

            if (!email.isEmpty() && !password.isEmpty()) {
                this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener ( this, OnCompleteListener<AuthResult> { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, Timeline::class.java))
                        Toast.makeText(this, "Successfully Logged in :)", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "Error Logging in :(", Toast.LENGTH_SHORT).show()
                    }
                })

            }else {
                Toast.makeText(this, "Please fill up the Credentials :|", Toast.LENGTH_SHORT).show()
            }
        }

*/


    }
    override fun onResume() {
        super.onResume()

    }
    override fun onPause() {
        super.onPause()

    }
}

