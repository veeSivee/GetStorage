package vee.apps.getstorage;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCek,btnClear;
    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCek = (Button)findViewById(R.id.button);
        btnClear = (Button)findViewById(R.id.button2);
        txtInfo = (TextView)findViewById(R.id.textView);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String primaryStorage = System.getenv("EXTERNAL_STORAGE");
                String secondStorage = System.getenv("SECONDARY_STORAGE");

                txtInfo.setText("Storage Info :\n" +
                        "Primary Storage : " + primaryStorage
                        + "\nSecond Storage  : " + secondStorage);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInfo.setText("Storage Info :");
            }
        });

    }
}
