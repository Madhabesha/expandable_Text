package com.hometest.expandabletext;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView detailText;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailText = findViewById(R.id.Detail);
        layout = findViewById(R.id.layout);

    }

@RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void expand(View view) {
        int v = (detailText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

    TransitionManager.beginDelayedTransition(layout, new AutoTransition());
    detailText.setVisibility(v);
    }
}