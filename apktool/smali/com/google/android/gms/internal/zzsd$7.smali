.class Lcom/google/android/gms/internal/zzsd$7;
.super Lcom/google/android/gms/wallet/Wallet$zza;


# instance fields
.field final synthetic zzbqw:Lcom/google/android/gms/internal/zzsd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzsd;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzsd$7;->zzbqw:Lcom/google/android/gms/internal/zzsd;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zzA(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/BooleanResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/BooleanResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/api/BooleanResult;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    return-object v0
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzse;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzsd$7;->zza(Lcom/google/android/gms/internal/zzse;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/internal/zzse;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->zzIj()Lcom/google/android/gms/wallet/IsReadyToPayRequest$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/IsReadyToPayRequest$zza;->zzIk()Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/zzse;->zza(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzsd$7;->zzA(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/BooleanResult;

    move-result-object v0

    return-object v0
.end method
