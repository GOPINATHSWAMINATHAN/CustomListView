package com.gopinath.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView list;

    String[] web={

            "apple","banana","orange","bingo","kurkure","oishi","baked oishi"
    };

    Integer[] imageid={R.drawable.images,R.drawable.imagesone,R.drawable.imagestwo,R.drawable.images,R.drawable.oishi,R.drawable.imagethree,R.drawable.imagestwo,R.drawable.imagesone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter = new
                CustomList(MainActivity.this, web, imageid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
