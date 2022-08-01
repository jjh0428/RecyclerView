package sungil.myrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import sungil.myrecyclerview.databinding.RvItemFriendBinding

class FriendAdapter(
    val friendList: List<Friend>
) : RecyclerView.Adapter<FriendAdapter.ViewHolder>() {

    inner class ViewHolder(
        val binding: RvItemFriendBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(friend: Friend) {
            Glide.with(binding.ivProfile.context)
                .load(friend.imgUrl)
                .into(binding.ivProfile)
            binding.tvName.text = friend.name
            binding.tvHp.text = friend.hp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvItemFriendBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend = friendList[position]
        holder.bind(friend)
    }

    override fun getItemCount(): Int {
        return friendList.size
    }
}