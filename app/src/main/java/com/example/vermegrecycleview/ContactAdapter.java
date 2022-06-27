package com.example.vermegrecycleview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MViewHolder> {
    private Context mContext;
    private List<Contact> mList;

    public ContactAdapter(Context mContext, List<Contact> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_card,parent,false);
        return new MViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {
        Contact c = mList.get(position);
        holder.imgPhoto.setImageResource((c.getPhoto()));
        holder.tvTel.setText(c.getTel());
        holder.tvNomPrenom.setText(c.getName()+" "+c.getLastName());
        holder.imgInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Info", Toast.LENGTH_SHORT).show();
            }
        });
        holder.imgTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Uri uri = Uri.parse("tel:"+c.getTel());
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public class MViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto, imgTel, imgInfo;
        TextView tvNomPrenom, tvTel;
        public MViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto=itemView.findViewById(R.id.imageView);
            imgTel=itemView.findViewById(R.id.imageViewCall);
            imgInfo=itemView.findViewById(R.id.imageViewInfo);
            tvNomPrenom=itemView.findViewById(R.id.textViewname);
            tvTel=itemView.findViewById(R.id.textViewTel);
        }
    }
}
