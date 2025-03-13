package pl.zabrze.zs10.listy3p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ListView listViewPrzepisy;
    private ArrayAdapter<Przepis> arrayAdapterPrzepis;
    public static final String NAZWA = "nazwaPrzepisu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent().getExtras().getString(KategorieActivity.KATEGORIA);
        TextView textView =findViewById(R.id.textViewNazwaKategorii);
        textView.setText(kategoria);
        ArrayList<Przepis> przepisy = Repozytorium.przepisyZKategorii(kategoria);
        listViewPrzepisy = findViewById(R.id.listViewPrzepisy);
        arrayAdapterPrzepis = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                przepisy
        );
        listViewPrzepisy.setAdapter(arrayAdapterPrzepis);
        listViewPrzepisy.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(ListaPrzepisowActivity.this,
                                PrzepisActivity.class);
                        String nazwaPrzepisu = przepisy.get(i).getNazwa();
                        intent.putExtra(NAZWA,nazwaPrzepisu);
                        startActivity(intent);
                    }
                }
        );
    }
}