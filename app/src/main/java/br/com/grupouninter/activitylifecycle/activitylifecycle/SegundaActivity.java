package br.com.grupouninter.activitylifecycle.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.grupouninter.activitylifecycle.activitylifecycle.R;

public class SegundaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_segunda);

    }
}
