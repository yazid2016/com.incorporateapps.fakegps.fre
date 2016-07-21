package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzai
  implements Parcelable.Creator
{
  static void zza(GetDriveIdFromUniqueIdentifierRequest paramGetDriveIdFromUniqueIdentifierRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaoZ, false);
    zzb.zza(paramParcel, 3, zzarM);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GetDriveIdFromUniqueIdentifierRequest zzbs(Parcel paramParcel)
  {
    boolean bool = false;
    int j = zza.zzau(paramParcel);
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetDriveIdFromUniqueIdentifierRequest(i, str, bool);
  }
  
  public GetDriveIdFromUniqueIdentifierRequest[] zzdn(int paramInt)
  {
    return new GetDriveIdFromUniqueIdentifierRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */