package com.example.colorpicker;



import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InputFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InputFragment extends Fragment {

    EditText input1Text;
    EditText input2Text;
    EditText input3Text;
    View.OnClickListener addlistener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String input1 = input1Text.getText().toString();
            String input2 = input2Text.getText().toString();
            String input3 = input3Text.getText().toString();
            // add todo
        }
    };

    public InputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentActivity context = getActivity();
        LinearLayout root = new LinearLayout(context);
        root.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        root.setOrientation(LinearLayout.VERTICAL);

        LinearLayout NEELayout = new LinearLayout(context);
        NEELayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        NEELayout.setOrientation(LinearLayout.HORIZONTAL);
        TextView NEETextView = new TextView(context);
        NEETextView.setText("NEE");
        NEETextView.setTextSize(18);
        NEETextView.setPadding(16, 16, 16, 16);
        NEETextView.setTextColor(Color.BLACK);
        NEETextView.setClickable(true);
        NEETextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace fragment with your web fragment here
               // InfoWebFragment webFragment = InfoWebFragment.newInstance("https://seekingalpha.com/symbol/NEE");
               // getParentFragmentManager().beginTransaction()
                   //     .replace(R.id.fragment_container, webFragment) // container in your activity
                    //    .addToBackStack(null)
                    //    .commit();
            }
        });

        LinearLayout input1layout = new LinearLayout(context);
        input1layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        input1layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView input1textView = new TextView(getActivity());
        input1textView.setText(R.string.input1);
        input1Text = new EditText(context);
        input1layout.addView(input1textView);
        input1layout.addView(input1Text);
        root.addView(input1layout);

        LinearLayout input2layout = new LinearLayout(context);
        input2layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        input2layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView input2textView = new TextView(getActivity());
        input2textView.setText(R.string.input2);
        input2Text = new EditText(context);
        input2layout.addView(input2textView);
        input2layout.addView(input2Text);
        root.addView(input2layout);

        LinearLayout input3layout = new LinearLayout(context);
        input3layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        input3layout.setOrientation(LinearLayout.HORIZONTAL);
        TextView input3textView = new TextView(getActivity());
        input3textView.setText(R.string.input3);
        input3Text = new EditText(context);
        input3layout.addView(input3textView);
        input3layout.addView(input3Text);
        root.addView(input3layout);

        Button addButton = new Button(context);
        addButton.setText(R.string.add_entry);

        root.addView(addButton);

        return root;
    }
}