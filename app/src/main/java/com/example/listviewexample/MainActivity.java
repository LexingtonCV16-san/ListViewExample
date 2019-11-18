package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    String name, main_sport;
    int age;
    double worth;
    MyAdapter myArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Todo reference listview
        ListView listView = (ListView) findViewById(R.id.listview1);
    // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        myArrayAdapter= new MyAdapter(getApplicationContext(), R.id.listview1, getPlayers());
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArrayAdapter);
        listView.setAdapter(myArrayAdapter);
    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    public ArrayList<Player> getPlayers(){
        a.setImageResource(R.drawable.card);
        b.setImageResource(R.drawable.chess);
        c.setImageResource(R.drawable.game);
        d.setImageResource(R.drawable.tennis);
        ArrayList<Player> player = new ArrayList<Player>();
        player.add(new Player("XiaoHong", 18, 2.5, "tennis",d));
        player.add(new Player("XiaoMing",80, 0,"Computer Game Player",c));
        player.add(new Player("XiaoLan",50, 3.2, "Chess",b));
        player.add(new Player("XiaoLan",20,5.7, "Card",a));
        return player;
    }
    // choose successful sportsmen from different sports, make sure to fill Player class before starting

}
