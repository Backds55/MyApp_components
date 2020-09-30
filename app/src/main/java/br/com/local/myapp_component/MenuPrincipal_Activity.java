package br.com.local.myapp_component;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuPrincipal_Activity extends AppCompatActivity implements View.OnClickListener {
    //Criar uma variável ou atributo global do objeto do xml
    ImageButton imbHistoria, imbArmaduras, imbJarvis, imbPepper, imb_EmpresaS, imb_Vingadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Liga a Classe ao Layout através do R.java
        setContentView(R.layout.menu__principal_layout);
        //realizei a ligação do objeto xml com o java
        imbHistoria = findViewById(R.id.imbHistoria);
        imbArmaduras = findViewById(R.id.imbArmaduras);
        imbJarvis = findViewById(R.id.imbJarvis);
        imbPepper = findViewById(R.id.imbPepper);
        imb_EmpresaS = findViewById(R.id.imb_EmpresaS);
        imb_Vingadores = findViewById(R.id.imb_Vingadores);

        imbHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Historia_Activity.class));

            }
        });

        imbArmaduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Armaduras_Activity.class));

            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imbJarvis:
                startActivity(new Intent(getApplicationContext(),Jarvis_Activity.class));
                break;
        }
    }
}