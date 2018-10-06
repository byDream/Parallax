package com.tao.parallax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ParallaxListView listview;
    private String[] indexArr = { "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        listview = (ParallaxListView) findViewById(R.id.listview);

        listview.setOverScrollMode(ListView.OVER_SCROLL_NEVER);//永远不显示蓝色阴影

        //添加header
        View headerView = View.inflate(this,R.layout.layout_header, null);
        ImageView imageView = (ImageView) headerView.findViewById(R.id.imageView);
        listview.setParallaxImageView(imageView);

        listview.addHeaderView(headerView);

        listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, indexArr));
    }

}
