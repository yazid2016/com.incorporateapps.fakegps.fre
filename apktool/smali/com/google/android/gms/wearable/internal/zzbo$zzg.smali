.class final Lcom/google/android/gms/wearable/internal/zzbo$zzg;
.super Lcom/google/android/gms/wearable/internal/zzbo$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbo$zzb;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzj$zze;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbk;->zzgc(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/wearable/internal/zzj$zzc;

    iget-object v3, p1, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->zzbsB:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-direct {v2, v3}, Lcom/google/android/gms/wearable/internal/zzj$zzc;-><init>(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzj$zze;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/CapabilityInfo;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbo$zzg;->zzX(Ljava/lang/Object;)V

    return-void
.end method