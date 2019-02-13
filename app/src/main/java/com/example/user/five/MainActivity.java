package com.example.user.five;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView namestr,numbstr;
ImageView photostr;
ListView pcall;

private int[] picture={R.drawable.sujith,R.drawable.nabin,R.drawable.jude};
    ArrayList<String>nm=new ArrayList<>();
    ArrayList<String>numb=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cal=findViewById(R.id.callbtn);
        pcall=findViewById(R.id.five);

        nm.add("Sujith");
        nm.add("Nabin");
        nm.add("Jude");

        numb.add("8921400381");
        numb.add("7561883710");
        numb.add("9895657383");

        adapt apt=new adapt();
        pcall.setAdapter(apt);
       pcall.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 String number = numb.get(position);
                 if (position == 0) {
                     Intent ph = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                     startActivity(ph);
                 } else if (position == 1) {
                     Intent ph = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                     startActivity(ph);
                 } else if (position == 2) {

                     Intent ph = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                     startActivity(ph);
                 }
             }

            });


    }
    class adapt extends BaseAdapter{
        @Override
        public int getCount() {
            return numb.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater infl=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=infl.inflate(R.layout.victory,null);
            photostr=convertView.findViewById(R.id.pics);
            namestr=convertView.findViewById(R.id.name);
            numbstr=convertView.findViewById(R.id.connumb);
            photostr.setImageResource(picture[position]);
            namestr.setText(nm.get(position));
            numbstr.setText(numb.get(position));
            return convertView;
        }
    }
}
