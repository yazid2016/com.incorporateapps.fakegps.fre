package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzj
  extends zzw.zza
{
  private final AppEventListener zzun;
  
  public zzj(AppEventListener paramAppEventListener)
  {
    zzun = paramAppEventListener;
  }
  
  public final void onAppEvent(String paramString1, String paramString2)
  {
    zzun.onAppEvent(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */