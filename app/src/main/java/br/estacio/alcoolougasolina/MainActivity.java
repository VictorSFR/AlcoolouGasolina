package br.estacio.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valorCarro;
    private Button btnVerificar;
    private TextView porcentagemDistribuidor;
    private TextView impostos;
    private TextView precoFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorCarro = (EditText) findViewById(R.id.valorCarro);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        porcentagemDistribuidor = (TextView) findViewById(R.id.porcentagemDistribuidor);
        impostos = (TextView) findViewById(R.id.impostos);
        precoFinal = (TextView) findViewById(R.id.precoFinal);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorDouble = Double.parseDouble(valorCarro.getText().toString());
                double calcDistribuidor = (valorDouble*0.28);
                double calcImpostos = (valorDouble*0.45);
                double calcPrecoFinal = (valorDouble+calcDistribuidor+calcImpostos);

                porcentagemDistribuidor.setText("Porcentagem do distribuidor: "+String.valueOf(calcDistribuidor));
                impostos.setText("Impostos: "+String.valueOf(calcImpostos));
                precoFinal.setText("Preço Final: "+String.valueOf(calcPrecoFinal));
            }
        });

    }
}
