package best.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

/**
 * Created by Admin on 26/10/2017.
 */

public class MainActivity3 extends AppCompatActivity {
    private Button btnBack,btnNext;
    private TextView tvTuoi,tvChieuCao;
    private NumberPicker nbTuoi,nbChieuCao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity2();
            }

            private void doOpenMainActivity2() {
                Intent mIntent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(mIntent);
            }
        });
        btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenMainActivity4();
            }

            private void doOpenMainActivity4() {
                Intent mIntent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(mIntent);
            }
        });
        tvTuoi = (TextView) findViewById(R.id.tv_thn);
        nbTuoi = (NumberPicker) findViewById(R.id.nb_tuoi);
        nbTuoi.setMinValue(0);
        nbTuoi.setMaxValue(120);
        nbTuoi.setWrapSelectorWheel(true);
        nbTuoi.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {

                tvTuoi.setText("Tuoi cua ban la: "+newVal);
            }
        });
        tvChieuCao= (TextView) findViewById(R.id.tv_cchn);
        nbChieuCao= (NumberPicker) findViewById(R.id.nb_chieu_cao);
        nbChieuCao.setMinValue(20);
        nbChieuCao.setMaxValue(250);
        nbChieuCao.setWrapSelectorWheel(true);
        nbChieuCao.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int x, int y) {
                tvChieuCao.setText("Chieu cao cua ban la: "+y+"cm");

            }
        });

    }

}
