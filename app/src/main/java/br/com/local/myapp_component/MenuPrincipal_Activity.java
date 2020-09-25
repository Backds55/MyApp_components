package br.com.local.myapp_component;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuPrincipal_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Liga a Classe ao Layout através do R.java
        setContentView(R.layout.menu__principal_layout);
    }

    public void abrir_Historia(View view) {
        /*mostrar mensagem na janela do Android
        Toast.makeText(getApplicationContext(),
                "Cliquei em História",
                Toast.LENGTH_SHORT).show();*/

        //abrir a janela de História
        Intent intent = new Intent(this,Historia_Activity.class);
        startActivity(intent);

        //fecha a janela atual
        finish();
    }

    public void abrir_Armaduras(View view) {
       /* //mostrar mensagem na janela do Android
        Toast.makeText(getApplicationContext(),
                "Cliquei em Armaduras",
                Toast.LENGTH_SHORT).show();*/

        //abrir a janela de Armaduras
        Intent intent = new Intent(getApplicationContext(), Armaduras_Activity.class);

        startActivity(intent);

        //fecha a janela atual

        finish();

    }

    public void abrir_Jarvis(View view) {
        //mostrar mensagem na janela do Android
       /* Toast.makeText(getApplicationContext(),
                "Cliquei em Jarvis",
                Toast.LENGTH_SHORT).show();*/

        //abrir a janela Jarvis
        Intent intent = new Intent(getApplicationContext(), Jarvis_Activity.class);

        startActivity(intent);

        //fecha a janela atual
        finish();
    }

    public void abrir_Pepper(View view) {
        //mostrar mensagem na janela do Android
        /*Toast.makeText(getApplicationContext(),
                "Cliquei em Pepper Pots",
                Toast.LENGTH_SHORT).show();*/

        //abrir a janela Peppers
        Intent intent = new Intent(getApplicationContext(), Peppers_Activity.class);
        startActivity(intent);
        //fecha a janela atual
        finish();
    }

    public void abrir_Empresa(View view) {
        //mostrar mensagem na janela do Android
       /* Toast.makeText(getApplicationContext(),
                "Cliquei em Empresa Stark",
                Toast.LENGTH_SHORT).show();*/

       //abrir a janela Empresa
        Intent intent = new Intent(getApplicationContext(), Empresa_Activity.class);
        startActivity(intent);
        //fecha a janela atual
        finish();
    }

    public void abrir_Vingadores(View view) {
        //mostrar mensagem na janela do Android
       /* Toast.makeText(getApplicationContext(),
                "Cliquei em Vingadores",
                Toast.LENGTH_SHORT).show();*/

       //abrir a janela Vingadores
        Intent intent = new Intent(getApplicationContext(), Vingadores_Activity.class);
        startActivity(intent);
        //fecha a janela atual
        finish();
    }

}