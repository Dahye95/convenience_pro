package com.example.convenience_pro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import adapters.itemListAdapter;
import model.item;
import model.itemList;

public class MainActivity extends AppCompatActivity {

    private itemListAdapter itemListAdapter;
    private ArrayList<itemList> itemLists;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvItemListView = findViewById(R.id.rvItemListView);


        itemLists = prepareData();

        itemListAdapter = new itemListAdapter(itemLists, MainActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        rvItemListView.setLayoutManager(manager);
        rvItemListView.setAdapter(itemListAdapter);


    }


    private ArrayList<itemList> prepareData() {
        ArrayList<itemList> itemLists = new ArrayList<itemList>();
        itemList cu_list = new itemList();
        cu_list.id = 1;
        cu_list.itemListName="CU";
        cu_list.items = new ArrayList<>();

        item saleItem = new item();
        saleItem.id = 1;
        saleItem.itemImgUrl="https://tqklhszfkvzk6518638.cdn.ntruss.com/product/6921211104292.jpg";
        saleItem.itemName ="농심)멘토스레인보우";
        saleItem.itemPrice="800원";
        saleItem.itemPlus ="1+1";


        Log.e("dfdfdf","Dfdfdf"+cu_list);

        item saleItem2 = new item();
        saleItem2.id = 2;
        saleItem2.itemImgUrl="https://tqklhszfkvzk6518638.cdn.ntruss.com/product/8801094202606.jpg";
        saleItem2.itemName ="코카)스프라이트P500ml";
        saleItem2.itemPrice="2,000원";
        saleItem2.itemPlus ="1+1";



        item saleItem3 = new item();
        saleItem3.id = 3;
        saleItem3.itemImgUrl="https://tqklhszfkvzk6518638.cdn.ntruss.com/product/8806002010861.jpg";
        saleItem3.itemName ="광동)헛개파워병";
        saleItem3.itemPrice="5,000원";
        saleItem3.itemPlus ="1+1";

        cu_list.items.add(saleItem);
        cu_list.items.add(saleItem2);
        cu_list.items.add(saleItem3);

       itemLists.add(cu_list);
       Log.e("aaaaaa","=========="+itemLists);
            return itemLists;

    }




}