package com.example.myownapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


import com.example.myownapplication.InfoActivity;
import com.example.myownapplication.R;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //1.定义对象
    private EditText etUsername;
    private EditText etPassword;
    private CheckBox cbAutoLogin;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2.初始化控件对象
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        cbAutoLogin = findViewById(R.id.cb_auto_login);
        btnLogin = findViewById(R.id.btn_login);
        Map<String, String> data = SPUtil.getAll(this);
        if (data.size()>0){
            etUsername.setText(data.get("account"));
            etPassword.setText(data.get("password"));
        }

        //3.设置按钮的监听器
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }

    private void login(){
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString();
        if("a".equals(username) && "1".equals(password)){
            Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, InfoActivity.class);
            intent.putExtra("username",username);
            startActivity(intent);
            if (cbAutoLogin.isChecked()) {
                SPUtil.saveAccount(this, username, password);
                Toast.makeText(MainActivity.this, "存储且登录成功",
                        Toast.LENGTH_LONG).show();
            }else {
                SPUtil.clear(this);
            }
        }else{
            Toast.makeText(this,"用户名或密码不正确",Toast.LENGTH_LONG).show();
        }
    }

    public void onClick(View view) {
    }
}