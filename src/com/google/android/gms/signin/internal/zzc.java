package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc
  implements Parcelable.Creator
{
  static void zza(CheckServerAuthResult paramCheckServerAuthResult, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzbhf);
    zzb.zzc(paramParcel, 3, zzbhg, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public CheckServerAuthResult zzgS(Parcel paramParcel)
  {
    boolean bool = false;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 3: 
        localArrayList = zza.zzc(paramParcel, k, Scope.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new CheckServerAuthResult(i, bool, localArrayList);
  }
  
  public CheckServerAuthResult[] zzjZ(int paramInt)
  {
    return new CheckServerAuthResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */