package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzk$zza
  extends Binder
  implements zzk
{
  public zzk$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
  }
  
  public static zzk zzbt(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzk))) {
      return (zzk)localIInterface;
    }
    return new zzk.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (DataPoint)DataPoint.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zzc(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */