package binus.com.genshinguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    RecyclerView mRecycler;
    MyAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mRecycler = findViewById(R.id.recyclerview);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new MyAdapter(this,getList());
        mRecycler.setAdapter(mAdapter);

    }

    private ArrayList<Model> getList(){
        ArrayList<Model> models = new ArrayList<>();
        Model ms = new Model();

        ms.setTitle("Mondstadt");
        ms.setDesc("This is Description");
        ms.setImg(R.drawable.mondstadt);
        models.add(ms);

        ms.setTitle("Liyue");
        ms.setDesc("This is Description");
        ms.setImg(R.drawable.liyue);
        models.add(ms);

        ms.setTitle("Inazuma");
        ms.setDesc("This is Description");
        ms.setImg(R.drawable.inazuma);
        models.add(ms);

        ms.setTitle("Dragonspine");
        ms.setDesc("This is Dragonspine Description");
        ms.setImg(R.drawable.dragonspine);
        models.add(ms);


        return models;
    }
}