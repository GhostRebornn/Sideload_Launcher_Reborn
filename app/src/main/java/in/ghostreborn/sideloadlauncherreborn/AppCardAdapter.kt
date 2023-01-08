package `in`.ghostreborn.sideloadlauncherreborn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppCardAdapter(private var appNameArray: List<String>): RecyclerView.Adapter<AppCardAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.app_card_view, parent, false)
        return ViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val appName = appNameArray[position]
        holder.appNameTextView.text = appName
    }

    override fun getItemCount(): Int {
        return appNameArray.size
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val appNameTextView: TextView = view.findViewById(R.id.app_name_text_view)
    }
}