package br.com.local.myapp_component;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    Button btnEntrar, btnSair;
    EditText txtEmail, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnEntrar = findViewById(R.id.btEntrar);
        btnSair = findViewById(R.id.btSair);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha)

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Transformando as variáveis edittext em string
                String email = txtEmail.getText().toString();
                String senha = txtSenha.getText().toString();
                if(email.equals("etecia")&& senha.equals("etecia")) {
                    startActivity(new Intent(getApplicationContext(),
                            MenuPrincipal_Activity.class));
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Usuário e senha incorretos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}