package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzk
  implements Parcelable.Creator
{
  static void zza(RealtimeDocumentSyncRequest paramRealtimeDocumentSyncRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzb(paramParcel, 2, zzapq, false);
    zzb.zzb(paramParcel, 3, zzapr, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public RealtimeDocumentSyncRequest zzaN(Parcel paramParcel)
  {
    ArrayList localArrayList2 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    ArrayList localArrayList1 = null;
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
        localArrayList1 = zza.zzD(paramParcel, k);
        break;
      case 3: 
        localArrayList2 = zza.zzD(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new RealtimeDocumentSyncRequest(i, localArrayList1, localArrayList2);
  }
  
  public RealtimeDocumentSyncRequest[] zzcC(int paramInt)
  {
    return new RealtimeDocumentSyncRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */