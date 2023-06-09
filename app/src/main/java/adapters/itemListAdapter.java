package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.convenience_pro.R;

import java.util.ArrayList;

import model.itemList;

public class itemListAdapter extends RecyclerView.Adapter<itemListAdapter.ViewHolder> {

    public ArrayList<itemList> itemLists;
    public Context context;
    private LayoutInflater layoutInflater;


    public itemListAdapter(ArrayList<itemList> itemLists, Context context) {

        this.itemLists = itemLists;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.single_saleitem_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemListAdapter.ViewHolder holder, int position) {
        holder.recyclerView.setAdapter(new ItemAdapter(context,itemLists.get(position).items));
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.recyclerView.setHasFixedSize(true);
        holder.tvHeadLine.setText(itemLists.get(position).itemListName);

    }

    @Override
    public int getItemCount() {
        return itemLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        TextView tvHeadLine;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView)itemView.findViewById((R.id.rvItemLists));
            tvHeadLine = (TextView)itemView.findViewById(R.id.rvWhere);

        }
    }

}
