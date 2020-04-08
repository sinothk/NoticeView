package com.sinothk.noticeView.demo;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sinothk.widgets.noticeView.MarqueeListView;

import java.util.ArrayList;
import java.util.List;

public class NoticeListViewDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_list_view_activity_main_demo);

        final List<CharSequence> list = new ArrayList<>();
        list.add("4、新浪微博：@孙福生微博");
        list.add("5、www.sinothk.com");

        //
        MarqueeListView marqueeListView = this.findViewById(R.id.marqueeListView);
        marqueeListView.startWithList(list);
        marqueeListView.setOnItemClickListener(new MarqueeListView.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(NoticeListViewDemoMainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
