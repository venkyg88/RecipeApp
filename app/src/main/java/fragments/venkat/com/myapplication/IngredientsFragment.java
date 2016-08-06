package fragments.venkat.com.myapplication;

/**
 * Created by venkatgonuguntala on 8/6/16.
 */

public class IngredientsFragment extends CheckBoxFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
