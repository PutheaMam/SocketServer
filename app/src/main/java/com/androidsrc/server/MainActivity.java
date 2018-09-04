package com.androidsrc.server;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import java.net.ServerSocket;

public class MainActivity extends Activity {

	Server server;
	TextView info ,infoip, msg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		info = (TextView) findViewById(R.id.info);
		infoip = (TextView) findViewById(R.id.infoip);
		msg = (TextView) findViewById(R.id.msg);
		server = new Server(this);
		infoip.setText(server.getIpAddress());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		server.onDestroy();
	}


}