package com.example.corporalevaluation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ProtocolsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_protocols);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.protocols, menu);
		return true;
	}
	
	public void exibirToastClick(View v){
		Toast.makeText(this, "Botão funcionando!", Toast.LENGTH_LONG).show();
	}

}
