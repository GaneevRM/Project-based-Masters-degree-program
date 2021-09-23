package com.ganeevrm.prototype_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onImageButton(View view) {
        Toast.makeText(this, "Изображения", Toast.LENGTH_SHORT).show();
    }

    public void onAudioButton(View view) {
        Intent voiceIntent = new Intent(this, VoskActivity.class);
        startActivity(voiceIntent);
    }

    public void onReportButton(View view) {
        Toast.makeText(this, "Отчёты", Toast.LENGTH_SHORT).show();
    }
}