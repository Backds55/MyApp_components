package br.com.local.myapp_component;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Jarvis_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jarvis_layout);
    }

    //Para colocar o menu criado no Layout
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Instanciar o menu ou inflar o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_jarvis, menu);

        return super.onCreateOptionsMenu(menu);
    }
    //Criando método para inserir evento de click no menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case :
                R.id.mCadastrar;
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case :
                R.id.mAlterar;
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case :
                R.id.mExcluir;
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case :
                R.id.mPesquisar;
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case :
                R.id.mVoltar;
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Voltar",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
        return super.onOptionsItemSelected(item);
    }
}