package binus.com.genshinguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String TAG = SecondActivity.class.getSimpleName();

    // for row.xml
    ListView lv;
    String title[] = {"Ganyu", "Xiao", "Keqing","Zhongli","Hu Tao","Qiqi"};
    String desc[] = {"Ganyu (Chinese: 甘雨 Gānyǔ, \"Sweet Rain\") is a playable Cryo character in Genshin Impact.","Xiao (Chinese: 魈 Xiāo, \"Demon\"), Yaksha name Alatus, is a playable Anemo character in Genshin Impact.","Keqing (Chinese: 刻晴 Kèqíng, \"Sunny Moment\" or \"Delicate Carving\") is a playable Electro character in Genshin Impact.","Zhongli (Chinese: 钟离 Zhōnglí) is a playable Geo character in Genshin Impact.", "Hu Tao (Chinese: 胡桃 Hú Táo, \"Walnut\") is a playable Pyro character in Genshin Impact.", "Qiqi (Chinese: 七七 Qīqī, \"Seven-Seven\") is a playable Cryo character in Genshin Impact."};
    int images[]= {R.drawable.ganyu, R.drawable.xiao,R.drawable.keqing,R.drawable.zhongli,R.drawable.hutao,R.drawable.qiqi};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,"onCreate Called");
        lv = findViewById(R.id.listView);

        // create adapter class
        MyAdapter adapter = new MyAdapter(this, title, desc, images);
        lv.setAdapter(adapter);
        // set item click on list view

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Toast.makeText(SecondActivity.this,"Ganyu Description.",Toast.LENGTH_SHORT).show();
                }
                if(position == 1)
                {
                    Toast.makeText(SecondActivity.this,"Xiao Description",Toast.LENGTH_SHORT).show();
                }
                if(position == 2)
                {
                    Toast.makeText(SecondActivity.this,"Keqing Description",Toast.LENGTH_SHORT).show();
                }
                if(position == 3)
                {
                    Toast.makeText(SecondActivity.this,"Zhongli Description",Toast.LENGTH_SHORT).show();
                }
                if(position == 4)
                {
                    Toast.makeText(SecondActivity.this,"Hu Tao Description",Toast.LENGTH_SHORT).show();
                }
                if(position == 5)
                {
                    Toast.makeText(SecondActivity.this,"Qiqi Description",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rtitle[];
        String rdesc[];
        int rimg[];

        MyAdapter(Context c, String title[], String desc[],int img[]){
            super(c, R.layout.row, R.id.tv1,title);
            this.context = c;
            this.rtitle = title;
            this.rdesc = desc;
            this.rimg = img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.tv1);
            TextView myDesc = row.findViewById(R.id.tv2);

            // set resources
            images.setImageResource(rimg[position]);
            myTitle.setText(rtitle[position]);
            myDesc.setText(rdesc[position]);





            return row;
        }
    }

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


}