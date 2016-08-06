package fragments.venkat.com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

/**
 * Created by venkatgonuguntala on 8/2/16.
 */

public class CheckBoxFragment extends Fragment {
    public static final String CHECKED_BOX_STATE = "checked_box_state";
    private CheckBox[] mCheckBox;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int index = getArguments().getInt(ViewPagerFragment.KEY_RECIPE_INDEX);
        View view = inflater.inflate(R.layout.fragment_contents, container, false);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.checkboxLayout);
        String[] contents;
        if (getArguments().getBoolean(ViewPagerFragment.IS_INGREDIENTS)) {
            contents = Recipes.ingredients[index].split("`");
        } else {
            contents = Recipes.directions[index].split("`");
        }
        mCheckBox = new CheckBox[contents.length];
        boolean [] checkBoxs = new boolean[mCheckBox.length];
        if (savedInstanceState != null && savedInstanceState.getBooleanArray(CHECKED_BOX_STATE) != null) {
            checkBoxs = savedInstanceState.getBooleanArray(CHECKED_BOX_STATE);
        }
        setUpCheckBoxes(contents, linearLayout, checkBoxs);

        return view;
    }

    private void setUpCheckBoxes(String[] contents, ViewGroup container, boolean[] checkBoxes) {
        int i = 0;
        for (String content : contents) {
            mCheckBox[i] = new CheckBox(getActivity());
            mCheckBox[i].setPadding(8, 16, 8, 16);
            mCheckBox[i].setTextSize(20f);
            mCheckBox[i].setText(content);
            container.addView(mCheckBox[i]);
            if (mCheckBox[i].isChecked()){
                mCheckBox[i].toggle();
            }
            i++;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        boolean[] checkBoxState = new boolean[mCheckBox.length];
        int i = 0;
        for (CheckBox checkBox : mCheckBox ) {
            checkBoxState[i] = checkBox.isChecked();
            i++;
        }
        outState.putBooleanArray(CHECKED_BOX_STATE, checkBoxState);
        super.onSaveInstanceState(outState);
    }
}
