package escuelaing.com.co.bowmobileapp.data.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import escuelaing.com.co.bowmobileapp.R;

public class PartyActivity extends AppCompatActivity {
    Button buttonBack;
    Button buttonBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);
        componentsInitialization();
        actionListenersInitialization();
    }

    void componentsInitialization() {
        buttonBack = (Button) findViewById((R.id.buttonBack));
        buttonBook = (Button) findViewById((R.id.bookButton));
        ScrollView sv = (ScrollView) findViewById(R.id.partyScrollView);
        sv.smoothScrollTo(0,300);
    }

    void actionListenersInitialization() {

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PartyActivity.this,BookActivity.class );
                startActivity(intent);
            }
        });
    }
}