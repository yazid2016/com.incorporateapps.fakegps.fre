.class Lcom/google/android/gms/auth/api/credentials/internal/zzd$1$1;
.super Lcom/google/android/gms/auth/api/credentials/internal/zza;


# instance fields
.field final synthetic zzWx:Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1$1;->zzWx:Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/credentials/internal/zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1$1;->zzWx:Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;

    new-instance v1, Lcom/google/android/gms/auth/api/credentials/internal/zzc;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/zzc;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public zzg(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1$1;->zzWx:Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/internal/zzc;->zzh(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/credentials/internal/zzc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
