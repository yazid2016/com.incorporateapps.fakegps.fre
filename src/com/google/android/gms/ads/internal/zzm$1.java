package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq.zza;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzm$1
  implements zzjq.zza
{
  zzm$1(zzd paramzzd, String paramString, zzjp paramzzjp) {}
  
  public final void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    try
    {
      paramzzjp = new JSONObject();
      paramzzjp.put("headline", zzqq.getHeadline());
      paramzzjp.put("body", zzqq.getBody());
      paramzzjp.put("call_to_action", zzqq.getCallToAction());
      paramzzjp.put("price", zzqq.getPrice());
      paramzzjp.put("star_rating", String.valueOf(zzqq.getStarRating()));
      paramzzjp.put("store", zzqq.getStore());
      paramzzjp.put("icon", zzm.zza(zzqq.zzdK()));
      localObject1 = new JSONArray();
      Object localObject2 = zzqq.getImages();
      if (localObject2 != null)
      {
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((JSONArray)localObject1).put(zzm.zza(zzm.zzd(((Iterator)localObject2).next())));
        }
      }
      paramzzjp.put("images", localObject1);
    }
    catch (JSONException paramzzjp)
    {
      zzin.zzd("Exception occurred when loading assets", paramzzjp);
      return;
    }
    paramzzjp.put("extras", zzm.zzb(zzqq.getExtras(), zzqr));
    Object localObject1 = new JSONObject();
    ((JSONObject)localObject1).put("assets", paramzzjp);
    ((JSONObject)localObject1).put("template_id", "2");
    zzqs.zza("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzm.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */