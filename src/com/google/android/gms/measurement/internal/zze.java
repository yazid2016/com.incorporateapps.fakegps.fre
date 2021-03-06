package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzpz.zza;
import com.google.android.gms.internal.zzpz.zzb;
import com.google.android.gms.internal.zzpz.zze;
import com.google.android.gms.internal.zzqb.zze;
import com.google.android.gms.internal.zzsn;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

class zze
  extends zzz
{
  private static final Map zzaVB;
  private final zze.zzc zzaVC;
  private final zzaf zzaVD = new zzaf(zzjl());
  
  static
  {
    ArrayMap localArrayMap = new ArrayMap(13);
    zzaVB = localArrayMap;
    localArrayMap.put("app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;");
    zzaVB.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
    zzaVB.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
    zzaVB.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
    zzaVB.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
    zzaVB.put("last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;");
    zzaVB.put("day", "ALTER TABLE apps ADD COLUMN day INTEGER;");
    zzaVB.put("daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;");
    zzaVB.put("daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;");
    zzaVB.put("daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;");
    zzaVB.put("remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;");
    zzaVB.put("config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;");
    zzaVB.put("failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;");
  }
  
  zze(zzw paramzzw)
  {
    super(paramzzw);
    paramzzw = zzjQ();
    zzaVC = new zze.zzc(this, getContext(), paramzzw);
  }
  
  private boolean zzCw()
  {
    return getContext().getDatabasePath(zzjQ()).exists();
  }
  
  static int zza(Cursor paramCursor, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      return paramCursor.getType(paramInt);
    }
    CursorWindow localCursorWindow = ((SQLiteCursor)paramCursor).getWindow();
    int i = paramCursor.getPosition();
    if (localCursorWindow.isNull(i, paramInt)) {
      return 0;
    }
    if (localCursorWindow.isLong(i, paramInt)) {
      return 1;
    }
    if (localCursorWindow.isFloat(i, paramInt)) {
      return 2;
    }
    if (localCursorWindow.isString(i, paramInt)) {
      return 3;
    }
    if (localCursorWindow.isBlob(i, paramInt)) {
      return 4;
    }
    return -1;
  }
  
  private long zza(String paramString, String[] paramArrayOfString, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    Object localObject = null;
    String[] arrayOfString = null;
    try
    {
      paramArrayOfString = localSQLiteDatabase.rawQuery(paramString, paramArrayOfString);
      arrayOfString = paramArrayOfString;
      localObject = paramArrayOfString;
      long l;
      if (paramArrayOfString.moveToFirst())
      {
        arrayOfString = paramArrayOfString;
        localObject = paramArrayOfString;
        paramLong = paramArrayOfString.getLong(0);
        l = paramLong;
        if (paramArrayOfString != null)
        {
          paramArrayOfString.close();
          l = paramLong;
        }
      }
      do
      {
        return l;
        l = paramLong;
      } while (paramArrayOfString == null);
      paramArrayOfString.close();
      return paramLong;
    }
    catch (SQLiteException paramArrayOfString)
    {
      localObject = arrayOfString;
      zzAo().zzCE().zze("Database error", paramString, paramArrayOfString);
      localObject = arrayOfString;
      throw paramArrayOfString;
    }
    finally
    {
      if (localObject != null) {
        ((Cursor)localObject).close();
      }
    }
  }
  
  private void zza(String paramString, zzpz.zza paramzza)
  {
    int k = 0;
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzx.zzz(paramzza);
    zzx.zzz(zzaZt);
    zzx.zzz(zzaZs);
    if (zzaZr == null) {
      zzAo().zzCF().zzfg("Audience with no ID");
    }
    label236:
    label281:
    label290:
    label291:
    for (;;)
    {
      return;
      int n = zzaZr.intValue();
      Object localObject = zzaZt;
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        if (zzaZv == null)
        {
          zzAo().zzCF().zze("Event filter with no ID. Audience definition ignored. appId, audienceId", paramString, zzaZr);
          return;
        }
        i += 1;
      }
      localObject = zzaZs;
      j = localObject.length;
      i = 0;
      while (i < j)
      {
        if (zzaZv == null)
        {
          zzAo().zzCF().zze("Property filter with no ID. Audience definition ignored. appId, audienceId", paramString, zzaZr);
          return;
        }
        i += 1;
      }
      int m = 1;
      localObject = zzaZt;
      int i1 = localObject.length;
      j = 0;
      i = m;
      if (j < i1)
      {
        if (!zza(paramString, n, localObject[j])) {
          i = 0;
        }
      }
      else
      {
        if (i == 0) {
          break label290;
        }
        paramzza = zzaZs;
        m = paramzza.length;
        j = 0;
        if (j >= m) {
          break label290;
        }
        if (zza(paramString, n, paramzza[j])) {
          break label281;
        }
        i = k;
      }
      for (;;)
      {
        if (i != 0) {
          break label291;
        }
        zzB(paramString, n);
        return;
        j += 1;
        break;
        j += 1;
        break label236;
      }
    }
  }
  
  private boolean zza(String paramString, int paramInt, zzpz.zzb paramzzb)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzx.zzz(paramzzb);
    if (TextUtils.isEmpty(zzaZw))
    {
      zzAo().zzCF().zze("Event filter had no event name. Audience definition ignored. audienceId, filterId", Integer.valueOf(paramInt), String.valueOf(zzaZv));
      return false;
    }
    try
    {
      byte[] arrayOfByte = new byte[paramzzb.getSerializedSize()];
      Object localObject = zzsn.zzE(arrayOfByte);
      paramzzb.writeTo((zzsn)localObject);
      ((zzsn)localObject).zzJo();
      localObject = new ContentValues();
      ((ContentValues)localObject).put("app_id", paramString);
      ((ContentValues)localObject).put("audience_id", Integer.valueOf(paramInt));
      ((ContentValues)localObject).put("filter_id", zzaZv);
      ((ContentValues)localObject).put("event_name", zzaZw);
      ((ContentValues)localObject).put("data", arrayOfByte);
      return false;
    }
    catch (IOException paramString)
    {
      try
      {
        if (getWritableDatabase().insertWithOnConflict("event_filters", null, (ContentValues)localObject, 5) == -1L) {
          zzAo().zzCE().zzfg("Failed to insert event filter (got -1)");
        }
        return true;
      }
      catch (SQLiteException paramString)
      {
        zzAo().zzCE().zzj("Error storing event filter", paramString);
      }
      paramString = paramString;
      zzAo().zzCE().zzj("Configuration loss. Failed to serialize event filter", paramString);
      return false;
    }
  }
  
  private boolean zza(String paramString, int paramInt, zzpz.zze paramzze)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzx.zzz(paramzze);
    if (TextUtils.isEmpty(zzaZL))
    {
      zzAo().zzCF().zze("Property filter had no property name. Audience definition ignored. audienceId, filterId", Integer.valueOf(paramInt), String.valueOf(zzaZv));
      return false;
    }
    try
    {
      byte[] arrayOfByte = new byte[paramzze.getSerializedSize()];
      Object localObject = zzsn.zzE(arrayOfByte);
      paramzze.writeTo((zzsn)localObject);
      ((zzsn)localObject).zzJo();
      localObject = new ContentValues();
      ((ContentValues)localObject).put("app_id", paramString);
      ((ContentValues)localObject).put("audience_id", Integer.valueOf(paramInt));
      ((ContentValues)localObject).put("filter_id", zzaZv);
      ((ContentValues)localObject).put("property_name", zzaZL);
      ((ContentValues)localObject).put("data", arrayOfByte);
      try
      {
        if (getWritableDatabase().insertWithOnConflict("property_filters", null, (ContentValues)localObject, 5) == -1L)
        {
          zzAo().zzCE().zzfg("Failed to insert property filter (got -1)");
          return false;
        }
      }
      catch (SQLiteException paramString)
      {
        zzAo().zzCE().zzj("Error storing property filter", paramString);
        return false;
      }
      return true;
    }
    catch (IOException paramString)
    {
      zzAo().zzCE().zzj("Configuration loss. Failed to serialize property filter", paramString);
      return false;
    }
  }
  
  private long zzb(String paramString, String[] paramArrayOfString)
  {
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    Object localObject = null;
    String[] arrayOfString = null;
    try
    {
      paramArrayOfString = localSQLiteDatabase.rawQuery(paramString, paramArrayOfString);
      arrayOfString = paramArrayOfString;
      localObject = paramArrayOfString;
      if (paramArrayOfString.moveToFirst())
      {
        arrayOfString = paramArrayOfString;
        localObject = paramArrayOfString;
        long l = paramArrayOfString.getLong(0);
        if (paramArrayOfString != null) {
          paramArrayOfString.close();
        }
        return l;
      }
      arrayOfString = paramArrayOfString;
      localObject = paramArrayOfString;
      throw new SQLiteException("Database returned empty set");
    }
    catch (SQLiteException paramArrayOfString)
    {
      localObject = arrayOfString;
      zzAo().zzCE().zze("Database error", paramString, paramArrayOfString);
      localObject = arrayOfString;
      throw paramArrayOfString;
    }
    finally
    {
      if (localObject != null) {
        ((Cursor)localObject).close();
      }
    }
  }
  
  private String zzjQ()
  {
    if (!zzCp().zzkr()) {
      return zzCp().zzkR();
    }
    if (zzCp().zzks()) {
      return zzCp().zzkR();
    }
    zzAo().zzCG().zzfg("Using secondary database");
    return zzCp().zzkS();
  }
  
  public void beginTransaction()
  {
    zzjv();
    getWritableDatabase().beginTransaction();
  }
  
  public void endTransaction()
  {
    zzjv();
    getWritableDatabase().endTransaction();
  }
  
  SQLiteDatabase getWritableDatabase()
  {
    zzjk();
    try
    {
      SQLiteDatabase localSQLiteDatabase = zzaVC.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzAo().zzCF().zzj("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  public void setTransactionSuccessful()
  {
    zzjv();
    getWritableDatabase().setTransactionSuccessful();
  }
  
  public void zzA(String paramString, int paramInt)
  {
    zzx.zzcM(paramString);
    zzjk();
    zzjv();
    try
    {
      getWritableDatabase().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[] { paramString, paramString, String.valueOf(paramInt) });
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzAo().zzCE().zze("Error pruning currencies", paramString, localSQLiteException);
    }
  }
  
  void zzB(String paramString, int paramInt)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    localSQLiteDatabase.delete("property_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(paramInt) });
    localSQLiteDatabase.delete("event_filters", "app_id=? and audience_id=?", new String[] { paramString, String.valueOf(paramInt) });
  }
  
  /* Error */
  com.google.android.gms.internal.zzqb.zzf zzC(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   4: aload_0
    //   5: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   8: aload_1
    //   9: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore 4
    //   19: aload 4
    //   21: ldc_w 435
    //   24: iconst_1
    //   25: anewarray 294	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: ldc_w 437
    //   33: aastore
    //   34: ldc_w 439
    //   37: iconst_2
    //   38: anewarray 294	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: aload_1
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: iload_2
    //   48: invokestatic 419	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   51: aastore
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   58: astore 5
    //   60: aload 5
    //   62: astore 4
    //   64: aload 5
    //   66: invokeinterface 181 1 0
    //   71: istore_3
    //   72: iload_3
    //   73: ifne +19 -> 92
    //   76: aload 5
    //   78: ifnull +10 -> 88
    //   81: aload 5
    //   83: invokeinterface 188 1 0
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_1
    //   91: areturn
    //   92: aload 5
    //   94: astore 4
    //   96: aload 5
    //   98: iconst_0
    //   99: invokeinterface 447 2 0
    //   104: invokestatic 453	com/google/android/gms/internal/zzsm:zzD	([B)Lcom/google/android/gms/internal/zzsm;
    //   107: astore 7
    //   109: aload 5
    //   111: astore 4
    //   113: new 455	com/google/android/gms/internal/zzqb$zzf
    //   116: dup
    //   117: invokespecial 456	com/google/android/gms/internal/zzqb$zzf:<init>	()V
    //   120: astore 6
    //   122: aload 5
    //   124: astore 4
    //   126: aload 6
    //   128: aload 7
    //   130: invokevirtual 460	com/google/android/gms/internal/zzqb$zzf:zzH	(Lcom/google/android/gms/internal/zzsm;)Lcom/google/android/gms/internal/zzqb$zzf;
    //   133: pop
    //   134: aload 6
    //   136: astore_1
    //   137: aload 5
    //   139: ifnull -49 -> 90
    //   142: aload 5
    //   144: invokeinterface 188 1 0
    //   149: aload 6
    //   151: areturn
    //   152: astore 7
    //   154: aload 5
    //   156: astore 4
    //   158: aload_0
    //   159: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   162: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   165: ldc_w 462
    //   168: aload_1
    //   169: aload 7
    //   171: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   174: goto -40 -> 134
    //   177: astore_1
    //   178: aload 5
    //   180: astore 4
    //   182: aload_0
    //   183: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   186: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   189: ldc_w 464
    //   192: aload_1
    //   193: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   196: aload 5
    //   198: ifnull +10 -> 208
    //   201: aload 5
    //   203: invokeinterface 188 1 0
    //   208: aconst_null
    //   209: areturn
    //   210: astore_1
    //   211: aconst_null
    //   212: astore 4
    //   214: aload 4
    //   216: ifnull +10 -> 226
    //   219: aload 4
    //   221: invokeinterface 188 1 0
    //   226: aload_1
    //   227: athrow
    //   228: astore_1
    //   229: goto -15 -> 214
    //   232: astore_1
    //   233: aconst_null
    //   234: astore 5
    //   236: goto -58 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	zze
    //   0	239	1	paramString	String
    //   0	239	2	paramInt	int
    //   71	2	3	bool	boolean
    //   17	203	4	localObject	Object
    //   58	177	5	localCursor	Cursor
    //   120	30	6	localzzf	com.google.android.gms.internal.zzqb.zzf
    //   107	22	7	localzzsm	com.google.android.gms.internal.zzsm
    //   152	18	7	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   126	134	152	java/io/IOException
    //   64	72	177	android/database/sqlite/SQLiteException
    //   96	109	177	android/database/sqlite/SQLiteException
    //   113	122	177	android/database/sqlite/SQLiteException
    //   126	134	177	android/database/sqlite/SQLiteException
    //   158	174	177	android/database/sqlite/SQLiteException
    //   19	60	210	finally
    //   64	72	228	finally
    //   96	109	228	finally
    //   113	122	228	finally
    //   126	134	228	finally
    //   158	174	228	finally
    //   182	196	228	finally
    //   19	60	232	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public String zzCq()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore_1
    //   8: aload_1
    //   9: ldc_w 467
    //   12: aconst_null
    //   13: invokevirtual 178	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore_1
    //   17: aload_1
    //   18: astore_2
    //   19: aload_1
    //   20: invokeinterface 181 1 0
    //   25: ifeq +29 -> 54
    //   28: aload_1
    //   29: astore_2
    //   30: aload_1
    //   31: iconst_0
    //   32: invokeinterface 470 2 0
    //   37: astore_3
    //   38: aload_3
    //   39: astore_2
    //   40: aload_1
    //   41: ifnull +11 -> 52
    //   44: aload_1
    //   45: invokeinterface 188 1 0
    //   50: aload_3
    //   51: astore_2
    //   52: aload_2
    //   53: areturn
    //   54: aload 4
    //   56: astore_2
    //   57: aload_1
    //   58: ifnull -6 -> 52
    //   61: aload_1
    //   62: invokeinterface 188 1 0
    //   67: aconst_null
    //   68: areturn
    //   69: astore_3
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_1
    //   73: astore_2
    //   74: aload_0
    //   75: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   78: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   81: ldc_w 472
    //   84: aload_3
    //   85: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   88: aload 4
    //   90: astore_2
    //   91: aload_1
    //   92: ifnull -40 -> 52
    //   95: aload_1
    //   96: invokeinterface 188 1 0
    //   101: aconst_null
    //   102: areturn
    //   103: astore_1
    //   104: aconst_null
    //   105: astore_2
    //   106: aload_2
    //   107: ifnull +9 -> 116
    //   110: aload_2
    //   111: invokeinterface 188 1 0
    //   116: aload_1
    //   117: athrow
    //   118: astore_1
    //   119: goto -13 -> 106
    //   122: astore_3
    //   123: goto -51 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	zze
    //   7	89	1	localObject1	Object
    //   103	14	1	localObject2	Object
    //   118	1	1	localObject3	Object
    //   18	93	2	localObject4	Object
    //   37	14	3	str	String
    //   69	16	3	localSQLiteException1	SQLiteException
    //   122	1	3	localSQLiteException2	SQLiteException
    //   1	88	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   8	17	69	android/database/sqlite/SQLiteException
    //   8	17	103	finally
    //   19	28	118	finally
    //   30	38	118	finally
    //   74	88	118	finally
    //   19	28	122	android/database/sqlite/SQLiteException
    //   30	38	122	android/database/sqlite/SQLiteException
  }
  
  void zzCr()
  {
    zzjk();
    zzjv();
    if (!zzCw()) {}
    long l1;
    long l2;
    do
    {
      return;
      l1 = zzCozzaXm.get();
      l2 = zzjl().elapsedRealtime();
    } while (Math.abs(l2 - l1) <= zzCp().zzBR());
    zzCozzaXm.set(l2);
    zzCs();
  }
  
  void zzCs()
  {
    zzjk();
    zzjv();
    if (!zzCw()) {}
    int i;
    do
    {
      return;
      i = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(zzjl().currentTimeMillis()), String.valueOf(zzCp().zzBQ()) });
    } while (i <= 0);
    zzAo().zzCK().zzj("Deleted stale rows. rowsDeleted", Integer.valueOf(i));
  }
  
  public long zzCt()
  {
    return zza("select max(bundle_end_timestamp) from queue", null, 0L);
  }
  
  public long zzCu()
  {
    return zza("select max(timestamp) from raw_events", null, 0L);
  }
  
  public boolean zzCv()
  {
    return zzb("select count(1) > 0 from raw_events", null) != 0L;
  }
  
  /* Error */
  public zzi zzI(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   7: pop
    //   8: aload_2
    //   9: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   17: aload_0
    //   18: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   21: aload_0
    //   22: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: ldc_w 547
    //   28: iconst_3
    //   29: anewarray 294	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc_w 549
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: ldc_w 551
    //   43: aastore
    //   44: dup
    //   45: iconst_2
    //   46: ldc_w 553
    //   49: aastore
    //   50: ldc_w 555
    //   53: iconst_2
    //   54: anewarray 294	java/lang/String
    //   57: dup
    //   58: iconst_0
    //   59: aload_1
    //   60: aastore
    //   61: dup
    //   62: iconst_1
    //   63: aload_2
    //   64: aastore
    //   65: aconst_null
    //   66: aconst_null
    //   67: aconst_null
    //   68: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   71: astore 4
    //   73: aload 4
    //   75: invokeinterface 181 1 0
    //   80: istore_3
    //   81: iload_3
    //   82: ifne +19 -> 101
    //   85: aload 4
    //   87: ifnull +10 -> 97
    //   90: aload 4
    //   92: invokeinterface 188 1 0
    //   97: aconst_null
    //   98: astore_1
    //   99: aload_1
    //   100: areturn
    //   101: new 557	com/google/android/gms/measurement/internal/zzi
    //   104: dup
    //   105: aload_1
    //   106: aload_2
    //   107: aload 4
    //   109: iconst_0
    //   110: invokeinterface 185 2 0
    //   115: aload 4
    //   117: iconst_1
    //   118: invokeinterface 185 2 0
    //   123: aload 4
    //   125: iconst_2
    //   126: invokeinterface 185 2 0
    //   131: invokespecial 560	com/google/android/gms/measurement/internal/zzi:<init>	(Ljava/lang/String;Ljava/lang/String;JJJ)V
    //   134: astore 5
    //   136: aload 4
    //   138: invokeinterface 563 1 0
    //   143: ifeq +16 -> 159
    //   146: aload_0
    //   147: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   150: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   153: ldc_w 565
    //   156: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   159: aload 5
    //   161: astore_1
    //   162: aload 4
    //   164: ifnull -65 -> 99
    //   167: aload 4
    //   169: invokeinterface 188 1 0
    //   174: aload 5
    //   176: areturn
    //   177: astore 5
    //   179: aconst_null
    //   180: astore 4
    //   182: aload_0
    //   183: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   186: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   189: ldc_w 567
    //   192: aload_1
    //   193: aload_2
    //   194: aload 5
    //   196: invokevirtual 571	com/google/android/gms/measurement/internal/zzp$zza:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   199: aload 4
    //   201: ifnull +10 -> 211
    //   204: aload 4
    //   206: invokeinterface 188 1 0
    //   211: aconst_null
    //   212: areturn
    //   213: astore_1
    //   214: aload 5
    //   216: astore_2
    //   217: aload_2
    //   218: ifnull +9 -> 227
    //   221: aload_2
    //   222: invokeinterface 188 1 0
    //   227: aload_1
    //   228: athrow
    //   229: astore_1
    //   230: aload 4
    //   232: astore_2
    //   233: goto -16 -> 217
    //   236: astore_1
    //   237: aload 4
    //   239: astore_2
    //   240: goto -23 -> 217
    //   243: astore 5
    //   245: goto -63 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	zze
    //   0	248	1	paramString1	String
    //   0	248	2	paramString2	String
    //   80	2	3	bool	boolean
    //   71	167	4	localCursor	Cursor
    //   1	174	5	localzzi	zzi
    //   177	38	5	localSQLiteException1	SQLiteException
    //   243	1	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   21	73	177	android/database/sqlite/SQLiteException
    //   21	73	213	finally
    //   73	81	229	finally
    //   101	159	229	finally
    //   182	199	236	finally
    //   73	81	243	android/database/sqlite/SQLiteException
    //   101	159	243	android/database/sqlite/SQLiteException
  }
  
  public void zzJ(String paramString1, String paramString2)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzjk();
    zzjv();
    try
    {
      int i = getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[] { paramString1, paramString2 });
      zzAo().zzCK().zzj("Deleted user attribute rows:", Integer.valueOf(i));
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zzAo().zzCE().zzd("Error deleting user attribute", paramString1, paramString2, localSQLiteException);
    }
  }
  
  /* Error */
  public zzai zzK(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   7: pop
    //   8: aload_2
    //   9: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   17: aload_0
    //   18: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   21: aload_0
    //   22: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: ldc_w 574
    //   28: iconst_2
    //   29: anewarray 294	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: ldc_w 582
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: ldc_w 584
    //   43: aastore
    //   44: ldc_w 555
    //   47: iconst_2
    //   48: anewarray 294	java/lang/String
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: aload_2
    //   58: aastore
    //   59: aconst_null
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   65: astore 4
    //   67: aload 4
    //   69: invokeinterface 181 1 0
    //   74: istore_3
    //   75: iload_3
    //   76: ifne +19 -> 95
    //   79: aload 4
    //   81: ifnull +10 -> 91
    //   84: aload 4
    //   86: invokeinterface 188 1 0
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_1
    //   94: areturn
    //   95: new 586	com/google/android/gms/measurement/internal/zzai
    //   98: dup
    //   99: aload_1
    //   100: aload_2
    //   101: aload 4
    //   103: iconst_0
    //   104: invokeinterface 185 2 0
    //   109: aload_0
    //   110: aload 4
    //   112: iconst_1
    //   113: invokevirtual 589	com/google/android/gms/measurement/internal/zze:zzb	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   116: invokespecial 592	com/google/android/gms/measurement/internal/zzai:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   119: astore 5
    //   121: aload 4
    //   123: invokeinterface 563 1 0
    //   128: ifeq +16 -> 144
    //   131: aload_0
    //   132: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   135: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   138: ldc_w 594
    //   141: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   144: aload 5
    //   146: astore_1
    //   147: aload 4
    //   149: ifnull -56 -> 93
    //   152: aload 4
    //   154: invokeinterface 188 1 0
    //   159: aload 5
    //   161: areturn
    //   162: astore 5
    //   164: aconst_null
    //   165: astore 4
    //   167: aload_0
    //   168: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   171: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   174: ldc_w 596
    //   177: aload_1
    //   178: aload_2
    //   179: aload 5
    //   181: invokevirtual 571	com/google/android/gms/measurement/internal/zzp$zza:zzd	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   184: aload 4
    //   186: ifnull +10 -> 196
    //   189: aload 4
    //   191: invokeinterface 188 1 0
    //   196: aconst_null
    //   197: areturn
    //   198: astore_1
    //   199: aload 5
    //   201: astore_2
    //   202: aload_2
    //   203: ifnull +9 -> 212
    //   206: aload_2
    //   207: invokeinterface 188 1 0
    //   212: aload_1
    //   213: athrow
    //   214: astore_1
    //   215: aload 4
    //   217: astore_2
    //   218: goto -16 -> 202
    //   221: astore_1
    //   222: aload 4
    //   224: astore_2
    //   225: goto -23 -> 202
    //   228: astore 5
    //   230: goto -63 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	this	zze
    //   0	233	1	paramString1	String
    //   0	233	2	paramString2	String
    //   74	2	3	bool	boolean
    //   65	158	4	localCursor	Cursor
    //   1	159	5	localzzai	zzai
    //   162	38	5	localSQLiteException1	SQLiteException
    //   228	1	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   21	67	162	android/database/sqlite/SQLiteException
    //   21	67	198	finally
    //   67	75	214	finally
    //   95	144	214	finally
    //   167	184	221	finally
    //   67	75	228	android/database/sqlite/SQLiteException
    //   95	144	228	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  Map zzL(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   4: aload_0
    //   5: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   8: aload_1
    //   9: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 14	android/support/v4/util/ArrayMap
    //   21: dup
    //   22: invokespecial 599	android/support/v4/util/ArrayMap:<init>	()V
    //   25: astore 8
    //   27: aload_0
    //   28: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore 5
    //   33: aload 5
    //   35: ldc_w 338
    //   38: iconst_2
    //   39: anewarray 294	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: ldc_w 324
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: ldc_w 333
    //   53: aastore
    //   54: ldc_w 601
    //   57: iconst_2
    //   58: anewarray 294	java/lang/String
    //   61: dup
    //   62: iconst_0
    //   63: aload_1
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: aload_2
    //   68: aastore
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 5
    //   77: aload 5
    //   79: astore_2
    //   80: aload 5
    //   82: invokeinterface 181 1 0
    //   87: ifne +24 -> 111
    //   90: aload 5
    //   92: astore_2
    //   93: invokestatic 606	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   96: astore_1
    //   97: aload 5
    //   99: ifnull +10 -> 109
    //   102: aload 5
    //   104: invokeinterface 188 1 0
    //   109: aload_1
    //   110: areturn
    //   111: aload 5
    //   113: astore_2
    //   114: aload 5
    //   116: iconst_1
    //   117: invokeinterface 447 2 0
    //   122: invokestatic 453	com/google/android/gms/internal/zzsm:zzD	([B)Lcom/google/android/gms/internal/zzsm;
    //   125: astore 6
    //   127: aload 5
    //   129: astore_2
    //   130: new 254	com/google/android/gms/internal/zzpz$zzb
    //   133: dup
    //   134: invokespecial 607	com/google/android/gms/internal/zzpz$zzb:<init>	()V
    //   137: astore 9
    //   139: aload 5
    //   141: astore_2
    //   142: aload 9
    //   144: aload 6
    //   146: invokevirtual 611	com/google/android/gms/internal/zzpz$zzb:zzu	(Lcom/google/android/gms/internal/zzsm;)Lcom/google/android/gms/internal/zzpz$zzb;
    //   149: pop
    //   150: aload 5
    //   152: astore_2
    //   153: aload 5
    //   155: iconst_0
    //   156: invokeinterface 614 2 0
    //   161: istore_3
    //   162: aload 5
    //   164: astore_2
    //   165: aload 8
    //   167: iload_3
    //   168: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   171: invokeinterface 616 2 0
    //   176: checkcast 618	java/util/List
    //   179: astore 7
    //   181: aload 7
    //   183: astore 6
    //   185: aload 7
    //   187: ifnonnull +32 -> 219
    //   190: aload 5
    //   192: astore_2
    //   193: new 620	java/util/ArrayList
    //   196: dup
    //   197: invokespecial 621	java/util/ArrayList:<init>	()V
    //   200: astore 6
    //   202: aload 5
    //   204: astore_2
    //   205: aload 8
    //   207: iload_3
    //   208: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   211: aload 6
    //   213: invokeinterface 30 3 0
    //   218: pop
    //   219: aload 5
    //   221: astore_2
    //   222: aload 6
    //   224: aload 9
    //   226: invokeinterface 625 2 0
    //   231: pop
    //   232: aload 5
    //   234: astore_2
    //   235: aload 5
    //   237: invokeinterface 563 1 0
    //   242: istore 4
    //   244: iload 4
    //   246: ifne -135 -> 111
    //   249: aload 5
    //   251: ifnull +10 -> 261
    //   254: aload 5
    //   256: invokeinterface 188 1 0
    //   261: aload 8
    //   263: areturn
    //   264: astore 6
    //   266: aload 5
    //   268: astore_2
    //   269: aload_0
    //   270: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   273: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   276: ldc_w 627
    //   279: aload_1
    //   280: aload 6
    //   282: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   285: goto -53 -> 232
    //   288: astore_1
    //   289: aload 5
    //   291: astore_2
    //   292: aload_0
    //   293: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   296: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   299: ldc_w 629
    //   302: aload_1
    //   303: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   306: aload 5
    //   308: ifnull +10 -> 318
    //   311: aload 5
    //   313: invokeinterface 188 1 0
    //   318: aconst_null
    //   319: areturn
    //   320: astore_1
    //   321: aconst_null
    //   322: astore_2
    //   323: aload_2
    //   324: ifnull +9 -> 333
    //   327: aload_2
    //   328: invokeinterface 188 1 0
    //   333: aload_1
    //   334: athrow
    //   335: astore_1
    //   336: goto -13 -> 323
    //   339: astore_1
    //   340: aconst_null
    //   341: astore 5
    //   343: goto -54 -> 289
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	zze
    //   0	346	1	paramString1	String
    //   0	346	2	paramString2	String
    //   161	47	3	i	int
    //   242	3	4	bool	boolean
    //   31	311	5	localObject1	Object
    //   125	98	6	localObject2	Object
    //   264	17	6	localIOException	IOException
    //   179	7	7	localList	List
    //   25	237	8	localArrayMap	ArrayMap
    //   137	88	9	localzzb	zzpz.zzb
    // Exception table:
    //   from	to	target	type
    //   142	150	264	java/io/IOException
    //   80	90	288	android/database/sqlite/SQLiteException
    //   93	97	288	android/database/sqlite/SQLiteException
    //   114	127	288	android/database/sqlite/SQLiteException
    //   130	139	288	android/database/sqlite/SQLiteException
    //   142	150	288	android/database/sqlite/SQLiteException
    //   153	162	288	android/database/sqlite/SQLiteException
    //   165	181	288	android/database/sqlite/SQLiteException
    //   193	202	288	android/database/sqlite/SQLiteException
    //   205	219	288	android/database/sqlite/SQLiteException
    //   222	232	288	android/database/sqlite/SQLiteException
    //   235	244	288	android/database/sqlite/SQLiteException
    //   269	285	288	android/database/sqlite/SQLiteException
    //   33	77	320	finally
    //   80	90	335	finally
    //   93	97	335	finally
    //   114	127	335	finally
    //   130	139	335	finally
    //   142	150	335	finally
    //   153	162	335	finally
    //   165	181	335	finally
    //   193	202	335	finally
    //   205	219	335	finally
    //   222	232	335	finally
    //   235	244	335	finally
    //   269	285	335	finally
    //   292	306	335	finally
    //   33	77	339	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  Map zzM(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   4: aload_0
    //   5: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   8: aload_1
    //   9: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 14	android/support/v4/util/ArrayMap
    //   21: dup
    //   22: invokespecial 599	android/support/v4/util/ArrayMap:<init>	()V
    //   25: astore 8
    //   27: aload_0
    //   28: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore 5
    //   33: aload 5
    //   35: ldc_w 365
    //   38: iconst_2
    //   39: anewarray 294	java/lang/String
    //   42: dup
    //   43: iconst_0
    //   44: ldc_w 324
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: ldc_w 333
    //   53: aastore
    //   54: ldc_w 632
    //   57: iconst_2
    //   58: anewarray 294	java/lang/String
    //   61: dup
    //   62: iconst_0
    //   63: aload_1
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: aload_2
    //   68: aastore
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 5
    //   77: aload 5
    //   79: astore_2
    //   80: aload 5
    //   82: invokeinterface 181 1 0
    //   87: ifne +24 -> 111
    //   90: aload 5
    //   92: astore_2
    //   93: invokestatic 606	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   96: astore_1
    //   97: aload 5
    //   99: ifnull +10 -> 109
    //   102: aload 5
    //   104: invokeinterface 188 1 0
    //   109: aload_1
    //   110: areturn
    //   111: aload 5
    //   113: astore_2
    //   114: aload 5
    //   116: iconst_1
    //   117: invokeinterface 447 2 0
    //   122: invokestatic 453	com/google/android/gms/internal/zzsm:zzD	([B)Lcom/google/android/gms/internal/zzsm;
    //   125: astore 6
    //   127: aload 5
    //   129: astore_2
    //   130: new 261	com/google/android/gms/internal/zzpz$zze
    //   133: dup
    //   134: invokespecial 633	com/google/android/gms/internal/zzpz$zze:<init>	()V
    //   137: astore 9
    //   139: aload 5
    //   141: astore_2
    //   142: aload 9
    //   144: aload 6
    //   146: invokevirtual 637	com/google/android/gms/internal/zzpz$zze:zzx	(Lcom/google/android/gms/internal/zzsm;)Lcom/google/android/gms/internal/zzpz$zze;
    //   149: pop
    //   150: aload 5
    //   152: astore_2
    //   153: aload 5
    //   155: iconst_0
    //   156: invokeinterface 614 2 0
    //   161: istore_3
    //   162: aload 5
    //   164: astore_2
    //   165: aload 8
    //   167: iload_3
    //   168: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   171: invokeinterface 616 2 0
    //   176: checkcast 618	java/util/List
    //   179: astore 7
    //   181: aload 7
    //   183: astore 6
    //   185: aload 7
    //   187: ifnonnull +32 -> 219
    //   190: aload 5
    //   192: astore_2
    //   193: new 620	java/util/ArrayList
    //   196: dup
    //   197: invokespecial 621	java/util/ArrayList:<init>	()V
    //   200: astore 6
    //   202: aload 5
    //   204: astore_2
    //   205: aload 8
    //   207: iload_3
    //   208: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   211: aload 6
    //   213: invokeinterface 30 3 0
    //   218: pop
    //   219: aload 5
    //   221: astore_2
    //   222: aload 6
    //   224: aload 9
    //   226: invokeinterface 625 2 0
    //   231: pop
    //   232: aload 5
    //   234: astore_2
    //   235: aload 5
    //   237: invokeinterface 563 1 0
    //   242: istore 4
    //   244: iload 4
    //   246: ifne -135 -> 111
    //   249: aload 5
    //   251: ifnull +10 -> 261
    //   254: aload 5
    //   256: invokeinterface 188 1 0
    //   261: aload 8
    //   263: areturn
    //   264: astore 6
    //   266: aload 5
    //   268: astore_2
    //   269: aload_0
    //   270: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   273: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   276: ldc_w 627
    //   279: aload_1
    //   280: aload 6
    //   282: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   285: goto -53 -> 232
    //   288: astore_1
    //   289: aload 5
    //   291: astore_2
    //   292: aload_0
    //   293: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   296: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   299: ldc_w 629
    //   302: aload_1
    //   303: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   306: aload 5
    //   308: ifnull +10 -> 318
    //   311: aload 5
    //   313: invokeinterface 188 1 0
    //   318: aconst_null
    //   319: areturn
    //   320: astore_1
    //   321: aconst_null
    //   322: astore_2
    //   323: aload_2
    //   324: ifnull +9 -> 333
    //   327: aload_2
    //   328: invokeinterface 188 1 0
    //   333: aload_1
    //   334: athrow
    //   335: astore_1
    //   336: goto -13 -> 323
    //   339: astore_1
    //   340: aconst_null
    //   341: astore 5
    //   343: goto -54 -> 289
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	zze
    //   0	346	1	paramString1	String
    //   0	346	2	paramString2	String
    //   161	47	3	i	int
    //   242	3	4	bool	boolean
    //   31	311	5	localObject1	Object
    //   125	98	6	localObject2	Object
    //   264	17	6	localIOException	IOException
    //   179	7	7	localList	List
    //   25	237	8	localArrayMap	ArrayMap
    //   137	88	9	localzze	zzpz.zze
    // Exception table:
    //   from	to	target	type
    //   142	150	264	java/io/IOException
    //   80	90	288	android/database/sqlite/SQLiteException
    //   93	97	288	android/database/sqlite/SQLiteException
    //   114	127	288	android/database/sqlite/SQLiteException
    //   130	139	288	android/database/sqlite/SQLiteException
    //   142	150	288	android/database/sqlite/SQLiteException
    //   153	162	288	android/database/sqlite/SQLiteException
    //   165	181	288	android/database/sqlite/SQLiteException
    //   193	202	288	android/database/sqlite/SQLiteException
    //   205	219	288	android/database/sqlite/SQLiteException
    //   222	232	288	android/database/sqlite/SQLiteException
    //   235	244	288	android/database/sqlite/SQLiteException
    //   269	285	288	android/database/sqlite/SQLiteException
    //   33	77	320	finally
    //   80	90	335	finally
    //   93	97	335	finally
    //   114	127	335	finally
    //   130	139	335	finally
    //   142	150	335	finally
    //   153	162	335	finally
    //   165	181	335	finally
    //   193	202	335	finally
    //   205	219	335	finally
    //   222	232	335	finally
    //   235	244	335	finally
    //   269	285	335	finally
    //   292	306	335	finally
    //   33	77	339	android/database/sqlite/SQLiteException
  }
  
  public void zzZ(long paramLong)
  {
    zzjk();
    zzjv();
    if (getWritableDatabase().delete("queue", "rowid=?", new String[] { String.valueOf(paramLong) }) != 1) {
      zzAo().zzCE().zzfg("Deleted fewer rows from queue than expected");
    }
  }
  
  /* Error */
  public zze.zza zza(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   9: aload_0
    //   10: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   13: new 645	com/google/android/gms/measurement/internal/zze$zza
    //   16: dup
    //   17: invokespecial 646	com/google/android/gms/measurement/internal/zze$zza:<init>	()V
    //   20: astore 8
    //   22: aload_0
    //   23: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 9
    //   28: aload 9
    //   30: ldc_w 648
    //   33: iconst_4
    //   34: anewarray 294	java/lang/String
    //   37: dup
    //   38: iconst_0
    //   39: ldc 52
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: ldc 60
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc 56
    //   51: aastore
    //   52: dup
    //   53: iconst_3
    //   54: ldc 64
    //   56: aastore
    //   57: ldc_w 650
    //   60: iconst_1
    //   61: anewarray 294	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: aload_3
    //   67: aastore
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: astore 6
    //   80: aload 7
    //   82: invokeinterface 181 1 0
    //   87: ifne +36 -> 123
    //   90: aload 7
    //   92: astore 6
    //   94: aload_0
    //   95: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   98: invokevirtual 241	com/google/android/gms/measurement/internal/zzp:zzCF	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   101: ldc_w 652
    //   104: aload_3
    //   105: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   108: aload 7
    //   110: ifnull +10 -> 120
    //   113: aload 7
    //   115: invokeinterface 188 1 0
    //   120: aload 8
    //   122: areturn
    //   123: aload 7
    //   125: astore 6
    //   127: aload 7
    //   129: iconst_0
    //   130: invokeinterface 185 2 0
    //   135: lload_1
    //   136: lcmp
    //   137: ifne +54 -> 191
    //   140: aload 7
    //   142: astore 6
    //   144: aload 8
    //   146: aload 7
    //   148: iconst_1
    //   149: invokeinterface 185 2 0
    //   154: putfield 656	com/google/android/gms/measurement/internal/zze$zza:zzaVF	J
    //   157: aload 7
    //   159: astore 6
    //   161: aload 8
    //   163: aload 7
    //   165: iconst_2
    //   166: invokeinterface 185 2 0
    //   171: putfield 659	com/google/android/gms/measurement/internal/zze$zza:zzaVE	J
    //   174: aload 7
    //   176: astore 6
    //   178: aload 8
    //   180: aload 7
    //   182: iconst_3
    //   183: invokeinterface 185 2 0
    //   188: putfield 662	com/google/android/gms/measurement/internal/zze$zza:zzaVG	J
    //   191: aload 7
    //   193: astore 6
    //   195: aload 8
    //   197: aload 8
    //   199: getfield 656	com/google/android/gms/measurement/internal/zze$zza:zzaVF	J
    //   202: lconst_1
    //   203: ladd
    //   204: putfield 656	com/google/android/gms/measurement/internal/zze$zza:zzaVF	J
    //   207: iload 4
    //   209: ifeq +19 -> 228
    //   212: aload 7
    //   214: astore 6
    //   216: aload 8
    //   218: aload 8
    //   220: getfield 659	com/google/android/gms/measurement/internal/zze$zza:zzaVE	J
    //   223: lconst_1
    //   224: ladd
    //   225: putfield 659	com/google/android/gms/measurement/internal/zze$zza:zzaVE	J
    //   228: iload 5
    //   230: ifeq +19 -> 249
    //   233: aload 7
    //   235: astore 6
    //   237: aload 8
    //   239: aload 8
    //   241: getfield 662	com/google/android/gms/measurement/internal/zze$zza:zzaVG	J
    //   244: lconst_1
    //   245: ladd
    //   246: putfield 662	com/google/android/gms/measurement/internal/zze$zza:zzaVG	J
    //   249: aload 7
    //   251: astore 6
    //   253: new 315	android/content/ContentValues
    //   256: dup
    //   257: invokespecial 317	android/content/ContentValues:<init>	()V
    //   260: astore 10
    //   262: aload 7
    //   264: astore 6
    //   266: aload 10
    //   268: ldc 52
    //   270: lload_1
    //   271: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   274: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   277: aload 7
    //   279: astore 6
    //   281: aload 10
    //   283: ldc 56
    //   285: aload 8
    //   287: getfield 659	com/google/android/gms/measurement/internal/zze$zza:zzaVE	J
    //   290: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   293: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   296: aload 7
    //   298: astore 6
    //   300: aload 10
    //   302: ldc 60
    //   304: aload 8
    //   306: getfield 656	com/google/android/gms/measurement/internal/zze$zza:zzaVF	J
    //   309: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   312: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   315: aload 7
    //   317: astore 6
    //   319: aload 10
    //   321: ldc 64
    //   323: aload 8
    //   325: getfield 662	com/google/android/gms/measurement/internal/zze$zza:zzaVG	J
    //   328: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   331: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   334: aload 7
    //   336: astore 6
    //   338: aload 9
    //   340: ldc_w 648
    //   343: aload 10
    //   345: ldc_w 650
    //   348: iconst_1
    //   349: anewarray 294	java/lang/String
    //   352: dup
    //   353: iconst_0
    //   354: aload_3
    //   355: aastore
    //   356: invokevirtual 674	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   359: pop
    //   360: aload 7
    //   362: ifnull +10 -> 372
    //   365: aload 7
    //   367: invokeinterface 188 1 0
    //   372: aload 8
    //   374: areturn
    //   375: astore_3
    //   376: aconst_null
    //   377: astore 7
    //   379: aload 7
    //   381: astore 6
    //   383: aload_0
    //   384: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   387: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   390: ldc_w 676
    //   393: aload_3
    //   394: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   397: aload 7
    //   399: ifnull +10 -> 409
    //   402: aload 7
    //   404: invokeinterface 188 1 0
    //   409: aload 8
    //   411: areturn
    //   412: astore_3
    //   413: aconst_null
    //   414: astore 6
    //   416: aload 6
    //   418: ifnull +10 -> 428
    //   421: aload 6
    //   423: invokeinterface 188 1 0
    //   428: aload_3
    //   429: athrow
    //   430: astore_3
    //   431: goto -15 -> 416
    //   434: astore_3
    //   435: goto -56 -> 379
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	438	0	this	zze
    //   0	438	1	paramLong	long
    //   0	438	3	paramString	String
    //   0	438	4	paramBoolean1	boolean
    //   0	438	5	paramBoolean2	boolean
    //   78	344	6	localCursor1	Cursor
    //   74	329	7	localCursor2	Cursor
    //   20	390	8	localzza	zze.zza
    //   26	313	9	localSQLiteDatabase	SQLiteDatabase
    //   260	84	10	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   22	76	375	android/database/sqlite/SQLiteException
    //   22	76	412	finally
    //   80	90	430	finally
    //   94	108	430	finally
    //   127	140	430	finally
    //   144	157	430	finally
    //   161	174	430	finally
    //   178	191	430	finally
    //   195	207	430	finally
    //   216	228	430	finally
    //   237	249	430	finally
    //   253	262	430	finally
    //   266	277	430	finally
    //   281	296	430	finally
    //   300	315	430	finally
    //   319	334	430	finally
    //   338	360	430	finally
    //   383	397	430	finally
    //   80	90	434	android/database/sqlite/SQLiteException
    //   94	108	434	android/database/sqlite/SQLiteException
    //   127	140	434	android/database/sqlite/SQLiteException
    //   144	157	434	android/database/sqlite/SQLiteException
    //   161	174	434	android/database/sqlite/SQLiteException
    //   178	191	434	android/database/sqlite/SQLiteException
    //   195	207	434	android/database/sqlite/SQLiteException
    //   216	228	434	android/database/sqlite/SQLiteException
    //   237	249	434	android/database/sqlite/SQLiteException
    //   253	262	434	android/database/sqlite/SQLiteException
    //   266	277	434	android/database/sqlite/SQLiteException
    //   281	296	434	android/database/sqlite/SQLiteException
    //   300	315	434	android/database/sqlite/SQLiteException
    //   319	334	434	android/database/sqlite/SQLiteException
    //   338	360	434	android/database/sqlite/SQLiteException
  }
  
  void zza(ContentValues paramContentValues, String paramString, Object paramObject)
  {
    zzx.zzcM(paramString);
    zzx.zzz(paramObject);
    if ((paramObject instanceof String))
    {
      paramContentValues.put(paramString, (String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramContentValues.put(paramString, (Long)paramObject);
      return;
    }
    if ((paramObject instanceof Float))
    {
      paramContentValues.put(paramString, (Float)paramObject);
      return;
    }
    throw new IllegalArgumentException("Invalid value type");
  }
  
  public void zza(zzqb.zze paramzze)
  {
    zzjk();
    zzjv();
    zzx.zzz(paramzze);
    zzx.zzcM(appId);
    zzx.zzz(zzbaq);
    zzCr();
    long l = zzjl().currentTimeMillis();
    if ((zzbaq.longValue() < l - zzCp().zzBQ()) || (zzbaq.longValue() > zzCp().zzBQ() + l)) {
      zzAo().zzCF().zze("Storing bundle outside of the max uploading time span. now, timestamp", Long.valueOf(l), zzbaq);
    }
    try
    {
      byte[] arrayOfByte = new byte[paramzze.getSerializedSize()];
      Object localObject = zzsn.zzE(arrayOfByte);
      paramzze.writeTo((zzsn)localObject);
      ((zzsn)localObject).zzJo();
      arrayOfByte = zzCk().zzg(arrayOfByte);
      zzAo().zzCK().zzj("Saving bundle, size", Integer.valueOf(arrayOfByte.length));
      localObject = new ContentValues();
      ((ContentValues)localObject).put("app_id", appId);
      ((ContentValues)localObject).put("bundle_end_timestamp", zzbaq);
      ((ContentValues)localObject).put("data", arrayOfByte);
      return;
    }
    catch (IOException paramzze)
    {
      try
      {
        if (getWritableDatabase().insert("queue", null, (ContentValues)localObject) == -1L) {
          zzAo().zzCE().zzfg("Failed to insert bundle (got -1)");
        }
        return;
      }
      catch (SQLiteException paramzze)
      {
        zzAo().zzCE().zzj("Error storing bundle", paramzze);
      }
      paramzze = paramzze;
      zzAo().zzCE().zzj("Data loss. Failed to serialize bundle", paramzze);
      return;
    }
  }
  
  public void zza(zza paramzza)
  {
    zzx.zzz(paramzza);
    zzjk();
    zzjv();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramzza.zzwK());
    localContentValues.put("app_instance_id", paramzza.zzBj());
    localContentValues.put("gmp_app_id", paramzza.zzBk());
    localContentValues.put("resettable_device_id_hash", paramzza.zzBl());
    localContentValues.put("last_bundle_index", Long.valueOf(paramzza.zzBr()));
    localContentValues.put("last_bundle_start_timestamp", Long.valueOf(paramzza.zzBm()));
    localContentValues.put("last_bundle_end_timestamp", Long.valueOf(paramzza.zzBn()));
    localContentValues.put("app_version", paramzza.zzli());
    localContentValues.put("app_store", paramzza.zzBo());
    localContentValues.put("gmp_version", Long.valueOf(paramzza.zzBp()));
    localContentValues.put("dev_cert_hash", Long.valueOf(paramzza.zzBq()));
    localContentValues.put("measurement_enabled", Boolean.valueOf(paramzza.zzAr()));
    localContentValues.put("day", Long.valueOf(paramzza.zzBv()));
    localContentValues.put("daily_public_events_count", Long.valueOf(paramzza.zzBw()));
    localContentValues.put("daily_events_count", Long.valueOf(paramzza.zzBx()));
    localContentValues.put("daily_conversions_count", Long.valueOf(paramzza.zzBy()));
    localContentValues.put("config_fetched_time", Long.valueOf(paramzza.zzBs()));
    localContentValues.put("failed_config_fetch_time", Long.valueOf(paramzza.zzBt()));
    try
    {
      if (getWritableDatabase().insertWithOnConflict("apps", null, localContentValues, 5) == -1L) {
        zzAo().zzCE().zzfg("Failed to insert/update app (got -1)");
      }
      return;
    }
    catch (SQLiteException paramzza)
    {
      zzAo().zzCE().zzj("Error storing app", paramzza);
    }
  }
  
  /* Error */
  public void zza(zzh paramzzh, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   4: aload_0
    //   5: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   8: aload_1
    //   9: invokestatic 224	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: pop
    //   13: aload_1
    //   14: getfield 815	com/google/android/gms/measurement/internal/zzh:zzaUa	Ljava/lang/String;
    //   17: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   20: pop
    //   21: new 817	com/google/android/gms/internal/zzqb$zzb
    //   24: dup
    //   25: invokespecial 818	com/google/android/gms/internal/zzqb$zzb:<init>	()V
    //   28: astore 5
    //   30: aload 5
    //   32: aload_1
    //   33: getfield 821	com/google/android/gms/measurement/internal/zzh:zzaVN	J
    //   36: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   39: putfield 824	com/google/android/gms/internal/zzqb$zzb:zzbag	Ljava/lang/Long;
    //   42: aload 5
    //   44: aload_1
    //   45: getfield 828	com/google/android/gms/measurement/internal/zzh:zzaVO	Lcom/google/android/gms/measurement/internal/EventParams;
    //   48: invokevirtual 833	com/google/android/gms/measurement/internal/EventParams:size	()I
    //   51: anewarray 835	com/google/android/gms/internal/zzqb$zzc
    //   54: putfield 839	com/google/android/gms/internal/zzqb$zzb:zzbae	[Lcom/google/android/gms/internal/zzqb$zzc;
    //   57: aload_1
    //   58: getfield 828	com/google/android/gms/measurement/internal/zzh:zzaVO	Lcom/google/android/gms/measurement/internal/EventParams;
    //   61: invokevirtual 843	com/google/android/gms/measurement/internal/EventParams:iterator	()Ljava/util/Iterator;
    //   64: astore 6
    //   66: iconst_0
    //   67: istore 4
    //   69: aload 6
    //   71: invokeinterface 848 1 0
    //   76: ifeq +72 -> 148
    //   79: aload 6
    //   81: invokeinterface 852 1 0
    //   86: checkcast 294	java/lang/String
    //   89: astore 8
    //   91: new 835	com/google/android/gms/internal/zzqb$zzc
    //   94: dup
    //   95: invokespecial 853	com/google/android/gms/internal/zzqb$zzc:<init>	()V
    //   98: astore 7
    //   100: aload 5
    //   102: getfield 839	com/google/android/gms/internal/zzqb$zzb:zzbae	[Lcom/google/android/gms/internal/zzqb$zzc;
    //   105: iload 4
    //   107: aload 7
    //   109: aastore
    //   110: aload 7
    //   112: aload 8
    //   114: putfield 856	com/google/android/gms/internal/zzqb$zzc:name	Ljava/lang/String;
    //   117: aload_1
    //   118: getfield 828	com/google/android/gms/measurement/internal/zzh:zzaVO	Lcom/google/android/gms/measurement/internal/EventParams;
    //   121: aload 8
    //   123: invokevirtual 859	com/google/android/gms/measurement/internal/EventParams:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   126: astore 8
    //   128: aload_0
    //   129: invokevirtual 710	com/google/android/gms/measurement/internal/zze:zzCk	()Lcom/google/android/gms/measurement/internal/zzaj;
    //   132: aload 7
    //   134: aload 8
    //   136: invokevirtual 862	com/google/android/gms/measurement/internal/zzaj:zza	(Lcom/google/android/gms/internal/zzqb$zzc;Ljava/lang/Object;)V
    //   139: iload 4
    //   141: iconst_1
    //   142: iadd
    //   143: istore 4
    //   145: goto -76 -> 69
    //   148: aload 5
    //   150: invokevirtual 863	com/google/android/gms/internal/zzqb$zzb:getSerializedSize	()I
    //   153: newarray <illegal type>
    //   155: astore 6
    //   157: aload 6
    //   159: invokestatic 306	com/google/android/gms/internal/zzsn:zzE	([B)Lcom/google/android/gms/internal/zzsn;
    //   162: astore 7
    //   164: aload 5
    //   166: aload 7
    //   168: invokevirtual 864	com/google/android/gms/internal/zzqb$zzb:writeTo	(Lcom/google/android/gms/internal/zzsn;)V
    //   171: aload 7
    //   173: invokevirtual 313	com/google/android/gms/internal/zzsn:zzJo	()V
    //   176: aload_0
    //   177: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   180: invokevirtual 528	com/google/android/gms/measurement/internal/zzp:zzCK	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   183: ldc_w 866
    //   186: aload_1
    //   187: getfield 869	com/google/android/gms/measurement/internal/zzh:mName	Ljava/lang/String;
    //   190: aload 6
    //   192: arraylength
    //   193: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   196: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   199: new 315	android/content/ContentValues
    //   202: dup
    //   203: invokespecial 317	android/content/ContentValues:<init>	()V
    //   206: astore 5
    //   208: aload 5
    //   210: ldc_w 319
    //   213: aload_1
    //   214: getfield 815	com/google/android/gms/measurement/internal/zzh:zzaUa	Ljava/lang/String;
    //   217: invokevirtual 322	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload 5
    //   222: ldc_w 870
    //   225: aload_1
    //   226: getfield 869	com/google/android/gms/measurement/internal/zzh:mName	Ljava/lang/String;
    //   229: invokevirtual 322	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   232: aload 5
    //   234: ldc_w 872
    //   237: aload_1
    //   238: getfield 875	com/google/android/gms/measurement/internal/zzh:zzaez	J
    //   241: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   244: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   247: aload 5
    //   249: ldc_w 877
    //   252: lload_2
    //   253: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   256: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   259: aload 5
    //   261: ldc_w 333
    //   264: aload 6
    //   266: invokevirtual 336	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   269: aload_0
    //   270: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   273: ldc_w 879
    //   276: aconst_null
    //   277: aload 5
    //   279: invokevirtual 724	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   282: ldc2_w 343
    //   285: lcmp
    //   286: ifne +16 -> 302
    //   289: aload_0
    //   290: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   293: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   296: ldc_w 881
    //   299: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   302: return
    //   303: astore_1
    //   304: aload_0
    //   305: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   308: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   311: ldc_w 883
    //   314: aload_1
    //   315: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   318: return
    //   319: astore_1
    //   320: aload_0
    //   321: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   324: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   327: ldc_w 885
    //   330: aload_1
    //   331: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   334: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	335	0	this	zze
    //   0	335	1	paramzzh	zzh
    //   0	335	2	paramLong	long
    //   67	77	4	i	int
    //   28	250	5	localObject1	Object
    //   64	201	6	localObject2	Object
    //   98	74	7	localObject3	Object
    //   89	46	8	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   148	176	303	java/io/IOException
    //   269	302	319	android/database/sqlite/SQLiteException
  }
  
  public void zza(zzi paramzzi)
  {
    zzx.zzz(paramzzi);
    zzjk();
    zzjv();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", zzaUa);
    localContentValues.put("name", mName);
    localContentValues.put("lifetime_count", Long.valueOf(zzaVP));
    localContentValues.put("current_bundle_count", Long.valueOf(zzaVQ));
    localContentValues.put("last_fire_timestamp", Long.valueOf(zzaVR));
    try
    {
      if (getWritableDatabase().insertWithOnConflict("events", null, localContentValues, 5) == -1L) {
        zzAo().zzCE().zzfg("Failed to insert/update event aggregates (got -1)");
      }
      return;
    }
    catch (SQLiteException paramzzi)
    {
      zzAo().zzCE().zzj("Error storing event aggregates", paramzzi);
    }
  }
  
  /* Error */
  void zza(String paramString, int paramInt, com.google.android.gms.internal.zzqb.zzf paramzzf)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   4: aload_0
    //   5: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   8: aload_1
    //   9: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_3
    //   14: invokestatic 224	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   17: pop
    //   18: aload_3
    //   19: invokevirtual 903	com/google/android/gms/internal/zzqb$zzf:getSerializedSize	()I
    //   22: newarray <illegal type>
    //   24: astore 4
    //   26: aload 4
    //   28: invokestatic 306	com/google/android/gms/internal/zzsn:zzE	([B)Lcom/google/android/gms/internal/zzsn;
    //   31: astore 5
    //   33: aload_3
    //   34: aload 5
    //   36: invokevirtual 904	com/google/android/gms/internal/zzqb$zzf:writeTo	(Lcom/google/android/gms/internal/zzsn;)V
    //   39: aload 5
    //   41: invokevirtual 313	com/google/android/gms/internal/zzsn:zzJo	()V
    //   44: new 315	android/content/ContentValues
    //   47: dup
    //   48: invokespecial 317	android/content/ContentValues:<init>	()V
    //   51: astore_3
    //   52: aload_3
    //   53: ldc_w 319
    //   56: aload_1
    //   57: invokevirtual 322	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload_3
    //   61: ldc_w 324
    //   64: iload_2
    //   65: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   68: invokevirtual 327	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   71: aload_3
    //   72: ldc_w 437
    //   75: aload 4
    //   77: invokevirtual 336	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   80: aload_0
    //   81: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   84: ldc_w 435
    //   87: aconst_null
    //   88: aload_3
    //   89: iconst_5
    //   90: invokevirtual 342	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   93: ldc2_w 343
    //   96: lcmp
    //   97: ifne +16 -> 113
    //   100: aload_0
    //   101: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   104: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   107: ldc_w 906
    //   110: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   113: return
    //   114: astore_1
    //   115: aload_0
    //   116: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   119: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   122: ldc_w 908
    //   125: aload_1
    //   126: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   129: return
    //   130: astore_1
    //   131: aload_0
    //   132: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   135: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   138: ldc_w 910
    //   141: aload_1
    //   142: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   145: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	zze
    //   0	146	1	paramString	String
    //   0	146	2	paramInt	int
    //   0	146	3	paramzzf	com.google.android.gms.internal.zzqb.zzf
    //   24	52	4	arrayOfByte	byte[]
    //   31	9	5	localzzsn	zzsn
    // Exception table:
    //   from	to	target	type
    //   18	44	114	java/io/IOException
    //   80	113	130	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public void zza(String paramString, long paramLong, zze.zzb paramzzb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aload 4
    //   5: invokestatic 224	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   8: pop
    //   9: aload_0
    //   10: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   13: aload_0
    //   14: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   17: aload 7
    //   19: astore 6
    //   21: aload_0
    //   22: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: astore 10
    //   27: aload 7
    //   29: astore 6
    //   31: aload_1
    //   32: invokestatic 286	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   35: ifeq +204 -> 239
    //   38: aload 7
    //   40: astore 6
    //   42: aload 10
    //   44: ldc_w 913
    //   47: iconst_1
    //   48: anewarray 294	java/lang/String
    //   51: dup
    //   52: iconst_0
    //   53: lload_2
    //   54: invokestatic 522	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   57: aastore
    //   58: invokevirtual 178	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore_1
    //   62: aload_1
    //   63: astore 6
    //   65: aload_1
    //   66: astore 7
    //   68: aload_1
    //   69: invokeinterface 181 1 0
    //   74: istore 5
    //   76: iload 5
    //   78: ifne +14 -> 92
    //   81: aload_1
    //   82: ifnull +9 -> 91
    //   85: aload_1
    //   86: invokeinterface 188 1 0
    //   91: return
    //   92: aload_1
    //   93: astore 6
    //   95: aload_1
    //   96: astore 7
    //   98: aload_1
    //   99: iconst_0
    //   100: invokeinterface 470 2 0
    //   105: astore 8
    //   107: aload_1
    //   108: astore 6
    //   110: aload_1
    //   111: astore 7
    //   113: aload_1
    //   114: iconst_1
    //   115: invokeinterface 470 2 0
    //   120: astore 9
    //   122: aload_1
    //   123: astore 6
    //   125: aload_1
    //   126: astore 7
    //   128: aload_1
    //   129: invokeinterface 188 1 0
    //   134: aload 9
    //   136: astore 7
    //   138: aload_1
    //   139: astore 6
    //   141: aload 6
    //   143: astore_1
    //   144: aload 10
    //   146: ldc_w 915
    //   149: iconst_1
    //   150: anewarray 294	java/lang/String
    //   153: dup
    //   154: iconst_0
    //   155: ldc_w 917
    //   158: aastore
    //   159: ldc_w 919
    //   162: iconst_2
    //   163: anewarray 294	java/lang/String
    //   166: dup
    //   167: iconst_0
    //   168: aload 8
    //   170: aastore
    //   171: dup
    //   172: iconst_1
    //   173: aload 7
    //   175: aastore
    //   176: aconst_null
    //   177: aconst_null
    //   178: ldc_w 921
    //   181: ldc_w 923
    //   184: invokevirtual 926	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   187: astore 9
    //   189: aload 9
    //   191: astore_1
    //   192: aload 9
    //   194: astore 6
    //   196: aload 9
    //   198: invokeinterface 181 1 0
    //   203: ifne +140 -> 343
    //   206: aload 9
    //   208: astore_1
    //   209: aload 9
    //   211: astore 6
    //   213: aload_0
    //   214: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   217: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   220: ldc_w 928
    //   223: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   226: aload 9
    //   228: ifnull -137 -> 91
    //   231: aload 9
    //   233: invokeinterface 188 1 0
    //   238: return
    //   239: aload 7
    //   241: astore 6
    //   243: aload 10
    //   245: ldc_w 930
    //   248: iconst_1
    //   249: anewarray 294	java/lang/String
    //   252: dup
    //   253: iconst_0
    //   254: aload_1
    //   255: aastore
    //   256: invokevirtual 178	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   259: astore 8
    //   261: aload 8
    //   263: astore 6
    //   265: aload 8
    //   267: astore 7
    //   269: aload 8
    //   271: invokeinterface 181 1 0
    //   276: istore 5
    //   278: iload 5
    //   280: ifne +16 -> 296
    //   283: aload 8
    //   285: ifnull -194 -> 91
    //   288: aload 8
    //   290: invokeinterface 188 1 0
    //   295: return
    //   296: aload 8
    //   298: astore 6
    //   300: aload 8
    //   302: astore 7
    //   304: aload 8
    //   306: iconst_0
    //   307: invokeinterface 470 2 0
    //   312: astore 9
    //   314: aload 8
    //   316: astore 6
    //   318: aload 8
    //   320: astore 7
    //   322: aload 8
    //   324: invokeinterface 188 1 0
    //   329: aload 8
    //   331: astore 6
    //   333: aload 9
    //   335: astore 7
    //   337: aload_1
    //   338: astore 8
    //   340: goto -199 -> 141
    //   343: aload 9
    //   345: astore_1
    //   346: aload 9
    //   348: astore 6
    //   350: aload 9
    //   352: iconst_0
    //   353: invokeinterface 447 2 0
    //   358: invokestatic 453	com/google/android/gms/internal/zzsm:zzD	([B)Lcom/google/android/gms/internal/zzsm;
    //   361: astore 11
    //   363: aload 9
    //   365: astore_1
    //   366: aload 9
    //   368: astore 6
    //   370: new 690	com/google/android/gms/internal/zzqb$zze
    //   373: dup
    //   374: invokespecial 931	com/google/android/gms/internal/zzqb$zze:<init>	()V
    //   377: astore 12
    //   379: aload 9
    //   381: astore_1
    //   382: aload 9
    //   384: astore 6
    //   386: aload 12
    //   388: aload 11
    //   390: invokevirtual 935	com/google/android/gms/internal/zzqb$zze:zzG	(Lcom/google/android/gms/internal/zzsm;)Lcom/google/android/gms/internal/zzqb$zze;
    //   393: pop
    //   394: aload 9
    //   396: astore_1
    //   397: aload 9
    //   399: astore 6
    //   401: aload 9
    //   403: invokeinterface 563 1 0
    //   408: ifeq +23 -> 431
    //   411: aload 9
    //   413: astore_1
    //   414: aload 9
    //   416: astore 6
    //   418: aload_0
    //   419: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   422: invokevirtual 241	com/google/android/gms/measurement/internal/zzp:zzCF	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   425: ldc_w 937
    //   428: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   431: aload 9
    //   433: astore_1
    //   434: aload 9
    //   436: astore 6
    //   438: aload 9
    //   440: invokeinterface 188 1 0
    //   445: aload 9
    //   447: astore_1
    //   448: aload 9
    //   450: astore 6
    //   452: aload 4
    //   454: aload 12
    //   456: invokeinterface 942 2 0
    //   461: aload 9
    //   463: astore_1
    //   464: aload 9
    //   466: astore 6
    //   468: aload 10
    //   470: ldc_w 879
    //   473: iconst_4
    //   474: anewarray 294	java/lang/String
    //   477: dup
    //   478: iconst_0
    //   479: ldc_w 921
    //   482: aastore
    //   483: dup
    //   484: iconst_1
    //   485: ldc_w 870
    //   488: aastore
    //   489: dup
    //   490: iconst_2
    //   491: ldc_w 872
    //   494: aastore
    //   495: dup
    //   496: iconst_3
    //   497: ldc_w 333
    //   500: aastore
    //   501: ldc_w 919
    //   504: iconst_2
    //   505: anewarray 294	java/lang/String
    //   508: dup
    //   509: iconst_0
    //   510: aload 8
    //   512: aastore
    //   513: dup
    //   514: iconst_1
    //   515: aload 7
    //   517: aastore
    //   518: aconst_null
    //   519: aconst_null
    //   520: ldc_w 921
    //   523: aconst_null
    //   524: invokevirtual 926	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   527: astore 7
    //   529: aload 7
    //   531: astore_1
    //   532: aload_1
    //   533: astore 6
    //   535: aload_1
    //   536: astore 7
    //   538: aload_1
    //   539: invokeinterface 181 1 0
    //   544: ifne +72 -> 616
    //   547: aload_1
    //   548: astore 6
    //   550: aload_1
    //   551: astore 7
    //   553: aload_0
    //   554: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   557: invokevirtual 241	com/google/android/gms/measurement/internal/zzp:zzCF	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   560: ldc_w 944
    //   563: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   566: aload_1
    //   567: ifnull -476 -> 91
    //   570: aload_1
    //   571: invokeinterface 188 1 0
    //   576: return
    //   577: astore 4
    //   579: aload 9
    //   581: astore_1
    //   582: aload 9
    //   584: astore 6
    //   586: aload_0
    //   587: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   590: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   593: ldc_w 946
    //   596: aload 8
    //   598: aload 4
    //   600: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   603: aload 9
    //   605: ifnull -514 -> 91
    //   608: aload 9
    //   610: invokeinterface 188 1 0
    //   615: return
    //   616: aload_1
    //   617: astore 6
    //   619: aload_1
    //   620: astore 7
    //   622: aload_1
    //   623: iconst_0
    //   624: invokeinterface 185 2 0
    //   629: lstore_2
    //   630: aload_1
    //   631: astore 6
    //   633: aload_1
    //   634: astore 7
    //   636: aload_1
    //   637: iconst_3
    //   638: invokeinterface 447 2 0
    //   643: invokestatic 453	com/google/android/gms/internal/zzsm:zzD	([B)Lcom/google/android/gms/internal/zzsm;
    //   646: astore 9
    //   648: aload_1
    //   649: astore 6
    //   651: aload_1
    //   652: astore 7
    //   654: new 817	com/google/android/gms/internal/zzqb$zzb
    //   657: dup
    //   658: invokespecial 818	com/google/android/gms/internal/zzqb$zzb:<init>	()V
    //   661: astore 10
    //   663: aload_1
    //   664: astore 6
    //   666: aload_1
    //   667: astore 7
    //   669: aload 10
    //   671: aload 9
    //   673: invokevirtual 949	com/google/android/gms/internal/zzqb$zzb:zzD	(Lcom/google/android/gms/internal/zzsm;)Lcom/google/android/gms/internal/zzqb$zzb;
    //   676: pop
    //   677: aload_1
    //   678: astore 6
    //   680: aload_1
    //   681: astore 7
    //   683: aload 10
    //   685: aload_1
    //   686: iconst_1
    //   687: invokeinterface 470 2 0
    //   692: putfield 950	com/google/android/gms/internal/zzqb$zzb:name	Ljava/lang/String;
    //   695: aload_1
    //   696: astore 6
    //   698: aload_1
    //   699: astore 7
    //   701: aload 10
    //   703: aload_1
    //   704: iconst_2
    //   705: invokeinterface 185 2 0
    //   710: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   713: putfield 953	com/google/android/gms/internal/zzqb$zzb:zzbaf	Ljava/lang/Long;
    //   716: aload_1
    //   717: astore 6
    //   719: aload_1
    //   720: astore 7
    //   722: aload 4
    //   724: lload_2
    //   725: aload 10
    //   727: invokeinterface 956 4 0
    //   732: istore 5
    //   734: iload 5
    //   736: ifne +39 -> 775
    //   739: aload_1
    //   740: ifnull -649 -> 91
    //   743: aload_1
    //   744: invokeinterface 188 1 0
    //   749: return
    //   750: astore 9
    //   752: aload_1
    //   753: astore 6
    //   755: aload_1
    //   756: astore 7
    //   758: aload_0
    //   759: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   762: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   765: ldc_w 958
    //   768: aload 8
    //   770: aload 9
    //   772: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   775: aload_1
    //   776: astore 6
    //   778: aload_1
    //   779: astore 7
    //   781: aload_1
    //   782: invokeinterface 563 1 0
    //   787: istore 5
    //   789: iload 5
    //   791: ifne -175 -> 616
    //   794: aload_1
    //   795: ifnull -704 -> 91
    //   798: aload_1
    //   799: invokeinterface 188 1 0
    //   804: return
    //   805: astore_1
    //   806: aload 6
    //   808: astore 7
    //   810: aload_0
    //   811: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   814: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   817: ldc_w 960
    //   820: aload_1
    //   821: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   824: aload 6
    //   826: ifnull -735 -> 91
    //   829: aload 6
    //   831: invokeinterface 188 1 0
    //   836: return
    //   837: astore 4
    //   839: aconst_null
    //   840: astore_1
    //   841: aload_1
    //   842: ifnull +9 -> 851
    //   845: aload_1
    //   846: invokeinterface 188 1 0
    //   851: aload 4
    //   853: athrow
    //   854: astore 4
    //   856: aload 7
    //   858: astore_1
    //   859: goto -18 -> 841
    //   862: astore 4
    //   864: goto -23 -> 841
    //   867: astore_1
    //   868: goto -62 -> 806
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	871	0	this	zze
    //   0	871	1	paramString	String
    //   0	871	2	paramLong	long
    //   0	871	4	paramzzb	zze.zzb
    //   74	716	5	bool	boolean
    //   19	811	6	localObject1	Object
    //   1	856	7	localObject2	Object
    //   105	664	8	localObject3	Object
    //   120	552	9	localObject4	Object
    //   750	21	9	localIOException	IOException
    //   25	701	10	localObject5	Object
    //   361	28	11	localzzsm	com.google.android.gms.internal.zzsm
    //   377	78	12	localzze	zzqb.zze
    // Exception table:
    //   from	to	target	type
    //   386	394	577	java/io/IOException
    //   669	677	750	java/io/IOException
    //   21	27	805	android/database/sqlite/SQLiteException
    //   31	38	805	android/database/sqlite/SQLiteException
    //   42	62	805	android/database/sqlite/SQLiteException
    //   68	76	805	android/database/sqlite/SQLiteException
    //   98	107	805	android/database/sqlite/SQLiteException
    //   113	122	805	android/database/sqlite/SQLiteException
    //   128	134	805	android/database/sqlite/SQLiteException
    //   243	261	805	android/database/sqlite/SQLiteException
    //   269	278	805	android/database/sqlite/SQLiteException
    //   304	314	805	android/database/sqlite/SQLiteException
    //   322	329	805	android/database/sqlite/SQLiteException
    //   538	547	805	android/database/sqlite/SQLiteException
    //   553	566	805	android/database/sqlite/SQLiteException
    //   622	630	805	android/database/sqlite/SQLiteException
    //   636	648	805	android/database/sqlite/SQLiteException
    //   654	663	805	android/database/sqlite/SQLiteException
    //   669	677	805	android/database/sqlite/SQLiteException
    //   683	695	805	android/database/sqlite/SQLiteException
    //   701	716	805	android/database/sqlite/SQLiteException
    //   722	734	805	android/database/sqlite/SQLiteException
    //   758	775	805	android/database/sqlite/SQLiteException
    //   781	789	805	android/database/sqlite/SQLiteException
    //   21	27	837	finally
    //   31	38	837	finally
    //   42	62	837	finally
    //   243	261	837	finally
    //   68	76	854	finally
    //   98	107	854	finally
    //   113	122	854	finally
    //   128	134	854	finally
    //   269	278	854	finally
    //   304	314	854	finally
    //   322	329	854	finally
    //   538	547	854	finally
    //   553	566	854	finally
    //   622	630	854	finally
    //   636	648	854	finally
    //   654	663	854	finally
    //   669	677	854	finally
    //   683	695	854	finally
    //   701	716	854	finally
    //   722	734	854	finally
    //   758	775	854	finally
    //   781	789	854	finally
    //   810	824	854	finally
    //   144	189	862	finally
    //   196	206	862	finally
    //   213	226	862	finally
    //   350	363	862	finally
    //   370	379	862	finally
    //   386	394	862	finally
    //   401	411	862	finally
    //   418	431	862	finally
    //   438	445	862	finally
    //   452	461	862	finally
    //   468	529	862	finally
    //   586	603	862	finally
    //   144	189	867	android/database/sqlite/SQLiteException
    //   196	206	867	android/database/sqlite/SQLiteException
    //   213	226	867	android/database/sqlite/SQLiteException
    //   350	363	867	android/database/sqlite/SQLiteException
    //   370	379	867	android/database/sqlite/SQLiteException
    //   386	394	867	android/database/sqlite/SQLiteException
    //   401	411	867	android/database/sqlite/SQLiteException
    //   418	431	867	android/database/sqlite/SQLiteException
    //   438	445	867	android/database/sqlite/SQLiteException
    //   452	461	867	android/database/sqlite/SQLiteException
    //   468	529	867	android/database/sqlite/SQLiteException
    //   586	603	867	android/database/sqlite/SQLiteException
  }
  
  public boolean zza(zzai paramzzai)
  {
    zzx.zzz(paramzzai);
    zzjk();
    zzjv();
    if (zzK(zzaUa, mName) == null) {
      if (zzaj.zzfq(mName))
      {
        if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { zzaUa }) < zzCp().zzBL()) {}
      }
      else {
        while (zzb("select count(1) from user_attributes where app_id=?", new String[] { zzaUa }) >= zzCp().zzBM()) {
          return false;
        }
      }
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", zzaUa);
    localContentValues.put("name", mName);
    localContentValues.put("set_timestamp", Long.valueOf(zzaZp));
    zza(localContentValues, "value", zzNc);
    try
    {
      if (getWritableDatabase().insertWithOnConflict("user_attributes", null, localContentValues, 5) == -1L) {
        zzAo().zzCE().zzfg("Failed to insert/update user property (got -1)");
      }
      return true;
    }
    catch (SQLiteException paramzzai)
    {
      for (;;)
      {
        zzAo().zzCE().zzj("Error storing user property", paramzzai);
      }
    }
  }
  
  /* Error */
  public String zzaa(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   7: aload_0
    //   8: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   11: aload_0
    //   12: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   15: ldc_w 995
    //   18: iconst_1
    //   19: anewarray 294	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: lload_1
    //   25: invokestatic 522	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   28: aastore
    //   29: invokevirtual 178	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore_3
    //   33: aload_3
    //   34: astore 4
    //   36: aload_3
    //   37: invokeinterface 181 1 0
    //   42: ifne +40 -> 82
    //   45: aload_3
    //   46: astore 4
    //   48: aload_0
    //   49: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   52: invokevirtual 528	com/google/android/gms/measurement/internal/zzp:zzCK	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   55: ldc_w 997
    //   58: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   61: aload 6
    //   63: astore 4
    //   65: aload_3
    //   66: ifnull +13 -> 79
    //   69: aload_3
    //   70: invokeinterface 188 1 0
    //   75: aload 6
    //   77: astore 4
    //   79: aload 4
    //   81: areturn
    //   82: aload_3
    //   83: astore 4
    //   85: aload_3
    //   86: iconst_0
    //   87: invokeinterface 470 2 0
    //   92: astore 5
    //   94: aload 5
    //   96: astore 4
    //   98: aload_3
    //   99: ifnull -20 -> 79
    //   102: aload_3
    //   103: invokeinterface 188 1 0
    //   108: aload 5
    //   110: areturn
    //   111: astore 5
    //   113: aconst_null
    //   114: astore_3
    //   115: aload_3
    //   116: astore 4
    //   118: aload_0
    //   119: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   122: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   125: ldc_w 999
    //   128: aload 5
    //   130: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   133: aload 6
    //   135: astore 4
    //   137: aload_3
    //   138: ifnull -59 -> 79
    //   141: aload_3
    //   142: invokeinterface 188 1 0
    //   147: aconst_null
    //   148: areturn
    //   149: astore_3
    //   150: aconst_null
    //   151: astore 4
    //   153: aload 4
    //   155: ifnull +10 -> 165
    //   158: aload 4
    //   160: invokeinterface 188 1 0
    //   165: aload_3
    //   166: athrow
    //   167: astore_3
    //   168: goto -15 -> 153
    //   171: astore 5
    //   173: goto -58 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	this	zze
    //   0	176	1	paramLong	long
    //   32	110	3	localCursor	Cursor
    //   149	17	3	localObject1	Object
    //   167	1	3	localObject2	Object
    //   34	125	4	localObject3	Object
    //   92	17	5	str	String
    //   111	18	5	localSQLiteException1	SQLiteException
    //   171	1	5	localSQLiteException2	SQLiteException
    //   1	133	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   11	33	111	android/database/sqlite/SQLiteException
    //   11	33	149	finally
    //   36	45	167	finally
    //   48	61	167	finally
    //   85	94	167	finally
    //   118	133	167	finally
    //   36	45	171	android/database/sqlite/SQLiteException
    //   48	61	171	android/database/sqlite/SQLiteException
    //   85	94	171	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public long zzb(zzqb.zze paramzze)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   4: aload_0
    //   5: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   8: aload_1
    //   9: invokestatic 224	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: pop
    //   13: aload_1
    //   14: getfield 693	com/google/android/gms/internal/zzqb$zze:appId	Ljava/lang/String;
    //   17: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   20: pop
    //   21: aload_1
    //   22: invokevirtual 705	com/google/android/gms/internal/zzqb$zze:getSerializedSize	()I
    //   25: newarray <illegal type>
    //   27: astore 4
    //   29: aload 4
    //   31: invokestatic 306	com/google/android/gms/internal/zzsn:zzE	([B)Lcom/google/android/gms/internal/zzsn;
    //   34: astore 5
    //   36: aload_1
    //   37: aload 5
    //   39: invokevirtual 706	com/google/android/gms/internal/zzqb$zze:writeTo	(Lcom/google/android/gms/internal/zzsn;)V
    //   42: aload 5
    //   44: invokevirtual 313	com/google/android/gms/internal/zzsn:zzJo	()V
    //   47: aload_0
    //   48: invokevirtual 710	com/google/android/gms/measurement/internal/zze:zzCk	()Lcom/google/android/gms/measurement/internal/zzaj;
    //   51: aload 4
    //   53: invokevirtual 1004	com/google/android/gms/measurement/internal/zzaj:zzr	([B)J
    //   56: lstore_2
    //   57: new 315	android/content/ContentValues
    //   60: dup
    //   61: invokespecial 317	android/content/ContentValues:<init>	()V
    //   64: astore 5
    //   66: aload 5
    //   68: ldc_w 319
    //   71: aload_1
    //   72: getfield 693	com/google/android/gms/internal/zzqb$zze:appId	Ljava/lang/String;
    //   75: invokevirtual 322	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload 5
    //   80: ldc_w 877
    //   83: lload_2
    //   84: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   87: invokevirtual 670	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   90: aload 5
    //   92: ldc_w 917
    //   95: aload 4
    //   97: invokevirtual 336	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   100: aload_0
    //   101: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   104: ldc_w 915
    //   107: aconst_null
    //   108: aload 5
    //   110: iconst_4
    //   111: invokevirtual 342	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   114: pop2
    //   115: lload_2
    //   116: lreturn
    //   117: astore_1
    //   118: aload_0
    //   119: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   122: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   125: ldc_w 1006
    //   128: aload_1
    //   129: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   132: aload_1
    //   133: athrow
    //   134: astore_1
    //   135: aload_0
    //   136: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   139: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   142: ldc_w 1008
    //   145: aload_1
    //   146: invokevirtual 352	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   149: aload_1
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	zze
    //   0	151	1	paramzze	zzqb.zze
    //   56	60	2	l	long
    //   27	69	4	arrayOfByte	byte[]
    //   34	75	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   21	47	117	java/io/IOException
    //   100	115	134	android/database/sqlite/SQLiteException
  }
  
  Object zzb(Cursor paramCursor, int paramInt)
  {
    int i = zza(paramCursor, paramInt);
    switch (i)
    {
    default: 
      zzAo().zzCE().zzj("Loaded invalid unknown value type, ignoring it", Integer.valueOf(i));
      return null;
    case 0: 
      zzAo().zzCE().zzfg("Loaded invalid null value from database");
      return null;
    case 1: 
      return Long.valueOf(paramCursor.getLong(paramInt));
    case 2: 
      return Float.valueOf(paramCursor.getFloat(paramInt));
    case 3: 
      return paramCursor.getString(paramInt);
    }
    zzAo().zzCE().zzfg("Loaded invalid blob type value, ignoring it");
    return null;
  }
  
  void zzb(String paramString, zzpz.zza[] paramArrayOfzza)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    zzx.zzz(paramArrayOfzza);
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    try
    {
      zzfb(paramString);
      int j = paramArrayOfzza.length;
      int i = 0;
      while (i < j)
      {
        zza(paramString, paramArrayOfzza[i]);
        i += 1;
      }
      localSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
  }
  
  public void zzd(String paramString, byte[] paramArrayOfByte)
  {
    zzx.zzcM(paramString);
    zzjk();
    zzjv();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("remote_config", paramArrayOfByte);
    try
    {
      if (getWritableDatabase().update("apps", localContentValues, "app_id = ?", new String[] { paramString }) == 0L) {
        zzAo().zzCE().zzfg("Failed to update remote config (got 0)");
      }
      return;
    }
    catch (SQLiteException paramString)
    {
      zzAo().zzCE().zzj("Error storing remote config", paramString);
    }
  }
  
  /* Error */
  public List zzeX(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aload_1
    //   4: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   7: pop
    //   8: aload_0
    //   9: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   12: aload_0
    //   13: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   16: new 620	java/util/ArrayList
    //   19: dup
    //   20: invokespecial 621	java/util/ArrayList:<init>	()V
    //   23: astore 8
    //   25: aload_0
    //   26: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   29: astore 6
    //   31: aload_0
    //   32: invokevirtual 382	com/google/android/gms/measurement/internal/zze:zzCp	()Lcom/google/android/gms/measurement/internal/zzd;
    //   35: invokevirtual 979	com/google/android/gms/measurement/internal/zzd:zzBM	()I
    //   38: istore_2
    //   39: aload 6
    //   41: ldc_w 574
    //   44: iconst_3
    //   45: anewarray 294	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: ldc_w 870
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: ldc_w 582
    //   59: aastore
    //   60: dup
    //   61: iconst_2
    //   62: ldc_w 584
    //   65: aastore
    //   66: ldc_w 650
    //   69: iconst_1
    //   70: anewarray 294	java/lang/String
    //   73: dup
    //   74: iconst_0
    //   75: aload_1
    //   76: aastore
    //   77: aconst_null
    //   78: aconst_null
    //   79: ldc_w 921
    //   82: iload_2
    //   83: invokestatic 419	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   86: invokevirtual 926	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   89: astore 6
    //   91: aload 6
    //   93: invokeinterface 181 1 0
    //   98: istore_3
    //   99: iload_3
    //   100: ifne +18 -> 118
    //   103: aload 6
    //   105: ifnull +10 -> 115
    //   108: aload 6
    //   110: invokeinterface 188 1 0
    //   115: aload 8
    //   117: areturn
    //   118: aload 6
    //   120: iconst_0
    //   121: invokeinterface 470 2 0
    //   126: astore 7
    //   128: aload 6
    //   130: iconst_1
    //   131: invokeinterface 185 2 0
    //   136: lstore 4
    //   138: aload_0
    //   139: aload 6
    //   141: iconst_2
    //   142: invokevirtual 589	com/google/android/gms/measurement/internal/zze:zzb	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   145: astore 9
    //   147: aload 9
    //   149: ifnonnull +43 -> 192
    //   152: aload_0
    //   153: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   156: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   159: ldc_w 1039
    //   162: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   165: aload 6
    //   167: invokeinterface 563 1 0
    //   172: istore_3
    //   173: iload_3
    //   174: ifne -56 -> 118
    //   177: aload 6
    //   179: ifnull +10 -> 189
    //   182: aload 6
    //   184: invokeinterface 188 1 0
    //   189: aload 8
    //   191: areturn
    //   192: aload 8
    //   194: new 586	com/google/android/gms/measurement/internal/zzai
    //   197: dup
    //   198: aload_1
    //   199: aload 7
    //   201: lload 4
    //   203: aload 9
    //   205: invokespecial 592	com/google/android/gms/measurement/internal/zzai:<init>	(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   208: invokeinterface 625 2 0
    //   213: pop
    //   214: goto -49 -> 165
    //   217: astore 7
    //   219: aload_0
    //   220: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   223: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   226: ldc_w 1041
    //   229: aload_1
    //   230: aload 7
    //   232: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   235: aload 6
    //   237: ifnull +10 -> 247
    //   240: aload 6
    //   242: invokeinterface 188 1 0
    //   247: aconst_null
    //   248: areturn
    //   249: astore_1
    //   250: aload 7
    //   252: astore 6
    //   254: aload 6
    //   256: ifnull +10 -> 266
    //   259: aload 6
    //   261: invokeinterface 188 1 0
    //   266: aload_1
    //   267: athrow
    //   268: astore_1
    //   269: goto -15 -> 254
    //   272: astore_1
    //   273: goto -19 -> 254
    //   276: astore 7
    //   278: aconst_null
    //   279: astore 6
    //   281: goto -62 -> 219
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	this	zze
    //   0	284	1	paramString	String
    //   38	45	2	i	int
    //   98	76	3	bool	boolean
    //   136	66	4	l	long
    //   29	251	6	localObject1	Object
    //   1	199	7	str	String
    //   217	34	7	localSQLiteException1	SQLiteException
    //   276	1	7	localSQLiteException2	SQLiteException
    //   23	170	8	localArrayList	java.util.ArrayList
    //   145	59	9	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   91	99	217	android/database/sqlite/SQLiteException
    //   118	147	217	android/database/sqlite/SQLiteException
    //   152	165	217	android/database/sqlite/SQLiteException
    //   165	173	217	android/database/sqlite/SQLiteException
    //   192	214	217	android/database/sqlite/SQLiteException
    //   25	91	249	finally
    //   91	99	268	finally
    //   118	147	268	finally
    //   152	165	268	finally
    //   165	173	268	finally
    //   192	214	268	finally
    //   219	235	272	finally
    //   25	91	276	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public zza zzeY(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   9: aload_0
    //   10: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   13: aload_0
    //   14: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: ldc_w 648
    //   20: bipush 17
    //   22: anewarray 294	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc_w 738
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: ldc_w 743
    //   36: aastore
    //   37: dup
    //   38: iconst_2
    //   39: ldc_w 748
    //   42: aastore
    //   43: dup
    //   44: iconst_3
    //   45: ldc_w 753
    //   48: aastore
    //   49: dup
    //   50: iconst_4
    //   51: ldc 48
    //   53: aastore
    //   54: dup
    //   55: iconst_5
    //   56: ldc_w 761
    //   59: aastore
    //   60: dup
    //   61: bipush 6
    //   63: ldc 22
    //   65: aastore
    //   66: dup
    //   67: bipush 7
    //   69: ldc 32
    //   71: aastore
    //   72: dup
    //   73: bipush 8
    //   75: ldc 36
    //   77: aastore
    //   78: dup
    //   79: bipush 9
    //   81: ldc 40
    //   83: aastore
    //   84: dup
    //   85: bipush 10
    //   87: ldc 44
    //   89: aastore
    //   90: dup
    //   91: bipush 11
    //   93: ldc 52
    //   95: aastore
    //   96: dup
    //   97: bipush 12
    //   99: ldc 56
    //   101: aastore
    //   102: dup
    //   103: bipush 13
    //   105: ldc 60
    //   107: aastore
    //   108: dup
    //   109: bipush 14
    //   111: ldc 64
    //   113: aastore
    //   114: dup
    //   115: bipush 15
    //   117: ldc 72
    //   119: aastore
    //   120: dup
    //   121: bipush 16
    //   123: ldc 76
    //   125: aastore
    //   126: ldc_w 650
    //   129: iconst_1
    //   130: anewarray 294	java/lang/String
    //   133: dup
    //   134: iconst_0
    //   135: aload_1
    //   136: aastore
    //   137: aconst_null
    //   138: aconst_null
    //   139: aconst_null
    //   140: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   143: astore 5
    //   145: aload 5
    //   147: astore 4
    //   149: aload 5
    //   151: invokeinterface 181 1 0
    //   156: istore_3
    //   157: iload_3
    //   158: ifne +19 -> 177
    //   161: aload 5
    //   163: ifnull +10 -> 173
    //   166: aload 5
    //   168: invokeinterface 188 1 0
    //   173: aconst_null
    //   174: astore_1
    //   175: aload_1
    //   176: areturn
    //   177: aload 5
    //   179: astore 4
    //   181: new 733	com/google/android/gms/measurement/internal/zza
    //   184: dup
    //   185: aload_0
    //   186: getfield 1047	com/google/android/gms/measurement/internal/zze:zzaTV	Lcom/google/android/gms/measurement/internal/zzw;
    //   189: aload_1
    //   190: invokespecial 1050	com/google/android/gms/measurement/internal/zza:<init>	(Lcom/google/android/gms/measurement/internal/zzw;Ljava/lang/String;)V
    //   193: astore 6
    //   195: aload 5
    //   197: astore 4
    //   199: aload 6
    //   201: aload 5
    //   203: iconst_0
    //   204: invokeinterface 470 2 0
    //   209: invokevirtual 1053	com/google/android/gms/measurement/internal/zza:zzeM	(Ljava/lang/String;)V
    //   212: aload 5
    //   214: astore 4
    //   216: aload 6
    //   218: aload 5
    //   220: iconst_1
    //   221: invokeinterface 470 2 0
    //   226: invokevirtual 1056	com/google/android/gms/measurement/internal/zza:zzeN	(Ljava/lang/String;)V
    //   229: aload 5
    //   231: astore 4
    //   233: aload 6
    //   235: aload 5
    //   237: iconst_2
    //   238: invokeinterface 470 2 0
    //   243: invokevirtual 1059	com/google/android/gms/measurement/internal/zza:zzeO	(Ljava/lang/String;)V
    //   246: aload 5
    //   248: astore 4
    //   250: aload 6
    //   252: aload 5
    //   254: iconst_3
    //   255: invokeinterface 185 2 0
    //   260: invokevirtual 1062	com/google/android/gms/measurement/internal/zza:zzS	(J)V
    //   263: aload 5
    //   265: astore 4
    //   267: aload 6
    //   269: aload 5
    //   271: iconst_4
    //   272: invokeinterface 185 2 0
    //   277: invokevirtual 1065	com/google/android/gms/measurement/internal/zza:zzO	(J)V
    //   280: aload 5
    //   282: astore 4
    //   284: aload 6
    //   286: aload 5
    //   288: iconst_5
    //   289: invokeinterface 185 2 0
    //   294: invokevirtual 1068	com/google/android/gms/measurement/internal/zza:zzP	(J)V
    //   297: aload 5
    //   299: astore 4
    //   301: aload 6
    //   303: aload 5
    //   305: bipush 6
    //   307: invokeinterface 470 2 0
    //   312: invokevirtual 1071	com/google/android/gms/measurement/internal/zza:setAppVersion	(Ljava/lang/String;)V
    //   315: aload 5
    //   317: astore 4
    //   319: aload 6
    //   321: aload 5
    //   323: bipush 7
    //   325: invokeinterface 470 2 0
    //   330: invokevirtual 1074	com/google/android/gms/measurement/internal/zza:zzeP	(Ljava/lang/String;)V
    //   333: aload 5
    //   335: astore 4
    //   337: aload 6
    //   339: aload 5
    //   341: bipush 8
    //   343: invokeinterface 185 2 0
    //   348: invokevirtual 1077	com/google/android/gms/measurement/internal/zza:zzQ	(J)V
    //   351: aload 5
    //   353: astore 4
    //   355: aload 6
    //   357: aload 5
    //   359: bipush 9
    //   361: invokeinterface 185 2 0
    //   366: invokevirtual 1080	com/google/android/gms/measurement/internal/zza:zzR	(J)V
    //   369: aload 5
    //   371: astore 4
    //   373: aload 5
    //   375: bipush 10
    //   377: invokeinterface 1083 2 0
    //   382: ifeq +184 -> 566
    //   385: iconst_1
    //   386: istore_2
    //   387: goto +267 -> 654
    //   390: aload 5
    //   392: astore 4
    //   394: aload 6
    //   396: iload_3
    //   397: invokevirtual 1087	com/google/android/gms/measurement/internal/zza:setMeasurementEnabled	(Z)V
    //   400: aload 5
    //   402: astore 4
    //   404: aload 6
    //   406: aload 5
    //   408: bipush 11
    //   410: invokeinterface 185 2 0
    //   415: invokevirtual 1090	com/google/android/gms/measurement/internal/zza:zzV	(J)V
    //   418: aload 5
    //   420: astore 4
    //   422: aload 6
    //   424: aload 5
    //   426: bipush 12
    //   428: invokeinterface 185 2 0
    //   433: invokevirtual 1093	com/google/android/gms/measurement/internal/zza:zzW	(J)V
    //   436: aload 5
    //   438: astore 4
    //   440: aload 6
    //   442: aload 5
    //   444: bipush 13
    //   446: invokeinterface 185 2 0
    //   451: invokevirtual 1096	com/google/android/gms/measurement/internal/zza:zzX	(J)V
    //   454: aload 5
    //   456: astore 4
    //   458: aload 6
    //   460: aload 5
    //   462: bipush 14
    //   464: invokeinterface 185 2 0
    //   469: invokevirtual 1099	com/google/android/gms/measurement/internal/zza:zzY	(J)V
    //   472: aload 5
    //   474: astore 4
    //   476: aload 6
    //   478: aload 5
    //   480: bipush 15
    //   482: invokeinterface 185 2 0
    //   487: invokevirtual 1102	com/google/android/gms/measurement/internal/zza:zzT	(J)V
    //   490: aload 5
    //   492: astore 4
    //   494: aload 6
    //   496: aload 5
    //   498: bipush 16
    //   500: invokeinterface 185 2 0
    //   505: invokevirtual 1105	com/google/android/gms/measurement/internal/zza:zzU	(J)V
    //   508: aload 5
    //   510: astore 4
    //   512: aload 6
    //   514: invokevirtual 1108	com/google/android/gms/measurement/internal/zza:zzBi	()V
    //   517: aload 5
    //   519: astore 4
    //   521: aload 5
    //   523: invokeinterface 563 1 0
    //   528: ifeq +20 -> 548
    //   531: aload 5
    //   533: astore 4
    //   535: aload_0
    //   536: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   539: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   542: ldc_w 1110
    //   545: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   548: aload 6
    //   550: astore_1
    //   551: aload 5
    //   553: ifnull -378 -> 175
    //   556: aload 5
    //   558: invokeinterface 188 1 0
    //   563: aload 6
    //   565: areturn
    //   566: aload 5
    //   568: astore 4
    //   570: aload 5
    //   572: bipush 10
    //   574: invokeinterface 614 2 0
    //   579: istore_2
    //   580: goto +74 -> 654
    //   583: iconst_0
    //   584: istore_3
    //   585: goto -195 -> 390
    //   588: astore 6
    //   590: aconst_null
    //   591: astore 5
    //   593: aload 5
    //   595: astore 4
    //   597: aload_0
    //   598: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   601: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   604: ldc_w 1112
    //   607: aload_1
    //   608: aload 6
    //   610: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   613: aload 5
    //   615: ifnull +10 -> 625
    //   618: aload 5
    //   620: invokeinterface 188 1 0
    //   625: aconst_null
    //   626: areturn
    //   627: astore_1
    //   628: aconst_null
    //   629: astore 4
    //   631: aload 4
    //   633: ifnull +10 -> 643
    //   636: aload 4
    //   638: invokeinterface 188 1 0
    //   643: aload_1
    //   644: athrow
    //   645: astore_1
    //   646: goto -15 -> 631
    //   649: astore 6
    //   651: goto -58 -> 593
    //   654: iload_2
    //   655: ifeq -72 -> 583
    //   658: iconst_1
    //   659: istore_3
    //   660: goto -270 -> 390
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	663	0	this	zze
    //   0	663	1	paramString	String
    //   386	269	2	i	int
    //   156	504	3	bool	boolean
    //   147	490	4	localCursor1	Cursor
    //   143	476	5	localCursor2	Cursor
    //   193	371	6	localzza	zza
    //   588	21	6	localSQLiteException1	SQLiteException
    //   649	1	6	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   13	145	588	android/database/sqlite/SQLiteException
    //   13	145	627	finally
    //   149	157	645	finally
    //   181	195	645	finally
    //   199	212	645	finally
    //   216	229	645	finally
    //   233	246	645	finally
    //   250	263	645	finally
    //   267	280	645	finally
    //   284	297	645	finally
    //   301	315	645	finally
    //   319	333	645	finally
    //   337	351	645	finally
    //   355	369	645	finally
    //   373	385	645	finally
    //   394	400	645	finally
    //   404	418	645	finally
    //   422	436	645	finally
    //   440	454	645	finally
    //   458	472	645	finally
    //   476	490	645	finally
    //   494	508	645	finally
    //   512	517	645	finally
    //   521	531	645	finally
    //   535	548	645	finally
    //   570	580	645	finally
    //   597	613	645	finally
    //   149	157	649	android/database/sqlite/SQLiteException
    //   181	195	649	android/database/sqlite/SQLiteException
    //   199	212	649	android/database/sqlite/SQLiteException
    //   216	229	649	android/database/sqlite/SQLiteException
    //   233	246	649	android/database/sqlite/SQLiteException
    //   250	263	649	android/database/sqlite/SQLiteException
    //   267	280	649	android/database/sqlite/SQLiteException
    //   284	297	649	android/database/sqlite/SQLiteException
    //   301	315	649	android/database/sqlite/SQLiteException
    //   319	333	649	android/database/sqlite/SQLiteException
    //   337	351	649	android/database/sqlite/SQLiteException
    //   355	369	649	android/database/sqlite/SQLiteException
    //   373	385	649	android/database/sqlite/SQLiteException
    //   394	400	649	android/database/sqlite/SQLiteException
    //   404	418	649	android/database/sqlite/SQLiteException
    //   422	436	649	android/database/sqlite/SQLiteException
    //   440	454	649	android/database/sqlite/SQLiteException
    //   458	472	649	android/database/sqlite/SQLiteException
    //   476	490	649	android/database/sqlite/SQLiteException
    //   494	508	649	android/database/sqlite/SQLiteException
    //   512	517	649	android/database/sqlite/SQLiteException
    //   521	531	649	android/database/sqlite/SQLiteException
    //   535	548	649	android/database/sqlite/SQLiteException
    //   570	580	649	android/database/sqlite/SQLiteException
  }
  
  public long zzeZ(String paramString)
  {
    zzx.zzcM(paramString);
    zzjk();
    zzjv();
    try
    {
      int i = getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { paramString, String.valueOf(zzCp().zzeW(paramString)) });
      return i;
    }
    catch (SQLiteException paramString)
    {
      zzAo().zzCE().zzj("Error deleting over the limit events", paramString);
    }
    return 0L;
  }
  
  /* Error */
  public byte[] zzfa(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   9: aload_0
    //   10: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   13: aload_0
    //   14: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: ldc_w 648
    //   20: iconst_1
    //   21: anewarray 294	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: ldc 68
    //   28: aastore
    //   29: ldc_w 650
    //   32: iconst_1
    //   33: anewarray 294	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: aload_1
    //   39: aastore
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 443	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore 4
    //   48: aload 4
    //   50: astore_3
    //   51: aload 4
    //   53: invokeinterface 181 1 0
    //   58: istore_2
    //   59: iload_2
    //   60: ifne +19 -> 79
    //   63: aload 4
    //   65: ifnull +10 -> 75
    //   68: aload 4
    //   70: invokeinterface 188 1 0
    //   75: aconst_null
    //   76: astore_1
    //   77: aload_1
    //   78: areturn
    //   79: aload 4
    //   81: astore_3
    //   82: aload 4
    //   84: iconst_0
    //   85: invokeinterface 447 2 0
    //   90: astore 5
    //   92: aload 4
    //   94: astore_3
    //   95: aload 4
    //   97: invokeinterface 563 1 0
    //   102: ifeq +19 -> 121
    //   105: aload 4
    //   107: astore_3
    //   108: aload_0
    //   109: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   112: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   115: ldc_w 1126
    //   118: invokevirtual 247	com/google/android/gms/measurement/internal/zzp$zza:zzfg	(Ljava/lang/String;)V
    //   121: aload 5
    //   123: astore_1
    //   124: aload 4
    //   126: ifnull -49 -> 77
    //   129: aload 4
    //   131: invokeinterface 188 1 0
    //   136: aload 5
    //   138: areturn
    //   139: astore 5
    //   141: aconst_null
    //   142: astore 4
    //   144: aload 4
    //   146: astore_3
    //   147: aload_0
    //   148: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   151: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   154: ldc_w 1128
    //   157: aload_1
    //   158: aload 5
    //   160: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   163: aload 4
    //   165: ifnull +10 -> 175
    //   168: aload 4
    //   170: invokeinterface 188 1 0
    //   175: aconst_null
    //   176: areturn
    //   177: astore_1
    //   178: aconst_null
    //   179: astore_3
    //   180: aload_3
    //   181: ifnull +9 -> 190
    //   184: aload_3
    //   185: invokeinterface 188 1 0
    //   190: aload_1
    //   191: athrow
    //   192: astore_1
    //   193: goto -13 -> 180
    //   196: astore 5
    //   198: goto -54 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	zze
    //   0	201	1	paramString	String
    //   58	2	2	bool	boolean
    //   50	135	3	localCursor1	Cursor
    //   46	123	4	localCursor2	Cursor
    //   90	47	5	arrayOfByte	byte[]
    //   139	20	5	localSQLiteException1	SQLiteException
    //   196	1	5	localSQLiteException2	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   13	48	139	android/database/sqlite/SQLiteException
    //   13	48	177	finally
    //   51	59	192	finally
    //   82	92	192	finally
    //   95	105	192	finally
    //   108	121	192	finally
    //   147	163	192	finally
    //   51	59	196	android/database/sqlite/SQLiteException
    //   82	92	196	android/database/sqlite/SQLiteException
    //   95	105	196	android/database/sqlite/SQLiteException
    //   108	121	196	android/database/sqlite/SQLiteException
  }
  
  void zzfb(String paramString)
  {
    zzjv();
    zzjk();
    zzx.zzcM(paramString);
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    localSQLiteDatabase.delete("property_filters", "app_id=?", new String[] { paramString });
    localSQLiteDatabase.delete("event_filters", "app_id=?", new String[] { paramString });
  }
  
  public void zzfc(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    try
    {
      localSQLiteDatabase.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[] { paramString, paramString });
      return;
    }
    catch (SQLiteException paramString)
    {
      zzAo().zzCE().zzj("Failed to remove unused event metadata", paramString);
    }
  }
  
  public long zzfd(String paramString)
  {
    zzx.zzcM(paramString);
    return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { paramString }, 0L);
  }
  
  protected void zziJ() {}
  
  /* Error */
  public List zzn(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: invokevirtual 214	com/google/android/gms/measurement/internal/zze:zzjk	()V
    //   7: aload_0
    //   8: invokevirtual 211	com/google/android/gms/measurement/internal/zze:zzjv	()V
    //   11: iload_2
    //   12: ifle +112 -> 124
    //   15: iconst_1
    //   16: istore 4
    //   18: iload 4
    //   20: invokestatic 1142	com/google/android/gms/common/internal/zzx:zzac	(Z)V
    //   23: iload_3
    //   24: ifle +106 -> 130
    //   27: iload 5
    //   29: istore 4
    //   31: iload 4
    //   33: invokestatic 1142	com/google/android/gms/common/internal/zzx:zzac	(Z)V
    //   36: aload_1
    //   37: invokestatic 220	com/google/android/gms/common/internal/zzx:zzcM	(Ljava/lang/String;)Ljava/lang/String;
    //   40: pop
    //   41: aload_0
    //   42: invokevirtual 172	com/google/android/gms/measurement/internal/zze:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   45: ldc_w 514
    //   48: iconst_2
    //   49: anewarray 294	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: ldc_w 921
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: ldc_w 333
    //   63: aastore
    //   64: ldc_w 650
    //   67: iconst_1
    //   68: anewarray 294	java/lang/String
    //   71: dup
    //   72: iconst_0
    //   73: aload_1
    //   74: aastore
    //   75: aconst_null
    //   76: aconst_null
    //   77: ldc_w 921
    //   80: iload_2
    //   81: invokestatic 419	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   84: invokevirtual 926	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   87: astore 8
    //   89: aload 8
    //   91: invokeinterface 181 1 0
    //   96: ifne +40 -> 136
    //   99: invokestatic 1146	java/util/Collections:emptyList	()Ljava/util/List;
    //   102: astore 9
    //   104: aload 9
    //   106: astore_1
    //   107: aload 8
    //   109: ifnull +13 -> 122
    //   112: aload 8
    //   114: invokeinterface 188 1 0
    //   119: aload 9
    //   121: astore_1
    //   122: aload_1
    //   123: areturn
    //   124: iconst_0
    //   125: istore 4
    //   127: goto -109 -> 18
    //   130: iconst_0
    //   131: istore 4
    //   133: goto -102 -> 31
    //   136: new 620	java/util/ArrayList
    //   139: dup
    //   140: invokespecial 621	java/util/ArrayList:<init>	()V
    //   143: astore 9
    //   145: iconst_0
    //   146: istore_2
    //   147: aload 8
    //   149: iconst_0
    //   150: invokeinterface 185 2 0
    //   155: lstore 6
    //   157: aload 8
    //   159: iconst_1
    //   160: invokeinterface 447 2 0
    //   165: astore 10
    //   167: aload_0
    //   168: invokevirtual 710	com/google/android/gms/measurement/internal/zze:zzCk	()Lcom/google/android/gms/measurement/internal/zzaj;
    //   171: aload 10
    //   173: invokevirtual 1149	com/google/android/gms/measurement/internal/zzaj:zzp	([B)[B
    //   176: astore 10
    //   178: aload 9
    //   180: invokeinterface 1151 1 0
    //   185: ifne +12 -> 197
    //   188: aload 10
    //   190: arraylength
    //   191: iload_2
    //   192: iadd
    //   193: iload_3
    //   194: if_icmpgt +70 -> 264
    //   197: aload 10
    //   199: invokestatic 453	com/google/android/gms/internal/zzsm:zzD	([B)Lcom/google/android/gms/internal/zzsm;
    //   202: astore 11
    //   204: new 690	com/google/android/gms/internal/zzqb$zze
    //   207: dup
    //   208: invokespecial 931	com/google/android/gms/internal/zzqb$zze:<init>	()V
    //   211: astore 12
    //   213: aload 12
    //   215: aload 11
    //   217: invokevirtual 935	com/google/android/gms/internal/zzqb$zze:zzG	(Lcom/google/android/gms/internal/zzsm;)Lcom/google/android/gms/internal/zzqb$zze;
    //   220: pop
    //   221: aload 10
    //   223: arraylength
    //   224: iload_2
    //   225: iadd
    //   226: istore_2
    //   227: aload 9
    //   229: aload 12
    //   231: lload 6
    //   233: invokestatic 667	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   236: invokestatic 1157	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   239: invokeinterface 625 2 0
    //   244: pop
    //   245: aload 8
    //   247: invokeinterface 563 1 0
    //   252: istore 4
    //   254: iload 4
    //   256: ifeq +8 -> 264
    //   259: iload_2
    //   260: iload_3
    //   261: if_icmple +138 -> 399
    //   264: aload 9
    //   266: astore_1
    //   267: aload 8
    //   269: ifnull -147 -> 122
    //   272: aload 8
    //   274: invokeinterface 188 1 0
    //   279: aload 9
    //   281: areturn
    //   282: astore 10
    //   284: aload_0
    //   285: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   288: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   291: ldc_w 1159
    //   294: aload_1
    //   295: aload 10
    //   297: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   300: goto -55 -> 245
    //   303: astore 10
    //   305: aload_0
    //   306: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   309: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   312: ldc_w 1161
    //   315: aload_1
    //   316: aload 10
    //   318: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   321: goto -76 -> 245
    //   324: astore 9
    //   326: aconst_null
    //   327: astore 8
    //   329: aload_0
    //   330: invokevirtual 192	com/google/android/gms/measurement/internal/zze:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   333: invokevirtual 198	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   336: ldc_w 1163
    //   339: aload_1
    //   340: aload 9
    //   342: invokevirtual 206	com/google/android/gms/measurement/internal/zzp$zza:zze	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   345: invokestatic 1146	java/util/Collections:emptyList	()Ljava/util/List;
    //   348: astore 9
    //   350: aload 9
    //   352: astore_1
    //   353: aload 8
    //   355: ifnull -233 -> 122
    //   358: aload 8
    //   360: invokeinterface 188 1 0
    //   365: aload 9
    //   367: areturn
    //   368: astore_1
    //   369: aconst_null
    //   370: astore 8
    //   372: aload 8
    //   374: ifnull +10 -> 384
    //   377: aload 8
    //   379: invokeinterface 188 1 0
    //   384: aload_1
    //   385: athrow
    //   386: astore_1
    //   387: goto -15 -> 372
    //   390: astore_1
    //   391: goto -19 -> 372
    //   394: astore 9
    //   396: goto -67 -> 329
    //   399: goto -252 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	402	0	this	zze
    //   0	402	1	paramString	String
    //   0	402	2	paramInt1	int
    //   0	402	3	paramInt2	int
    //   16	239	4	bool1	boolean
    //   1	27	5	bool2	boolean
    //   155	77	6	l	long
    //   87	291	8	localCursor	Cursor
    //   102	178	9	localObject	Object
    //   324	17	9	localSQLiteException1	SQLiteException
    //   348	18	9	localList	List
    //   394	1	9	localSQLiteException2	SQLiteException
    //   165	57	10	arrayOfByte	byte[]
    //   282	14	10	localIOException1	IOException
    //   303	14	10	localIOException2	IOException
    //   202	14	11	localzzsm	com.google.android.gms.internal.zzsm
    //   211	19	12	localzze	zzqb.zze
    // Exception table:
    //   from	to	target	type
    //   157	178	282	java/io/IOException
    //   213	221	303	java/io/IOException
    //   41	89	324	android/database/sqlite/SQLiteException
    //   41	89	368	finally
    //   89	104	386	finally
    //   136	145	386	finally
    //   147	157	386	finally
    //   157	178	386	finally
    //   178	197	386	finally
    //   197	213	386	finally
    //   213	221	386	finally
    //   221	245	386	finally
    //   245	254	386	finally
    //   284	300	386	finally
    //   305	321	386	finally
    //   329	350	390	finally
    //   89	104	394	android/database/sqlite/SQLiteException
    //   136	145	394	android/database/sqlite/SQLiteException
    //   147	157	394	android/database/sqlite/SQLiteException
    //   157	178	394	android/database/sqlite/SQLiteException
    //   178	197	394	android/database/sqlite/SQLiteException
    //   197	213	394	android/database/sqlite/SQLiteException
    //   213	221	394	android/database/sqlite/SQLiteException
    //   221	245	394	android/database/sqlite/SQLiteException
    //   245	254	394	android/database/sqlite/SQLiteException
    //   284	300	394	android/database/sqlite/SQLiteException
    //   305	321	394	android/database/sqlite/SQLiteException
  }
  
  public void zzz(List paramList)
  {
    zzx.zzz(paramList);
    zzjk();
    zzjv();
    StringBuilder localStringBuilder = new StringBuilder("rowid in (");
    int i = 0;
    while (i < paramList.size())
    {
      if (i != 0) {
        localStringBuilder.append(",");
      }
      localStringBuilder.append(((Long)paramList.get(i)).longValue());
      i += 1;
    }
    localStringBuilder.append(")");
    i = getWritableDatabase().delete("raw_events", localStringBuilder.toString(), null);
    if (i != paramList.size()) {
      zzAo().zzCE().zze("Deleted fewer rows from raw events table than expected", Integer.valueOf(i), Integer.valueOf(paramList.size()));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */