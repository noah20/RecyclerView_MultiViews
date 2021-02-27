package com.example.recyclerviewmultiviewsfacebookclon.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmultiviewsfacebookclon.R;
import com.example.recyclerviewmultiviewsfacebookclon.databinding.RecyclerMediaItemLayoutBinding;
import com.example.recyclerviewmultiviewsfacebookclon.databinding.RecyclerNormalItemLayoutBinding;
import com.example.recyclerviewmultiviewsfacebookclon.model.POST_TYPE;
import com.example.recyclerviewmultiviewsfacebookclon.model.PRIVACY;
import com.example.recyclerviewmultiviewsfacebookclon.model.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<PostModel> mPostModels = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mainView;
        if (viewType == 0) {
            mainView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_media_item_layout, parent, false);
            return new MediaPostViewHolder(mainView);
        } else {
            mainView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_normal_item_layout, parent, false);
            return new PostViewHolder(mainView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       PostModel temp = mPostModels.get(position);
        if (holder.getItemViewType()==0){
            MediaPostViewHolder mediaHolder = (MediaPostViewHolder) holder;
            mediaHolder.mMediaBinding.mediapostUserImage.setImageResource(temp.getUserImageId());
            mediaHolder.mMediaBinding.mediapostUserName.setText(temp.getUserName());
            mediaHolder.mMediaBinding.mediapostTime.setText(dateFormatter(temp.getTime()));
            mediaHolder.mMediaBinding.mediapostPrivacy.setImageResource(getPrivacyIcon(temp.getPrivacy()));
            mediaHolder.mMediaBinding.mediapostDescription.setText(temp.getDescription());
            mediaHolder.mMediaBinding.mediapostImage.setImageResource(temp.getImageId());
            if(temp.getType()==POST_TYPE.Image)
                mediaHolder.mMediaBinding.mediapostPlay.setVisibility(View.GONE);
            else
                mediaHolder.mMediaBinding.mediapostPlay.setVisibility(View.VISIBLE);

            mediaHolder.mMediaBinding.mediapostCommentCount.setText(temp.getComments()+" Comments");
            mediaHolder.mMediaBinding.mediapostLikesCount.setText(temp.getLikes()+" Likes");

            //mediaHolder.mMediaBinding.mediaPost

        }else {
            PostViewHolder postHolder = (PostViewHolder) holder;
            postHolder.mTextBinding.postUserIamge.setImageResource(temp.getImageId());
            postHolder.mTextBinding.postUserName.setText(temp.getUserName());
            postHolder.mTextBinding.postTime.setText(dateFormatter(temp.getTime()));
            postHolder.mTextBinding.postPrivacy.setImageResource(getPrivacyIcon(temp.getPrivacy()));
            postHolder.mTextBinding.postDescription.setText(temp.getDescription());
            postHolder.mTextBinding.postUserIamge.setImageResource(temp.getUserImageId());
            postHolder.mTextBinding.postCommentCount.setText(temp.getComments()+" Comments");
            postHolder.mTextBinding.postLikesCount.setText(temp.getLikes()+" Likes");

        }
    }

    public String dateFormatter(long time){
        long t = System.currentTimeMillis() - time;
        String format;
        if(t < 3600000){
             format = android.text.format.DateFormat.format("m",t).toString()+" m";
        }else if(t>3600000&&t<86400000){
            format = android.text.format.DateFormat.format("H",t).toString()+" h";
        }else {
            format = android.text.format.DateFormat.format("YY/M/d _ h:m",t).toString().replace("_","at");
        }
        return format;
    }

    public int getPrivacyIcon(PRIVACY privacy){

        switch (privacy){
            case PRIVACY_ALL:
                return R.drawable.ic_public;
            case PRIVACY_FRIENDS:
                return R.drawable.ic_friends;
        }

        return R.drawable.ic_public;
    }
    @Override
    public int getItemViewType(int position) {
        if (mPostModels.get(position).getType() == POST_TYPE.Video
                || mPostModels.get(position).getType() == POST_TYPE.Image)
            return 0;
        else
            return 1;

    }

    @Override
    public int getItemCount() {
        return mPostModels.size();
    }

    public void setPostModels(List<PostModel> postModels) {
        mPostModels = postModels;
        notifyDataSetChanged();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        RecyclerNormalItemLayoutBinding mTextBinding;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextBinding = RecyclerNormalItemLayoutBinding.bind(itemView);

        }
    }

    public static class MediaPostViewHolder extends RecyclerView.ViewHolder {
        RecyclerMediaItemLayoutBinding mMediaBinding;

        public MediaPostViewHolder(@NonNull View itemView) {
            super(itemView);
            mMediaBinding = RecyclerMediaItemLayoutBinding.bind(itemView);
        }
    }
}
