package br.com.local.projetointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MesasActivity extends AppCompatActivity {
    GridView gridViewMesas;
    String[] mesaSelec;
    ImageView IconHouseMenu;
    String txtNumMesa[] ={
            "1", "2", "3", "4", "5", "6", "7", "8"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mesas_layout);
        gridViewMesas = findViewById(R.id.gridMesas);
        IconHouseMenu = findViewById(R.id.IconHouseMenu);

        IconHouseMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
            }
        });


        AdaptadorMesas adapter = new AdaptadorMesas();
        gridViewMesas.setAdapter(adapter);

        gridViewMesas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                //Passando valores de uma janela para outra
                //mesaSelec = txtNumMesa[i].split(" ");
                intent.putExtra("sendMesa", mesaSelec[i]);
                //Toast.makeText(MesasActivity.this, mesaSelec[1], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    public class AdaptadorMesas extends BaseAdapter{

        @Override
        public int getCount() {
            return txtNumMesa.length;
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
            TextView txtMesa;
            View view = getLayoutInflater().inflate(R.layout.modelo_mesa,null);
            txtMesa = view.findViewById(R.id.txtMesa);
            txtMesa.setText(txtNumMesa[i]);
            return view;
        }
    }

}