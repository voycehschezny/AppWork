package com.dima.mycourse.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.dima.mycourse.R;

/**
 * Created by Dimon on 13.09.2015.
 */
public class OneFragment extends Fragment{
    public final static String TAG = "OneFragmentTEG";
    private ListView listView1;
    private String[] strListView1 = {"sdf","sdfsdf","sdfs"};
    private EditText inputSearch;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootFragment = inflater.inflate(R.layout.one_fragment,null);

        listView1 = (ListView)rootFragment.findViewById(R.id.listView);
        //strListView1 = getResources().getStringArray(R.array.my_listF1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1, strListView1);
        listView1.setAdapter(adapter);

        return rootFragment;
    }


}
