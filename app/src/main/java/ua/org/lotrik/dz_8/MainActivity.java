package ua.org.lotrik.dz_8;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = (ImageView)findViewById(R.id.imageView);
        final ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        final ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        final ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        final ImageView imageView5 = (ImageView)findViewById(R.id.imageView5);
        final ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        final ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
        final ImageView imageView8 = (ImageView)findViewById(R.id.imageView8);
        final ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
        final Button newGame = (Button)findViewById(R.id.newGame);
        imageView.setBackgroundColor(Color.WHITE);
        imageView2.setBackgroundColor(Color.WHITE);
        imageView3.setBackgroundColor(Color.WHITE);
        imageView4.setBackgroundColor(Color.WHITE);
        imageView5.setBackgroundColor(Color.WHITE);
        imageView6.setBackgroundColor(Color.WHITE);
        imageView7.setBackgroundColor(Color.WHITE);
        imageView8.setBackgroundColor(Color.WHITE);
        imageView9.setBackgroundColor(Color.WHITE);

        final View.OnClickListener click = new View.OnClickListener() {
            int x=0;
            int[] pressed = {0,0,0,0,0,0,0,0,0};
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageView:
                        if (x==0 && pressed[0] == 0) {
                            imageView.setBackgroundResource(R.drawable.x);
                            pressed[0]++;
                            x++;
                        } else if (x>0 && pressed[0] == 0){
                            imageView.setBackgroundResource(R.drawable.o);
                            pressed[0]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView2:
                        if (x==0 && pressed[1] == 0) {
                            imageView2.setBackgroundResource(R.drawable.x);
                            pressed[1]++;
                            x++;
                        } else if (x>0 && pressed[1] == 0){
                            imageView2.setBackgroundResource(R.drawable.o);
                            pressed[1]++;
                            x=0;
                        };
                        break;
                    case R.id.imageView3:
                        if (x==0 && pressed[2] == 0) {
                            imageView3.setBackgroundResource(R.drawable.x);
                            pressed[2]++;
                            x++;
                        } else if (x>0 && pressed[2] == 0){
                            imageView3.setBackgroundResource(R.drawable.o);
                            pressed[2]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView4:
                        if (x==0 && pressed[3] == 0) {
                            imageView4.setBackgroundResource(R.drawable.x);
                            pressed[3]++;
                            x++;
                        } else if (x>0 && pressed[3] == 0){
                            imageView4.setBackgroundResource(R.drawable.o);
                            pressed[3]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView5:
                        if (x==0 && pressed[4] == 0) {
                            imageView5.setBackgroundResource(R.drawable.x);
                            pressed[4]++;
                            x++;
                        } else if (x>0 && pressed[4] == 0){
                            imageView5.setBackgroundResource(R.drawable.o);
                            pressed[4]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView6:
                        if (x==0 && pressed[5] == 0) {
                            imageView6.setBackgroundResource(R.drawable.x);
                            pressed[5]++;
                            x++;
                        } else if (x>0 && pressed[5] == 0){
                            imageView6.setBackgroundResource(R.drawable.o);
                            pressed[5]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView7:
                        if (x==0 && pressed[6] == 0) {
                            imageView7.setBackgroundResource(R.drawable.x);
                            pressed[6]++;
                            x++;
                        } else if (x>0 && pressed[6] == 0){
                            imageView7.setBackgroundResource(R.drawable.o);
                            pressed[6]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView8:
                        if (x==0 && pressed[7] == 0) {
                            imageView8.setBackgroundResource(R.drawable.x);
                            pressed[7]++;
                            x++;
                        } else if (x>0 && pressed[7] == 0){
                            imageView8.setBackgroundResource(R.drawable.o);
                            pressed[7]++;
                            x=0;
                        }
                        break;
                    case R.id.imageView9:
                        if (x==0 && pressed[8] == 0) {
                            imageView9.setBackgroundResource(R.drawable.x);
                            pressed[8]++;
                            x++;
                        } else if (x>0 && pressed[8] == 0){
                            imageView9.setBackgroundResource(R.drawable.o);
                            pressed[8]++;
                            x=0;
                        }
                        break;
                    case R.id.newGame:
                        imageView.setBackgroundColor(Color.WHITE);
                        imageView2.setBackgroundColor(Color.WHITE);
                        imageView3.setBackgroundColor(Color.WHITE);
                        imageView4.setBackgroundColor(Color.WHITE);
                        imageView5.setBackgroundColor(Color.WHITE);
                        imageView6.setBackgroundColor(Color.WHITE);
                        imageView7.setBackgroundColor(Color.WHITE);
                        imageView8.setBackgroundColor(Color.WHITE);
                        imageView9.setBackgroundColor(Color.WHITE);
                        x=0;
                        for (int i=0; i<pressed.length;i++)
                        {
                            pressed[i] = 0;
                        }
                        break;
                }
            }
        };
        imageView.setOnClickListener(click);
        imageView2.setOnClickListener(click);
        imageView3.setOnClickListener(click);
        imageView4.setOnClickListener(click);
        imageView5.setOnClickListener(click);
        imageView6.setOnClickListener(click);
        imageView7.setOnClickListener(click);
        imageView8.setOnClickListener(click);
        imageView9.setOnClickListener(click);
        newGame.setOnClickListener(click);
    }

}
