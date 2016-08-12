package fragments.venkat.com.myapplication.ui;

import fragments.venkat.com.myapplication.Recipes;
import fragments.venkat.com.myapplication.ui.CheckBoxFragment;

/**
 * Created by venkatgonuguntala on 8/6/16.
 */

public class IngredientsFragment extends CheckBoxFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
