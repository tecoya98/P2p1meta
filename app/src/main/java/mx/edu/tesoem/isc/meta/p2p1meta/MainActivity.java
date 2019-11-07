package mx.edu.tesoem.isc.meta.p2p1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton visc,vitics,vambiental,vgastro;
    CheckBox chcasa,chescuela,chtrabajo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visc=(RadioButton)findViewById(R.id.rdisc);
        vitics=(RadioButton)findViewById(R.id.rdtics);
        vambiental=(RadioButton)findViewById(R.id.rdambiental);
        vgastro=(RadioButton)findViewById(R.id.rdgastronomia);
        chcasa=(CheckBox)findViewById(R.id.cbcasa);
        chescuela=(CheckBox)findViewById(R.id.cbescuela);
        chtrabajo=(CheckBox)findViewById(R.id.cbtrabajo);
    }
    public void seleccion(View view){
        if(visc.isChecked()) Toast.makeText(this,"Ingenieria en Sistemas Computacionales",Toast.LENGTH_SHORT).show();
        if(vitics.isChecked()) Toast.makeText(this,"Ingenieria en TICS",Toast.LENGTH_SHORT).show();
        if(vambiental.isChecked()) Toast.makeText(this,"Ingenieria Ambiental",Toast.LENGTH_SHORT).show();
        if(vgastro.isChecked()) Toast.makeText(this,"Lic Gastronomia",Toast.LENGTH_SHORT).show();
    }
    public void seleccion1(View view) {
        if(chcasa.isChecked()) Toast.makeText(this,"Casa",Toast.LENGTH_SHORT).show();
        if(chescuela.isChecked()) Toast.makeText(this,"Escuela",Toast.LENGTH_SHORT).show();
        if(chtrabajo.isChecked()) Toast.makeText(this,"Trabajo",Toast.LENGTH_SHORT).show();
    }

}