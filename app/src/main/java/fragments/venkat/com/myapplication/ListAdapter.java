package fragments.venkat.com.myapplication;

/**
 * Created by venkatgonuguntala on 8/1/16.
 */

public class ListAdapter extends RecyclerViewAdapter {
    private final ListFragment.onRecipeSelectedInterface mListner;

    public ListAdapter(ListFragment.onRecipeSelectedInterface listener) {
        mListner = listener;
    }

    @Override
    protected int getLayout() {
        return R.layout.list_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListner.onListRecipeSelected(index);
    }

}
