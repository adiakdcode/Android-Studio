package com.adiakdcode.hellotoast12b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//Adalah class Activity yang akan dijalankan
    private int mCount= 0; //Private Variabel
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState); //I dont know :v
        setContentView(R.layout.activity_main);//Menjadikan halaman activty_main.xml sebagai halaman UI utama
        //dengan memanggil akses resource layout dgn fungsi setContentView()
        mShowCount = (TextView) findViewById(R.id.show_count); //Mencari komponen Textview dengan id show_count
        Log.d("MainActivity","Hello Toast!");
        //Blok Code ini akan mengeluarkan pesan "Hello Toast pada Logcat, yang bergunan untuk proses debug
    }
    public void showToast(View view) {//Method showToast
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        //Blok Code ini akan menampilkan kata "Hello Toast" dengan durasi yang Relative pendek jika tombol Toast ditekan"
        toast.show();
    }
    public void countUp(View view) {//Method count
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        //Meset Text dari angka ke String"
    }
}