package com.dima.mycourse.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dima.mycourse.R;

/**
 * Created by Dimon on 13.09.2015.
 */
public class TwoFragment extends Fragment{
    public final static String TAG = "TwoFragmentTEG";
    private ListView listView2;
    private String[] strListView2 = {"",""};
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootFragment2 = inflater.inflate(R.layout.two_fragment,null);
        listView2 = (ListView)rootFragment2.findViewById(R.id.listView2);
        //strListView2 = getResources().getStringArray(R.array.my_listF2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView2);
        listView2.setAdapter(adapter2);
        return rootFragment2;
    }
}
