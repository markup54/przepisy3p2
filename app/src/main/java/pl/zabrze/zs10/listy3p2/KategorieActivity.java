package pl.zabrze.zs10.listy3p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class KategorieActivity extends AppCompatActivity {
public static final  String KATEGORIA = "kategoria";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);

        ListView listView =findViewById(R.id.listViewKategorie);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(KategorieActivity.this,
                                ListaPrzepisowActivity.class);
                        //intecja jawna
                        String kategoria = listView.getItemAtPosition(i).toString();
                        intent.putExtra(KATEGORIA , kategoria);
                        startActivity(intent);
                    }
                }
        );

    }
}