package kr.hs.emirim.chaehyeon.study_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //onCreate 가장 먼저 실행되는 것
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //앱 실행
        //onCreate(0 --> 처음 앱을 실행시켰을때 단 한번 호출되는 메서드
        //onStart()
        //onResume()

        //홈 버튼 클릭
        //onPause()
        //onStop()

        //다시 앱으로 복귀
        //onRestart()
        //onStart()
        //onResume()

        //뒤로가기 버튼을 통해서 앱을 완전히 종료
        //onPause()
        //onStop()
        //onDestroy() --> 앱이 완전히 종료되었을때 딱 한번 호출


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