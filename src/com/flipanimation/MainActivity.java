package com.flipanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	View viewRoot,view1,view2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewRoot=(View)findViewById(R.id.root);
		view1=(View)findViewById(R.id.imageView1);
		view2=(View)findViewById(R.id.imageView2);
    }
    
    public void flipIt(View v) {
		flipCard();
	}
    
    public void flipCard() {
		
		FlipAnimation flipAnimation = new FlipAnimation(view1, view2);
		 
	    if (view1.getVisibility() == View.GONE)
	    {
	        flipAnimation.reverse();
	    }
	    view1.startAnimation(flipAnimation);
	}
    
}
