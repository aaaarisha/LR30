package com.vasilkovamgkct.lr29;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class TopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        // Находим ImageView и задаем описание
        ImageView infoImage = view.findViewById(R.id.info_image);
        infoImage.setContentDescription(getString(R.string.restaurant_image));

        // Находим текстовые представления
        TextView companyNameTextView = view.findViewById(R.id.company_name);
        TextView homeTextView = view.findViewById(R.id.home_text);

        // Установка текста для текстовых представлений
        companyNameTextView.setText(getString(R.string.company_name));
        homeTextView.setText(getString(R.string.home_text));

        return view;
    }
}