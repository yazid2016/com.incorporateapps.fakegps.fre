package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$ProfileSettingsLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$ProfileSettingsLoadedBinderCallback(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzV(DataHolder paramDataHolder)
  {
    zzamC.zzs(new GamesClientImpl.LoadProfileSettingsResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.ProfileSettingsLoadedBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */