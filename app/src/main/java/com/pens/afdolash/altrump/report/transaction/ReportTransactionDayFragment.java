package com.pens.afdolash.altrump.report.transaction;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pens.afdolash.altrump.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReportTransactionDayFragment extends Fragment {


    public ReportTransactionDayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_report_transaction_day, container, false);
    }

}
