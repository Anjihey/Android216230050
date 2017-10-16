package com.example.a216230050_2b;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

public class page2 extends Fragment
{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.page2, container, false);

        TabHost tabHost = (TabHost)view.findViewById(R.id.tabHost); // fragment에서 findviewgyid할때
        tabHost.setup();

        TabHost.TabSpec ts1 = tabHost.newTabSpec("Name");
        ts1.setContent(R.id.tab1);
        ts1.setIndicator("Name");
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("ID");
        ts2.setContent(R.id.tab2);
        ts2.setIndicator("ID");
        tabHost.addTab(ts2);

        TabHost.TabSpec ts3 = tabHost.newTabSpec("Class");
        ts3.setContent(R.id.tab3);
        ts3.setIndicator("Class");
        tabHost.addTab(ts3);


        return view;

    }


}

