package biocom.projeto.projetobio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PesquisaAtividade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_atividade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //aqui tento fazer a função para a pesquisa
        final TextView lblResultado = (TextView) findViewById(R.id.lblResultado);
        final EditText lblPesquisa = (EditText) findViewById(R.id.lblPesquisa);
        Button btnPesquisar = (Button) findViewById(R.id.btnPesquisar);




        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String variavel = lblPesquisa.getText().toString();
                lblResultado.setText(variavel);


                //logo a baixo um teste de pesquisa de algum tipo de planta
                if (variavel.equals("Planta 1")){
                    //Muda a variavel para verde
                    lblResultado.setTextColor(0xff00ff00);
                }else if(variavel.equals("Planta 2")) {
                    //Muda variavel para cor verde
                    lblResultado.setTextColor(0xff00ff00);
                }else {
                    lblResultado.setText("Não existe esta planta");
                    lblResultado.setTextColor(0xffff0033);
                }
            }
        });

        //logo a cima foi finalizado todo o processo

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
