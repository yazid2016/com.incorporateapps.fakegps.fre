package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.signin.internal.zzh;

final class zzrl$2
  extends Api.zza
{
  public final zzh zza(Context paramContext, Looper paramLooper, zzf paramzzf, zzrl.zza paramzza, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return new zzh(paramContext, paramLooper, false, paramzzf, paramzza.zzFF(), paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */