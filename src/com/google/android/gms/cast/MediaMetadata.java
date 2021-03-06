package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.zzlp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata
{
  public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
  public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
  public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
  public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
  public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
  public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
  public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
  public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
  public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
  public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
  public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
  public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
  public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
  public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
  public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
  public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
  public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
  public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
  public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
  public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
  public static final int MEDIA_TYPE_GENERIC = 0;
  public static final int MEDIA_TYPE_MOVIE = 1;
  public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
  public static final int MEDIA_TYPE_PHOTO = 4;
  public static final int MEDIA_TYPE_TV_SHOW = 2;
  public static final int MEDIA_TYPE_USER = 100;
  private static final String[] zzaaW = { null, "String", "int", "double", "ISO-8601 date String" };
  private static final MediaMetadata.zza zzaaX = new MediaMetadata.zza().zzc("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).zzc("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).zzc("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).zzc("com.google.android.gms.cast.metadata.TITLE", "title", 1).zzc("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).zzc("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).zzc("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).zzc("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).zzc("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).zzc("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).zzc("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).zzc("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).zzc("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).zzc("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).zzc("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).zzc("com.google.android.gms.cast.metadata.WIDTH", "width", 2).zzc("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).zzc("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).zzc("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).zzc("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
  private final Bundle zzaaY = new Bundle();
  private int zzaaZ;
  private final List zzxX = new ArrayList();
  
  public MediaMetadata()
  {
    this(0);
  }
  
  public MediaMetadata(int paramInt)
  {
    zzaaZ = paramInt;
  }
  
  private void zza(JSONObject paramJSONObject, String... paramVarArgs)
  {
    try
    {
      int j = paramVarArgs.length;
      int i = 0;
      for (;;)
      {
        String str;
        if (i < j)
        {
          str = paramVarArgs[i];
          if (!zzaaY.containsKey(str)) {}
        }
        else
        {
          switch (zzaaX.zzcc(str))
          {
          case 1: 
          case 4: 
            paramJSONObject.put(zzaaX.zzca(str), zzaaY.getString(str));
            break;
          case 2: 
            paramJSONObject.put(zzaaX.zzca(str), zzaaY.getInt(str));
            break;
          case 3: 
            paramJSONObject.put(zzaaX.zzca(str), zzaaY.getDouble(str));
            break;
            paramVarArgs = zzaaY.keySet().iterator();
            while (paramVarArgs.hasNext())
            {
              str = (String)paramVarArgs.next();
              if (!str.startsWith("com.google."))
              {
                Object localObject = zzaaY.get(str);
                if ((localObject instanceof String)) {
                  paramJSONObject.put(str, localObject);
                } else if ((localObject instanceof Integer)) {
                  paramJSONObject.put(str, localObject);
                } else if ((localObject instanceof Double)) {
                  paramJSONObject.put(str, localObject);
                }
              }
            }
          }
        }
        i += 1;
      }
      return;
    }
    catch (JSONException paramJSONObject) {}
  }
  
  private void zzb(JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramVarArgs = new HashSet(Arrays.asList(paramVarArgs));
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        Object localObject1 = (String)localIterator.next();
        if (!"metadataType".equals(localObject1))
        {
          Object localObject2 = zzaaX.zzcb((String)localObject1);
          if (localObject2 != null)
          {
            boolean bool = paramVarArgs.contains(localObject2);
            if (!bool) {}
          }
          else
          {
            try
            {
              localObject1 = paramJSONObject.get((String)localObject1);
              if (localObject1 != null) {
                switch (zzaaX.zzcc((String)localObject2))
                {
                case 1: 
                  if ((localObject1 instanceof String)) {
                    zzaaY.putString((String)localObject2, (String)localObject1);
                  }
                  break;
                case 4: 
                  if (((localObject1 instanceof String)) && (zzlp.zzco((String)localObject1) != null)) {
                    zzaaY.putString((String)localObject2, (String)localObject1);
                  }
                  break;
                case 2: 
                  if ((localObject1 instanceof Integer)) {
                    zzaaY.putInt((String)localObject2, ((Integer)localObject1).intValue());
                  }
                  break;
                case 3: 
                  if ((localObject1 instanceof Double))
                  {
                    zzaaY.putDouble((String)localObject2, ((Double)localObject1).doubleValue());
                    continue;
                    localObject2 = paramJSONObject.get((String)localObject1);
                    if ((localObject2 instanceof String)) {
                      zzaaY.putString((String)localObject1, (String)localObject2);
                    } else if ((localObject2 instanceof Integer)) {
                      zzaaY.putInt((String)localObject1, ((Integer)localObject2).intValue());
                    } else if ((localObject2 instanceof Double)) {
                      zzaaY.putDouble((String)localObject1, ((Double)localObject2).doubleValue());
                    }
                  }
                  break;
                }
              }
            }
            catch (JSONException localJSONException) {}
          }
        }
      }
      return;
    }
    catch (JSONException paramJSONObject) {}
  }
  
  private boolean zzb(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1.size() != paramBundle2.size()) {
      return false;
    }
    Iterator localIterator = paramBundle1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle1.get(str);
      Object localObject2 = paramBundle2.get(str);
      if (((localObject1 instanceof Bundle)) && ((localObject2 instanceof Bundle)) && (!zzb((Bundle)localObject1, (Bundle)localObject2))) {
        return false;
      }
      if (localObject1 == null)
      {
        if ((localObject2 != null) || (!paramBundle2.containsKey(str))) {
          return false;
        }
      }
      else if (!localObject1.equals(localObject2)) {
        return false;
      }
    }
    return true;
  }
  
  private void zzf(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("null and empty keys are not allowed");
    }
    int i = zzaaX.zzcc(paramString);
    if ((i != paramInt) && (i != 0)) {
      throw new IllegalArgumentException("Value for " + paramString + " must be a " + zzaaW[paramInt]);
    }
  }
  
  public void addImage(WebImage paramWebImage)
  {
    zzxX.add(paramWebImage);
  }
  
  public void clear()
  {
    zzaaY.clear();
    zzxX.clear();
  }
  
  public void clearImages()
  {
    zzxX.clear();
  }
  
  public boolean containsKey(String paramString)
  {
    return zzaaY.containsKey(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof MediaMetadata)) {
        return false;
      }
      paramObject = (MediaMetadata)paramObject;
    } while ((zzb(zzaaY, zzaaY)) && (zzxX.equals(zzxX)));
    return false;
  }
  
  public Calendar getDate(String paramString)
  {
    zzf(paramString, 4);
    paramString = zzaaY.getString(paramString);
    if (paramString != null) {
      return zzlp.zzco(paramString);
    }
    return null;
  }
  
  public String getDateAsString(String paramString)
  {
    zzf(paramString, 4);
    return zzaaY.getString(paramString);
  }
  
  public double getDouble(String paramString)
  {
    zzf(paramString, 3);
    return zzaaY.getDouble(paramString);
  }
  
  public List getImages()
  {
    return zzxX;
  }
  
  public int getInt(String paramString)
  {
    zzf(paramString, 2);
    return zzaaY.getInt(paramString);
  }
  
  public int getMediaType()
  {
    return zzaaZ;
  }
  
  public String getString(String paramString)
  {
    zzf(paramString, 1);
    return zzaaY.getString(paramString);
  }
  
  public boolean hasImages()
  {
    return (zzxX != null) && (!zzxX.isEmpty());
  }
  
  public int hashCode()
  {
    Iterator localIterator = zzaaY.keySet().iterator();
    String str;
    for (int i = 17; localIterator.hasNext(); i = zzaaY.get(str).hashCode() + i * 31) {
      str = (String)localIterator.next();
    }
    return i * 31 + zzxX.hashCode();
  }
  
  public Set keySet()
  {
    return zzaaY.keySet();
  }
  
  public void putDate(String paramString, Calendar paramCalendar)
  {
    zzf(paramString, 4);
    zzaaY.putString(paramString, zzlp.zza(paramCalendar));
  }
  
  public void putDouble(String paramString, double paramDouble)
  {
    zzf(paramString, 3);
    zzaaY.putDouble(paramString, paramDouble);
  }
  
  public void putInt(String paramString, int paramInt)
  {
    zzf(paramString, 2);
    zzaaY.putInt(paramString, paramInt);
  }
  
  public void putString(String paramString1, String paramString2)
  {
    zzf(paramString1, 1);
    zzaaY.putString(paramString1, paramString2);
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("metadataType", zzaaZ);
      zzlp.zza(localJSONObject, zzxX);
      switch (zzaaZ)
      {
      default: 
        zza(localJSONObject, new String[0]);
        return localJSONObject;
      case 0: 
        zza(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      case 1: 
        zza(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      case 2: 
        zza(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        return localJSONObject;
      case 3: 
        zza(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      }
      zza(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public void zzg(JSONObject paramJSONObject)
  {
    clear();
    zzaaZ = 0;
    try
    {
      zzaaZ = paramJSONObject.getInt("metadataType");
      zzlp.zza(zzxX, paramJSONObject);
      switch (zzaaZ)
      {
      default: 
        zzb(paramJSONObject, new String[0]);
        return;
      case 0: 
        zzb(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return;
      case 1: 
        zzb(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return;
      case 2: 
        zzb(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        return;
      case 3: 
        zzb(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return;
      }
      zzb(paramJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */