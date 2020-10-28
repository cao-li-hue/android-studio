package com.example.myownapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class KeepActivity extends AppCompatActivity {

    Button btn_confirm;
    private String[] titles = {"清新","可爱","炫酷","卡通","纹理","风景"};
    private String[] price = {"唯美","遇一人","Chritian","Bibibi","bobo","酱酱屠屠"};
    private int[] icons = {
            R.drawable.table, R.drawable.apple,R.drawable.cake,
            R.drawable.wireclothes, R.drawable.kiwifruit, R.drawable.scarf};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep);

        initData();
        initView();
    }
    private void initView(){
        ListView lvGoods = findViewById(R.id.lv_goods);
        BaseAdapter adapter = new GoodsAdapter(this,goods);
        lvGoods.setAdapter(adapter);
        lvGoods.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Goods good = (Goods) parent.getItemAtPosition(position);
                Toast.makeText(KeepActivity.this, good.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<Goods> goods;
    private void initData(){
        goods = new ArrayList<>();
        for (int i = 0 ; i < titles.length; i++){
            goods.add(new Goods(titles[i], price[i], icons[i]));
        }
    }
}