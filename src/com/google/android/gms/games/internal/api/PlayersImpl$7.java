package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

class PlayersImpl$7
  extends PlayersImpl.LoadPlayersImpl
{
  PlayersImpl$7(PlayersImpl paramPlayersImpl, GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zza(this, "played_with", zzaGL, true, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.PlayersImpl.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */