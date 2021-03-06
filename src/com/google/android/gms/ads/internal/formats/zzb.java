package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzis;
import java.util.Iterator;
import java.util.List;

class zzb
  extends RelativeLayout
{
  private static final float[] zzxR = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  private final RelativeLayout zzxS;
  private AnimationDrawable zzxT;
  
  public zzb(Context paramContext, zza paramzza)
  {
    super(paramContext);
    zzx.zzz(paramzza);
    Object localObject1 = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject1).addRule(10);
    ((RelativeLayout.LayoutParams)localObject1).addRule(11);
    Object localObject2 = new ShapeDrawable(new RoundRectShape(zzxR, null, null));
    ((ShapeDrawable)localObject2).getPaint().setColor(paramzza.getBackgroundColor());
    zzxS = new RelativeLayout(paramContext);
    zzxS.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    zzr.zzbE().zza(zzxS, (Drawable)localObject2);
    localObject1 = new RelativeLayout.LayoutParams(-2, -2);
    if (!TextUtils.isEmpty(paramzza.getText()))
    {
      localObject2 = new RelativeLayout.LayoutParams(-2, -2);
      TextView localTextView = new TextView(paramContext);
      localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localTextView.setId(1195835393);
      localTextView.setTypeface(Typeface.DEFAULT);
      localTextView.setText(paramzza.getText());
      localTextView.setTextColor(paramzza.getTextColor());
      localTextView.setTextSize(paramzza.getTextSize());
      localTextView.setPadding(zzn.zzcS().zzb(paramContext, 4), 0, zzn.zzcS().zzb(paramContext, 4), 0);
      zzxS.addView(localTextView);
      ((RelativeLayout.LayoutParams)localObject1).addRule(1, localTextView.getId());
    }
    paramContext = new ImageView(paramContext);
    paramContext.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    paramContext.setId(1195835394);
    localObject1 = paramzza.zzdG();
    if (((List)localObject1).size() > 1)
    {
      zzxT = new AnimationDrawable();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Drawable)((Iterator)localObject1).next();
        zzxT.addFrame((Drawable)localObject2, paramzza.zzdH());
      }
      zzr.zzbE().zza(paramContext, zzxT);
    }
    for (;;)
    {
      zzxS.addView(paramContext);
      addView(zzxS);
      return;
      if (((List)localObject1).size() == 1) {
        paramContext.setImageDrawable((Drawable)((List)localObject1).get(0));
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    if (zzxT != null) {
      zzxT.start();
    }
    super.onAttachedToWindow();
  }
  
  public ViewGroup zzdI()
  {
    return zzxS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */