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
import android.widget.TextView;

public class VerifyActivity extends AppCompatActivity {
    TextView txNik;
    TextView txNama;
    TextView txTglLahir;
    TextView txJk;
    TextView txHubungan;
    TextView txTglKonfirmasi;
    TextView txJnstes;

    Button btnUbah;
    Button btnLanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        txTglKonfirmasi = (TextView) findViewById(R.id.txt_tgl_konfirmasi);
        txJnstes = (TextView) findViewById(R.id.txt_jnstes);
        txNik = (TextView) findViewById(R.id.tx_nik);
        txNama = (TextView) findViewById(R.id.tx_nama);
        txTglLahir = (TextView) findViewById(R.id.tx_tgl_lahir);
        txJk = (TextView) findViewById(R.id.tx_jkelamin);
        txHubungan = (TextView) findViewById(R.id.tx_Hubungan);

        Intent i = getIntent();
        txJnstes.setText(i.getExtras().getString("Jenis Tes"));
        txTglKonfirmasi.setText(i.getExtras().getString("Tanggal Terkonfirmasi"));
        txNik.setText(i.getExtras().getString("Nik"));
        txNik.setText(i.getExtras().getString("Nik"));
        txNama.setText(i.getExtras().getString("Nama"));
        txTglLahir.setText(i.getExtras().getString("Tgl_lahir"));
        txJk.setText(i.getExtras().getString("Jk"));
        txHubungan.setText(i.getExtras().getString("Hub"));


        btnLanjut = (Button) findViewById(R.id.lanjut);
        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(VerifyActivity.this, "Terima kasih laporan anda membantu kami dalam melakukan penangan kasus secara tepat");
            }
        });

        btnUbah = (Button) findViewById(R.id.ubah);
        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}