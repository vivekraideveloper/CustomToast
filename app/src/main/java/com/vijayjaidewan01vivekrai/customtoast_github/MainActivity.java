package com.vijayjaidewan01vivekrai.customtoast_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG);
                LayoutInflater inflater = getLayoutInflater();
                View view1 = inflater.inflate(R.layout.custom_layout, null);
                toast.setView(view1);
                toast.show();

            }
        });

    }
}
