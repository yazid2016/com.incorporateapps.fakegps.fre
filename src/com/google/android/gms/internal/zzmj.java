package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzmj
  extends zzj
{
  public zzmj(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 39, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  protected zzml zzaW(IBinder paramIBinder)
  {
    return zzml.zza.zzaY(paramIBinder);
  }
  
  public String zzgu()
  {
    return "com.google.android.gms.common.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.common.internal.service.ICommonService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */