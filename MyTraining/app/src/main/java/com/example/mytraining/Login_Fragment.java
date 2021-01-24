package com.example.mytraining;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import static android.content.ContentValues.TAG;

public class Login_Fragment extends Fragment {
    private static final String SHARED_PREFS = "sharedPrefs";
    private static final String USERNAME = "username";
    private TextInputLayout usernameTextInput;
    private TextInputEditText usernameEditText;
    private TextInputLayout passwordTextInput;
    private TextInputEditText passwordEditText;
    @Override
           public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
               View v = inflater.inflate(R.layout.login_fragment, container, false);



               MaterialButton loginButton = v.findViewById(R.id.login_button);
                usernameTextInput = v.findViewById(R.id.username_text_input);
                usernameEditText = v.findViewById(R.id.username_edit_input);
                passwordTextInput = v.findViewById(R.id.password_input_text);
                passwordEditText = v.findViewById(R.id.password_edit_text);



               loginButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view){
                       if(usernameEditText.getText().toString().equals("Rami") && (passwordEditText.length() > 8)){
                           saveData();
                           ((NavigationHost) getActivity()).navigateTo(new Home_fragment(), false);
                       } else {
                           passwordTextInput.setError("False");
                       }

                   }

        });
        return v;
    }

    public void saveData(){
        SharedPreferences sharedPref = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(USERNAME, usernameEditText.getText().toString());
        editor.apply();

    }
}
