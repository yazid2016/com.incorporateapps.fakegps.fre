package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(AddLocalCapabilityResponse paramAddLocalCapabilityResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, statusCode);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public AddLocalCapabilityResponse zzib(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        j = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new AddLocalCapabilityResponse(i, j);
  }
  
  public AddLocalCapabilityResponse[] zzlC(int paramInt)
  {
    return new AddLocalCapabilityResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */