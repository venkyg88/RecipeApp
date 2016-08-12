package fragments.venkat.com.myapplication.adapter;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import fragments.venkat.com.myapplication.R;
import fragments.venkat.com.myapplication.model.Result;
import fragments.venkat.com.myapplication.ui.DetailFragment;
import fragments.venkat.com.myapplication.ui.NewsViewPagerFragment;

/**
 * Created by venkatgonuguntala on 8/11/16.
 */
public class HealthListAdapter extends RecyclerView.Adapter{
    public static final String TITLE = "title";
    public static final String DATE_PUBLISHED = "date_published";
    private List<Result> mResult;

    public void setHealthListAdapter(List<Result> results) {
        mResult = results;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_list_item, parent, false);
        return new HealthListAdapter.HealthListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((HealthListAdapter.HealthListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        if (mResult != null) {
            return mResult.size();
        }
        return 0;
    }

    private class HealthListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTitleTextView;
        private TextView mDateTextView;
        public HealthListViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.itemTitle);
            mDateTextView = (TextView) itemView.findViewById(R.id.itemDatePublished);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mTitleTextView.setText(mResult.get(position).getTitle());
            mDateTextView.setText(mResult.get(position).getPublishedDate());
        }

        @Override
        public void onClick(View v) {

        }
    }
}
