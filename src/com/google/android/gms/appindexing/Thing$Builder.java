package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

public class Thing$Builder
{
  final Bundle zzUH = new Bundle();
  
  public Thing build()
  {
    return new Thing(zzUH);
  }
  
  public Builder put(String paramString, Thing paramThing)
  {
    zzx.zzz(paramString);
    if (paramThing != null) {
      zzUH.putParcelable(paramString, zzUG);
    }
    return this;
  }
  
  public Builder put(String paramString1, String paramString2)
  {
    zzx.zzz(paramString1);
    if (paramString2 != null) {
      zzUH.putString(paramString1, paramString2);
    }
    return this;
  }
  
  public Builder put(String paramString, boolean paramBoolean)
  {
    zzx.zzz(paramString);
    zzUH.putBoolean(paramString, paramBoolean);
    return this;
  }
  
  public Builder put(String paramString, Thing[] paramArrayOfThing)
  {
    zzx.zzz(paramString);
    if (paramArrayOfThing != null)
    {
      ArrayList localArrayList = new ArrayList();
      int j = paramArrayOfThing.length;
      int i = 0;
      while (i < j)
      {
        Thing localThing = paramArrayOfThing[i];
        if (localThing != null) {
          localArrayList.add(zzUG);
        }
        i += 1;
      }
      zzUH.putParcelableArray(paramString, (Parcelable[])localArrayList.toArray(new Bundle[localArrayList.size()]));
    }
    return this;
  }
  
  public Builder put(String paramString, String[] paramArrayOfString)
  {
    zzx.zzz(paramString);
    if (paramArrayOfString != null) {
      zzUH.putStringArray(paramString, paramArrayOfString);
    }
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    put("description", paramString);
    return this;
  }
  
  public Builder setId(String paramString)
  {
    if (paramString != null) {
      put("id", paramString);
    }
    return this;
  }
  
  public Builder setName(String paramString)
  {
    zzx.zzz(paramString);
    put("name", paramString);
    return this;
  }
  
  public Builder setType(String paramString)
  {
    put("type", paramString);
    return this;
  }
  
  public Builder setUrl(Uri paramUri)
  {
    zzx.zzz(paramUri);
    put("url", paramUri.toString());
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appindexing.Thing.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */