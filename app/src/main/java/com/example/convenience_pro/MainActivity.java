package com.example.convenience_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    private ArrayList<itemList> prepareData() {
        ArrayList<itemList> itemLists = new ArrayList<itemList>();
        itemList cu_list = new itemList();
        cu_list.id = 1;
        cu_list.itemListName="CU";


        item saleItem = new item();
        saleItem.id = 1;
        saleItem.itemImg="https://tqklhszfkvzk6518638.cdn.ntruss.com/product/8801051009033.jpg";
        saleItem.itemName ="46cm)초극세모칫솔";
        saleItem.itemPrice="3,500원";
        saleItem.itemPlus ="1+1";


        item saleItem2 = new item();
        saleItem.id = 2;
        saleItem.itemImg="https://tqklhszfkvzk6518638.cdn.ntruss.com/product/8806403146473.jpg";
        saleItem.itemName ="메디안)치석케어치약";
        saleItem.itemPrice="4,500원";
        saleItem.itemPlus ="1+1";



        item saleItem3 = new item();
        saleItem.id = 3;
        saleItem.itemImg="https://tqklhszfkvzk6518638.cdn.ntruss.com/product/8801042443631.jpg";
        saleItem.itemName ="메디안)센서티브칫솔";
        saleItem.itemPrice="3,000원";
        saleItem.itemPlus ="1+1";


       cu_list.items.add(saleItem);
       cu_list.items.add(saleItem2);
       cu_list.items.add(saleItem3);

       itemLists.add(cu_list);

        return itemLists;

    }




}