package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
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
    public void onClick(View v){
        cakeModel.candlesLit = !cakeModel.candlesLit;
        Log.d("cake","click!" );
        cakeView.invalidate();//redraw the cake

    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        cakeModel.hasCandles = !cakeModel.hasCandles;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.candleCount = progress;//set the candle # to the seekbar progress
        cakeView.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //nothing
    }
}
