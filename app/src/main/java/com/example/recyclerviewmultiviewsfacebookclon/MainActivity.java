package com.example.recyclerviewmultiviewsfacebookclon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerviewmultiviewsfacebookclon.adapter.PostAdapter;
import com.example.recyclerviewmultiviewsfacebookclon.databinding.ActivityMainBinding;
import com.example.recyclerviewmultiviewsfacebookclon.dataprovider.DataProviderRepo;
import com.example.recyclerviewmultiviewsfacebookclon.dataprovider.OnDataAvail;
import com.example.recyclerviewmultiviewsfacebookclon.model.PostModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        PostAdapter adapter = new PostAdapter();
        mBinding.recycler.setAdapter(adapter);

        DataProviderRepo providerRepo = new DataProviderRepo();
        providerRepo.getListOfData(new OnDataAvail() {
            @Override
            public void onDataAvail(List<PostModel> modelList) {
                adapter.setPostModels(modelList);
            }
        });


    }

    @Override
    protected void onDestroy() {
        mBinding = null;
        super.onDestroy();
    }
}