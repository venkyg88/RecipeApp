package fragments.venkat.com.myapplication.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fragments.venkat.com.myapplication.R;
import fragments.venkat.com.myapplication.adapter.HeadLinesListAdapter;
import fragments.venkat.com.myapplication.adapter.ListAdapter;
import fragments.venkat.com.myapplication.api.NewYorkTimesApi;
import fragments.venkat.com.myapplication.controller.Access;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */

public abstract class BaseFragment extends Fragment {
    private final static String TAG = BaseFragment.class.getSimpleName();

    protected NewYorkTimesApi mNewYorkTimesApi;
    protected HeadLinesListAdapter mHeadLinesListAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        PoliticsFragment.onHeadLinesSelectedInterface listener = (PoliticsFragment.onHeadLinesSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        mNewYorkTimesApi = Access.getInstance().getNewYorkTimesAPi();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mHeadLinesListAdapter = new ListAdapter(listener);
        getHeadlinesFromApi();

        recyclerView.setAdapter(mHeadLinesListAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    public abstract void getHeadlinesFromApi();

}
