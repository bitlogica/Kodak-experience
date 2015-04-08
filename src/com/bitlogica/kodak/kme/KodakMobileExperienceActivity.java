package com.bitlogica.kodak.kme;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class KodakMobileExperienceActivity extends AppWidgetProvider {

   @Override
   public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
      for(int i=0; i<appWidgetIds.length; i++){
	      int currentWidgetId = appWidgetIds[i];
	      Intent intent = new Intent(Intent.ACTION_MAIN);
	      intent.setComponent(new ComponentName("com.bitlogica.kodak.kme", "com.bitlogica.kodak.kme.ResetDefaultHomeActivity"));
	      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	      PendingIntent pending = PendingIntent.getActivity(context, 0, intent, 0);
	      RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
	      views.setOnClickPendingIntent(R.id.imageButton1, pending);
	      appWidgetManager.updateAppWidget(currentWidgetId,views);
      }
   }	
   
   
}