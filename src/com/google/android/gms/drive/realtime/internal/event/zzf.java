package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(TextDeletedDetails paramTextDeletedDetails, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzc(paramParcel, 2, mIndex);
    zzb.zzc(paramParcel, 3, zzavn);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public TextDeletedDetails zzcH(Parcel paramParcel)
  {
    int k = 0;
    int m = zza.zzau(paramParcel);
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        i = zza.zzg(paramParcel, n);
        break;
      case 2: 
        j = zza.zzg(paramParcel, n);
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new TextDeletedDetails(i, j, k);
  }
  
  public TextDeletedDetails[] zzeD(int paramInt)
  {
    return new TextDeletedDetails[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */