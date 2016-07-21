package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzry$zza
  extends Binder
  implements zzry
{
  public zzry$zza()
  {
    attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
  }
  
  public static zzry zzek(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzry))) {
      return (zzry)localIInterface;
    }
    return new zzry.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
    paramInt1 = paramParcel1.readInt();
    paramInt2 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramInt1, paramInt2, paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzry.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */