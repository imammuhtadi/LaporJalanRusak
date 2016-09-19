package akakom.ti1.imammuhtadi_125410307;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnLihat, btnTambah;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi button/tombol
        btnLihat = (Button) findViewById(R.id.btLihat);
        btnTambah = (Button) findViewById(R.id.btTambah);

        // even klik untuk menampilkan class SemuaAnggotaActivity
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Tampilkan semua anggota activity lewat intent
                Intent i = new Intent(getApplicationContext(),
                        TampilDataActivity.class);
                startActivity(i);
            }
        });

        // even klik menampilkan TambahAnggotaACtivity
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Tampilkan tambah anggota activity lewat intent
                Intent i = new Intent(getApplicationContext(),
                        TambahActivity.class);
                startActivity(i);
            }
        });
    }
}
