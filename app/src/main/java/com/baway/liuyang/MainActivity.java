package com.baway.liuyang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * 类描述：这是一个maninactivity 是一个程序的入口
 * 姓名：刘洋
 * 时间：2017.08.07
 */
public class MainActivity extends AppCompatActivity {
    private TopBar topBar;
    private boolean b = false;
    private boolean c = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topBar = (TopBar) findViewById(R.id.topbar);
        topBar.setOnTopBarClickListener(new TopBar.TopBarClickListener() {
            @Override
            public void leftClick() {
                if (b){
                    b = false;
                }else{
                    b = true;
                }
                topBar.setLeftIsvisable(b);
                Toast.makeText(MainActivity.this,"返回",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                if (c){
                    c = false;
                }else{
                    c = true;
                }
                topBar.setRightIsvisable(c);
                Toast.makeText(MainActivity.this,"查看更多",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
