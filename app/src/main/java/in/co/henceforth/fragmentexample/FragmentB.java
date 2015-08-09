package in.co.henceforth.fragmentexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  mContainer = inflater.inflate(R.layout.fragment_b, container, false);

        TextView textView=(TextView) mContainer.findViewById(R.id.frag_b_text);
        textView.setText(getArguments().getString("var1"));

        // Inflate the layout for this fragment
        return mContainer;
    }


}
