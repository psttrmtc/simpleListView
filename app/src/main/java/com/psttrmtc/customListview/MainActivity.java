package com.psttrmtc.customListview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<User> userList;

    ListView listView;

    TextView displayInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //The arguments of the custom adapter are: activityContext, layout to-be-inflated, labels, icon
        userList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
        displayInfo = (TextView) findViewById(R.id.displayInfo);
        userList.add(new User(R.drawable.icon_2,"Bùi Minh Hải","1612168"));
        userList.add(new User(R.drawable.icon_1,"Nguyễn Thanh Hoàng","1612215"));
        userList.add(new User(R.drawable.icon_3,"Nguyễn Minh Lợi","18120441"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.item_list,userList);
        displayInfo.setText(userList.get(0).getName());
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                adapterView.getChildAt(position).setBackgroundColor(Color.LTGRAY);
//                displayInfo.setText(userList.get(position).getName());
//            }
//        });
    }
}