package br.com.local.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.Shapeable;

public class MenuActivity extends AppCompatActivity {
    GridView gridView;
    ImageView IconSettingsMenu;
    ImageView IconMesasMenu;
    ShapeableImageView ImgModelCardapio;
    TextView txtModelCardapio;
    Button txtModelValorCardapio;
    String nMesa;
    Intent intent;




    int imgCardapio[] = {
            R.drawable.hamburguermodel, R.drawable.pizzamodel, R.drawable.batatamodel
    };
    String nomeProduto[] = {"Zinguer Burguer", "Pizza Peperone", "Batata Média",
            "Zinguer Burguer", "Pizza Peperone", "Batata Média",
            "Zinguer Burguer", "Pizza Peperone", "Batata Média"};

    String precoProduto[] = {"R$ 40,00", "R$ 35,00", "R$ 15,00", "R$ 40,00", "R$ 35,00", "R$ 15,00",
            "R$ 40,00", "R$ 35,00", "R$ 15,00"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Intent intent = getIntent();

        txtModelCardapio = findViewById(R.id.txtModelCardapio);
        IconSettingsMenu = findViewById(R.id.IconSettingsMenu);
        IconMesasMenu = findViewById(R.id.IconMesasMenu);
        gridView = findViewById(R.id.GriedViewMenu);
        String nome =  intent.getStringExtra("sendMesa");
        System.out.println(nome);
        txtModelCardapio.setText("hahaha");
        AdaptadorCard adapter = new AdaptadorCard();

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getApplicationContext(), MenuPratoActivity.class));
            }
        });

        IconSettingsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });
        IconMesasMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MesasActivity.class));
            }
        });


    }

    public class AdaptadorCard extends BaseAdapter {
        @Override
        public int getCount() {
            return imgCardapio.length;
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
            TextView txtNome, txtPreco;
            ImageView imgCardapioView;


            View view = getLayoutInflater().inflate(R.layout.modelo_cardapio, null);

            txtNome = view.findViewById(R.id.txtModelCardapio);
            txtPreco = view.findViewById(R.id.txtModelValorCardapio);
            imgCardapioView = view.findViewById(R.id.ImgModelCardapio);

            txtNome.setText(nomeProduto[i]);
            txtPreco.setText(precoProduto[i]);

            imgCardapioView.setImageResource(imgCardapio[i]);


            return view;
        }
    }
}