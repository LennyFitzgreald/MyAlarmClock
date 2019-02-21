package jp.techacademy.wakahara.koumei.myalarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.jetbrains.anko.toast

class AlarmBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        // context?.toast("アラームを受信しました")

        // Ankoを使わない場合
        // Toast.makeText(context, "受信しました", Toast.LENGTH_SHORT).show()
        val intent = Intent(context, MainActivity::class.java)
            .putExtra("onRwceive", true)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(intent)
    }
}