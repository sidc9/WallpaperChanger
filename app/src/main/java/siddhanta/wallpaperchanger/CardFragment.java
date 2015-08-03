package siddhanta.wallpaperchanger;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * Created by Sidd.c on 3/8/2015.
 */
public class CardFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    TextView textView;

    private int position;

    public static CardFragment newInstance (int position) {
        CardFragment f = new CardFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState(){
        super.onCreate(savedInstanceState);
        position.getArguments().getInt(ARG_POSITION);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_card,container,false);

    }
}
