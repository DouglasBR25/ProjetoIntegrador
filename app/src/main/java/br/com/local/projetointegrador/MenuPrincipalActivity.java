package br.com.local.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MenuPrincipalActivity extends AppCompatActivity {
    Button btnConfirmar;
    Button btnDiminuirQuantidade1,btnDiminuirQuantidade2,btnDiminuirQuantidade3;
    Button btnAumentarQuantidade1,btnAumentarQuantidade2,btnAumentarQuantidade3;
    EditText edtQuantidade1,edtQuantidade2,edtQuantidade3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnDiminuirQuantidade1 = findViewById(R.id.btnDiminuirQuantidade1);
        btnDiminuirQuantidade2 = findViewById(R.id.btnDiminuirQuantidade2);
        btnDiminuirQuantidade3 = findViewById(R.id.btnDiminuirQuantidade3);
        btnAumentarQuantidade1 = findViewById(R.id.btnAumentarQuantidade1);
        btnAumentarQuantidade2 = findViewById(R.id.btnAumentarQuantidade2);
        btnAumentarQuantidade3 = findViewById(R.id.btnAumentarQuantidade3);



        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MenuPratoActivity.class));
            }
        });

        btnAumentarQuantidade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidade1 = findViewById(R.id.edtQuantidade1);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidade1.getText()));
                edtQuantidade1.setText(String.valueOf(quantid + 1));
            }
        });

        btnAumentarQuantidade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidade2 = findViewById(R.id.edtQuantidade2);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidade2.getText()));
                edtQuantidade2.setText(String.valueOf(quantid + 1));
            }
        });

        btnAumentarQuantidade3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidade3 = findViewById(R.id.edtQuantidade3);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidade3.getText()));
                edtQuantidade3.setText(String.valueOf(quantid + 1));
            }
        });

        btnDiminuirQuantidade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidade1 = findViewById(R.id.edtQuantidade1);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidade1.getText()));
                if(quantid > 0){
                    edtQuantidade1.setText(String.valueOf(quantid - 1));
                }}
        });

        btnDiminuirQuantidade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidade2 = findViewById(R.id.edtQuantidade2);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidade2.getText()));
                if(quantid > 0){
                    edtQuantidade2.setText(String.valueOf(quantid - 1));
                }}
        });

        btnDiminuirQuantidade3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtQuantidade3 = findViewById(R.id.edtQuantidade3);
                Integer quantid = Integer.parseInt(String.valueOf(edtQuantidade3.getText()));
                if(quantid > 0){
                    edtQuantidade3.setText(String.valueOf(quantid - 1));
                }}
        });

    }
}