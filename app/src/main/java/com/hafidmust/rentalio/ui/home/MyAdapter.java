package com.hafidmust.rentalio.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hafidmust.rentalio.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class MyAdapter extends SliderViewAdapter<MyAdapter.ViewHolder> {

    List<Integer> imageList;
    MyAdapter(List<Integer>list){
        this.imageList = list;
    }

    class ViewHolder extends SliderViewAdapter.ViewHolder{
        ImageView imageView;


        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getCount() {
        return imageList.size() ;
    }
}
