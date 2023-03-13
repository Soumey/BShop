package com.example.bshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class wow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wow);

        TextView text=(TextView) findViewById(R.id.tView_wow);
        text.setText(Html.fromHtml(
                "<b><font color=#ffffff>        World Of Warcraft:<br>Darmowy okres probny</font></b><br>"
                        +"<font color=grey>      MMORPG</font><br>"
                        +"<font color=#ffff00>      Graj za darmo do poziomu 20!</font><br>"

        ));

        TextView text2=(TextView) findViewById(R.id.tView_wow2);
        text2.setText(Html.fromHtml(

                        "<font color=grey>*Darmowy okres probny nie jest dostepny w World of Warcraft Classic<br>" +
                                "<u>Obowiazuja ograniczenia</u><br>" +
                                "Cena zawiera VAT<br>" +
                                "<u>Wymagania sprzetowe</u><br>" +
                                "<u>Informacje szczegolowe</u>"+"</font>"


        ));
    }

}