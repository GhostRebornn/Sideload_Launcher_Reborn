package `in`.ghostreborn.sideloadlauncherreborn

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appNames = arrayOf(
            "Google",
            "Google Chrome",
            "Google Drive",
            "Google Photos",
            "Google Contacts",
            "Google Dialer",
            "Google Maps",
            "Google Play Store",
            "Google Play Games"
        ).toList()

        val recyclerView: RecyclerView = findViewById(R.id.app_recycler_view)
        val appCardAdapter: AppCardAdapter = AppCardAdapter(appNames)
        val linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = appCardAdapter

    }
}