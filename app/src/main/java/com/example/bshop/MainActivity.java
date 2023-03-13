package com.example.bshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageSlider=findViewById(R.id.imageSlider);

        ArrayList<SlideModel> images=new ArrayList<>();
        images.add(new SlideModel(R.drawable.a0,null));
        images.add(new SlideModel(R.drawable.a1,null));
        images.add(new SlideModel(R.drawable.a2,null));
        images.add(new SlideModel(R.drawable.a3,null));
        images.add(new SlideModel(R.drawable.a4,null));
        imageSlider.setImageList(images, ScaleTypes.CENTER_CROP);
        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                Toast.makeText(MainActivity.this,"Item"+i+"Selected",Toast.LENGTH_SHORT).show();
            }
        });

        TextView text=(TextView) findViewById(R.id.textView2);
        text.setText(Html.fromHtml(
                "<b>        Call of Duty: Vanguard - Edycja Definitywna</b><br>"
                +"<font color=#ffff00>      Zdobadz Pakiet broni na front!</font><br>"
                +"      Strzelanka<br>"
                +"      <b>99.99 EUR</b><br>"
        ));

        TextView text2=(TextView) findViewById(R.id.textView3);
        text2.setText(Html.fromHtml(
                "<b>        Diablo Immortal</b><br>"
                        +"<font color=#ffff00>      Gra dostępna za darmo i w formie otwartej bety na PC</font><br>"
                        +"      RPG akcji<br>"
                        +"      <b>Graj za darmo</b><br>"
        ));

        TextView text3=(TextView) findViewById(R.id.textView4);
        text3.setText(Html.fromHtml(
                "<b>        World Of Warcraft:Darmowy okres probny</b><br>"
                        +"<font color=#ffff00>      Graj za darmo do poziomu 20!</font><br>"
                        +"      MMORPG<br>"
                        +"      <b>Graj za darmo</b><br>"
        ));

        Button btn1 = (Button) findViewById(R.id.btn_kontakt);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Contact.class));
            }
        });

        ImageView wow=(ImageView) findViewById(R.id.imageView7);

        wow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, wow.class));
            }
        });


    }
}