package com.example.mohsin.customlistview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends ArrayAdapter<ModelClass>    {
    private static final String TAG = "Adapter";
    private Context mContext;
    private String nProducto, nCantidad, nDescripcion, nPrecio;
    int mResource;

    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList<ModelClass> objects) {
        super(context, resource, objects);
         mContext= context;
         mResource= resource;
    }



}
