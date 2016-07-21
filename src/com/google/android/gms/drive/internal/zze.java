package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zze
  implements Parcelable.Creator
{
  static void zza(CancelPendingActionsRequest paramCancelPendingActionsRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzb(paramParcel, 2, zzapG, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public CancelPendingActionsRequest zzbc(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
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
        localArrayList = zza.zzD(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new CancelPendingActionsRequest(i, localArrayList);
  }
  
  public CancelPendingActionsRequest[] zzcS(int paramInt)
  {
    return new CancelPendingActionsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */