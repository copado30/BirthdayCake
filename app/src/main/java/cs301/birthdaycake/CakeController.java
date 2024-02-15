package cs301.birthdaycake;

public class CakeController {
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
}
