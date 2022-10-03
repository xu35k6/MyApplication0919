package com.example.myapplication0919;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx = findViewById(R.id.textView2); // 文字
        btn = findViewById(R.id.button);//  按鈕

        btn.setOnClickListener(myclick);
        tx.setOnClickListener(myclick);
    }

//    @Override
//    public void onClick(View view) {
//        switch( view.getId()){
//            case R.id.textView2:
//                tx.setTextColor(Color.GREEN);
//                tx.setText("方法三文字");
//                break;
//            case R.id.button:
//                tx.setTextColor(Color.BLACK);
//                tx.setText("方法三按鈕");
//                break;
//        }
//    }

    private View.OnClickListener myclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.button:
                    tx.setTextColor(Color.RED);
                    tx.setText("方法二按鈕");
                    break;
                case R.id.textView2:
                    tx.setTextColor(Color.GREEN);
                    tx.setText("方法二文字");
                    break;
            }
        }
    };

//    public void OnBtnClick(View view){
//        tx.setTextColor(Color.RED);
//        tx.setText("方法一按鈕");
//    }
//    public void OnTextClick(View view){
//        tx.setTextColor(Color.GREEN);
//        tx.setText("方法一文字");
//    }

}
