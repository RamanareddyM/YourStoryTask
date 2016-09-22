package com.twitter.hashtag.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.twitter.hashtag.R;
import com.twitter.hashtag.models.TweetModel;

import java.util.List;

/**
 * Created by ramanaredddy on 22/09/16.
 */

public class TweetsImagesAdapter extends RecyclerView.Adapter<TweetsImagesAdapter.ViewHolder> {

    private Context context;
    private List<TweetModel> tweetModelsList;

    public TweetsImagesAdapter(Context context, List<TweetModel> tweetModelsList) {
        this.context = context;
        this.tweetModelsList = tweetModelsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.tweet_image, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (tweetModelsList.get(position).getImage_url() != null)
            Picasso.with(context).load(tweetModelsList.get(position).getImage_url()).placeholder(R.mipmap.ic_launcher).into(holder.tweetImage);
    }

    @Override
    public int getItemCount() {
        return tweetModelsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView tweetImage;

        public ViewHolder(View itemView) {
            super(itemView);
            tweetImage = (ImageView) itemView.findViewById(R.id.image_tweet);
        }
    }


}
