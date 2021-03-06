package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrp;

public final class AnalyticsReceiver
  extends BroadcastReceiver
{
  static zzrp zzOM;
  static Boolean zzON;
  static Object zzqy = new Object();
  
  public static boolean zzY(Context paramContext)
  {
    zzx.zzz(paramContext);
    if (zzON != null) {
      return zzON.booleanValue();
    }
    boolean bool = zzam.zza(paramContext, AnalyticsReceiver.class, false);
    zzON = Boolean.valueOf(bool);
    return bool;
  }
  
  public final void onReceive(Context paramContext, Intent arg2)
  {
    Object localObject = zzf.zzaa(paramContext);
    localzzaf = ((zzf)localObject).zzjm();
    ??? = ???.getAction();
    if (((zzf)localObject).zzjn().zzkr()) {
      localzzaf.zza("Device AnalyticsReceiver got", ???);
    }
    for (;;)
    {
      boolean bool;
      if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(???))
      {
        bool = AnalyticsService.zzZ(paramContext);
        localObject = new Intent(paramContext, AnalyticsService.class);
        ((Intent)localObject).setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      }
      synchronized (zzqy)
      {
        paramContext.startService((Intent)localObject);
        if (!bool)
        {
          return;
          localzzaf.zza("Local AnalyticsReceiver got", ???);
          continue;
        }
        try
        {
          if (zzOM == null)
          {
            paramContext = new zzrp(paramContext, 1, "Analytics WakeLock");
            zzOM = paramContext;
            paramContext.setReferenceCounted(false);
          }
          zzOM.acquire(1000L);
        }
        catch (SecurityException paramContext)
        {
          for (;;)
          {
            localzzaf.zzbg("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          }
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.AnalyticsReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */