package com.example.tab;

 import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * Created by tutlane on 09-01-2018.
 */

public class AboutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        final View inflate;
        inflate = inflater.inflate(R.layout.aboutlayout, viewGroup, false);
        return inflate;
    }
}