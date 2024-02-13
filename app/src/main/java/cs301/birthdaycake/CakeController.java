package cs301.birthdaycake;

public class CakeController {
    //instance variables
    public boolean candlesLit;
    public int candleCount;
    public boolean frosting;
    public boolean hasCandles;
    private CakeView cakeView;
    private CakeModel cakeModel;


    /*
        IMPORTANT METHOD (findViewById())
     */
    public CakeController(CakeView passedView ){
        candlesLit = true;
        candleCount=2;
        frosting=true;
        hasCandles=true;
        cakeView = passedView;
        cakeModel = cakeView.getCakeModel();
    }
}
