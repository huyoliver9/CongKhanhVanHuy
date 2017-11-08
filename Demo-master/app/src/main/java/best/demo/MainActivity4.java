package best.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 26/10/2017.
 */

public class MainActivity4 extends AppCompatActivity {
    private Button btnBack,btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        btnBack= (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity3();
            }

            private void doOpenMainActivity3() {
                Intent mIntent=new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(mIntent);
            }
        });
        btnNext= (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity5();
            }

            private void doOpenMainActivity5() {
                Intent mIntent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(mIntent);
            }
        });
    }
}
