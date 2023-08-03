package View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.convenience_pro.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Network.ApiClient;
import Network.RetrofitService;
import adapters.itemListAdapter;
import model.item;
import model.itemList;
import model.saleProductList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private itemListAdapter itemListAdapter;
    private ArrayList<itemList> itemLists;

    saleProductList saleItemList;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        RetrofitService retrofitService= ApiClient.getClient().create(RetrofitService.class);

        Call<saleProductList> call = retrofitService.getGs25();
        call.enqueue(new Callback<saleProductList>() {
            @Override
            public void onResponse(Call<saleProductList> call, Response<saleProductList> response) {
                try {
                    System.out.println(response.errorBody().string().toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                saleItemList = response.body();
                textView.setText(response.body().toString());
                if (!response.isSuccessful()) {
                    Log.d("성공실패", "onResponse:onresponse실패");
                }
                else {
                    Log.d("요기요기+responseBody", saleItemList.toString());
                }
            }
            @Override
            public void onFailure(Call<saleProductList> call, Throwable t) {
                Log.d("responseBody",t.toString());
            }
        });

//        RecyclerView rvItemListView = findViewById(R.id.rvItemListView);





//        itemLists = prepareData();
//
//        itemListAdapter = new itemListAdapter(itemLists, MainActivity.this);
//        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
//        rvItemListView.setLayoutManager(manager);
//        rvItemListView.setAdapter(itemListAdapter);


    }

//
//    private ArrayList<itemList> prepareData() {
//        ArrayList<itemList> itemLists = new ArrayList<itemList>();
//        itemList cu_list = new itemList();
//        cu_list.id = 1;
//        cu_list.itemListName = "gs25";
//        cu_list.items = new ArrayList<>();
//
//
//        InputStream inputStream = getResources().openRawResource(R.raw.sample_gs25);
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        StringBuffer stringBuffer = new StringBuffer();
//        String line = null;
//
//        try {
//            while ((line = bufferedReader.readLine()) != null) {
//                stringBuffer.append(line);
//
//            }
//            Log.v("TAG", "스트링버퍼:" + stringBuffer.toString());
//
//
//            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
//            JSONArray jsonArray = new JSONArray(jsonObject.getString("items"));
////            Log.e("============================","jsonobject"+jsonObject);
////            Log.e("=========","jsonArray"+jsonArray);
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
//                Log.e("=========","jsonArray"+i);
//                int item_idx = jsonObject1.getInt("item_idx");
//                String name = jsonObject1.getString("name");
//                String price = jsonObject1.getString("price");
//                String img = jsonObject1.getString("img");
//
//
//                item saleItem = new item();
//                saleItem.item_idx = item_idx;
//                saleItem.img = img;
//                saleItem.name = name;
//                saleItem.price = price;
//                saleItem.itemPlus = "1+1";
//
//                Log.e("dfdfdf", "Dfdfdf" + cu_list);
//
//
//                cu_list.items.add(saleItem);
//
//            }
//            itemLists.add(cu_list);
//            Log.e("aaaaaa", "==========" + itemLists);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }
//
//        return itemLists;
//    }
    }