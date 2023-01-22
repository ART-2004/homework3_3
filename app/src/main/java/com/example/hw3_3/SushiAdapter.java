package com.example.hw3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SushiAdapter extends RecyclerView.Adapter<SushiAdapter.SushiViewHolder> {

    ArrayList<Sushi> arrayList;
    public SushiAdapter(ArrayList<Sushi> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public SushiAdapter.SushiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SushiViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_sushi,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SushiViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class SushiViewHolder extends RecyclerView.ViewHolder{

            private ImageView sushiIcon;
            private TextView sushiTitle;
            private TextView sushiIngredients;

            public SushiViewHolder(@NonNull View itemView) {
                super(itemView);
            }

            public void onBind(Sushi sushi){
                sushiIcon = itemView.findViewById(R.id.Image_View_Icon);
                sushiIngredients = itemView.findViewById(R.id.Text_View_Ingredients);
                sushiTitle = itemView.findViewById(R.id.Text_View_Title);

                sushiIcon.setImageResource(sushi.getImage());
                sushiIngredients.setText(sushi.getIngredients());
                sushiTitle.setText(sushi.getTitle());
            }
    }
}
