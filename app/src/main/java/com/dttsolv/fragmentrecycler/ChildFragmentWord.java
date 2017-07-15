package com.dttsolv.fragmentrecycler;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by systena on 6/29/2017.
 */

public class ChildFragmentWord extends Fragment{

    Button left;
    Button right;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.child_fragment_word,container,false);
        left = (Button) view.findViewById(R.id.leftBtn);
        right = (Button) view.findViewById(R.id.rightBtn);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.sub_container, new Left());
                transaction.commit();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.sub_container, new Right());
                transaction.commit();
            }
        });
        return view;
    }
}
