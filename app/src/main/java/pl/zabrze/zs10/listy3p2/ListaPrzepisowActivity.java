package pl.zabrze.zs10.listy3p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent().getExtras().getString(KategorieActivity.KATEGORIA);
        TextView textView =findViewById(R.id.textViewNazwaKategorii);
        textView.setText(kategoria);
        ArrayList<Przepis> przepisy = Repozytorium.przepisyZKategorii(kategoria);
    }
}