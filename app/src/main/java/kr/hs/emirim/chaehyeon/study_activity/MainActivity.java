package kr.hs.emirim.chaehyeon.study_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //onCreate 가장 먼저 실행되는 것
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MY", "__ onCreate() --"); //Log는 콘솔에 찍는게 아닌 Lotcat에 찍히는 디버깅 코드
    }//oncreate()

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MY", "__ onDestroy() --");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MY", "__ onPause() --");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MY", "__ onRestart() --");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MY", "__ onResume() --");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MY", "__ onStart() --");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MY", "__ onStop() --");
    }
}