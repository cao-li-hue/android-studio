package com.example.myownapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class daoh extends AppCompatActivity {

    Button btn_confirm;
    Button btn_execise,btn_massage,btn_my,btn_gg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daoh);
        btn_execise=findViewById(R.id.btn_execise);
        btn_execise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(daoh.this,KeepActivity.class);
                startActivity(intent);
            }
        });
        btn_massage=findViewById(R.id.btn_massage);
        btn_massage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(daoh.this,PetActivity.class);
                startActivity(intent);
            }
        });
        btn_my=findViewById(R.id.btn_my);
        btn_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(daoh.this,MyActivity.class);
                startActivity(intent);
            }
        });
        btn_gg=findViewById(R.id.btn_gg);
        btn_gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(daoh.this,ShopActivity.class);
                startActivity(intent);
            }
        });
}
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            //使用隐式intent实现activity跳转


            case R.id.btn_search:
                intent = new Intent(Intent.ACTION_WEB_SEARCH);
//                intent.putExtra(SearchManager.QUERY,);
                break;

        }
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);

        }


    }

}