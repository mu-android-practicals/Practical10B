package com.example.practical10b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private int stopLoop=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
    }
            public void timer(View view)
        {
            final Handler handler = new Handler();

            handler.post(new Runnable() {
                @Override
                public void run() {
                    if (stopLoop > 0) {
                        stopLoop--;
                        textView.setText("Time:" + stopLoop);

                        handler.postDelayed(this, 1000);
                    } else {
                    }
                }
            });
        }
            public void nonTimer(View view)
        {
            int i=0;
            for(i=0;i<3;i++)
            {
                textView.setText("Time:"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


    }
}