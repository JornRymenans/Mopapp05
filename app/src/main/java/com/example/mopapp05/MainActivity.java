package com.example.mopapp05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mopapp05.Model.MopDAO;
import com.example.mopapp05.recyclerutilities.MopAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMopjes;
    private MopAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //verwijzing naar recycler
        rvMopjes = findViewById(R.id.rv_mopjes);
        //adapter, hoe recycler opvallen
        adapter = new MopAdapter(MopDAO.getInstance().getMopLijst());
        rvMopjes.setAdapter(adapter);
        //hoe elementen weergeven (horizontale lijst?, verticale lijst?)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvMopjes.setLayoutManager(layoutManager);

    }
}
