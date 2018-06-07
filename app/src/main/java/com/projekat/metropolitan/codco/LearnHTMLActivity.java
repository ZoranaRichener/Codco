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

public class LearnHTMLActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_html);
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
        MenuItem mnu2 = menu.add(0, 1, 1, "Paragraphs");{
            mnu2.setAlphabeticShortcut('b');
            mnu2.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "Text Formating");{

            mnu3.setAlphabeticShortcut('c');
            mnu3.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Elements");{
            mnu4.setAlphabeticShortcut('d');
        }
        menu.add(0, 4, 4, "Atributes");
        menu.add(0, 5, 5, "Forms");
        menu.add(0, 6, 6, "Frames");
        menu.add(0, 7, 6, "Test");
    }
    private boolean MenuChoice(MenuItem item){
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "You have choose Basic Concepts to learn",
                        Toast.LENGTH_LONG).show();
                String url = "https://www.w3schools.com/html/default.asp";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                return true;
            case 1:
                Toast.makeText(this, "You have choose Paragraphs ",
                        Toast.LENGTH_LONG).show();
                String url1 = "https://www.w3schools.com/html/html_paragraphs.asp";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(url1));
                startActivity(i1);

                return true;
            case 2:
                Toast.makeText(this, "You have choose Text Fortmating",
                        Toast.LENGTH_LONG).show();
                String url2 = "https://www.w3schools.com/html/html_formatting.asp";
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse(url2));
                startActivity(i2);
                return true;
            case 3:
                Toast.makeText(this, "You have choose Elements",
                        Toast.LENGTH_LONG).show();
                String url3 = "https://www.w3schools.com/html/html_elements.asp";
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse(url3));
                startActivity(i3);
                return true;
            case 4:
                Toast.makeText(this, "You have choose Atributes",
                        Toast.LENGTH_LONG).show();
                String url4 = "https://www.w3schools.com/html/html_attributes.asp";
                Intent i4= new Intent(Intent.ACTION_VIEW);
                i4.setData(Uri.parse(url4));
                startActivity(i4);
                return true;
            case 5:
                Toast.makeText(this, "You have choose Forms",
                        Toast.LENGTH_LONG).show();
                String url5 = "https://www.w3schools.com/html/html_forms.asp";
                Intent i5= new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse(url5));
                startActivity(i5);
                return true;
            case 6:
                Toast.makeText(this, "You have choose Frames",
                        Toast.LENGTH_LONG).show();

                return true;
            case 7:
                Toast.makeText(this, "You have choose to test what you know",
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LearnHTMLActivity.this, TestHTMLActivity.class);
                startActivity(intent);
                return true;
        }
        return false;
    }
}
