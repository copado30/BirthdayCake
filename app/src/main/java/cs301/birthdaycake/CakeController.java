package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{
    //instance variables

    private CakeView cakeView;
    private CakeModel cakeModel;


    /*
        IMPORTANT METHOD (findViewById())
     */
    public CakeController(CakeView passedView ){
        cakeView = passedView;
        cakeModel = cakeView.getCakeModel();
    }
    @Override
    public void onClick(View v) {
        Log.d("cake","click!");
    }
}
