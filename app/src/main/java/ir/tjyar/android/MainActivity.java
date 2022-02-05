package ir.tjyar.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import ir.tjyar.android.databinding.ActivityMainBinding;
import ir.tjyar.android.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new MainViewModel(this);
        viewModel.setHandler(new MainActivityHandler());
        binding.setMain(viewModel);
    }

    public class MainActivityHandler {
        public void onClicked(View view) {
            int id = view.getId();

        }
    }
}