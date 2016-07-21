package com.google.android.gms.common.internal;

import java.util.ArrayList;

public abstract class zzj$zzc
{
  private Object mListener;
  private boolean zzalM;
  
  public zzj$zzc(zzj paramzzj, Object paramObject)
  {
    mListener = paramObject;
    zzalM = false;
  }
  
  public void unregister()
  {
    zzqO();
    synchronized (zzj.zzd(zzalL))
    {
      zzj.zzd(zzalL).remove(this);
      return;
    }
  }
  
  protected abstract void zzqM();
  
  /* Error */
  public void zzqN()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/google/android/gms/common/internal/zzj$zzc:mListener	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_0
    //   8: getfield 21	com/google/android/gms/common/internal/zzj$zzc:zzalM	Z
    //   11: ifeq +30 -> 41
    //   14: ldc 44
    //   16: new 46	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 48
    //   22: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   29: ldc 57
    //   31: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 70	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   40: pop
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: ifnull +34 -> 78
    //   47: aload_0
    //   48: aload_1
    //   49: invokevirtual 74	com/google/android/gms/common/internal/zzj$zzc:zzw	(Ljava/lang/Object;)V
    //   52: aload_0
    //   53: monitorenter
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield 21	com/google/android/gms/common/internal/zzj$zzc:zzalM	Z
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_0
    //   62: invokevirtual 76	com/google/android/gms/common/internal/zzj$zzc:unregister	()V
    //   65: return
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    //   71: astore_1
    //   72: aload_0
    //   73: invokevirtual 78	com/google/android/gms/common/internal/zzj$zzc:zzqM	()V
    //   76: aload_1
    //   77: athrow
    //   78: aload_0
    //   79: invokevirtual 78	com/google/android/gms/common/internal/zzj$zzc:zzqM	()V
    //   82: goto -30 -> 52
    //   85: astore_1
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_1
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	zzc
    //   6	43	1	localObject1	Object
    //   66	4	1	localObject2	Object
    //   71	6	1	localRuntimeException	RuntimeException
    //   85	4	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	41	66	finally
    //   41	43	66	finally
    //   47	52	71	java/lang/RuntimeException
    //   54	61	85	finally
  }
  
  public void zzqO()
  {
    try
    {
      mListener = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected abstract void zzw(Object paramObject);
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzj.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */