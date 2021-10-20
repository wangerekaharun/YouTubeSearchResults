package ke.co.appslab.gradleplugins.ui

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import ke.co.appslab.gradleplugins.databinding.ItemYoutubeVideoBinding

class YouTubeAdapter:  PagingDataAdapter<String, YouTubeAdapter.YouTubeViewHolder>(DiffUtilCallBack) {
    class YouTubeViewHolder(private val binding: ItemYoutubeVideoBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onBindViewHolder(holder: YouTubeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YouTubeViewHolder {
        TODO("Not yet implemented")
    }
}

object DiffUtilCallBack: DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
       return oldItem == newItem
    }

}