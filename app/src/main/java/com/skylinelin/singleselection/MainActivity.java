package com.skylinelin.singleselection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * @author skylinelin
 * @date 2018/2/2
 * */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RadioGroup mRadioGroup;
    private RadioButton mRadioBtSpicy;
    private RadioButton mRadioNoSpicy;
    private RadioButton mRadioWeiSpicy;
    private RadioButton mRadioZhongSpicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadioGroup = findViewById(R.id.radio_group);
        mRadioBtSpicy = findViewById(R.id.radio_bt_spicy);
        mRadioNoSpicy = findViewById(R.id.radio_no_spicy);
        mRadioWeiSpicy = findViewById(R.id.radio_wei_spicy);
        mRadioZhongSpicy = findViewById(R.id.radio_zhong_spicy);

        //获取选中Id
        //int checkedId = mRadioGroup.getCheckedRadioButtonId();

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                GuoLv(checkedId);
            }
        });


    }

    private void GuoLv(int checkedId) {
        String text = " ";
        switch (checkedId) {
            case R.id.radio_bt_spicy:
                text = "变态辣";
                break;
            case R.id.radio_no_spicy:
                text = "不要辣";
                break;
            case R.id.radio_wei_spicy:
                text = "微辣";
                break;
            case R.id.radio_zhong_spicy:
                text = "中辣";
                break;
            default:
                break;

        }
        Log.d(TAG,text);
        Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
    }

    public void dianji(View view) {

        int checkedId = mRadioGroup.getCheckedRadioButtonId();
        GuoLv(checkedId);

    }
}
