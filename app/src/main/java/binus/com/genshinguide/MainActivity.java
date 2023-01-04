package binus.com.genshinguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String TAG = MainActivity.class.getSimpleName();
    private Button thirdbutton;
    private Button secbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate Called");
        // activity_main from res -> layout -> activity_main.xml
        secbutton =  findViewById(R.id.secondActivity_btn);
        thirdbutton = findViewById(R.id.thirdActivity_btn);
        secbutton.setOnClickListener(this);
        thirdbutton.setOnClickListener(this);
    }

    // lifecycle android

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart Called");
    }

    @Override
    protected  void onResume(){
        super.onResume();
        Log.d(TAG,"onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause Called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onCreate Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestory Called");
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.secondActivity_btn:
               // onDestroy();
                Toast.makeText(this,"Button Pressed",Toast.LENGTH_SHORT).show();
                // for second activity
                Intent intentsecond = new Intent(this,SecondActivity.class);
                startActivity(intentsecond);
                break;

            case R.id.thirdActivity_btn:
                Toast.makeText(this,"Button Pressed",Toast.LENGTH_SHORT).show();
                // for third activity
                Intent intentthird = new Intent(this,ThirdActivity.class);
                startActivity(intentthird);
        }
    }

}