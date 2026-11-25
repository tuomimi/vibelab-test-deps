package com.tuomimi.vibelab.deps;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView info = findViewById(R.id.info);
        MaterialButton action = findViewById(R.id.action);

        action.setOnClickListener(v ->
                info.setText(getString(R.string.hello_info) + "\n\n依赖与资源合并正常。"));
    }
}
