package hr.pavetic.stickybottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import hr.pavetic.stickybottomsheet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonOpenDialog.setOnClickListener(view -> {
            StickyBottomSheet stickyBottomSheet = StickyBottomSheet.newInstance();
            if(!stickyBottomSheet.isAdded())
                stickyBottomSheet.show(getSupportFragmentManager(), "StickyBottomSheet");
        });
    }
}