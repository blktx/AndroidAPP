package com.example.groceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    String [] groceries = new String[] {"Shop all foods","Snacks","Breakfast & Cereal","Meals","Coffee","Beverages","Candy, Chocolate & Gum","Premium Chocolate Shop","Premium Coffee shop","Plant Based Food","Gluten Free Foods", "Asian Shop","Baking Center","Fresh food","Frozen food"};

    ListView listView;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> groceriesAdapter = new ArrayAdapter<String> (getBaseContext (),android.R.layout.simple_expandable_list_item_1,groceries);

        listView.setAdapter(groceriesAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        System.out.println(groceries[position]);

        Intent moveToDetailIntent = new Intent(getBaseContext (), NextActivity.class);
        moveToDetailIntent.putExtra("categoriesName",groceries[position]);
        startActivity(moveToDetailIntent);



    }
}
