package pl.zabrze.zs10.listy3p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class PrzepisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);

        String nazwaPrzepisu = getIntent().getExtras().getString(ListaPrzepisowActivity.NAZWA);
        Toast.makeText(this, nazwaPrzepisu, Toast.LENGTH_SHORT).show();
    }
}