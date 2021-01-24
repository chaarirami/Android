package com.example.registration;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view) {
        TextView viewFirstName = findViewById(R.id.txtViewFirstName);
        TextView viewLastName = findViewById(R.id.txtViewLastName);
        TextView viewEmail = findViewById(R.id.txtViewEmail);

        EditText edtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtEmail = findViewById(R.id.edtTxtEmail);

        viewFirstName.append(edtFirstName.getText().toString());
        viewLastName.append(edtLastName.getText().toString());
        viewEmail.append(edtEmail.getText().toString());
    }
}