package mx.edu.utng.reciclerview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvList =(RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvList.setLayoutManager(manager);
        List<Person> people=new ArrayList<Person>();
        people.add(new Person("TU Y YO"," 5 meses te amo",R.drawable.yo,R.color.color2));
        people.add(new Person("TU Y YO","5 meses te amo",R.drawable.yo,R.color.colorAccent));
        people.add(new Person("TU Y YO","5 meses te amo",R.drawable.yo,R.color.color3));
        people.add(new Person("TU Y YO","5 meses te amo",R.drawable.yo,R.color.color4));
        people.add(new Person("TU Y YO","5 meses te amo",R.drawable.yo,R.color.color5));



        RecyclerView.Adapter adapter = new RVAdapter(people);
        rvList.setAdapter(adapter);
    }
}
