.class Lcom/google/android/gms/internal/zzdw$5;
.super Lcom/google/android/gms/ads/internal/client/zzp$zza;


# instance fields
.field final synthetic zzAc:Lcom/google/android/gms/internal/zzdw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdw$5;->zzAc:Lcom/google/android/gms/internal/zzdw;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzp$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdw$5;->zzAc:Lcom/google/android/gms/internal/zzdw;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdw;->zza(Lcom/google/android/gms/internal/zzdw;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzdw$5$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzdw$5$1;-><init>(Lcom/google/android/gms/internal/zzdw$5;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
