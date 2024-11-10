package com.vasilkovamgkct.lr29;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.fragment.app.ListFragment;

public class PizzaFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] pizzas = {"Диаволо", "Фунги", "Маргарита"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, pizzas);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}