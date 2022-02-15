package com.smktelkom.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtName;
    private EditText edtTtl;
    private EditText edtKelas;
    private EditText edtAlamat;
    private EditText edtHobi;
    private Button btnSimpan;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtTtl = findViewById(R.id.edt_ttl);
        edtKelas = findViewById(R.id.edt_kelas);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtHobi = findViewById(R.id.edt_hobi);
        btnSimpan = findViewById(R.id.btn_simpan);
        tvResult = findViewById(R.id.tv_result);

        btnSimpan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_simpan){
            String inputName = edtName.getText().toString().trim();
            String inputTtl = edtTtl.getText().toString().trim();
            String inputKelas = edtKelas.getText().toString().trim();
            String inputAlamat = edtAlamat.getText().toString().trim();
            String inputHobi = edtHobi.getText().toString().trim();

            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(inputName)){
                isEmptyFields = true;
                edtName.setError("Harap isi field ini");
            }
            if (TextUtils.isEmpty(inputTtl)){
                isEmptyFields = true;
                edtTtl.setError("Harap isi field ini");
            }
            if (TextUtils.isEmpty(inputKelas)){
                isEmptyFields = true;
                edtKelas.setError("Harap isi field ini");
            }
            if (TextUtils.isEmpty(inputAlamat)){
                isEmptyFields = true;
                edtAlamat.setError("Harap isi field ini");
            }
            if (TextUtils.isEmpty(inputHobi)){
                isEmptyFields = true;
                edtHobi.setError("Harap isi field ini");
            }
            String name = (inputName);
            String ttl = (inputTtl);
            String kelas = (inputKelas);
            String alamat = (inputAlamat);
            String hobi = (inputHobi);

            if (!isEmptyFields){
                String output1 = "Nama :"+ name;
                String output2 = "Tanggal Lahir :"+ ttl;
                String output3 = "Kelas :"+ kelas;
                String output4 = "Alamat :"+ alamat;
                String output5 = "Hobi :"+ hobi;
                tvResult.setText(String.valueOf(output1)+"\n"+"\n"+(output2)+"\n"+"\n"+(output3)+"\n"+"\n"+(output4)+"\n"+"\n"+(output5));
            }
        }
    }
}