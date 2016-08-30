package id.co.sigma.android.persegipanjangapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText  edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang=(EditText)findViewById(R.id.edtPanjang);
        edtLebar=(EditText)findViewById(R.id.edtLebar);
        btnHitung=(Button)findViewById(R.id.btn_hitung);
        tvHasil=(TextView)findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.btn_hitung){
                    String panjang=edtPanjang.getText().toString().trim();
                    String lebar=edtLebar.getText().toString().trim();

                    boolean isNotError=false;
                    if(!TextUtils.isEmpty(panjang)){
                       isNotError=true;
                    }
                    if(!TextUtils.isEmpty(lebar)){
                        isNotError=true;
                    }

                    if(isNotError){
                        double p=Double.parseDouble(panjang);
                        double l= Double.parseDouble(lebar);

                        double luas=p*l;
                        tvHasil.setText("Hasil Luas : "+luas);
                    }
                }
            }
        });
    }
}
