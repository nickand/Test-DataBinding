package com.android.testdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.testdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Message message;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        message = new Message("First Message", "Second Message");
        binding.setMessage(message);
    }

    public void onButtonClick(View view) {
        message.setFirstMessage("Welcome DataBinding");
        message.setSecondMessage("Forget the findViewById");
        binding.textViewFirstName.setText(message.getFirstMessage());
        binding.textViewLastName.setText(message.getSecondMessage());
    }
}