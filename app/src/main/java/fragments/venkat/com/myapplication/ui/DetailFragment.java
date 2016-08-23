package fragments.venkat.com.myapplication.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import fragments.venkat.com.myapplication.R;
import fragments.venkat.com.myapplication.model.Politics;
import fragments.venkat.com.myapplication.model.Result;

/**
 * Created by venkatgonuguntala on 8/12/16.
 */

public class DetailFragment extends Fragment {
    public static final String TAG = DetailFragment.class.getSimpleName();

    public static final String INDEX = "index";

    private List<Result> mResult;
    private String mTitle;
    private String mDate;

    public void spit(Result result) {
        mTitle = result.getTitle();
        mDate = result.getPublishedDate();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView titleTextView = (TextView) view.findViewById(R.id.detailTitle);
        TextView dateTextView = (TextView) view.findViewById(R.id.detailDate);
        Bundle bundle = getArguments();
        int index = bundle.getInt(INDEX);
        titleTextView.setText(mTitle);
        dateTextView.setText(mDate);
        return view;
    }

}
