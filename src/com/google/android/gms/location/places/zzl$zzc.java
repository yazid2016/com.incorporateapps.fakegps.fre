package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzl$zzc
  extends zzl.zzb
{
  public zzl$zzc(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlaceBuffer zzaW(Status paramStatus)
  {
    return new PlaceBuffer(DataHolder.zzbI(paramStatus.getStatusCode()), null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzl.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */