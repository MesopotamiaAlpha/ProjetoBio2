package biocom.projeto.projetobio;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FamiliaAtividade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia_atividade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Logo a baixo estou chamando a tela pincipal devolta

        Button btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FamiliaAtividade.this, AtividadePrincipal.class);
                startActivities(new Intent[]{i});}});
        //terminado de chamar a tela


        //Logo A baixo vou sublinhar a especie
        TextView lblEspecie = (TextView) findViewById(R.id.lblEspecie);
        lblEspecie.setPaintFlags(lblEspecie.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        //Terminado de sublinhar

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Trocar a função por algo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
