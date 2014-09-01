package app.buu.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements android.view.View. OnClickListener {
	private Button b1 ;
	private Button b2;
	private TextView v1;
	private TextView vi1;
	private TextView vi2;
	private TextView vi3;
	private TextView vi4;
	private TextView vi5;
	private TextView vi6;
	private TextView vi7;
	private TextView vi8;
	private TextView vi9;
	private TextView vi10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMathching();
	}
	private void ViewMathching() {
		// TODO Auto-generated method stub
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		v1 = (TextView)findViewById(R.id.textView1);
		v1.setText("Jakkit Roikong");
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		vi1 = (TextView) findViewById(R.id.textView2);
		vi1.setText("Nickname");
		vi2 = (TextView) findViewById(R.id.textView3);
		vi2.setText("Tea");
		vi3 = (TextView) findViewById(R.id.textView4);
		vi3.setText("Age");
		vi4 = (TextView) findViewById(R.id.textView5);
		vi4.setText("20");
		vi5 = (TextView) findViewById(R.id.textView6);
		vi5.setText("Weight");
		vi6 = (TextView) findViewById(R.id.textView7);
		vi6.setText("62");
		vi7 = (TextView) findViewById(R.id.textView8);
		vi7.setText("170");
		vi8 = (TextView) findViewById(R.id.textView9);
		vi8.setText("Height");
		vi9 = (TextView) findViewById(R.id.textView10);
		vi9.setText("PlayGame,PlayGuitar");
		vi10 = (TextView) findViewById(R.id.textView11);
		vi10.setText("Habbit");
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			
			
			break;
		case R.id.button2:
			Intent sresume = new Intent(MainActivity.this,Resume.class);
			startActivity(sresume);
			break;
	

		default:
			break;
		}
		
	}
	
}
