package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzm
  implements Parcelable.Creator
{
  static void zza(CreateFileIntentSenderRequest paramCreateFileIntentSenderRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaqw, paramInt, false);
    zzb.zzc(paramParcel, 3, zzaox);
    zzb.zza(paramParcel, 4, zzapg, false);
    zzb.zza(paramParcel, 5, zzapj, paramInt, false);
    zzb.zza(paramParcel, 6, zzaqx, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CreateFileIntentSenderRequest zzbj(Parcel paramParcel)
  {
    int i = 0;
    Integer localInteger = null;
    int k = zza.zzau(paramParcel);
    DriveId localDriveId = null;
    String str = null;
    MetadataBundle localMetadataBundle = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localMetadataBundle = (MetadataBundle)zza.zza(paramParcel, m, MetadataBundle.CREATOR);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        str = zza.zzp(paramParcel, m);
        break;
      case 5: 
        localDriveId = (DriveId)zza.zza(paramParcel, m, DriveId.CREATOR);
        break;
      case 6: 
        localInteger = zza.zzh(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new CreateFileIntentSenderRequest(j, localMetadataBundle, i, str, localDriveId, localInteger);
  }
  
  public CreateFileIntentSenderRequest[] zzda(int paramInt)
  {
    return new CreateFileIntentSenderRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */