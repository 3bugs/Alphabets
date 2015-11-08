package com.example.alphabets;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import com.example.alphabets.model.EnglishAlphabet;

/**
 * Created by Promlert on 11/8/2015.
 */
public class AlphabetListFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<EnglishAlphabet> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                EnglishAlphabet.DATA
        );

    }
}
