.class final Lcom/google/android/gms/wallet/Wallet$1;
.super Lcom/google/android/gms/common/api/Api$zza;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/Api$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zzf;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$zzb;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/wallet/Wallet$1;->zza(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zzf;Lcom/google/android/gms/wallet/Wallet$WalletOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/zzse;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zzf;Lcom/google/android/gms/wallet/Wallet$WalletOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/zzse;
    .locals 9

    if-eqz p4, :cond_0

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/zzse;

    iget v6, p4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;->environment:I

    iget v7, p4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;->theme:I

    invoke-static {p4}, Lcom/google/android/gms/wallet/Wallet$WalletOptions;->zza(Lcom/google/android/gms/wallet/Wallet$WalletOptions;)Z

    move-result v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/zzse;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zzf;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;IIZ)V

    return-object v0

    :cond_0
    new-instance p4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, Lcom/google/android/gms/wallet/Wallet$WalletOptions;-><init>(Lcom/google/android/gms/wallet/Wallet$1;)V

    goto :goto_0
.end method
