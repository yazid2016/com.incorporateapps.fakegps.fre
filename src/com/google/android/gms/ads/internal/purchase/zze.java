package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgc;
import com.google.android.gms.internal.zzge.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzis;

public class zze
  extends zzge.zza
  implements ServiceConnection
{
  private final Activity mActivity;
  private zzb zzFC;
  zzh zzFD;
  private zzk zzFF;
  private Context zzFK;
  private zzgc zzFL;
  private zzf zzFM;
  private zzj zzFN;
  private String zzFO = null;
  
  public zze(Activity paramActivity)
  {
    mActivity = paramActivity;
    zzFD = zzh.zzy(mActivity.getApplicationContext());
  }
  
  /* Error */
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: iload_1
    //   1: sipush 1001
    //   4: if_icmpne +85 -> 89
    //   7: iconst_0
    //   8: istore 4
    //   10: invokestatic 58	com/google/android/gms/ads/internal/zzr:zzbM	()Lcom/google/android/gms/ads/internal/purchase/zzi;
    //   13: aload_3
    //   14: invokevirtual 64	com/google/android/gms/ads/internal/purchase/zzi:zzd	(Landroid/content/Intent;)I
    //   17: istore_1
    //   18: iload_2
    //   19: iconst_m1
    //   20: if_icmpne +70 -> 90
    //   23: invokestatic 58	com/google/android/gms/ads/internal/zzr:zzbM	()Lcom/google/android/gms/ads/internal/purchase/zzi;
    //   26: pop
    //   27: iload_1
    //   28: ifne +62 -> 90
    //   31: aload_0
    //   32: getfield 66	com/google/android/gms/ads/internal/purchase/zze:zzFF	Lcom/google/android/gms/ads/internal/purchase/zzk;
    //   35: aload_0
    //   36: getfield 31	com/google/android/gms/ads/internal/purchase/zze:zzFO	Ljava/lang/String;
    //   39: iload_2
    //   40: aload_3
    //   41: invokevirtual 72	com/google/android/gms/ads/internal/purchase/zzk:zza	(Ljava/lang/String;ILandroid/content/Intent;)Z
    //   44: ifeq +6 -> 50
    //   47: iconst_1
    //   48: istore 4
    //   50: aload_0
    //   51: getfield 74	com/google/android/gms/ads/internal/purchase/zze:zzFL	Lcom/google/android/gms/internal/zzgc;
    //   54: iload_1
    //   55: invokeinterface 80 2 0
    //   60: aload_0
    //   61: getfield 33	com/google/android/gms/ads/internal/purchase/zze:mActivity	Landroid/app/Activity;
    //   64: invokevirtual 83	android/app/Activity:finish	()V
    //   67: aload_0
    //   68: aload_0
    //   69: getfield 74	com/google/android/gms/ads/internal/purchase/zze:zzFL	Lcom/google/android/gms/internal/zzgc;
    //   72: invokeinterface 87 1 0
    //   77: iload 4
    //   79: iload_2
    //   80: aload_3
    //   81: invokevirtual 90	com/google/android/gms/ads/internal/purchase/zze:zza	(Ljava/lang/String;ZILandroid/content/Intent;)V
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 31	com/google/android/gms/ads/internal/purchase/zze:zzFO	Ljava/lang/String;
    //   89: return
    //   90: aload_0
    //   91: getfield 47	com/google/android/gms/ads/internal/purchase/zze:zzFD	Lcom/google/android/gms/ads/internal/purchase/zzh;
    //   94: aload_0
    //   95: getfield 92	com/google/android/gms/ads/internal/purchase/zze:zzFM	Lcom/google/android/gms/ads/internal/purchase/zzf;
    //   98: invokevirtual 95	com/google/android/gms/ads/internal/purchase/zzh:zza	(Lcom/google/android/gms/ads/internal/purchase/zzf;)V
    //   101: goto -51 -> 50
    //   104: astore_3
    //   105: ldc 97
    //   107: invokestatic 103	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   110: aload_0
    //   111: getfield 33	com/google/android/gms/ads/internal/purchase/zze:mActivity	Landroid/app/Activity;
    //   114: invokevirtual 83	android/app/Activity:finish	()V
    //   117: aload_0
    //   118: aconst_null
    //   119: putfield 31	com/google/android/gms/ads/internal/purchase/zze:zzFO	Ljava/lang/String;
    //   122: return
    //   123: astore_3
    //   124: aload_0
    //   125: aconst_null
    //   126: putfield 31	com/google/android/gms/ads/internal/purchase/zze:zzFO	Ljava/lang/String;
    //   129: aload_3
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	zze
    //   0	131	1	paramInt1	int
    //   0	131	2	paramInt2	int
    //   0	131	3	paramIntent	Intent
    //   8	70	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	18	104	android/os/RemoteException
    //   23	27	104	android/os/RemoteException
    //   31	47	104	android/os/RemoteException
    //   50	84	104	android/os/RemoteException
    //   90	101	104	android/os/RemoteException
    //   10	18	123	finally
    //   23	27	123	finally
    //   31	47	123	finally
    //   50	84	123	finally
    //   90	101	123	finally
    //   105	117	123	finally
  }
  
  public void onCreate()
  {
    Object localObject = GInAppPurchaseManagerInfoParcel.zzc(mActivity.getIntent());
    zzFN = zzFy;
    zzFF = zzrI;
    zzFL = zzFw;
    zzFC = new zzb(mActivity.getApplicationContext());
    zzFK = zzFx;
    if (mActivity.getResources().getConfiguration().orientation == 2) {
      mActivity.setRequestedOrientation(zzr.zzbE().zzhv());
    }
    for (;;)
    {
      localObject = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      ((Intent)localObject).setPackage("com.android.vending");
      mActivity.bindService((Intent)localObject, this, 1);
      return;
      mActivity.setRequestedOrientation(zzr.zzbE().zzhw());
    }
  }
  
  public void onDestroy()
  {
    mActivity.unbindService(this);
    zzFC.destroy();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    zzFC.zzN(paramIBinder);
    try
    {
      zzFO = zzFF.zzfZ();
      paramComponentName = zzFC.zzb(mActivity.getPackageName(), zzFL.getProductId(), zzFO);
      paramIBinder = (PendingIntent)paramComponentName.getParcelable("BUY_INTENT");
      if (paramIBinder == null)
      {
        int i = zzr.zzbM().zzd(paramComponentName);
        zzFL.recordPlayBillingResolution(i);
        zza(zzFL.getProductId(), false, i, null);
        mActivity.finish();
        return;
      }
      zzFM = new zzf(zzFL.getProductId(), zzFO);
      zzFD.zzb(zzFM);
      mActivity.startIntentSenderForResult(paramIBinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
      return;
    }
    catch (RemoteException paramComponentName)
    {
      zzin.zzd("Error when connecting in-app billing service", paramComponentName);
      mActivity.finish();
      return;
    }
    catch (IntentSender.SendIntentException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    zzFC.destroy();
  }
  
  protected void zza(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent)
  {
    if (zzFN != null) {
      zzFN.zza(paramString, paramBoolean, paramInt, paramIntent, zzFM);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */