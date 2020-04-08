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

        final List<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> listData = new ArrayList<>();
        listData.add("1 美国目前部署在西海岸的“尼米兹”号航母，也出现两名新冠");
        listData.add("2 美军已经有4艘航母出现新冠确诊病例，分别是“里根”号");
        listData.add("3 今年2月，路过华盛顿州西雅图市海岸的“尼米兹”号航母，由于不处于部署状态");
        listData.add("4 母港位于美国西海岸华盛顿州基察普海军基地布雷默顿港。");
        listData.add("5 负责美国西海岸防务的美国海军第三舰队发言人、海军中校约翰·法吉表示，“尼米兹”号已经开始“舰内隔离”");

        ArrayList<String> listData2 = new ArrayList<>();
        listData2.add("6 美国目前部署在西海岸的“尼米兹”号航母，也出现两名新冠");
        listData2.add("7 美军已经有4艘航母出现新冠确诊病例，分别是“里根”号");
        listData2.add("8 今年2月，路过华盛顿州西雅图市海岸的“尼米兹”号航母，由于不处于部署状态");
        listData2.add("9 母港位于美国西海岸华盛顿州基察普海军基地布雷默顿港。");
        listData2.add("10 负责美国西海岸防务的美国海军第三舰队发言人、海军中校约翰·法吉表示，“尼米兹”号已经开始“舰内隔离”");

        list.add(listData);
        list.add(listData2);

        //
        MarqueeListView marqueeListView = this.findViewById(R.id.marqueeListView);
        marqueeListView.startWithList(list);
        marqueeListView.setOnItemClickListener(new MarqueeListView.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(NoticeListViewDemoMainActivity.this, "position = " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
