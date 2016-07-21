package com.google.android.gms.ads.internal;

import android.os.Handler;

public class zzq$zza
{
  private final Handler mHandler;
  
  public zzq$zza(Handler paramHandler)
  {
    mHandler = paramHandler;
  }
  
  public boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    return mHandler.postDelayed(paramRunnable, paramLong);
  }
  
  public void removeCallbacks(Runnable paramRunnable)
  {
    mHandler.removeCallbacks(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzq.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */