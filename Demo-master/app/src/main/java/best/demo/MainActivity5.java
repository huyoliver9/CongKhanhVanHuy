package best.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Admin on 26/10/2017.
 */

public class MainActivity5 extends AppCompatActivity {
    private Button btnThongKe, btnLich;
    private Calendar cal;
    private Date date;
    private EditText edtBMI;
    private int year, month, day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        btnLich = (Button) findViewById(R.id.btn_lich);
        edtBMI = (EditText) findViewById(R.id.edt_bmi);
        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);


    }



}
