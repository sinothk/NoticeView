//package com.sinothk.noticeView.demo;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.design.widget.TabLayout;
//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
//import android.view.Menu;
//import android.view.MenuItem;
//
//import com.sinothk.noticeView.demo.fragment.CommonFragment;
//import com.sinothk.noticeView.demo.fragment.RecyclerViewFragment;
//import com.sinothk.noticeView.demo.fragment.adapter.FragmentPagerItemAdapter;
//
//public class MainActivity extends AppCompatActivity {
//
//    private TabLayout tabLayout;
//    private ViewPager viewPager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager = findViewById(R.id.viewPager);
//
//        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter.Builder(this, getSupportFragmentManager())
//                .add("Common1", new CommonFragment())
//                .add("Common2", new CommonFragment())
//                .add("RecyclerView", new RecyclerViewFragment())
//                .build();
//        viewPager.setAdapter(adapter);
//        viewPager.setOffscreenPageLimit(1);
//        tabLayout.setupWithViewPager(viewPager);
//    }
//}
