package yulssem.com.recyclerex02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<PostItem> items = new ArrayList<>();
    private RecyclerView recycler;
    private RecyclerAdepter adepter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recycler = findViewById(R.id.recycler);
        for (int i = 0; i < 100; i++) {
            PostItem item = new PostItem("http://img.tf.co.kr/article/home/2016/02/25/201668701456359956.jpg", "트와이스 좋아요" + i, false, false);
            items.add(i, item);
        }
        adepter = new RecyclerAdepter(this, items);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));
        recycler.setAdapter(adepter);
    }
}
