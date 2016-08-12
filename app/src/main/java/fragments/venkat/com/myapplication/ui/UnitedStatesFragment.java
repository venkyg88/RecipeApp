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
import fragments.venkat.com.myapplication.adapter.HealthListAdapter;
import fragments.venkat.com.myapplication.adapter.USListAdpater;
import fragments.venkat.com.myapplication.api.NewYorkTimesApi;
import fragments.venkat.com.myapplication.controller.Access;
import fragments.venkat.com.myapplication.model.Health;
import fragments.venkat.com.myapplication.model.Result;
import fragments.venkat.com.myapplication.model.UnitedStates;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static fragments.venkat.com.myapplication.util.Constant.apiKey;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */

public class UnitedStatesFragment  extends Fragment{
    public static final String TAG = UnitedStates.class.getSimpleName();

    private NewYorkTimesApi mNewYorkTimesApi;
    private USListAdpater mUSListAdpater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmnt_unitedstates, container, false);

        mNewYorkTimesApi = Access.getInstance().getNewYorkTimesAPi();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewUS);
        mUSListAdpater = new USListAdpater();
        getUSNews();

        recyclerView.setAdapter(mUSListAdpater);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void getUSNews() {

        mNewYorkTimesApi.getUnitedStatesCategory(apiKey, new Callback<UnitedStates>() {
            @Override
            public void success(UnitedStates health, Response response) {
                List<Result> resultList = health.getResults();

                mUSListAdpater.setUSListAdapter(resultList);
                mUSListAdpater.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, error+"Retrofit Failure");
            }
        });
    }
}
