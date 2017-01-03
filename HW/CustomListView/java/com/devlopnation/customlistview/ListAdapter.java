package com.devlopnation.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by asus on 1/3/2017.
 */

public class ListAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    public String[] name = {"kamla","vimla","shakuntala","shimla","amla"};
    public Integer[] images = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};

    public ListAdapter(Context context){
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return name[position];
    }

    @Override
    public long getItemId(int position) {
        return images[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = layoutInflater.inflate(R.layout.view,null);
        TextView tvName =(TextView) view.findViewById(R.id.textView);
        ImageView ivImage = (ImageView) view.findViewById(R.id.imageView);
        tvName.setText(name[position]);
        ivImage.setImageResource(images[position]);
        return view;
    }
}
