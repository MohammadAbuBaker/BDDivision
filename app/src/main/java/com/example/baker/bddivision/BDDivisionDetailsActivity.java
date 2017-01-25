package com.example.baker.bddivision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BDDivisionDetailsActivity extends AppCompatActivity {

    TextView txtDivisionName,txtDivisionDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bddivision_details);

        txtDivisionName=(TextView)findViewById(R.id.txtDivisionName);
        txtDivisionDetails=(TextView)findViewById(R.id.txtDivisionDetails);
        /*Main activity theke j id ta patano hoise ,aikane seita getExtras dia string variable raka hoise*/
        String getDivisionName=getIntent().getExtras().getString("divisionName");


        if(getDivisionName.equals("Dhaka")){
            txtDivisionName.setText("Dhaka");//setText dia text gula id te set kore dewa hoi
            txtDivisionDetails.setText("Dhaka is a capital of Bangladesh");

        }
        else if(getDivisionName.equals("Chittagong")){
            txtDivisionName.setText("Chittagong");
            txtDivisionDetails.setText("Chittagong is a beautiful city  of Bangladesh");

        }
        else if(getDivisionName.equals("Khulna")){
            txtDivisionName.setText("Khulna");
            txtDivisionDetails.setText("Khulna is a beautiful city  of Bangladesh");

        }

        else if(getDivisionName.equals("Sylhet")){
            txtDivisionName.setText("Sylhet");
            txtDivisionDetails.setText("Sylhet is a beautiful city  of Bangladesh");

        }
        else if(getDivisionName.equals("Rajshahi")){
            txtDivisionName.setText("Rajshahi");
            txtDivisionDetails.setText("Rajshahi is a beautiful city  of Bangladesh");

        }
        else if(getDivisionName.equals("Rangpur")){
            txtDivisionName.setText("Rangpur");
            txtDivisionDetails.setText("Rangpur is a beautiful city  of Bangladesh");

        }
        else if(getDivisionName.equals("Barisal")){
            txtDivisionName.setText("Barisal");
            txtDivisionDetails.setText("Barisal is a beautiful city  of Bangladesh");

        }
        else if(getDivisionName.equals("Maymensingh")){
            txtDivisionName.setText("Maymensingh");
            txtDivisionDetails.setText("Maymensingh is a beautiful city  of Bangladesh");

        }


    }
}
