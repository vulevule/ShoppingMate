package com.pma.shoppingmate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class SignUpActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        /*if (shouldAllowBack()) {
        } else {
            doSomething();
        }*/
    }
    public void goBack(View view) {
        Intent i = new Intent(this, WelcomeScreenActivity.class);        // Specify any activity here e.g. home or splash or login etc
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra("EXIT", true);
        startActivity(i);
        finish();
        Map map = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(@Nullable Object key) {
                return false;
            }

            @Override
            public boolean containsValue(@Nullable Object value) {
                return false;
            }

            @Nullable
            @Override
            public Object get(@Nullable Object key) {
                return null;
            }

            @Nullable
            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Nullable
            @Override
            public Object remove(@Nullable Object key) {
                return null;
            }

            @Override
            public void putAll(@NonNull Map m) {

            }

            @Override
            public void clear() {

            }

            @NonNull
            @Override
            public Set keySet() {
                return null;
            }

            @NonNull
            @Override
            public Collection values() {
                return null;
            }

            @NonNull
            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        }
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    public void signUp(View view) {
        //Intent intent = new Intent(this, SignInActivity.class);
        //startActivity(intent);
    }

    public void signIn(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}
