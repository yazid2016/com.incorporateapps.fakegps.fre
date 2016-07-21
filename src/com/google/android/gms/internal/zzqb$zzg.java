package com.google.android.gms.internal;

public final class zzqb$zzg
  extends zzsu
{
  private static volatile zzg[] zzbaI;
  public String name;
  public Float zzaZo;
  public String zzamJ;
  public Long zzbaJ;
  public Long zzbai;
  
  public zzqb$zzg()
  {
    zzEa();
  }
  
  public static zzg[] zzDZ()
  {
    if (zzbaI == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzbaI == null) {
        zzbaI = new zzg[0];
      }
      return zzbaI;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof zzg)) {
          return false;
        }
        paramObject = (zzg)paramObject;
        if (zzbaJ == null)
        {
          if (zzbaJ != null) {
            return false;
          }
        }
        else if (!zzbaJ.equals(zzbaJ)) {
          return false;
        }
        if (name == null)
        {
          if (name != null) {
            return false;
          }
        }
        else if (!name.equals(name)) {
          return false;
        }
        if (zzamJ == null)
        {
          if (zzamJ != null) {
            return false;
          }
        }
        else if (!zzamJ.equals(zzamJ)) {
          return false;
        }
        if (zzbai == null)
        {
          if (zzbai != null) {
            return false;
          }
        }
        else if (!zzbai.equals(zzbai)) {
          return false;
        }
        if (zzaZo != null) {
          break;
        }
      } while (zzaZo == null);
      return false;
    } while (zzaZo.equals(zzaZo));
    return false;
  }
  
  public final int hashCode()
  {
    int n = 0;
    int i1 = getClass().getName().hashCode();
    int i;
    int j;
    label33:
    int k;
    label42:
    int m;
    if (zzbaJ == null)
    {
      i = 0;
      if (name != null) {
        break label104;
      }
      j = 0;
      if (zzamJ != null) {
        break label115;
      }
      k = 0;
      if (zzbai != null) {
        break label126;
      }
      m = 0;
      label52:
      if (zzaZo != null) {
        break label138;
      }
    }
    for (;;)
    {
      return (m + (k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31) * 31 + n;
      i = zzbaJ.hashCode();
      break;
      label104:
      j = name.hashCode();
      break label33;
      label115:
      k = zzamJ.hashCode();
      break label42;
      label126:
      m = zzbai.hashCode();
      break label52;
      label138:
      n = zzaZo.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zzbaJ != null) {
      paramzzsn.zzb(1, zzbaJ.longValue());
    }
    if (name != null) {
      paramzzsn.zzn(2, name);
    }
    if (zzamJ != null) {
      paramzzsn.zzn(3, zzamJ);
    }
    if (zzbai != null) {
      paramzzsn.zzb(4, zzbai.longValue());
    }
    if (zzaZo != null) {
      paramzzsn.zzb(5, zzaZo.floatValue());
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzg zzEa()
  {
    zzbaJ = null;
    name = null;
    zzamJ = null;
    zzbai = null;
    zzaZo = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzg zzI(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      switch (i)
      {
      default: 
        if (zzsx.zzb(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        zzbaJ = Long.valueOf(paramzzsm.zzJa());
        break;
      case 18: 
        name = paramzzsm.readString();
        break;
      case 26: 
        zzamJ = paramzzsm.readString();
        break;
      case 32: 
        zzbai = Long.valueOf(paramzzsm.zzJa());
        break;
      case 45: 
        zzaZo = Float.valueOf(paramzzsm.readFloat());
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (zzbaJ != null) {
      i = j + zzsn.zzd(1, zzbaJ.longValue());
    }
    j = i;
    if (name != null) {
      j = i + zzsn.zzo(2, name);
    }
    i = j;
    if (zzamJ != null) {
      i = j + zzsn.zzo(3, zzamJ);
    }
    j = i;
    if (zzbai != null) {
      j = i + zzsn.zzd(4, zzbai.longValue());
    }
    i = j;
    if (zzaZo != null) {
      i = j + zzsn.zzc(5, zzaZo.floatValue());
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqb.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */