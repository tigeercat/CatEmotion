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
//    private Integer[] images = {R.drawable.sadcat, R.drawable.sadcat2};
//    private String[] texts  = {"Sad cat Pepper", "Sad cat Meme"};
    private CatDetailItem[] details;
//
////
//   if ( layout ==sad )
////        images = sadcatimages;
////        texts = sadtexts;
////        if ellse  layout == playful
////        images = playfulimages
//
//    public Integer[] sadcatimages = {R.drawable.sadcat, R.drawable.sadcat2};
//      public String[] sadcattexts = {"Sad cat Pepper", "Sad cat Meme"};
//
//
//   private Integer[] playfulimages = {R.drawable.playfulcat, R.drawable.playfulcat2};
//    private String[] playfultexts = {"meow lol", "meow haha hehe mow"};


    public ViewPagerAdapter(Context context, CatDetailItem[] details) {
        this.context = context;
        this.details = details;
    }
    @Override
    public int getCount() {
        return details.length;
    }

    @Override
    public  boolean isViewFromObject(View view, Object object){
        return view == object;
    }

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
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
