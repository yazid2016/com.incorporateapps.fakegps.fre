package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$5
  extends zzh
{
  Cast$CastApi$zza$5(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    try
    {
      paramzze.zzb(this);
      return;
    }
    catch (IllegalStateException paramzze)
    {
      zzbj(2001);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.CastApi.zza.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */