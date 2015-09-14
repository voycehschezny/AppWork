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
public class ThreeFragment extends Fragment {
    public final static String TAG = "ThreeFragmentTEG";
    private ListView listView3;
    private String[] strListView3 = {"",""};
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootFragment3 = inflater.inflate(R.layout.three_fragment,null);
        listView3 = (ListView)rootFragment3.findViewById(R.id.listView3);
       // strListView3 = getResources().getStringArray(R.array.my_listF3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView3);
        listView3.setAdapter(adapter3);
        return rootFragment3;
    }
}
