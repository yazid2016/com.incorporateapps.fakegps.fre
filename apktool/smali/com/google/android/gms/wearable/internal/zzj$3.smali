.class Lcom/google/android/gms/wearable/internal/zzj$3;
.super Lcom/google/android/gms/wearable/internal/zzi;


# instance fields
.field final synthetic zzbrM:Ljava/lang/String;

.field final synthetic zzbrO:Lcom/google/android/gms/wearable/internal/zzj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzj;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzj$3;->zzbrO:Lcom/google/android/gms/wearable/internal/zzj;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzj$3;->zzbrM:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzi;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzj$3;->zza(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzj$3;->zzbrM:Ljava/lang/String;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/zzbp;->zzr(Lcom/google/android/gms/common/api/internal/zza$zzb;Ljava/lang/String;)V

    return-void
.end method

.method protected zzbq(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/CapabilityApi$AddLocalCapabilityResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzj$zza;

    invoke-direct {v0, p1}, Lcom/google/android/gms/wearable/internal/zzj$zza;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzj$3;->zzbq(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/CapabilityApi$AddLocalCapabilityResult;

    move-result-object v0

    return-object v0
.end method
