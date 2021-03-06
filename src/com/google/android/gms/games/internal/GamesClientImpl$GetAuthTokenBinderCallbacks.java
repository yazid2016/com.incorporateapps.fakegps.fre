package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$GetAuthTokenBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  public GamesClientImpl$GetAuthTokenBinderCallbacks(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzg(int paramInt, String paramString)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    zzamC.zzs(new GamesClientImpl.GetTokenResultImpl(localStatus, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GetAuthTokenBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */