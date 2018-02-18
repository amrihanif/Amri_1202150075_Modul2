package com.example.amrihanif.amrihanif_1202150075_modul2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class daftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private daftarMenuAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;

    //array menu
    private String[] menu = {"Nasi Goreng", "Mie rebus Spesial", "tempe goreng", "Sate Madura", "paket kenyang", "risol"};
    //array harga
    private String[] price = {"15.000", "10.000", "5.000", "25.000", "30.000", "5.000"};
    //array gambar
    private int[] image = {R.drawable.nasgor, R.drawable.mirebus, R.drawable.tempegoreng, R.drawable.sate, R.drawable.paketkenyang,
            R.drawable.risol};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView= findViewById(R.id.recyclerview);
        DaftarItem();

        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new daftarMenuAdapter(Menu, Price, Gambar);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }
    }
}
