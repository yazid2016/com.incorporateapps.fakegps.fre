.class Lcom/google/android/gms/internal/zzpc$1;
.super Lcom/google/android/gms/internal/zzob$zzc;


# instance fields
.field final synthetic zzazU:Lcom/google/android/gms/fitness/data/DataSet;

.field final synthetic zzazV:Z

.field final synthetic zzazW:Lcom/google/android/gms/internal/zzpc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzpc;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/DataSet;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpc$1;->zzazW:Lcom/google/android/gms/internal/zzpc;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzpc$1;->zzazU:Lcom/google/android/gms/fitness/data/DataSet;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/zzpc$1;->zzazV:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzob$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzob;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzpc$1;->zza(Lcom/google/android/gms/internal/zzob;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzob;)V
    .locals 5

    new-instance v1, Lcom/google/android/gms/internal/zzph;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzph;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzob;->zzqJ()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzom;

    new-instance v2, Lcom/google/android/gms/fitness/request/DataInsertRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzpc$1;->zzazU:Lcom/google/android/gms/fitness/data/DataSet;

    iget-boolean v4, p0, Lcom/google/android/gms/internal/zzpc$1;->zzazV:Z

    invoke-direct {v2, v3, v1, v4}, Lcom/google/android/gms/fitness/request/DataInsertRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSet;Lcom/google/android/gms/internal/zzow;Z)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/zzom;->zza(Lcom/google/android/gms/fitness/request/DataInsertRequest;)V

    return-void
.end method
