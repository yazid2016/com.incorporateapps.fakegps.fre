package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzq$zza
  extends Binder
  implements zzq
{
  public static zzq zzaQ(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
    if ((localIInterface != null) && ((localIInterface instanceof zzq))) {
      return (zzq)localIInterface;
    }
    return new zzq.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.ICancelToken");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
    cancel();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzq.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */