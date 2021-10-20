package ke.co.appslab.gradleplugins.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import ke.co.appslab.gradleplugins.databinding.ItemYoutubeVideoBinding

typealias onClick = (String) -> Unit

class YouTubeAdapter(private val onClick: onClick):  PagingDataAdapter<String, YouTubeAdapter.YouTubeViewHolder>(DiffUtilCallBack) {
    class YouTubeViewHolder(private val binding: ItemYoutubeVideoBinding, private val onClick: onClick): RecyclerView.ViewHolder(binding.root){
        fun bind(video: String){
            binding.tvVideoName.text = video
            binding.root.setOnClickListener {
                onClick(video)
            }
        }
    }

    override fun onBindViewHolder(holder: YouTubeViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YouTubeViewHolder =
        YouTubeViewHolder(
            ItemYoutubeVideoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onClick
        )
}

object DiffUtilCallBack: DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
       return oldItem == newItem
    }

}