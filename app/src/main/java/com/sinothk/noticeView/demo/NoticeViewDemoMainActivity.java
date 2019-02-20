package com.sinothk.noticeView.demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;

import com.sinothk.widgets.noticeView.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class NoticeViewDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_view_activity_main_demo);

        MarqueeView marqueeView = this.findViewById(R.id.marqueeView);

        List<CharSequence> list = new ArrayList<>();

        SpannableString ss1 = new SpannableString("1、MarqueeView开源项目");
        ss1.setSpan(new ForegroundColorSpan(Color.RED), 2, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        list.add(ss1);

        SpannableString ss2 = new SpannableString("2、GitHub：sfsheng0322");
        ss2.setSpan(new ForegroundColorSpan(Color.GREEN), 9, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        list.add(ss2);

        SpannableString ss3 = new SpannableString("3、个人博客：sunfusheng.com");
        ss3.setSpan(new URLSpan("http://sunfusheng.com/"), 7, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        list.add(ss3);

        list.add("4、新浪微博：@孙福生微博");
        list.add("5、www.sinothk.com");

        marqueeView.startWithList(list);

        MarqueeView marqueeView2 = this.findViewById(R.id.marqueeView2);
        marqueeView2.startWithText(getString(R.string.marquee_text));
    }
}
