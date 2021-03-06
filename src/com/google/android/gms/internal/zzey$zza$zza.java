package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import java.util.List;

class zzey$zza$zza
  implements zzey
{
  private IBinder zzoz;
  
  zzey$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void destroy()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public android.os.Bundle getInterstitialAdapterInfo()
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 27
    //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   18: bipush 18
    //   20: aload_2
    //   21: aload_3
    //   22: iconst_0
    //   23: invokeinterface 37 5 0
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 40	android/os/Parcel:readException	()V
    //   33: aload_3
    //   34: invokevirtual 49	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 55	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_3
    //   44: invokeinterface 61 2 0
    //   49: checkcast 51	android/os/Bundle
    //   52: astore_1
    //   53: aload_3
    //   54: invokevirtual 43	android/os/Parcel:recycle	()V
    //   57: aload_2
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	zza
    //   52	13	1	localBundle	android.os.Bundle
    //   68	10	1	localObject	Object
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  public zzd getView()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      zzd localzzd = zzd.zza.zzbs(localParcel2.readStrongBinder());
      return localzzd;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isInitialized()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void pause()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void resume()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void showInterstitial()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void showVideo()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 27
    //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +61 -> 79
    //   21: aload 4
    //   23: iconst_1
    //   24: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   27: aload_1
    //   28: aload 4
    //   30: iconst_0
    //   31: invokevirtual 90	com/google/android/gms/ads/internal/client/AdRequestParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   34: aload 4
    //   36: aload_2
    //   37: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   50: bipush 20
    //   52: aload 4
    //   54: aload 5
    //   56: iconst_0
    //   57: invokeinterface 37 5 0
    //   62: pop
    //   63: aload 5
    //   65: invokevirtual 40	android/os/Parcel:readException	()V
    //   68: aload 5
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload 4
    //   75: invokevirtual 43	android/os/Parcel:recycle	()V
    //   78: return
    //   79: aload 4
    //   81: iconst_0
    //   82: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   85: goto -51 -> 34
    //   88: astore_1
    //   89: aload 5
    //   91: invokevirtual 43	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: invokevirtual 43	android/os/Parcel:recycle	()V
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	zza
    //   0	101	1	paramAdRequestParcel	AdRequestParcel
    //   0	101	2	paramString1	String
    //   0	101	3	paramString2	String
    //   3	92	4	localParcel1	Parcel
    //   8	82	5	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	88	finally
    //   21	34	88	finally
    //   34	68	88	finally
    //   79	85	88	finally
  }
  
  /* Error */
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.zza paramzza, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 7
    //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 8
    //   13: aload 7
    //   15: ldc 27
    //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: ifnull +101 -> 122
    //   24: aload_1
    //   25: invokeinterface 98 1 0
    //   30: astore_1
    //   31: aload 7
    //   33: aload_1
    //   34: invokevirtual 101	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +89 -> 127
    //   41: aload 7
    //   43: iconst_1
    //   44: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   47: aload_2
    //   48: aload 7
    //   50: iconst_0
    //   51: invokevirtual 90	com/google/android/gms/ads/internal/client/AdRequestParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   54: aload 7
    //   56: aload_3
    //   57: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload 6
    //   62: astore_1
    //   63: aload 4
    //   65: ifnull +11 -> 76
    //   68: aload 4
    //   70: invokeinterface 104 1 0
    //   75: astore_1
    //   76: aload 7
    //   78: aload_1
    //   79: invokevirtual 101	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   82: aload 7
    //   84: aload 5
    //   86: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   93: bipush 10
    //   95: aload 7
    //   97: aload 8
    //   99: iconst_0
    //   100: invokeinterface 37 5 0
    //   105: pop
    //   106: aload 8
    //   108: invokevirtual 40	android/os/Parcel:readException	()V
    //   111: aload 8
    //   113: invokevirtual 43	android/os/Parcel:recycle	()V
    //   116: aload 7
    //   118: invokevirtual 43	android/os/Parcel:recycle	()V
    //   121: return
    //   122: aconst_null
    //   123: astore_1
    //   124: goto -93 -> 31
    //   127: aload 7
    //   129: iconst_0
    //   130: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   133: goto -79 -> 54
    //   136: astore_1
    //   137: aload 8
    //   139: invokevirtual 43	android/os/Parcel:recycle	()V
    //   142: aload 7
    //   144: invokevirtual 43	android/os/Parcel:recycle	()V
    //   147: aload_1
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	zza
    //   0	149	1	paramzzd	zzd
    //   0	149	2	paramAdRequestParcel	AdRequestParcel
    //   0	149	3	paramString1	String
    //   0	149	4	paramzza	com.google.android.gms.ads.internal.reward.mediation.client.zza
    //   0	149	5	paramString2	String
    //   1	60	6	localObject	Object
    //   6	137	7	localParcel1	Parcel
    //   11	127	8	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   13	20	136	finally
    //   24	31	136	finally
    //   31	37	136	finally
    //   41	54	136	finally
    //   54	60	136	finally
    //   68	76	136	finally
    //   76	111	136	finally
    //   127	133	136	finally
  }
  
  /* Error */
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 7
    //   13: aload 6
    //   15: ldc 27
    //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: ifnull +93 -> 114
    //   24: aload_1
    //   25: invokeinterface 98 1 0
    //   30: astore_1
    //   31: aload 6
    //   33: aload_1
    //   34: invokevirtual 101	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +81 -> 119
    //   41: aload 6
    //   43: iconst_1
    //   44: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   47: aload_2
    //   48: aload 6
    //   50: iconst_0
    //   51: invokevirtual 90	com/google/android/gms/ads/internal/client/AdRequestParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   54: aload 6
    //   56: aload_3
    //   57: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload 5
    //   62: astore_1
    //   63: aload 4
    //   65: ifnull +11 -> 76
    //   68: aload 4
    //   70: invokeinterface 108 1 0
    //   75: astore_1
    //   76: aload 6
    //   78: aload_1
    //   79: invokevirtual 101	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   82: aload_0
    //   83: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   86: iconst_3
    //   87: aload 6
    //   89: aload 7
    //   91: iconst_0
    //   92: invokeinterface 37 5 0
    //   97: pop
    //   98: aload 7
    //   100: invokevirtual 40	android/os/Parcel:readException	()V
    //   103: aload 7
    //   105: invokevirtual 43	android/os/Parcel:recycle	()V
    //   108: aload 6
    //   110: invokevirtual 43	android/os/Parcel:recycle	()V
    //   113: return
    //   114: aconst_null
    //   115: astore_1
    //   116: goto -85 -> 31
    //   119: aload 6
    //   121: iconst_0
    //   122: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   125: goto -71 -> 54
    //   128: astore_1
    //   129: aload 7
    //   131: invokevirtual 43	android/os/Parcel:recycle	()V
    //   134: aload 6
    //   136: invokevirtual 43	android/os/Parcel:recycle	()V
    //   139: aload_1
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	zza
    //   0	141	1	paramzzd	zzd
    //   0	141	2	paramAdRequestParcel	AdRequestParcel
    //   0	141	3	paramString	String
    //   0	141	4	paramzzez	zzez
    //   1	60	5	localObject	Object
    //   6	129	6	localParcel1	Parcel
    //   11	119	7	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   13	20	128	finally
    //   24	31	128	finally
    //   31	37	128	finally
    //   41	54	128	finally
    //   54	60	128	finally
    //   68	76	128	finally
    //   76	103	128	finally
    //   119	125	128	finally
  }
  
  /* Error */
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 7
    //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 8
    //   13: aload 7
    //   15: ldc 27
    //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: ifnull +101 -> 122
    //   24: aload_1
    //   25: invokeinterface 98 1 0
    //   30: astore_1
    //   31: aload 7
    //   33: aload_1
    //   34: invokevirtual 101	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload_2
    //   38: ifnull +89 -> 127
    //   41: aload 7
    //   43: iconst_1
    //   44: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   47: aload_2
    //   48: aload 7
    //   50: iconst_0
    //   51: invokevirtual 90	com/google/android/gms/ads/internal/client/AdRequestParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   54: aload 7
    //   56: aload_3
    //   57: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   60: aload 7
    //   62: aload 4
    //   64: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   67: aload 6
    //   69: astore_1
    //   70: aload 5
    //   72: ifnull +11 -> 83
    //   75: aload 5
    //   77: invokeinterface 108 1 0
    //   82: astore_1
    //   83: aload 7
    //   85: aload_1
    //   86: invokevirtual 101	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   89: aload_0
    //   90: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   93: bipush 7
    //   95: aload 7
    //   97: aload 8
    //   99: iconst_0
    //   100: invokeinterface 37 5 0
    //   105: pop
    //   106: aload 8
    //   108: invokevirtual 40	android/os/Parcel:readException	()V
    //   111: aload 8
    //   113: invokevirtual 43	android/os/Parcel:recycle	()V
    //   116: aload 7
    //   118: invokevirtual 43	android/os/Parcel:recycle	()V
    //   121: return
    //   122: aconst_null
    //   123: astore_1
    //   124: goto -93 -> 31
    //   127: aload 7
    //   129: iconst_0
    //   130: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   133: goto -79 -> 54
    //   136: astore_1
    //   137: aload 8
    //   139: invokevirtual 43	android/os/Parcel:recycle	()V
    //   142: aload 7
    //   144: invokevirtual 43	android/os/Parcel:recycle	()V
    //   147: aload_1
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	zza
    //   0	149	1	paramzzd	zzd
    //   0	149	2	paramAdRequestParcel	AdRequestParcel
    //   0	149	3	paramString1	String
    //   0	149	4	paramString2	String
    //   0	149	5	paramzzez	zzez
    //   1	67	6	localObject	Object
    //   6	137	7	localParcel1	Parcel
    //   11	127	8	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   13	20	136	finally
    //   24	31	136	finally
    //   31	37	136	finally
    //   41	54	136	finally
    //   54	67	136	finally
    //   75	83	136	finally
    //   83	111	136	finally
    //   127	133	136	finally
  }
  
  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    label175:
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (paramzzd != null)
        {
          paramzzd = paramzzd.asBinder();
          localParcel1.writeStrongBinder(paramzzd);
          if (paramAdRequestParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            paramzzd = (zzd)localObject;
            if (paramzzez != null) {
              paramzzd = paramzzez.asBinder();
            }
            localParcel1.writeStrongBinder(paramzzd);
            if (paramNativeAdOptionsParcel == null) {
              break label175;
            }
            localParcel1.writeInt(1);
            paramNativeAdOptionsParcel.writeToParcel(localParcel1, 0);
            localParcel1.writeStringList(paramList);
            zzoz.transact(14, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          paramzzd = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    label159:
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (paramzzd != null)
        {
          paramzzd = paramzzd.asBinder();
          localParcel1.writeStrongBinder(paramzzd);
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
            if (paramAdRequestParcel == null) {
              break label159;
            }
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString);
            paramzzd = (zzd)localObject;
            if (paramzzez != null) {
              paramzzd = paramzzez.asBinder();
            }
            localParcel1.writeStrongBinder(paramzzd);
            zzoz.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          paramzzd = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    Object localObject = null;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    label167:
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        if (paramzzd != null)
        {
          paramzzd = paramzzd.asBinder();
          localParcel1.writeStrongBinder(paramzzd);
          if (paramAdSizeParcel != null)
          {
            localParcel1.writeInt(1);
            paramAdSizeParcel.writeToParcel(localParcel1, 0);
            if (paramAdRequestParcel == null) {
              break label167;
            }
            localParcel1.writeInt(1);
            paramAdRequestParcel.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            paramzzd = (zzd)localObject;
            if (paramzzez != null) {
              paramzzd = paramzzez.asBinder();
            }
            localParcel1.writeStrongBinder(paramzzd);
            zzoz.transact(6, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          paramzzd = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
        localParcel1.writeInt(0);
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 27
    //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +50 -> 66
    //   19: aload_3
    //   20: iconst_1
    //   21: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   24: aload_1
    //   25: aload_3
    //   26: iconst_0
    //   27: invokevirtual 90	com/google/android/gms/ads/internal/client/AdRequestParcel:writeToParcel	(Landroid/os/Parcel;I)V
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual 93	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   39: bipush 11
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 37 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 40	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 43	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 84	android/os/Parcel:writeInt	(I)V
    //   71: goto -41 -> 30
    //   74: astore_1
    //   75: aload 4
    //   77: invokevirtual 43	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 43	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	zza
    //   0	86	1	paramAdRequestParcel	AdRequestParcel
    //   0	86	2	paramString	String
    //   3	78	3	localParcel1	Parcel
    //   7	69	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	74	finally
    //   19	30	74	finally
    //   30	56	74	finally
    //   66	71	74	finally
  }
  
  public zzfb zzeF()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(15, localParcel1, localParcel2, 0);
      localParcel2.readException();
      zzfb localzzfb = zzfb.zza.zzI(localParcel2.readStrongBinder());
      return localzzfb;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public zzfc zzeG()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      zzoz.transact(16, localParcel1, localParcel2, 0);
      localParcel2.readException();
      zzfc localzzfc = zzfc.zza.zzJ(localParcel2.readStrongBinder());
      return localzzfc;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public android.os.Bundle zzeH()
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 27
    //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   18: bipush 17
    //   20: aload_2
    //   21: aload_3
    //   22: iconst_0
    //   23: invokeinterface 37 5 0
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 40	android/os/Parcel:readException	()V
    //   33: aload_3
    //   34: invokevirtual 49	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 55	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_3
    //   44: invokeinterface 61 2 0
    //   49: checkcast 51	android/os/Bundle
    //   52: astore_1
    //   53: aload_3
    //   54: invokevirtual 43	android/os/Parcel:recycle	()V
    //   57: aload_2
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	zza
    //   52	13	1	localBundle	android.os.Bundle
    //   68	10	1	localObject	Object
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  /* Error */
  public android.os.Bundle zzeI()
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 27
    //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/internal/zzey$zza$zza:zzoz	Landroid/os/IBinder;
    //   18: bipush 19
    //   20: aload_2
    //   21: aload_3
    //   22: iconst_0
    //   23: invokeinterface 37 5 0
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 40	android/os/Parcel:readException	()V
    //   33: aload_3
    //   34: invokevirtual 49	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 55	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_3
    //   44: invokeinterface 61 2 0
    //   49: checkcast 51	android/os/Bundle
    //   52: astore_1
    //   53: aload_3
    //   54: invokevirtual 43	android/os/Parcel:recycle	()V
    //   57: aload_2
    //   58: invokevirtual 43	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_3
    //   70: invokevirtual 43	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 43	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	zza
    //   52	13	1	localBundle	android.os.Bundle
    //   68	10	1	localObject	Object
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzey.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */