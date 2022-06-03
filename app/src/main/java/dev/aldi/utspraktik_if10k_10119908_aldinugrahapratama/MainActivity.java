package dev.aldi.utspraktik_if10k_10119908_aldinugrahapratama;

/**
 * Aldi Nugraha Pratama
 * Kelas: IF10K
 * NIM: 10119908
 */


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText edtNik;
    EditText edtNama;
    EditText edtTglLahir;
    EditText tglKonfirmasi;

    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio4;
    RadioButton radio5;
    RadioButton radio6;
    RadioButton radio7;
    RadioButton radio8;

    Button simpanBtn;
    String nik;
    String nama;
    String tglLahir;
    String jenisKelamin;
    String hub;
    String strJenistes;
    String strTglKonfirmasi;

    RadioGroup rg;
    RadioGroup rg2;
    RadioGroup jenisTes;

    String tempJK;
    String temp2;
    String tempJT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNik = (EditText) findViewById(R.id.nik);
        edtNama = (EditText) findViewById(R.id.nama);
        tglKonfirmasi = (EditText) findViewById(R.id.tgl_terkonfirmasi);
        edtTglLahir = (EditText) findViewById(R.id.tgl_lahir);

        radio7 = (RadioButton) findViewById(R.id.rapid);
        radio7.setOnClickListener(null);
        radio8 = (RadioButton) findViewById(R.id.pcr);
        radio8.setOnClickListener(null);
        jenisTes = (RadioGroup) findViewById(R.id.jenistes);
        jenisTes.setOnCheckedChangeListener(this::onJenisTestChecked);

        radio1 = (RadioButton) findViewById(R.id.cowo);
        radio1.setOnClickListener(null);
        radio2 = (RadioButton) findViewById(R.id.cewe);
        radio2.setOnClickListener(null);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(this::onJenisKelaminChecked);

        radio3 = (RadioButton) findViewById(R.id.ortu);
        radio4 = (RadioButton) findViewById(R.id.nikah);
        radio5 = (RadioButton) findViewById(R.id.anak);
        radio6 = (RadioButton) findViewById(R.id.lainnya);
        rg2 = (RadioGroup) findViewById(R.id.rg2) ;
        rg2.setOnCheckedChangeListener(this::onWaliChecked);

        simpanBtn = (Button) findViewById(R.id.simpan);
        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strTglKonfirmasi = tglKonfirmasi.getText().toString();
                nik = edtNik.getText().toString();
                nik = edtNik.getText().toString();
                nama = edtNama.getText().toString();
                tglLahir = edtTglLahir.getText().toString();
                strJenistes = tempJT.toString();
                jenisKelamin = tempJK.toString();
                hub=temp2.toString();

                Intent i = new Intent(getApplicationContext(), VerifyActivity.class);
                i.putExtra("Jenis Tes", strJenistes);
                i.putExtra("Tanggal Terkonfirmasi", strTglKonfirmasi);
                i.putExtra("Nik", nik);
                i.putExtra("Nik", nik);
                i.putExtra("Nama", nama);
                i.putExtra("Tgl_lahir", tglLahir);
                i.putExtra("Jk", jenisKelamin);
                i.putExtra("Hub", hub);
                startActivity(i);
            }
        });
    }

    public void onWaliChecked(RadioGroup arg0, int arg1) {
        if(radio3.isChecked()) temp2 = "Orang Tua";
        if(radio4.isChecked()) temp2 = "Suami/Istri";
        if(radio5.isChecked()) temp2 = "Anak";
        if(radio6.isChecked()) temp2 = "Hubungan Lainnya";
    }

    public void onJenisTestChecked(RadioGroup arg0, int arg1) {
        if(radio7.isChecked()) tempJT = "Rapid Antigen";
        if(radio8.isChecked()) tempJT = "PCR";
    }

    public void onJenisKelaminChecked(RadioGroup arg0, int arg1) {
        if(radio1.isChecked()) tempJK = "Pria";
        if(radio2.isChecked()) tempJK = "Wanita";
    }
}