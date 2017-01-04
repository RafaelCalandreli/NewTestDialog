package abbraconsultoria.com.br.newtestedialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.buttonId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Criar alert Dialog

                dialog = new AlertDialog.Builder(MainActivity.this);
                //Configurar o titulo

                dialog.setTitle("Título da dialog");

                //Configurar a mensagem

                dialog.setMessage("Essa mensagem que aparece dentro da dialog");
                //Cancelar a dialog
                dialog.setCancelable(false);

                dialog.setIcon(android.R.drawable.ic_delete);
                
                //Botao Negativo
                dialog.setNegativeButton("Botão Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Pressionado o botão Não",Toast.LENGTH_SHORT).show();
                    }
                });

                //Botao Positivo
                dialog.setPositiveButton("Botão Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"Pressionado o botão Sim",Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.create();
                dialog.show();
            }
        });


    }
}
