package best.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Admin on 26/10/2017.
 */

public class MainActivity2 extends AppCompatActivity {
    private Button btnBack,btnNext;
    private EditText edtCnht, edtCnmm;
    private String chuoiCnht,chuoiCnmm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnBack= (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity1();
            }

            private void doOpenMainActivity1() {
                Intent mIntent=new Intent(MainActivity2.this,MainActivity1.class);
                startActivity(mIntent);
            }
        });
        btnNext= (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity3();
            }

            private void doOpenMainActivity3() {
                Intent mIntent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(mIntent);
            }
        });
        edtCnht= (EditText) findViewById(R.id.edt_cnht);
        edtCnmm= (EditText) findViewById(R.id.edt_cnmm);
        String chuoiCnht=edtCnht.getText().toString();
        String chuoiCnmm=edtCnmm.getText().toString();
        if (chuoiCnht.isEmpty()||chuoiCnmm.isEmpty()){
            Toast.makeText(MainActivity2.this,"Ban can nhap day du thong tin",Toast.LENGTH_LONG).show();
        }
        else {

        }
    }
}
