.class Lcom/google/android/gms/internal/zzdw$6$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzdw$zza;


# instance fields
.field final synthetic zzAm:Lcom/google/android/gms/internal/zzdw$6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdw$6;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdw$6$4;->zzAm:Lcom/google/android/gms/internal/zzdw$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/internal/zzdx;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdx;->zzAu:Lcom/google/android/gms/ads/internal/reward/client/zzd;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdx;->zzAu:Lcom/google/android/gms/ads/internal/reward/client/zzd;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/zzd;->onRewardedVideoAdClosed()V

    :cond_0
    return-void
.end method
