package best.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 26/10/2017.
 */

public class MainActivity1 extends AppCompatActivity {
    private Button btnBack,btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btnBack= (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity();
            }

            private void doOpenMainActivity() {
                Intent mIntent=new Intent(MainActivity1.this,MainActivity.class);
                startActivity(mIntent);
            }
        });
        btnNext= (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity2();
            }

            private void doOpenMainActivity2() {
                Intent mIntent=new Intent(MainActivity1.this,MainActivity2.class);
                startActivity(mIntent);
            }
        });
    }
}
