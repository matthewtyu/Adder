package com.example.matthewyu.adder.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.matthewyu.adder.MainActivity;
import com.example.matthewyu.adder.R;

/**
 * Created by matthewyu on 4/16/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;

    public JUnit_test()
    {

        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();
        final EditText numberOne = (EditText) mainActivity.findViewById(R.id.numberOne);
        final EditText numberTwo = (EditText) mainActivity.findViewById(R.id.numberTwo);

        final Button btnAdd = (Button) mainActivity.findViewById(R.id.button);
        final TextView result = (TextView) mainActivity.findViewById(R.id.result);

        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                numberOne.setText("10");
                numberTwo.setText("20");
                btnAdd.performClick();
                assertEquals("30", result.getText().toString());
            }
        });



    }
}
