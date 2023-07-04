package com.example.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextText);
        editTextAddress = findViewById(R.id.editTextText2);

        Button displayButton = findViewById(R.id.tvdisplay);
        Button nameClearButton = findViewById(R.id.tvNameClear);
        Button addressClearButton = findViewById(R.id.tvclear);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String address = editTextAddress.getText().toString();

                if (!name.isEmpty() && !address.isEmpty()) {
                    String message = address + "にお住いの" + name + "さん、こんにちは！";
                    showToast(message);
                } else {
                    showToast("名前と住まいを入力してください");
                }
            }
        });

        nameClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextName.setText("");
            }
        });

        addressClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextAddress.setText("");
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
