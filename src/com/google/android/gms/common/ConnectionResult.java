package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class ConnectionResult
  implements SafeParcelable
{
  public static final int API_UNAVAILABLE = 16;
  public static final int CANCELED = 13;
  public static final Parcelable.Creator CREATOR = new zzb();
  public static final int DEVELOPER_ERROR = 10;
  public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 15;
  public static final int INVALID_ACCOUNT = 5;
  public static final int LICENSE_CHECK_FAILED = 11;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;
  public static final int RESTRICTED_PROFILE = 20;
  public static final int SERVICE_DISABLED = 3;
  public static final int SERVICE_INVALID = 9;
  public static final int SERVICE_MISSING = 1;
  public static final int SERVICE_MISSING_PERMISSION = 19;
  public static final int SERVICE_UPDATING = 18;
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_FAILED = 17;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int TIMEOUT = 14;
  public static final ConnectionResult zzafB = new ConnectionResult(0);
  private final PendingIntent mPendingIntent;
  final int mVersionCode;
  private final int zzade;
  private final String zzafC;
  
  public ConnectionResult(int paramInt)
  {
    this(paramInt, null, null);
  }
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    mVersionCode = paramInt1;
    zzade = paramInt2;
    mPendingIntent = paramPendingIntent;
    zzafC = paramString;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String getStatusString(int paramInt)
  {
    switch (paramInt)
    {
    case 12: 
    default: 
      return "UNKNOWN_ERROR_CODE(" + paramInt + ")";
    case 0: 
      return "SUCCESS";
    case 1: 
      return "SERVICE_MISSING";
    case 2: 
      return "SERVICE_VERSION_UPDATE_REQUIRED";
    case 3: 
      return "SERVICE_DISABLED";
    case 4: 
      return "SIGN_IN_REQUIRED";
    case 5: 
      return "INVALID_ACCOUNT";
    case 6: 
      return "RESOLUTION_REQUIRED";
    case 7: 
      return "NETWORK_ERROR";
    case 8: 
      return "INTERNAL_ERROR";
    case 9: 
      return "SERVICE_INVALID";
    case 10: 
      return "DEVELOPER_ERROR";
    case 11: 
      return "LICENSE_CHECK_FAILED";
    case 13: 
      return "CANCELED";
    case 14: 
      return "TIMEOUT";
    case 15: 
      return "INTERRUPTED";
    case 16: 
      return "API_UNAVAILABLE";
    case 17: 
      return "SIGN_IN_FAILED";
    case 18: 
      return "SERVICE_UPDATING";
    case 19: 
      return "SERVICE_MISSING_PERMISSION";
    }
    return "RESTRICTED_PROFILE";
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult)) {
        return false;
      }
      paramObject = (ConnectionResult)paramObject;
    } while ((zzade == zzade) && (zzw.equal(mPendingIntent, mPendingIntent)) && (zzw.equal(zzafC, zzafC)));
    return false;
  }
  
  public final int getErrorCode()
  {
    return zzade;
  }
  
  public final String getErrorMessage()
  {
    return zzafC;
  }
  
  public final PendingIntent getResolution()
  {
    return mPendingIntent;
  }
  
  public final boolean hasResolution()
  {
    return (zzade != 0) && (mPendingIntent != null);
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzade), mPendingIntent, zzafC });
  }
  
  public final boolean isSuccess()
  {
    return zzade == 0;
  }
  
  public final void startResolutionForResult(Activity paramActivity, int paramInt)
  {
    if (!hasResolution()) {
      return;
    }
    paramActivity.startIntentSenderForResult(mPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("statusCode", getStatusString(zzade)).zzg("resolution", mPendingIntent).zzg("message", zzafC).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */