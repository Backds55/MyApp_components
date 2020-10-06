package br.com.local.myapp_component;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Vingadores_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vingadores_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_vingadores, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mCAmerica:
                startActivity(new Intent(getApplicationContext(),
                        CAmerica_Activity.class));
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Capitão América",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHFerro:
                startActivity(new Intent(getApplicationContext(),
                        HFerro_Activity.class));
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Homem de Ferro",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHulk:
                startActivity(new Intent(getApplicationContext(),
                        Hulk_Activity.class));
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Hulk",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGArqueiro:
                startActivity(new Intent(getApplicationContext(),
                        GArqueiro_Activity.class));
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Gavião Arqueiro",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mVNegra:
                startActivity(new Intent(getApplicationContext(),
                        VNegra_Activity.class));
                Toast.makeText(getApplicationContext(),
                        "Cliquei na Viúva Negra",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}