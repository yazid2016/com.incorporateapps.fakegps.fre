package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

public class zzk
  implements Parcelable.Creator
{
  static void zza(SessionStopResult paramSessionStopResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1000, paramSessionStopResult.getVersionCode());
    zzb.zza(paramParcel, 2, paramSessionStopResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 3, paramSessionStopResult.getSessions(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionStopResult zzdX(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
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
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localStatus = (Status)zza.zza(paramParcel, k, Status.CREATOR);
        break;
      case 3: 
        localArrayList = zza.zzc(paramParcel, k, Session.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SessionStopResult(i, localStatus, localArrayList);
  }
  
  public SessionStopResult[] zzfY(int paramInt)
  {
    return new SessionStopResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */