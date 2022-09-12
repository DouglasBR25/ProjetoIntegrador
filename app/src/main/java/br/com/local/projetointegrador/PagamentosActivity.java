package br.com.local.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PagamentosActivity extends AppCompatActivity {

    ListView ModelComp;
    TextView ValueTotal;
    private TextView preco2;
    private TextView preco;
    private TextView valortotal;
    private Button btnCalcular;
    RadioGroup radioGroup;
    RadioButton rdb1, rdb2;
    Button btnfinalizarPedido;


    int imgLanches[] = {
            R.drawable.pizzateste};

    String tituloFood[] = {
            "Pizza Provolone",
            "Pizza Radius"};

    String descricaofood[] = {
            "Melhor queijo do mundo em 8 pedaços", "Melhor radius do mundo em 8 pedaços"};

    String rating[] = {
            "4,5", "5,0"};

    String precoProduto[] = {
            "32,00", "40,00"
    };

    String quantidade[] = {
            "1", "2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pagamentos_layout);

        ModelComp = findViewById(R.id.ModelComp);
        ValueTotal = findViewById(R.id.valuetotal);
        preco = findViewById(R.id.preco10);
        valortotal = findViewById(R.id.valuetotal);


        AdaptadorRecr adapter = new AdaptadorRecr();


        ModelComp.setAdapter(adapter);


    }


    public class AdaptadorRecr extends BaseAdapter {


        String preco;


        @Override
        public int getCount() {
            return imgLanches.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View v, ViewGroup viewGroup) {
            TextView txtDescricaofood, txtTitulofood, txtpreco, txtquantidade, txtModeloStars;

            View view = getLayoutInflater().inflate(R.layout.modelo_pagamentos, null);

            txtDescricaofood = view.findViewById(R.id.Descricaofood);
            txtTitulofood = view.findViewById(R.id.Titulofood);
            txtpreco = view.findViewById(R.id.preco10);
            txtquantidade = view.findViewById(R.id.quantidade);
            txtModeloStars = view.findViewById(R.id.ModeloStars);

            txtDescricaofood.setText(descricaofood[i]);
            txtpreco.setText(precoProduto[i]);
            txtModeloStars.setText(rating[i]);
            txtTitulofood.setText(tituloFood[i]);
            txtquantidade.setText(quantidade[i]);
            txtpreco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    preco = txtpreco.getText().toString();
                    ValueTotal.setText("R$ " + preco);
                    ValueTotal.setText(preco.toString());

                }
            });
            return view;
        }

    }

    public class Arrayteste {
        public void main(String[] args) {
            int n1;

        }
    }


}