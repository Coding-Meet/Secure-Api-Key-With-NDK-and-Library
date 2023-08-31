package com.coding.meet.secureapikeywithndkotherlibrary

import android.util.Base64
import android.util.Log
import com.cossacklabs.themis.SecureCell
import com.cossacklabs.themis.SymmetricKey

class SecurityManager {

    // Decrypts a encrypted string using provided key
    fun decryptStringWithKey(key: ByteArray,encryptedString:String){

        val symmetricKey = SymmetricKey(key)
        val secureCell =  SecureCell.SealWithKey(symmetricKey)

        val decodedData = Base64.decode(encryptedString,Base64.DEFAULT)
        val decryptedString = String(secureCell.decrypt(decodedData))

        Log.d("decryptedString",decryptedString)
    }

}