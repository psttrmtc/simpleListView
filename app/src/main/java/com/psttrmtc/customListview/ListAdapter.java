package com.psttrmtc.customListview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.List;

class MyListAdapter extends ArrayAdapter<User> {

    List<User> userList;

    Context context;

    int resource;

    public MyListAdapter(Context context, int resource, List<User> userList){
        super(context, resource, userList);
        this.context = context;
        this.resource = resource;
        this.userList = userList;
    }

    @Override
    public View getView(final int position, @Nullable View convertView, @Nullable ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewNumber = view.findViewById(R.id.textViewNumber);


        User user = userList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(user.getImage()));
        textViewName.setText(user.getName());
        textViewNumber.setText(user.getNumber());

        return view;
    }
}

