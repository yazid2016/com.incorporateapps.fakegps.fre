package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zza;
import com.google.android.gms.maps.model.zze;

public abstract class ICameraUpdateFactoryDelegate$zza
  extends Binder
  implements ICameraUpdateFactoryDelegate
{
  public static ICameraUpdateFactoryDelegate zzcs(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof ICameraUpdateFactoryDelegate))) {
      return (ICameraUpdateFactoryDelegate)localIInterface;
    }
    return new ICameraUpdateFactoryDelegate.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject1 = null;
    com.google.android.gms.dynamic.zzd localzzd = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      localObject1 = zoomIn();
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject5;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      localObject1 = zoomOut();
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject6;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      localObject1 = scrollBy(paramParcel1.readFloat(), paramParcel1.readFloat());
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject7;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      localObject1 = zoomTo(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject8;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      localObject1 = zoomBy(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject9;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      localObject1 = zoomByWithFocus(paramParcel1.readFloat(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject10;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = CameraPosition.CREATOR.zzfv(paramParcel1);; paramParcel1 = null)
      {
        localzzd = newCameraPosition(paramParcel1);
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject1;
        if (localzzd != null) {
          paramParcel1 = localzzd.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = LatLng.CREATOR.zzfz(paramParcel1);; paramParcel1 = null)
      {
        localObject1 = newLatLng(paramParcel1);
        paramParcel2.writeNoException();
        paramParcel1 = localzzd;
        if (localObject1 != null) {
          paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = LatLng.CREATOR.zzfz(paramParcel1);; localObject1 = null)
      {
        localObject1 = newLatLngZoom((LatLng)localObject1, paramParcel1.readFloat());
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject2;
        if (localObject1 != null) {
          paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = LatLngBounds.CREATOR.zzfy(paramParcel1);; localObject1 = null)
      {
        localObject1 = newLatLngBounds((LatLngBounds)localObject1, paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject3;
        if (localObject1 != null) {
          paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if (paramParcel1.readInt() != 0) {}
    for (localObject1 = LatLngBounds.CREATOR.zzfy(paramParcel1);; localObject1 = null)
    {
      localObject1 = newLatLngBoundsWithSize((LatLngBounds)localObject1, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject4;
      if (localObject1 != null) {
        paramParcel1 = ((com.google.android.gms.dynamic.zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */