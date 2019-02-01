package com.example.mobile_client;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rest_Password_Page extends AppCompatActivity {
    //r_username
    //tv_Sq1
    //tv_Sq2
    //Answer1
    //Answer2
    //r_password
    //r_repassword
    //r_sumbit

    private EditText r_Username;
    private EditText r_Answer1;
    private EditText r_Answer2;
    private TextView Security_question1;
    private TextView Security_question2;
    private EditText r_Password;
    private EditText r_Repassword;
    private Button r_Sumbit;
    private Button r_Back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest__password__page);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        r_Username = (EditText)findViewById(R.id.r_username);
        r_Answer1 = (EditText)findViewById(R.id.Answer1);
        r_Answer2 = (EditText)findViewById(R.id.Answer2);
        Security_question1 = (TextView)findViewById(R.id.tv_Sq1);
        Security_question2 = (TextView)findViewById(R.id.tv_Sq2);
        r_Password = (EditText)findViewById(R.id.r_password);
        r_Repassword =(EditText)findViewById(R.id.r_repassword);
        r_Sumbit = (Button)findViewById(R.id.r_sumbit);
        //r_Back = (Button)findViewById(R.id.bt_back);


        r_Sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTohome();
            }
        });
//        r_Back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goBack();
//
//            }
//        });

    }

    private void goTohome()
    {
        Intent intent = new Intent(Rest_Password_Page.this, Login_Page.class);
        startActivity(intent);
    }
//    private void goBack()
//    {
//        Intent intent = new Intent(Rest_Password_Page.this, Login_Page.class);
//        startActivity(intent);
//    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case android.R.id.home:
                finish();
                break;

            default:
                //no error
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toobar_edit_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}