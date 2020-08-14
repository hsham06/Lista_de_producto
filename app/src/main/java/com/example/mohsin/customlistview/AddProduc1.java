package com.example.mohsin.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddProduc1 extends AppCompatActivity {

    EditText producto, cantidad, descripcion, precio;
    String nProducto, nCantidad, nDescripcion, nPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_produc1);

        producto = findViewById(R.id.producto);
        cantidad = findViewById(R.id.cantidad);
        descripcion = findViewById(R.id.descripcion);
        precio = findViewById(R.id.precio);

    }


    public void click2(View view){
        nProducto = producto.getText().toString();
        nCantidad = cantidad.getText().toString();
        nDescripcion = descripcion.getText().toString();
        nPrecio = precio.getText().toString();

        storeNewUserData();
        Toast.makeText(this, "Producto añadido", Toast.LENGTH_SHORT).show();


        
        Intent intent = new Intent( AddProduc1.this,  MainActivity.class);
        intent.putExtra("id", 4);
        startActivity(intent);

    }

        private void storeNewUserData() {
           DatabaseReference rootnote;
           rootnote = FirebaseDatabase.getInstance().getReference("Producto");



            userHelperClass helperClass = new userHelperClass(nProducto, nCantidad,nDescripcion,nPrecio);
            // reference.setValue("first commit");
            rootnote.child(nProducto).setValue(helperClass);

        }

}
