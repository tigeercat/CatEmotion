package com.david.catemotion;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.chrisbanes.photoview.PhotoView;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private CatDetailItem[] details;
    public ViewPagerAdapter(Context context, CatDetailItem[] details) {
        this.context = context;
        this.details = details;
    }
    /*
    This method gets the count of objects inside details
     */
    @Override
    public int getCount() {
        return details.length;
    }
    /*
    This method checks if the view and object are equal
     */
    @Override
    public  boolean isViewFromObject(View view, Object object){
        return view == object;
    }
    /*
    This method inflates the custom_layout with image and text, and puts it
    inside of a ViewPager, for the image slider
     */
    @Override
    public Object instantiateItem(ViewGroup container, final int position){

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        PhotoView imageView = (PhotoView) view.findViewById((R.id.imageView));
        TextView textView = (TextView) view.findViewById(R.id.textView);
        imageView.setImageResource(details[position].image);
        textView.setText(details[position].description);
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }
    /*
    this method removes a view(pic / text) from the viewpager
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
