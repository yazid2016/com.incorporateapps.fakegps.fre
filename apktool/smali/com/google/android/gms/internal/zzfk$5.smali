.class Lcom/google/android/gms/internal/zzfk$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzCQ:Lcom/google/android/gms/internal/zzfk;

.field final synthetic zzCR:Lcom/google/ads/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzfk;Lcom/google/ads/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfk$5;->zzCQ:Lcom/google/android/gms/internal/zzfk;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfk$5;->zzCR:Lcom/google/ads/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzfk$5;->zzCQ:Lcom/google/android/gms/internal/zzfk;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzfk;->zza(Lcom/google/android/gms/internal/zzfk;)Lcom/google/android/gms/internal/zzez;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfk$5;->zzCR:Lcom/google/ads/b;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzfl;->zza(Lcom/google/ads/b;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzez;->onAdFailedToLoad(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call onAdFailedToLoad."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
