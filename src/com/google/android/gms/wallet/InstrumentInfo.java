package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InstrumentInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  private final int mVersionCode;
  private String zzboI;
  private String zzboJ;
  
  InstrumentInfo(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzboI = paramString1;
    zzboJ = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getInstrumentDetails()
  {
    return zzboJ;
  }
  
  public final String getInstrumentType()
  {
    return zzboI;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.InstrumentInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */