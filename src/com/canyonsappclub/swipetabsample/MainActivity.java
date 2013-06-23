package com.canyonsappclub.swipetabsample;

import java.util.HashMap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;

//Please excuse my C# coding style

public class MainActivity extends FragmentActivity //<----- Not your typical activity.
{

	ViewPager viewPager; 
	HashMap<String, TabInfo> tabInfoMap = new HashMap<String, TabInfo>();
	
	//*****
	//This is optional. As you can see you can use this to perform actions
	//when the state of the tabs change.
	//*****
	final OnPageChangeListener pageChangeListener = new OnPageChangeListener()
	{
		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
		}

		@Override
		public void onPageSelected(int index) {
			//tabHost.setCurrentTab(index);
		}
	};
	
	//*****
	//Pretty much everything is here. Yup.
	//*****
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Fragment fragmentA = new SampleFragmentA();
		Fragment fragmentB = new SampleFragmentB();
		
		TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
		pagerAdapter.addFragment(fragmentA, "Fragment A");
		pagerAdapter.addFragment(fragmentB, "Fragment B");
		
		viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(pagerAdapter);
		//viewPager.setOffscreenPageLimit(2);
		//viewPager.setCurrentItem(0);
		
		//Optional
		viewPager.setOnPageChangeListener(pageChangeListener);
	}

	//*****
	//Nothing much here
	//*****
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
