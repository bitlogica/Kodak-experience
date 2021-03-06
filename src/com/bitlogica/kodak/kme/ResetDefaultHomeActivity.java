package com.bitlogica.kodak.kme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ResetDefaultHomeActivity extends Activity {

	public ResetDefaultHomeActivity() { }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getBaseContext().sendBroadcast(new Intent("LAUNCHER_ENABLE_SIMPLE_UI").addCategory("KODAK_UI"));
		finish();
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onNewIntent(Intent intent) {
		getBaseContext().sendBroadcast(new Intent("LAUNCHER_ENABLE_SIMPLE_UI").addCategory("KODAK_UI"));
		finish();
		super.onNewIntent(intent);
	}


}



//final Intent intent=new Intent();
//intent.setAction(Intent.ACTION_MAIN);
//intent.addCategory(Intent.CATEGORY_HOME);
//startActivity(intent);

//PackageManager p = getPackageManager();
//ComponentName cN = new ComponentName(getBaseContext(), FakeHome.class);
//p.setComponentEnabledSetting(cN, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
//Intent selector = new Intent(Intent.ACTION_MAIN);
//selector.addCategory(Intent.CATEGORY_HOME);            
//startActivity(selector);
//p.setComponentEnabledSetting(cN, PackageManager.COMPONENT_ENABLED_STATE_DISABLED,    PackageManager.DONT_KILL_APP);


//ComponentName componentName = new ComponentName(getBaseContext(), FakeHome.class);
//PackageManager pm = getPackageManager();
//pm.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
//Intent i=new Intent(Intent.ACTION_MAIN);
//i.addCategory(Intent.CATEGORY_HOME);
//i.putExtra("default", false);
//i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//getApplicationContext().startActivity(i);
//pm.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
//
//Toast.makeText(getApplicationContext(), "Done again", Toast.LENGTH_LONG).show();
