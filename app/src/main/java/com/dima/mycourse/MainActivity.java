package com.dima.mycourse;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.dima.mycourse.fragment.OneFragment;
import com.dima.mycourse.fragment.ThreeFragment;
import com.dima.mycourse.fragment.TwoFragment;


public class MainActivity extends FragmentActivity{

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();
    }

    public void onClickFragment(View view)
    {
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (view.getId())
        {
            case R.id.button:
                    fragmentTransaction.replace(R.id.button_name, oneFragment, OneFragment.TAG);
                break;
            case R.id.button2:
                    fragmentTransaction.replace(R.id.button_name, twoFragment, TwoFragment.TAG);
                break;
            case R.id.button3:
                    fragmentTransaction.replace(R.id.button_name, threeFragment,ThreeFragment.TAG);
                break;
        }
        fragmentTransaction.commit();
    }
}
