package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeView = this.findViewById(R.id.cakeview);//cakeview is taken from the xml
        CakeController cakeController = new CakeController(cakeView);//

        Button blowButton = findViewById(R.id.blowOutButton);//reference to the button
        cakeController.onClick(blowButton);//give the cake controller the button
    }
    public void goodbye(View button){

        Log.i("button","Goodbye");

    }
}
