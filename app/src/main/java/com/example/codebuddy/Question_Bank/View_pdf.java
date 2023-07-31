package com.example.codebuddy.Question_Bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.codebuddy.R;
import com.github.barteksc.pdfviewer.PDFView;

public class View_pdf extends AppCompatActivity {


    PDFView pdfview;
    TextView headertitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);

        pdfview=findViewById(R.id.pdfView);
        headertitle=findViewById(R.id.headertitle);

        int position=getIntent().getIntExtra("position",0);
        String name=getIntent().getStringExtra("name");

        if(position==0){
            pdfview.fromAsset("java.pdf").load();
            headertitle.setText(name);
        }
        else if(position==1){
            pdfview.fromAsset("dsa.pdf").load();
            headertitle.setText(name);
        } else if(position==2){
            pdfview.fromAsset("android.pdf").load();
            headertitle.setText(name);
        } else if(position==3){
            pdfview.fromAsset("python.pdf").load();
            headertitle.setText(name);
        }
    }
}