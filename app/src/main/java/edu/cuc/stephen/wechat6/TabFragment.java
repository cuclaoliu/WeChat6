package edu.cuc.stephen.wechat6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabFragment extends Fragment{
    private String mTitle="Default Title";
    public final static String TITLE = "title";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if(bundle!=null){
            mTitle = bundle.getString(TITLE);
        }
        TextView tv = new TextView(getActivity());
        tv.setTextSize(30);
        tv.setBackgroundColor(0xffffffff);
        tv.setText(mTitle);
        return tv;
    }
}
