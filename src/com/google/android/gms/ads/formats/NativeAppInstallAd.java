package com.google.android.gms.ads.formats;

import android.os.Bundle;
import java.util.List;

public abstract class NativeAppInstallAd
  extends NativeAd
{
  public abstract void destroy();
  
  public abstract CharSequence getBody();
  
  public abstract CharSequence getCallToAction();
  
  public abstract Bundle getExtras();
  
  public abstract CharSequence getHeadline();
  
  public abstract NativeAd.Image getIcon();
  
  public abstract List getImages();
  
  public abstract CharSequence getPrice();
  
  public abstract Double getStarRating();
  
  public abstract CharSequence getStore();
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAppInstallAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */