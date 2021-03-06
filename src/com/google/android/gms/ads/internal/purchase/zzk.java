package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;

public class zzk
{
  private final String zzuM;
  
  public zzk(String paramString)
  {
    zzuM = paramString;
  }
  
  public boolean zza(String paramString, int paramInt, Intent paramIntent)
  {
    if ((paramString == null) || (paramIntent == null)) {}
    String str;
    do
    {
      return false;
      str = zzr.zzbM().zze(paramIntent);
      paramIntent = zzr.zzbM().zzf(paramIntent);
    } while ((str == null) || (paramIntent == null));
    if (!paramString.equals(zzr.zzbM().zzaq(str)))
    {
      zzin.zzaK("Developer payload not match.");
      return false;
    }
    if ((zzuM != null) && (!zzl.zzc(zzuM, str, paramIntent)))
    {
      zzin.zzaK("Fail to verify signature.");
      return false;
    }
    return true;
  }
  
  public String zzfZ()
  {
    return zzr.zzbC().zzhs();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */