package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService
  extends Service
{
  public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
  public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
  public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
  private final Set zzaLI = new HashSet();
  private int zzaLJ;
  
  private void zzdY(String paramString)
  {
    synchronized (zzaLI)
    {
      zzaLI.remove(paramString);
      if (zzaLI.size() == 0) {
        stopSelf(zzaLJ);
      }
      return;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onInitializeTasks() {}
  
  public abstract int onRunTask(TaskParams paramTaskParams);
  
  public int onStartCommand(Intent arg1, int paramInt1, int paramInt2)
  {
    ???.setExtrasClassLoader(PendingCallback.class.getClassLoader());
    if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(???.getAction()))
    {
      str = ???.getStringExtra("tag");
      localParcelable = ???.getParcelableExtra("callback");
      localBundle = (Bundle)???.getParcelableExtra("extras");
      if ((localParcelable == null) || (!(localParcelable instanceof PendingCallback))) {
        Log.e("GcmTaskService", getPackageName() + " " + str + ": Could not process request, invalid callback.");
      }
    }
    while (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(???.getAction()))
    {
      String str;
      Parcelable localParcelable;
      Bundle localBundle;
      return 2;
      synchronized (zzaLI)
      {
        zzaLI.add(str);
        stopSelf(zzaLJ);
        zzaLJ = paramInt2;
        new GcmTaskService.zza(this, str, ((PendingCallback)localParcelable).getIBinder(), localBundle).start();
        return 2;
      }
    }
    onInitializeTasks();
    synchronized (zzaLI)
    {
      zzaLJ = paramInt2;
      if (zzaLI.size() == 0) {
        stopSelf(zzaLJ);
      }
      return 2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.GcmTaskService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */