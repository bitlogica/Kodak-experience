package com.bitlogica.kodak.kme;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

public class ResetDefaultHome extends Activity {

	public ResetDefaultHome() { }

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
	}


	@Override
	protected void onResume() {
		super.onResume();
		//getApplicationContext().sendBroadcast(new Intent("LAUNCHER_ENABLE_SIMPLE_UI").addCategory("KODAK_UI"));

	   	ComponentName componentName = new ComponentName(getApplicationContext(), FakeHome.class);
        PackageManager pm = getApplicationContext().getPackageManager();
        pm.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
        Intent i=new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        i.putExtra("default", false);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplicationContext().startActivity(i);
        pm.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
		
		Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_LONG).show();
		finish();
	}


}
