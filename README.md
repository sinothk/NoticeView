# NoticeView
NoticeView(跑马灯)：https://github.com/sunfusheng/MarqueeView


# 引入
  ## Step 1. Add the JitPack repository to your build file
  Add it in your root build.gradle at the end of repositories:

    allprojects {
      repositories {
        ...
        maven { url 'https://www.jitpack.io' }
      }
    }

  ## Step 2. Add the dependency
    dependencies {
            implementation 'com.github.sinothk:NoticeView:2.x.1018'
    }

# 使用
  java:
  
        MarqueeView marqueeView2 = this.findViewById(R.id.marqueeView2);
        marqueeView2.startWithList(list);
        marqueeView2.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(NoticeViewDemoMainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    
   xml：
      
      <RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="30dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="20dp"
        android:background="@drawable/xml_oval_half_transparent_bg"
        android:paddingLeft="10dp"
        android:paddingRight="10dp">

        <ImageView
            android:id="@+id/iv_speaker33"
            android:layout_width="22dp"
            android:layout_height="22dp"
            android:layout_centerVertical="true"
            android:src="@mipmap/ic_loudspeaker" />

        <!--<com.sinothk.widgets.noticeView.MarqueeView-->
        <!--android:id="@+id/marqueeView2"-->
        <!--android:layout_width="match_parent"-->
        <!--android:layout_height="match_parent"-->
        <!--android:layout_centerVertical="true"-->
        <!--android:layout_marginLeft="8dp"-->
        <!--android:layout_toRightOf="@+id/iv_speaker33"-->
        <!--app:mvTextColor="@color/white"-->
        <!--app:mvDirection="bottom_to_top"-->
        <!--app:mvTextSize="14sp" />-->

        <com.sinothk.widgets.noticeView.MarqueeView
            android:id="@+id/marqueeView2"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_centerVertical="true"
            android:layout_marginLeft="8dp"
            android:layout_toRightOf="@+id/iv_speaker33"
            app:mvDirection="right_to_left"
            app:mvGravity="left"
            app:mvTextColor="@color/red" />
    </RelativeLayout>
