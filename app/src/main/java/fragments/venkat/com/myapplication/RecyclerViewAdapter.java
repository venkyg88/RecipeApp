package fragments.venkat.com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by venkatgonuguntala on 8/1/16.
 */

public abstract class RecyclerViewAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getLayout(), parent, false);
        return new ListViewHolder(view);
    }

    protected abstract int getLayout();

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Recipes.names.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTextView;
        private ImageView mImageView;
        private int mIndex;
        public ListViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.imageView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position) {
            mIndex = position;
            mImageView.setImageResource(Recipes.resourceIds[position]);
            mTextView.setText(Recipes.names[position]);
        }

        @Override
        public void onClick(View v) {
            onRecipeSelected(mIndex);
        }
    }

    protected abstract void onRecipeSelected(int index);
}
