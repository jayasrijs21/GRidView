package com.example.gridview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends BaseAdapter {
    Context context;
    String [] countries;
    int[] pics;
    CustomAdapter(Context context , String[] countries, int[] pics) {
        this.context = context;
        this.countries = countries;
        this.pics = pics;
    }
    @Override
    public int getCount() {
        return countries.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
//LAYOUT INFLATE - FINDFVIEW - SET
        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.gridviewlayout,viewGroup,false);
        }
       ImageView img =  view.findViewById(R.id.imageView3);
        TextView text = view.findViewById(R.id.textView2);

        img.setImageResource(pics[position]);
        text.setText(countries[position]);
        return view;
    }
}
