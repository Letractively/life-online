package it.bdsir.life_online;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ActivityMyPosition_ extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_my_position_);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_activity_my_position_, menu);
		return true;
	}

}
