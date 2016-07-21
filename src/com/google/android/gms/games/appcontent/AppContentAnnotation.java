package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface AppContentAnnotation
  extends Parcelable, Freezable
{
  public abstract String getDescription();
  
  public abstract String getId();
  
  public abstract String getTitle();
  
  public abstract String zzvT();
  
  public abstract int zzvU();
  
  public abstract Uri zzvV();
  
  public abstract Bundle zzvW();
  
  public abstract int zzvX();
  
  public abstract String zzvY();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentAnnotation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */