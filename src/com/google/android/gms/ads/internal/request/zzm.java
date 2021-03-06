package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzeg.zzd;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzmq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class zzm
  extends zzim
{
  private static zzdk zzIA = null;
  private static zzdf zzIB = null;
  static final long zzIw = TimeUnit.SECONDS.toMillis(10L);
  private static boolean zzIx;
  private static zzeg zzIy;
  private static zzdg zzIz;
  private static final Object zzqy = new Object();
  private final Context mContext;
  private final Object zzGg = new Object();
  private final zza.zza zzHg;
  private final AdRequestInfoParcel.zza zzHh;
  private zzeg.zzd zzIC;
  
  static
  {
    zzIx = false;
    zzIy = null;
    zzIz = null;
  }
  
  public zzm(Context paramContext, AdRequestInfoParcel.zza paramzza, zza.zza arg3)
  {
    super(true);
    zzHg = ???;
    mContext = paramContext;
    zzHh = paramzza;
    synchronized (zzqy)
    {
      if (!zzIx)
      {
        zzIA = new zzdk();
        zzIz = new zzdg(paramContext.getApplicationContext(), zzrl);
        zzIB = new zzm.zzc();
        zzIy = new zzeg(mContext.getApplicationContext(), zzHh.zzrl, (String)zzbt.zzvB.get(), new zzm.zzb(), new zzm.zza());
        zzIx = true;
      }
      return;
    }
  }
  
  private JSONObject zza(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    Bundle localBundle = zzHt.extras.getBundle("sdk_less_server_data");
    String str = zzHt.extras.getString("sdk_less_network_id");
    if (localBundle == null) {}
    JSONObject localJSONObject;
    do
    {
      return null;
      localJSONObject = zzhe.zza(mContext, paramAdRequestInfoParcel, zzr.zzbI().zzE(mContext), null, null, new zzbm((String)zzbt.zzvB.get()), null, null, new ArrayList(), null);
    } while (localJSONObject == null);
    try
    {
      paramAdRequestInfoParcel = AdvertisingIdClient.getAdvertisingIdInfo(mContext);
      localHashMap = new HashMap();
      localHashMap.put("request_id", paramString);
      localHashMap.put("network_id", str);
      localHashMap.put("request_param", localJSONObject);
      localHashMap.put("data", localBundle);
      if (paramAdRequestInfoParcel != null)
      {
        localHashMap.put("adid", paramAdRequestInfoParcel.getId());
        if (!paramAdRequestInfoParcel.isLimitAdTrackingEnabled()) {
          break label204;
        }
        i = 1;
        localHashMap.put("lat", Integer.valueOf(i));
      }
    }
    catch (GooglePlayServicesRepairableException paramAdRequestInfoParcel)
    {
      for (;;)
      {
        try
        {
          HashMap localHashMap;
          paramAdRequestInfoParcel = zzr.zzbC().zzG(localHashMap);
          return paramAdRequestInfoParcel;
        }
        catch (JSONException paramAdRequestInfoParcel)
        {
          int i;
          return null;
        }
        paramAdRequestInfoParcel = paramAdRequestInfoParcel;
        zzin.zzd("Cannot get advertising id info", paramAdRequestInfoParcel);
        paramAdRequestInfoParcel = null;
        continue;
        i = 0;
      }
    }
    catch (IllegalStateException paramAdRequestInfoParcel)
    {
      for (;;) {}
    }
    catch (GooglePlayServicesNotAvailableException paramAdRequestInfoParcel)
    {
      for (;;) {}
    }
    catch (IOException paramAdRequestInfoParcel)
    {
      label204:
      for (;;) {}
    }
  }
  
  protected static void zzc(zzed paramzzed)
  {
    paramzzed.zza("/loadAd", zzIA);
    paramzzed.zza("/fetchHttpRequest", zzIz);
    paramzzed.zza("/invalidRequest", zzIB);
  }
  
  protected static void zzd(zzed paramzzed)
  {
    paramzzed.zzb("/loadAd", zzIA);
    paramzzed.zzb("/fetchHttpRequest", zzIz);
    paramzzed.zzb("/invalidRequest", zzIB);
  }
  
  private AdResponseParcel zze(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    Object localObject = UUID.randomUUID().toString();
    JSONObject localJSONObject = zza(paramAdRequestInfoParcel, (String)localObject);
    if (localJSONObject == null) {
      paramAdRequestInfoParcel = new AdResponseParcel(0);
    }
    for (;;)
    {
      return paramAdRequestInfoParcel;
      long l1 = zzr.zzbG().elapsedRealtime();
      Future localFuture = zzIA.zzR((String)localObject);
      zza.zzMS.post(new zzm.2(this, localJSONObject, (String)localObject));
      long l2 = zzIw;
      long l3 = zzr.zzbG().elapsedRealtime();
      try
      {
        localObject = (JSONObject)localFuture.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
        if (localObject == null) {
          return new AdResponseParcel(-1);
        }
      }
      catch (InterruptedException paramAdRequestInfoParcel)
      {
        return new AdResponseParcel(-1);
      }
      catch (TimeoutException paramAdRequestInfoParcel)
      {
        return new AdResponseParcel(2);
      }
      catch (ExecutionException paramAdRequestInfoParcel)
      {
        return new AdResponseParcel(0);
        localObject = zzhe.zza(mContext, paramAdRequestInfoParcel, ((JSONObject)localObject).toString());
        paramAdRequestInfoParcel = (AdRequestInfoParcel)localObject;
        if (errorCode == -3) {
          continue;
        }
        paramAdRequestInfoParcel = (AdRequestInfoParcel)localObject;
        if (!TextUtils.isEmpty(body)) {
          continue;
        }
        return new AdResponseParcel(3);
      }
      catch (CancellationException paramAdRequestInfoParcel)
      {
        for (;;) {}
      }
    }
  }
  
  public void onStop()
  {
    synchronized (zzGg)
    {
      zza.zzMS.post(new zzm.3(this));
      return;
    }
  }
  
  public void zzbr()
  {
    zzin.zzaI("SdkLessAdLoaderBackgroundTask started.");
    Object localObject = new AdRequestInfoParcel(zzHh, null, -1L);
    AdResponseParcel localAdResponseParcel = zze((AdRequestInfoParcel)localObject);
    long l = zzr.zzbG().elapsedRealtime();
    localObject = new zzif.zza((AdRequestInfoParcel)localObject, localAdResponseParcel, null, null, errorCode, l, zzHX, null);
    zza.zzMS.post(new zzm.1(this, (zzif.zza)localObject));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */