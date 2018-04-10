package com.sf.retrofitrxjava.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sf.retrofitrxjava.Model.Post;
import com.sf.retrofitrxjava.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    Context context;
    List<Post> postsList;

    public PostAdapter(Context context, List<Post> postsList) {
        this.context = context;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_post, parent, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.txt_author.setText(String.valueOf(postsList.get(position).getUserId()));
        holder.txt_title.setText(String.valueOf(postsList.get(position).getTitle()));
        holder.txt_content.setText(new StringBuilder(postsList.get(position).getBody().substring(0, 20))
                .append("...").toString());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }
}
