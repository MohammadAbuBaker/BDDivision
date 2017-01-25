package com.example.baker.bddivision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDhaka,btnChittagong,btnKhulna,btnSylhet,btnRajshahi,btnRangpur,btnBarisal,btnMymensingh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* aikane typecast kore java er sathe xml file ta initialize kora hoise*/
        btnDhaka=(Button)findViewById(R.id.btnDhaka);
        btnChittagong=(Button)findViewById(R.id.btnChittagong);
        btnKhulna=(Button)findViewById(R.id.btnKhulna);
        btnSylhet=(Button)findViewById(R.id.btnSylhet);
        btnRajshahi=(Button)findViewById(R.id.btnRajshahi);
        btnRangpur=(Button)findViewById(R.id.btnRangpur);
        btnBarisal=(Button)findViewById(R.id.btnBarisal);
        btnMymensingh=(Button)findViewById(R.id.btnMymensingh);

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Dhaka");// aitar maddome id=divisionName and data=Dhaka onno activity te patano hoise
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Dhaka", Toast.LENGTH_SHORT).show();
            }
        });
        btnChittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Chittagong");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Chittagong", Toast.LENGTH_SHORT).show();
            }
        });
        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Khulna");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Khulna", Toast.LENGTH_SHORT).show();
            }
        });
        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Sylhet");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Sylhet", Toast.LENGTH_SHORT).show();
            }
        });
        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Rajshahi");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Rajshahi", Toast.LENGTH_SHORT).show();
            }
        });
        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Rangpur");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Rangpur", Toast.LENGTH_SHORT).show();
            }
        });
        btnBarisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Barisal");
                startActivity(intent);
                Toast.makeText(MainActivity.this, " Barisal", Toast.LENGTH_SHORT).show();
            }
        });
        btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BDDivisionDetailsActivity.class);
                intent.putExtra("divisionName","Maymensingh");
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Mymensingh", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
