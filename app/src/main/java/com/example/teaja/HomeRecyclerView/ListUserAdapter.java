package com.example.teaja.HomeRecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaja.R;
import com.example.teaja.myInterface.IClickItemListUser;

import java.util.List;

public class ListUserAdapter extends RecyclerView.Adapter<ListUserAdapter.PViewHolder> {
    List<ListUser> userList;
    IClickItemListUser iClickItemListUser;

    public void ListUserAdapter(List<ListUser> userList, IClickItemListUser iClickItemListUser) {
        this.userList = userList;
        this.iClickItemListUser = iClickItemListUser;
    }

    @NonNull
    @Override
    public ListUserAdapter.PViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_listuser, parent, false);
        PViewHolder pViewHolder = new PViewHolder(view);

        return pViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListUserAdapter.PViewHolder holder, int position) {
        ListUser user = userList.get(position);

        holder.imgList.setImageResource(user.getResourceID());
        holder.tvList.setText(user.getName());
        holder.lnlistUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iClickItemListUser.setOnClickItemListenerListUser(user);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (userList != null){
           return userList.size();
        }
        return 0;
    }

    public class PViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout lnlistUser;
        private ImageView imgList;
        private TextView tvList;
        public PViewHolder(@NonNull View itemView) {
            super(itemView);
            lnlistUser = itemView.findViewById(R.id.Ln_listUser);
            imgList = itemView.findViewById(R.id.img_listUser);
            tvList = itemView.findViewById(R.id.tv_listUser);
        }
    }
}
