package com.canyonsappclub.swipetabsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleFragmentA extends Fragment
{
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}
