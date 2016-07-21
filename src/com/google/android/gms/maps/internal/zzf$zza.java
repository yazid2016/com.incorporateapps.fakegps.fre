package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzc.zza;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public zzf$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
  }
  
  public static zzf zzcB(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
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
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    zza(zzc.zza.zzdf(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.zzf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */