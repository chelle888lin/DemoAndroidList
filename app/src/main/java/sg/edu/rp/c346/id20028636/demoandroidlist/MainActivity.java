package sg.edu.rp.c346.id20028636.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<String> alAndroidVersions;
    ArrayAdapter<String> aaAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.lvAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        alAndroidVersions.add("Tiramisu - 13.0");
        alAndroidVersions.add("Snow Cone - 12.0");
        alAndroidVersions.add("Red Velvet Cake - 11.0");
        alAndroidVersions.add("Quince Tart - 10.0");
        alAndroidVersions.add("Pie - 9.0");
        alAndroidVersions.add("Oreo - 8.0");
        alAndroidVersions.add("Nougat - 7.0");
        alAndroidVersions.add("Marshmallow - 6.0");
        alAndroidVersions.add("Lollipop - 5.0");
        alAndroidVersions.add("KitKat - 4.4");
        alAndroidVersions.add("Jelly Bean - 4.3");
        alAndroidVersions.add("Ice Cream Sandwich - 4.0");
        alAndroidVersions.add("Honeycomb - 3.0");
        alAndroidVersions.add("Gingerbread - 2.3");
        alAndroidVersions.add("Froyo - 2.2");
        alAndroidVersions.add("Eclair - 2.0");
        alAndroidVersions.add("Donut - 1.6");
        alAndroidVersions.add("Cupcake - 1.5");

        aaAndroidVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alAndroidVersions);

        lvAndroidVersions.setAdapter(aaAndroidVersions);
    }
}