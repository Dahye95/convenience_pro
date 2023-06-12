package adapters;


import android.content.ClipData;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.convenience_pro.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import model.item;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.CustomViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<item> items;
    private Context context;

    public ItemAdapter(Context context, ArrayList<item>items){
        this.context = context;
        this.items = items;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_saleitem,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        item proItem = items.get(position);
        holder.tvName.setText(proItem.name);
        holder.tvPrice.setText(proItem.price);
        holder.tvPlus.setText(proItem.itemPlus);

        Picasso.get().load(proItem.img)
                        .into(holder.ivImg);


    }


    @Override
    public int getItemCount() {
        return items.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivImg;
        public TextView tvName, tvPrice, tvPlus;

        public CustomViewHolder(View itemView){
            super(itemView);

            tvName = (TextView)itemView.findViewById(R.id.tvName);
            tvPrice = (TextView)itemView.findViewById(R.id.tvPrice);
            tvPlus = (TextView)itemView.findViewById(R.id.tvPlus);
            ivImg = (ImageView)itemView.findViewById(R.id.ivImg);

        }

    }

}
