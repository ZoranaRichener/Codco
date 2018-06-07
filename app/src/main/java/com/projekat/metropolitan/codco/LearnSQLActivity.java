package com.projekat.metropolitan.codco;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;

import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LearnSQLActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_sql);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnCreateContextMenuListener(this);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, view, menuInfo);
        CreateMenu(menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        return MenuChoice(item);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return MenuChoice(item);
    }
    private void CreateMenu(Menu menu){
        menu.setQwertyMode(true);
        MenuItem mnu1 = menu.add(0, 0, 0, "Basic Concepts");{
            mnu1.setAlphabeticShortcut('a');
            mnu1.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Filtering");{
            mnu2.setAlphabeticShortcut('b');
            mnu2.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "Functions");{

            mnu3.setAlphabeticShortcut('c');
            mnu3.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Subqueries");{
            mnu4.setAlphabeticShortcut('d');
        }
        menu.add(0, 4, 4, "Table operations");
        menu.add(0, 5, 5, "Views");
        menu.add(0, 6, 6, "Test");


    }
    private boolean MenuChoice(MenuItem item){
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "You have choose Basic Concepts to learn",
                        Toast.LENGTH_LONG).show();

                String url = "https://www.w3schools.com/sql/default.asp";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                return true;
            case 1:
                Toast.makeText(this, "You have choose Filtering",
                        Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "You have choose Functions",
                        Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "You have choose Subqueries",
                        Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "You have choose Table Operations",
                        Toast.LENGTH_LONG).show();
                return true;
            case 5:
                Toast.makeText(this, "You have choose Views",
                        Toast.LENGTH_LONG).show();
                return true;
            case 6:
                Toast.makeText(this, "You have choose to test what you know",
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LearnSQLActivity.this, TestSQLActivity.class);
                startActivity(intent);
                return true;
        }
        return false;
    }
}
