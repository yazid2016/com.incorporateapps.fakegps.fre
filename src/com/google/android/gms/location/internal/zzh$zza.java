package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public zzh$zza()
  {
    attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
  }
  
  public static zzh zzci(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzh))) {
      return (zzh)localIInterface;
    }
    return new zzh.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
      zza(paramParcel1.readInt(), paramParcel1.createStringArray());
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
      zzb(paramParcel1.readInt(), paramParcel1.createStringArray());
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
    paramInt1 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramInt1, paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */