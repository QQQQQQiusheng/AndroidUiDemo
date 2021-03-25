package com.qiusheng.androiduidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.ev_demo);
        TextView textView_btn = (TextView) findViewById(R.id.tv_btn_demo);
        ImageView imageView = (ImageView) findViewById(R.id.iv_demo);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);


        textView_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit_text = editText.getText().toString();

                switch (v.getId()) {
                    case R.id.tv_btn_demo:
                        imageView.setImageResource(R.mipmap.pic2);
                        Toast.makeText(MainActivity.this, edit_text, Toast.LENGTH_SHORT).show();
                        //控制ProgressBar可见性
                      /*  if (progressBar.getVisibility() == View.GONE) {
                            progressBar.setVisibility(View.VISIBLE);
                        } else {
                        progressBar.setVisibility(View.GONE);
                        }*/
                        int pro = progressBar.getProgress();
                        pro = pro + 20;
                        progressBar.setProgress(pro);

                        break;
                    default:
                        break;
                }

            }
        });


    }

}
