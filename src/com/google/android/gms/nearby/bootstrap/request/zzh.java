package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(StopScanRequest paramStopScanRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramStopScanRequest.getCallbackBinder(), false);
    zzb.zzc(paramParcel, 1000, versionCode);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public StopScanRequest zzfX(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new StopScanRequest(i, localIBinder);
  }
  
  public StopScanRequest[] zziT(int paramInt)
  {
    return new StopScanRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */