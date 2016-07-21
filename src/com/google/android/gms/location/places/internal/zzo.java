package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzo
  implements Parcelable.Creator
{
  static void zza(PlaceLocalization paramPlaceLocalization, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, name, false);
    zzb.zzc(paramParcel, 1000, versionCode);
    zzb.zza(paramParcel, 2, address, false);
    zzb.zza(paramParcel, 3, zzaQO, false);
    zzb.zza(paramParcel, 4, zzaQP, false);
    zzb.zzb(paramParcel, 5, zzaQQ, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PlaceLocalization zzfn(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localArrayList = zza.zzD(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceLocalization(i, str4, str3, str2, str1, localArrayList);
  }
  
  public PlaceLocalization[] zzia(int paramInt)
  {
    return new PlaceLocalization[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */