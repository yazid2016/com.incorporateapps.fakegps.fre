package com.google.android.gms.internal;

import android.os.IBinder;

class zzri$zza$zza
  implements zzri
{
  private IBinder zzoz;
  
  zzri$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  /* Error */
  public void zza(zzrh paramzzrh, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +60 -> 78
    //   21: aload_1
    //   22: invokeinterface 36 1 0
    //   27: astore_1
    //   28: aload 4
    //   30: aload_1
    //   31: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 4
    //   36: aload_2
    //   37: invokevirtual 42	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 42	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/zzri$zza$zza:zzoz	Landroid/os/IBinder;
    //   50: iconst_1
    //   51: aload 4
    //   53: aload 5
    //   55: iconst_0
    //   56: invokeinterface 48 5 0
    //   61: pop
    //   62: aload 5
    //   64: invokevirtual 51	android/os/Parcel:readException	()V
    //   67: aload 5
    //   69: invokevirtual 54	android/os/Parcel:recycle	()V
    //   72: aload 4
    //   74: invokevirtual 54	android/os/Parcel:recycle	()V
    //   77: return
    //   78: aconst_null
    //   79: astore_1
    //   80: goto -52 -> 28
    //   83: astore_1
    //   84: aload 5
    //   86: invokevirtual 54	android/os/Parcel:recycle	()V
    //   89: aload 4
    //   91: invokevirtual 54	android/os/Parcel:recycle	()V
    //   94: aload_1
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	zza
    //   0	96	1	paramzzrh	zzrh
    //   0	96	2	paramString1	String
    //   0	96	3	paramString2	String
    //   3	87	4	localParcel1	android.os.Parcel
    //   8	77	5	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	83	finally
    //   21	28	83	finally
    //   28	67	83	finally
  }
  
  /* Error */
  public void zzb(zzrh paramzzrh, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +60 -> 78
    //   21: aload_1
    //   22: invokeinterface 36 1 0
    //   27: astore_1
    //   28: aload 4
    //   30: aload_1
    //   31: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   34: aload 4
    //   36: aload_2
    //   37: invokevirtual 42	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 42	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 15	com/google/android/gms/internal/zzri$zza$zza:zzoz	Landroid/os/IBinder;
    //   50: iconst_2
    //   51: aload 4
    //   53: aload 5
    //   55: iconst_0
    //   56: invokeinterface 48 5 0
    //   61: pop
    //   62: aload 5
    //   64: invokevirtual 51	android/os/Parcel:readException	()V
    //   67: aload 5
    //   69: invokevirtual 54	android/os/Parcel:recycle	()V
    //   72: aload 4
    //   74: invokevirtual 54	android/os/Parcel:recycle	()V
    //   77: return
    //   78: aconst_null
    //   79: astore_1
    //   80: goto -52 -> 28
    //   83: astore_1
    //   84: aload 5
    //   86: invokevirtual 54	android/os/Parcel:recycle	()V
    //   89: aload 4
    //   91: invokevirtual 54	android/os/Parcel:recycle	()V
    //   94: aload_1
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	zza
    //   0	96	1	paramzzrh	zzrh
    //   0	96	2	paramString1	String
    //   0	96	3	paramString2	String
    //   3	87	4	localParcel1	android.os.Parcel
    //   8	77	5	localParcel2	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	83	finally
    //   21	28	83	finally
    //   28	67	83	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzri.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */