package fragments.venkat.com.myapplication;

/**
 * Created by venkatgonuguntala on 8/7/16.
 */

public class GridAdapter extends RecyclerViewAdapter {
    private final GridFragment.onRecipeSelectedInterface mListner;

    public GridAdapter(GridFragment.onRecipeSelectedInterface listener) {
        mListner = listener;
    }

    @Override
    protected int getLayout() {
        return R.layout.grid_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListner.onGridRecipeSelected(index);
    }
}
