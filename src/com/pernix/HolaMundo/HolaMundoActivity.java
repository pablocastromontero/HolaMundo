package com.pernix.HolaMundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class HolaMundoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     // esta linea enlaza el layout llamado main.xml a esta Activity
        setContentView(R.layout.main);  
        
        ScrollView sv = (ScrollView)findViewById(R.id.sv1);
        
        //for(int)
        
    }
}