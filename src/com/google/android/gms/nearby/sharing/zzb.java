package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(LocalContent paramLocalContent, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, paramLocalContent.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, paramLocalContent.getType());
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, paramLocalContent.zzEK(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, paramInt);
  }
  
  public LocalContent zzgr(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    String str = null;
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
        break;
      case 3: 
        str = zza.zzp(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new LocalContent(i, j, str);
  }
  
  public LocalContent[] zzjx(int paramInt)
  {
    return new LocalContent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */