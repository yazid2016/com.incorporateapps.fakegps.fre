package com.google.android.gms.nearby.messages.devices;

import com.google.android.gms.common.internal.zzx;

class zzc
  extends zza
{
  public zzc(byte[] paramArrayOfByte)
  {
    super(zzu(paramArrayOfByte));
  }
  
  private static byte[] zzu(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte.length == 10) || (paramArrayOfByte.length == 16)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
      return paramArrayOfByte;
    }
  }
  
  public String toString()
  {
    return "EddystoneUidPrefix{bytes=" + zzEt() + '}';
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */