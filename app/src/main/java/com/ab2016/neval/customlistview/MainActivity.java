package com.ab2016.neval.customlistview;

import android.app.ListActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String []  mobileOS = {"Android", "iOS", "WindowsMobile", "Blackberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setListAdapter(new MobileArrayAdapter(this, mobileOS));
    }

    @Override
    protected void onListItemClick(ListView lv, View view, int position, long id) {
        // We can access individual items in the XML file using the view object
        LinearLayout mLinearLayout = (LinearLayout) view.findViewById(R.id.mLinearLayout1);
        mLinearLayout.setBackgroundColor(Color.rgb(200, 200, 200));


        // Get the text of the selected item and display it with Toast
        TextView mTextView = (TextView) view.findViewById(R.id.label);
        String selectedValue = mTextView.getText().toString();

        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
    }
}
