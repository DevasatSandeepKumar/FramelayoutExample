package android.firebase.com.framelayoutexample;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private ImageView image;
    private TextView text;
    private FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame = (FrameLayout) findViewById(R.id.framelayout);
        text = (TextView) findViewById(R.id.frameText);
        image = (ImageView) findViewById(R.id.frameImage);

        // add a new element to the FrameLayout
        TextView newText = new TextView(this);
        newText.setText("This is sample frame layout example");
        newText.setTextColor(Color.BLUE);
        newText.setTextSize(20);
        frame.addView(newText);

        image.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // change the visibility mode of the TextView
                if(text.getVisibility() == View.GONE) {
                    text.setVisibility(View.VISIBLE);
                    frame.setBackgroundColor(Color.GREEN);
                } else {
                    text.setVisibility(View.GONE);
                }

            }
        });
    }

}
