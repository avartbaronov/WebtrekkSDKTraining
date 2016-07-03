package com.webtrekk.webtrekksdk.training;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSimplePageName(View view)
    {
        Intent intent = new Intent(this, SimpleActivity.class);
        startActivity(intent);
    }

    public void onMultiPageName(View view)
    {
        Intent intent = new Intent(this, ComplexActivity.class);
        startActivity(intent);
    }
}
