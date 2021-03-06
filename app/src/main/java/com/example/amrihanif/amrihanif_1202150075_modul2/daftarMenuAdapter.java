package com.example.amrihanif.amrihanif_1202150075_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

//Class Adapter ini Untuk Mengatur Bagaimana Data akan Ditampilkan
public class daftarMenuAdapter extends RecyclerView.Adapter<daftarMenuAdapter.ViewHolder> {

    private ArrayList<String> arrayListMenu; // untuk Judul
    private ArrayList<String> arrayListsPrice; // untuk Menu
    private ArrayList<Integer> gambar; //untuk gambar

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    daftarMenuAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsPrice, ArrayList<Integer> Gambar){
        this.arrayListMenu = arrayListMenu;
        this.arrayListsPrice = arrayListsPrice;
        this.gambar = Gambar;
    }

    //ViewHolder  Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView menu, price;
        private ImageView gambar;
        private LinearLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            menu = itemView.findViewById(R.id.txtMenu);
            price = itemView.findViewById(R.id.txtPrice);
            gambar = itemView.findViewById(R.id.image);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    public daftarMenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }


    public void onBindViewHolder(final daftarMenuAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String price = arrayListsPrice.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer image = gambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.menu.setText(menu);
        holder.price.setText("Harga Rp. "+price);
        holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailMenu.class);
                String komposisi;
                switch (position){
                    case 0:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Nasi, Kecap, Telur, Tomat, Cabe";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Mie Kuah, Telur, Ayam, Tomat, Cabe";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "kedelai pilihan";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "daging ayam, kacang, kecap, cabe";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Kentang, Roti, daging";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        komposisi = "Wortel, Kentang";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }


    public int getItemCount() {
        return arrayListMenu.size();
    }
}
