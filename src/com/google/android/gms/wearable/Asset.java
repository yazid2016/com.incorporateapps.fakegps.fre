package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class Asset
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  final int mVersionCode;
  public Uri uri;
  private byte[] zzaKm;
  private String zzbqU;
  public ParcelFileDescriptor zzbqV;
  
  Asset(int paramInt, byte[] paramArrayOfByte, String paramString, ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri)
  {
    mVersionCode = paramInt;
    zzaKm = paramArrayOfByte;
    zzbqU = paramString;
    zzbqV = paramParcelFileDescriptor;
    uri = paramUri;
  }
  
  public static Asset createFromBytes(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("Asset data cannot be null");
    }
    return new Asset(1, paramArrayOfByte, null, null, null);
  }
  
  public static Asset createFromFd(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor == null) {
      throw new IllegalArgumentException("Asset fd cannot be null");
    }
    return new Asset(1, null, null, paramParcelFileDescriptor, null);
  }
  
  public static Asset createFromRef(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("Asset digest cannot be null");
    }
    return new Asset(1, null, paramString, null, null);
  }
  
  public static Asset createFromUri(Uri paramUri)
  {
    if (paramUri == null) {
      throw new IllegalArgumentException("Asset uri cannot be null");
    }
    return new Asset(1, null, null, null, paramUri);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Asset)) {
        return false;
      }
      paramObject = (Asset)paramObject;
    } while ((zzw.equal(zzaKm, zzaKm)) && (zzw.equal(zzbqU, zzbqU)) && (zzw.equal(zzbqV, zzbqV)) && (zzw.equal(uri, uri)));
    return false;
  }
  
  public byte[] getData()
  {
    return zzaKm;
  }
  
  public String getDigest()
  {
    return zzbqU;
  }
  
  public ParcelFileDescriptor getFd()
  {
    return zzbqV;
  }
  
  public Uri getUri()
  {
    return uri;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaKm, zzbqU, zzbqV, uri });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Asset[@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (zzbqU == null) {
      localStringBuilder.append(", nodigest");
    }
    for (;;)
    {
      if (zzaKm != null)
      {
        localStringBuilder.append(", size=");
        localStringBuilder.append(zzaKm.length);
      }
      if (zzbqV != null)
      {
        localStringBuilder.append(", fd=");
        localStringBuilder.append(zzbqV);
      }
      if (uri != null)
      {
        localStringBuilder.append(", uri=");
        localStringBuilder.append(uri);
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(", ");
      localStringBuilder.append(zzbqU);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.Asset
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */