package org.infiniteroot.dices.activity;

import org.infiniteroot.dices.R;
import org.infiniteroot.dices.randomengine.RandomEngine;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView resultDices = null;
	private Button rollDices = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initViews();
		setControllers();
	}
	
	private void setControllers() {
		rollDices.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int res = RandomEngine.getFace(6);
				resultDices.setText(""+res);
			}
		});
	}

	private void initViews() {
		resultDices = (TextView) findViewById(R.id.resultDicesTextView);
		rollDices = (Button)findViewById(R.id.rollButton);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
