package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public static zzf zzbh(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzf))) {
      return (zzf)localIInterface;
    }
    return new zzf.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
      if (paramParcel1.readInt() != 0) {
        localObject1 = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzg((DataHolder)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
    localObject1 = localObject2;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
    }
    onError((Status)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.zzf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */