package com.dttsolv.fragmentrecycler;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SearchWord extends Fragment {

    android.app.FragmentManager myFrag;

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("MyFragment","onAttach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Log.i("MyFragment","onCreateView");
        View view = inflater.inflate(R.layout.search_word, container, false);
        myFrag = getChildFragmentManager();
        android.app.FragmentTransaction myTran = myFrag.beginTransaction();
        myTran.add(R.id.test_container,new ChildFragmentWord());
        myTran.commit();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("MyFragment","onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i("MyFragment","onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("MyFragment","onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("MyFragment","onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("MyFragment","onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("MyFragment","onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("MyFragment","onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("MyFragment","onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("MyFragment","onDetach");
        super.onDetach();
    }
}