package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.Adress;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyadpterAdd;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3.BuyActivity;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_manage.ReceivingActivity;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

public class SiteActivity extends AppCompatActivity {



    private ArrayList<Adress> mStrings;
    private MyadpterAdd mMyadpterAdd;
    private RecyclerView mRecyceler;
    private TextView mTvAddAdd;
    private TextView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);
        //管理收货地址
//        SharedPreferences shar = getSharedPreferences("mina", MODE_PRIVATE);
//        boolean boolean1 = shar.getBoolean("flag", false);
//
            initview();
            initciews();



    }

    private void initview() {
        mRecyceler = findViewById(R.id.recyceler);
        mTvAddAdd = findViewById(R.id.tv_addAdd);
        mBack = findViewById(R.id.image_back);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyceler.setLayoutManager(manager);
        mStrings = new ArrayList<>();
        mMyadpterAdd = new MyadpterAdd(mStrings, this);
        mRecyceler.setAdapter(mMyadpterAdd);

    }

    private void initciews() {

        //回调方法
        mMyadpterAdd.setOnCreateLayout(new MyadpterAdd.OnCreateLayout() {
            //编辑
            @Override
            public void OnCratek1(int position) {
                Intent intent = new Intent(SiteActivity.this, ReceivingActivity.class);
                startActivityForResult(intent, 1);  //请求码
            }
            //删除
            @Override
            public void OnCratek2(int position) {
                mStrings.remove(position);
                mMyadpterAdd.notifyDataSetChanged();
            }
            //监听整个布局传回数据
            @Override
            public void OnCratek3(int position) {
                Adress adress = mStrings.get(position);
                //  Toast.makeText(SiteActivity.this, "监听 ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SiteActivity.this, BuyActivity.class);
                EventBus.getDefault().post(adress);
                startActivity(intent);
               // finish();
            }
        });
        mTvAddAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建地址信息
                Intent intent = new Intent(SiteActivity.this, ReceivingActivity.class);
                startActivityForResult(intent, 1);  //请求码

            }
        });
        //返回

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 2) {
            String name = data.getStringExtra("name");
            String phone = data.getStringExtra("phone");
            String address = data.getStringExtra("address");
            String detailed = data.getStringExtra("detailed");
            Adress adress = new Adress(name, phone, address, detailed);
            Log.i("TAG", "onActivityResult: "+adress.toString());
            mStrings.add(adress);
            mMyadpterAdd.notifyDataSetChanged();
//           mTvName.setText(name);
//           mTvTel.setText(phone);
//           mTvContent.setText(detailed+"|"+address);

        }


    }


}
