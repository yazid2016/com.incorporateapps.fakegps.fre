package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;

public class zzag
  extends zzz
{
  private boolean zzRH;
  private final AlarmManager zzRI = (AlarmManager)getContext().getSystemService("alarm");
  
  protected zzag(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private PendingIntent zzld()
  {
    Intent localIntent = new Intent(getContext(), AppMeasurementReceiver.class);
    localIntent.setAction("com.google.android.gms.measurement.UPLOAD");
    return PendingIntent.getBroadcast(getContext(), 0, localIntent, 0);
  }
  
  public void cancel()
  {
    zzjv();
    zzRH = false;
    zzRI.cancel(zzld());
  }
  
  protected void zziJ()
  {
    zzRI.cancel(zzld());
  }
  
  public void zzt(long paramLong)
  {
    zzjv();
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zzx.zza(AppMeasurementReceiver.zzY(getContext()), "Receiver not registered/enabled");
      zzx.zza(AppMeasurementService.zzZ(getContext()), "Service not registered/enabled");
      cancel();
      long l = zzjl().elapsedRealtime();
      zzRH = true;
      zzRI.setInexactRepeating(2, l + paramLong, Math.max(zzCp().zzBZ(), paramLong), zzld());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */