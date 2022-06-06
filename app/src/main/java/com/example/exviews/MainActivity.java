package com.example.exviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtTelefone;
    private Switch swtWhats;
    private RadioGroup rdgContato;
    private Button btnLimpar;
    private Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTelefone = findViewById(R.id.edtTelefone);
        swtWhats = findViewById(R.id.swtWhats);
        rdgContato = findViewById(R.id.rdgContato);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnConfirmar = findViewById(R.id.btnConfirmar);

        btnLimpar.setOnClickListener(this);
        btnConfirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLimpar) {
            Toast.makeText(this, "Limpar", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.btnConfirmar) {
            Toast.makeText(this,"Confirmar", Toast.LENGTH_LONG).show();
        }
    }
}