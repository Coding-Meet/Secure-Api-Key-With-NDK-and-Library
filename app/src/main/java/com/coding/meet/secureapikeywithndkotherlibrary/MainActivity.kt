package com.coding.meet.secureapikeywithndkotherlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {

    object Keys {

        init {
            System.loadLibrary("native-lib")
        }
        
        external fun key(): String
        external fun encryptString() :String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("externalKey", Keys.key())
        Log.d("encryptString", Keys.encryptString())


        val securityManager = SecurityManager()

        // Replace with actual external key
        val externalKey = Keys.key().toByteArray(
            StandardCharsets.UTF_8)
        Log.d("externalKey",String(externalKey))

        // Replace with actual encrypted Key
        val externalEncryptedString = Keys.encryptString()
        Log.d("externalEncryptedString",externalEncryptedString)

        // Decrypt the External Encrypted string using the external key
        securityManager.decryptStringWithKey(externalKey,externalEncryptedString)

    }
}