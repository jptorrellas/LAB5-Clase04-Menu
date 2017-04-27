package com.example.a55.clase04_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Menu miMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para ocultar menu creado
        //navigationView.getMenu().findItem(R.id.elemento1).setVisible(false);
        //this.miMenu.setGroupVisible(R.id.miMenuGrupo, false);

    }




    //Para poner el menu que creamos por xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu, menu);
        this.miMenu = menu;
        //Para ocultar un item del menu
        //this.miMenu.findItem(R.id.opcion3).setVisible(false);

        //Para ocultar un grupo del menu
        this.miMenu.setGroupVisible(R.id.miMenuGrupo, false);
        return true;
    }

    //Para capturar la accion del boton del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.opcion1) {
            Toast.makeText(this, "Opcion 1 del Menu", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == R.id.opcion2) {
            Toast.makeText(this, "Opcion 2 del Menu", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == R.id.opcion3) {
            Toast.makeText(this, "Opcion 3 del Menu", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
