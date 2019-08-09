package com.example.user.latihanfragmentdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNama,edtAlamat,edtNoHP,edtPekerjaan,edtLamaKerja,edtAsalSekolah,edtKompetensi;
    Button btnInput;
    String namanya,alamatnya,noHpnya,pekerjaannya,lamakerjanya,asalsekolahnya,kompetensinya;
    Pegawai pegawai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama=(EditText)findViewById(R.id.edt_nama);
        edtAlamat=(EditText)findViewById(R.id.edt_alamat);
        edtNoHP=(EditText)findViewById(R.id.edt_noHp);
        edtPekerjaan=(EditText)findViewById(R.id.edt_pekerjaan);
        edtLamaKerja=(EditText)findViewById(R.id.edt_lamaKerja);
        edtAsalSekolah=(EditText)findViewById(R.id.edt_asalSekolah);
        edtKompetensi=(EditText)findViewById(R.id.edt_kompetensi);
        btnInput=(Button)findViewById(R.id.btn_input);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namanya=edtNama.getText().toString();
                alamatnya=edtAlamat.getText().toString();
                noHpnya=edtNoHP.getText().toString();
                pekerjaannya=edtPekerjaan.getText().toString();
                lamakerjanya=edtLamaKerja.getText().toString();
                asalsekolahnya=edtAsalSekolah.getText().toString();
                kompetensinya=edtKompetensi.getText().toString();
                pegawai = new Pegawai(namanya,alamatnya,noHpnya,pekerjaannya,lamakerjanya,asalsekolahnya,kompetensinya);
                Intent pindah = new Intent(MainActivity.this,DetailActivity.class);
                pindah.putExtra("pegawainya",pegawai);
                startActivity(pindah);

            }
        });
    }
}
