.class Lcom/google/android/gms/ads/internal/overlay/zzc$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzEd:Lcom/google/android/gms/ads/internal/overlay/zzc;

.field final synthetic zzEe:Ljava/lang/String;

.field final synthetic zzEf:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/overlay/zzc;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEd:Lcom/google/android/gms/ads/internal/overlay/zzc;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEe:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEf:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEd:Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzc;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)Lcom/google/android/gms/ads/internal/overlay/zzh;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEd:Lcom/google/android/gms/ads/internal/overlay/zzc;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/overlay/zzc;->zza(Lcom/google/android/gms/ads/internal/overlay/zzc;)Lcom/google/android/gms/ads/internal/overlay/zzh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEe:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/overlay/zzc$3;->zzEf:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
