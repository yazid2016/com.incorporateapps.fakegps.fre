package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;

final class zzqd$1
  extends Api.zza
{
  public final zzqc zzo(Context paramContext, Looper paramLooper, zzf paramzzf, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return new zzqc(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqd.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */