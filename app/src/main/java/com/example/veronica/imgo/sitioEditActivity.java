package com.example.veronica.imgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sitioEditActivity extends AppCompatActivity {

    ControlBD helper;

    EditText editIdSitio;
    EditText editDescripcion;
    EditText editIdCategoria;
    EditText editNombreSitio;
    EditText editPrecioMin;
    EditText editPrecioMax;
    EditText editDireccion;
    EditText editLatitud;
    EditText editLongitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitio_edit);

        helper = new ControlBD(this);
        editIdSitio = (EditText) findViewById(R.id.editIdSitio);
        editIdCategoria = (EditText) findViewById(R.id.editIdCategoria);
        editDescripcion = (EditText) findViewById(R.id.editDescripcion);
        editNombreSitio = (EditText) findViewById(R.id.editNombreSitio);
        editPrecioMin = (EditText) findViewById(R.id.editPrecioMin);
        editPrecioMax = (EditText) findViewById(R.id.editPrecioMax);
        editDireccion = (EditText) findViewById(R.id.editDireccion);
        editLatitud =(EditText) findViewById(R.id.editLatitud);
        editLongitud = (EditText) findViewById(R.id.editLongitud);


    }
    public void insertarSitio(View v) {

        Integer idSitio = Integer.valueOf(editIdSitio.getText().toString());
        Integer idCategoria = Integer.valueOf(editIdCategoria.getText().toString());

        String descripcion = editDescripcion.getText().toString();
        String nombreSitio = editNombreSitio.getText().toString();
        Float precioMin = Float.valueOf(editPrecioMin.getText().toString());
        Float precioMax = Float.valueOf(editPrecioMax.getText().toString());
        String direccion = editDireccion.getText().toString();
        Float latitud = Float.valueOf(editLatitud.getText().toString());
        Float longitud = Float.valueOf(editLongitud.getText().toString());
        String regInsertados;
        String regInsertadoUbicacion;

        if(idCategoria==1||idCategoria==2||idCategoria==3||idCategoria==4||idCategoria==5){

            if(precioMin<=precioMax){
                Sitio sitio = new Sitio();
                sitio.setIdSitio(idSitio);
                sitio.setIdCategoria(idCategoria);
                sitio.setDescripcion(descripcion);
                sitio.setNombreSitio(nombreSitio);
                sitio.setPrecioMax(precioMax);
                sitio.setPrecioMin(precioMin);

                Ubicacion ubicacion = new Ubicacion();
                ubicacion.setIdUbicacion(idSitio);
                ubicacion.setIdSitio(idSitio);
                ubicacion.setDireccion(direccion);
                ubicacion.setCoordenadaX(longitud);
                ubicacion.setCoordenadaY(latitud);

                helper.abrir();
                regInsertados = helper.actualizar(sitio);
                regInsertadoUbicacion = helper.actualizar(ubicacion);

                helper.cerrar();
                Toast.makeText(this, regInsertados, Toast.LENGTH_SHORT).show();
                Toast.makeText(this, regInsertadoUbicacion, Toast.LENGTH_SHORT).show();

                //       editIdSitio.setText("");
                //       editIdCategoria.setText("");
                //       editDescripcion.setText("");
                //       editNombreSitio.setText("");
                //       editPrecioMax.setText("");
                //       editPrecioMin.setText("");
                //       editDireccion.setText("");
                //       editLatitud.setText("");
                //       editLongitud.setText("");


            }else {
                Toast.makeText(this, "Precio Maximo debe ser mayor", Toast.LENGTH_SHORT).show();
            }

        }else {
            Toast.makeText(this, "ID Categoria no valido", Toast.LENGTH_SHORT).show();
        }

    }
}