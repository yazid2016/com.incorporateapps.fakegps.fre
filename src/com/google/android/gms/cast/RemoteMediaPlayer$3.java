package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

class RemoteMediaPlayer$3
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$3(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, GoogleApiClient paramGoogleApiClient2, TextTrackStyle paramTextTrackStyle)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze arg1)
  {
    synchronized (RemoteMediaPlayer.zze(zzabK))
    {
      RemoteMediaPlayer.zzf(zzabK).zzc(zzabL);
      try
      {
        RemoteMediaPlayer.zzg(zzabK).zza(zzacm, zzabN);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          zza(zzq(new Status(2100)));
          RemoteMediaPlayer.zzf(zzabK).zzc(null);
        }
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
      finally
      {
        RemoteMediaPlayer.zzf(zzabK).zzc(null);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */