package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;

public final class zzmn
{
  public static int zza(Object[] paramArrayOfObject, Object paramObject)
  {
    int j = 0;
    int i;
    if (paramArrayOfObject != null) {
      i = paramArrayOfObject.length;
    }
    while (j < i) {
      if (zzw.equal(paramArrayOfObject[j], paramObject))
      {
        return j;
        i = 0;
      }
      else
      {
        j += 1;
      }
    }
    return -1;
  }
  
  public static void zza(StringBuilder paramStringBuilder, double[] paramArrayOfDouble)
  {
    int j = paramArrayOfDouble.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Double.toString(paramArrayOfDouble[i]));
      i += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, float[] paramArrayOfFloat)
  {
    int j = paramArrayOfFloat.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Float.toString(paramArrayOfFloat[i]));
      i += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Integer.toString(paramArrayOfInt[i]));
      i += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, long[] paramArrayOfLong)
  {
    int j = paramArrayOfLong.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Long.toString(paramArrayOfLong[i]));
      i += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, Object[] paramArrayOfObject)
  {
    int j = paramArrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(paramArrayOfObject[i].toString());
      i += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append("\"").append(paramArrayOfString[i]).append("\"");
      i += 1;
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, boolean[] paramArrayOfBoolean)
  {
    int j = paramArrayOfBoolean.length;
    int i = 0;
    while (i < j)
    {
      if (i != 0) {
        paramStringBuilder.append(",");
      }
      paramStringBuilder.append(Boolean.toString(paramArrayOfBoolean[i]));
      i += 1;
    }
  }
  
  public static Integer[] zza(int[] paramArrayOfInt)
  {
    Object localObject;
    if (paramArrayOfInt == null)
    {
      localObject = null;
      return (Integer[])localObject;
    }
    int j = paramArrayOfInt.length;
    Integer[] arrayOfInteger = new Integer[j];
    int i = 0;
    for (;;)
    {
      localObject = arrayOfInteger;
      if (i >= j) {
        break;
      }
      arrayOfInteger[i] = Integer.valueOf(paramArrayOfInt[i]);
      i += 1;
    }
  }
  
  public static ArrayList zzb(Object[] paramArrayOfObject)
  {
    int j = paramArrayOfObject.length;
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      localArrayList.add(paramArrayOfObject[i]);
      i += 1;
    }
    return localArrayList;
  }
  
  public static boolean zzb(Object[] paramArrayOfObject, Object paramObject)
  {
    return zza(paramArrayOfObject, paramObject) >= 0;
  }
  
  public static ArrayList zzsa()
  {
    return new ArrayList();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */