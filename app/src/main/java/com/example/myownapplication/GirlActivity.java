package com.example.myownapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GirlActivity extends Fragment {
    private String context;
    private TextView mTextView;

    public  GirlActivity(String context){
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_girl,container,false);
        mTextView = (TextView)view.findViewById(R.id.txt_content2);
        //mTextView = (TextView)getActivity().findViewById(R.id.txt_content);
        mTextView.setText(context);
        return view;
    }
}