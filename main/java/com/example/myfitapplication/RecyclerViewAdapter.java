package com.example.myfitapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import javax.xml.namespace.QName;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Techniques> mData;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context mContext, List<Techniques> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    /*@Override
    public void onMovedToScrapHeap(View view) {

    }*/

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view = mInflater.inflate(R.layout.cardview_techniques,viewGroup, false);
        //MyHolder holder= new MyHolder(view);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        myHolder.TechName.setText(mData.get(i).getTechName());

        myHolder.img_tech_thumbnail.setImageResource(mData.get(i).getThumbnail());

        myHolder.cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,TechniquesActivity.class);

                intent.putExtra("Name", mData.get(i).getTechName());
                intent.putExtra("Repetitions", mData.get(i).getTechInfo());
                intent.putExtra("Methods", mData.get(i).getTechSpecs());
                intent.putExtra("Technique",mData.get(i).getTechnique());

                mContext.startActivity(intent);
            }
        });
    }

    public int getItemCount(){
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView TechName;
        CardView cardView;
        ImageView img_tech_thumbnail;
        @SuppressLint("WrongViewCast")
        public MyHolder(@NonNull View itemView){
            super(itemView);
            TechName = (TextView)itemView.findViewById(R.id.text_view);
            img_tech_thumbnail = (ImageView)itemView.findViewById(R.id.tech_img);
            cardView = (CardView)itemView.findViewById(R.id.card);
        }
    }
}
