package com.portfolio.evanday.applicationportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PortfolioFrontPage extends AppCompatActivity
{
    /* is it possible to add another parameter as input so i can use
    one method for all of the toasts instead of a different method 
    for each toast? possible method shown below but I don't know how
    to call it with the extra parameter.
    
    public void toast(View view, Charsequence text)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } */
    
    
    public void movieToast(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This will be the popular movies app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void stockToast(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This will be the Stock Hawk app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void buildbigggerToast(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This will be the Build it Bigger app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void materialToast(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This will be the Make your app Material app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void ubiquitousToast(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This will be the Go Ubiquitous app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void capstoneToast(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This will be the Capstone app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_front_page);
    }
}
