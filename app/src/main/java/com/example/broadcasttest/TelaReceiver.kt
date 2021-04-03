package com.example.broadcasttest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TelaReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Tela desbloqueada", Toast.LENGTH_SHORT).show()
        val mainIntent = Intent(context, MainActivity::class.java)
        context.startActivity(mainIntent)
    }
}