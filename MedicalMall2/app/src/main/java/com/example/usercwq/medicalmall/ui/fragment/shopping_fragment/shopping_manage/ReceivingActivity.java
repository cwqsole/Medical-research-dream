package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_manage;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3.SiteActivity;
import com.lljjcoder.citypickerview.widget.CityPicker;

public class ReceivingActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mImageBack;
    private TextView mTvTitle;
    private TextView mTvName;
    private TextView mTvChoose;
    private EditText mEtName;
    private TextView mTvTel;
    private EditText mEtTel;
    private TextView mRegion;
    private TextView mTvRegion;
    private ImageView mIvRight;
    private EditText mEtAddress;
    private TextView mTvDelAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);
        initview();


    }



    private void initview() {
        mImageBack = findViewById(R.id.image_back);
        mTvTitle = findViewById(R.id.tv_title);
        mTvName = findViewById(R.id.tv_name);
        mTvChoose = findViewById(R.id.tv_choose);
        mEtName = findViewById(R.id.et_name);
        mTvTel = findViewById(R.id.tv_tel);
        mEtTel = findViewById(R.id.et_tel);
        mRegion = findViewById(R.id.region);
        mTvRegion = findViewById(R.id.tv_address);
        mIvRight = findViewById(R.id.iv_right);
        mEtAddress = findViewById(R.id.et_address);
        mTvDelAdd = findViewById(R.id.tv_delAdd);
        mTvDelAdd.setOnClickListener(this);
        //选择地区
        mTvRegion.setOnClickListener(this);
    }


    //Texview的点击事件
//    public void chooseArea(View view) {
//        //判断输入法的隐藏状态
//        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (imm.isActive()) {
//            imm.hideSoftInputFromWindow(view.getWindowToken(),
//                    InputMethodManager.HIDE_NOT_ALWAYS);
//            selectAddress();//调用CityPicker选取区域
//        }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_delAdd:
                String name = mEtName.getText().toString();  //名字
                String phone = mEtTel.getText().toString();  //手机号
                //  mTvRegion  选项地址
                String detailed = mTvRegion.getText().toString();
                //详细地址
                String address = mEtAddress.getText().toString();
                Intent intent = new Intent(this, SiteActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("phone",phone);
                intent.putExtra("address",address);
                intent.putExtra("detailed",detailed);
                setResult(2, intent);
                finish();
                break;

            case R.id.tv_address:
                selectAddress();
                break;
            case R.id.image_back:
                finish();
                break;
        }
    }
    private void selectAddress() {
        CityPicker cityPicker = new CityPicker.Builder(ReceivingActivity.this)
                .textSize(14)
                .title("地址选择")
                .titleBackgroundColor("#FFFFFF")
//                .titleTextColor("#696969")
                .confirTextColor("#696969")
                .cancelTextColor("#696969")
                .province("北京市")
                .city("北京市")
                .district("朝阳区")
                .textColor(Color.parseColor("#000000"))
                .provinceCyclic(true)
                .cityCyclic(false)
                .districtCyclic(false)
                .visibleItemsCount(7)
                .itemPadding(15)
                .onlyShowProvinceAndCity(false)
                .build();
        cityPicker.show();
        //监听方法，获取选择结果
        cityPicker.setOnCityItemClickListener(new CityPicker.OnCityItemClickListener() {
            @Override
            public void onSelected(String... citySelected) {
                //省份
                String province = citySelected[0];
                //城市
                String city = citySelected[1];
                //区县（如果设定了两级联动，那么该项返回空）
                String district = citySelected[2];
                //邮编
                String code = citySelected[3];
                //为TextView赋值
                mTvRegion.setText(province.trim()+ city.trim()+ district.trim());
            }
        });
    }


}
