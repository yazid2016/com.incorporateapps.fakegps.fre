.class Lcom/google/android/gms/internal/zzse$zzb;
.super Lcom/google/android/gms/internal/zzse$zza;


# instance fields
.field private final zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzse$zza;-><init>(Lcom/google/android/gms/internal/zzse$1;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzse$zzb;->zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/common/api/Status;ZLandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzse$zzb;->zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

    new-instance v1, Lcom/google/android/gms/common/api/BooleanResult;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/common/api/BooleanResult;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/zza$zzb;->zzs(Ljava/lang/Object;)V

    return-void
.end method
