package com.google.android.gms.internal;

public class zzoz
{
  private static final ThreadLocal zzazL = new ThreadLocal();
  
  public static String zzD(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return paramString1;
    }
    byte[] arrayOfByte = new byte[paramString1.length() + paramString2.length()];
    System.arraycopy(paramString1.getBytes(), 0, arrayOfByte, 0, paramString1.length());
    System.arraycopy(paramString2.getBytes(), 0, arrayOfByte, paramString1.length(), paramString2.length());
    return Integer.toHexString(zznd.zza(arrayOfByte, 0, arrayOfByte.length, 0));
  }
  
  public static String zzdF(String paramString)
  {
    if (zzuH()) {
      return paramString;
    }
    return zzD(paramString, (String)zzazL.get());
  }
  
  public static boolean zzuH()
  {
    String str = (String)zzazL.get();
    return (str == null) || (str.startsWith("com.google"));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzoz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */