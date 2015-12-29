package com.example.pbtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.zjt.pbmessage.ZTPhoneMessage.Person;

public class MainActivity extends Activity {
    Person.Builder pBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pBuilder = Person.newBuilder();
        pBuilder.setName("zhangjiantao");
        pBuilder.setEmail("a_tao123@163.com");
        pBuilder.setId(3);

    }

    public void pbtest(View v) {
        Person build = pBuilder.build();
        System.out.println("--pbtest== " + build.toString() + " name==" + build.getName() + " email==" + build.getEmail());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
