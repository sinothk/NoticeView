package com.sinothk.noticeView.demo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sinothk.widgets.noticeView.marqueeListView.MarqueeListView;
import com.sinothk.widgets.noticeView.marqueeListView.bean.MarqueeListEntity;

import java.util.ArrayList;
import java.util.List;

public class NoticeListViewDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_list_view_activity_main_demo);

        final List<ArrayList<MarqueeListEntity>> list = new ArrayList<>();
        ArrayList<MarqueeListEntity> listData = new ArrayList<>();
        listData.add(new MarqueeListEntity(R.mipmap.notice_view_ic_launcher, "1 美国目前部署在西海岸的“尼米兹”号航母，也出现两名新冠", "2020-04-08"));
        listData.add(new MarqueeListEntity("2 美军已经有4艘航母出现新冠确诊病例，分别是“里根”号，由于不处于部署状态号已经开始"));
        listData.add(new MarqueeListEntity("3 今年2月，路过华盛顿州西雅图市海岸的“尼米兹”号航母，由于不处于部署状态", "2020-04-08"));
        listData.add(new MarqueeListEntity("4 母港位于美国西海岸华盛顿州基察普海军基地布雷默顿港。", "2020-04-08"));
        listData.add(new MarqueeListEntity("5 负责美国西海岸防务的美国海军第三舰队发言人、海军中校约翰·法吉表示，“尼米兹”号已经开始“舰内隔离”", "2020-04-08"));

        ArrayList<MarqueeListEntity> listData2 = new ArrayList<>();
        listData2.add(new MarqueeListEntity("6 美国目前部署在西海岸的“尼米兹”号航母，也出现两名新冠", "2020-04-08"));
        listData2.add(new MarqueeListEntity("7 美军已经有4艘航母出现新冠确诊病例，分别是“里根”号，由于不处于部署状态", "2020-04-08"));
        listData2.add(new MarqueeListEntity("8 今年2月，路过华盛顿州西雅图市海岸的“尼米兹”号航母，由于不处于部署状态", "2020-04-08"));
        listData2.add(new MarqueeListEntity("9 母港位于美国西海岸华盛顿州基察普海军基地布雷默顿港。号已经开始"));
        listData2.add(new MarqueeListEntity("10 负责美国西海岸防务的美国海军第三舰队发言人、海军中校约翰·法吉表示，“尼米兹”号已经开始“舰内隔离”", "2020-04-08"));

        list.add(listData);
        list.add(listData2);

        MarqueeListView marqueeListView = this.findViewById(R.id.marqueeListView);
        marqueeListView.startWithList(list);
        marqueeListView.setOnItemClickListener(new MarqueeListView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, MarqueeListEntity entity) {
                Toast.makeText(NoticeListViewDemoMainActivity.this, "position = " + entity.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
