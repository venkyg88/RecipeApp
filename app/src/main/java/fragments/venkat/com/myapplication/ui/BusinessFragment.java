package fragments.venkat.com.myapplication.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fragments.venkat.com.myapplication.R;
import fragments.venkat.com.myapplication.adapter.BusinessListAdapter;
import fragments.venkat.com.myapplication.api.NewYorkTimesApi;
import fragments.venkat.com.myapplication.controller.Access;
import fragments.venkat.com.myapplication.model.Business;
import fragments.venkat.com.myapplication.model.Result;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static fragments.venkat.com.myapplication.util.Constant.apiKey;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */

public class BusinessFragment extends Fragment {
    private final static String TAG = PoliticsFragment.class.getSimpleName();

    private NewYorkTimesApi mNewYorkTimesApi;
    private BusinessListAdapter mBusinessListAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_business, container, false);
        mNewYorkTimesApi = Access.getInstance().getNewYorkTimesAPi();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewBusiness);
        mBusinessListAdapter = new BusinessListAdapter();
        getBusiness();

        recyclerView.setAdapter(mBusinessListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void getBusiness() {

        mNewYorkTimesApi.getBusinessCategory(apiKey, new Callback<Business>() {
            @Override
            public void success(Business business, Response response) {
                List<Result> resultList = business.getResults();

                mBusinessListAdapter.setBusinessListAdapter(resultList);
                mBusinessListAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, error+"Retrofit Failure");
            }
        });
    }
}
