.class public final Lcom/google/android/gms/ads/internal/purchase/zzg;
.super Lcom/google/android/gms/internal/zzgg$zza;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private mContext:Landroid/content/Context;

.field zzFC:Lcom/google/android/gms/ads/internal/purchase/zzb;

.field private zzFI:Ljava/lang/String;

.field private zzFM:Lcom/google/android/gms/ads/internal/purchase/zzf;

.field private zzFS:Z

.field private zzFT:I

.field private zzFU:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/ads/internal/purchase/zzf;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzgg$zza;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFS:Z

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFI:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFT:I

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFU:Landroid/content/Intent;

    iput-boolean p3, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFS:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->mContext:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFM:Lcom/google/android/gms/ads/internal/purchase/zzf;

    return-void
.end method


# virtual methods
.method public final finishPurchase()V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzr;->zzbM()Lcom/google/android/gms/ads/internal/purchase/zzi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFU:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/purchase/zzi;->zzd(Landroid/content/Intent;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFT:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/zzb;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/purchase/zzb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFC:Lcom/google/android/gms/ads/internal/purchase/zzb;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/google/android/gms/common/stats/zzb;->zzrP()Lcom/google/android/gms/common/stats/zzb;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->mContext:Landroid/content/Context;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, p0, v3}, Lcom/google/android/gms/common/stats/zzb;->zza(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFI:Ljava/lang/String;

    return-object v0
.end method

.method public final getPurchaseData()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFU:Landroid/content/Intent;

    return-object v0
.end method

.method public final getResultCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFT:I

    return v0
.end method

.method public final isVerified()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFS:Z

    return v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    const-string v0, "In-app billing service connected."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzin;->zzaJ(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFC:Lcom/google/android/gms/ads/internal/purchase/zzb;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/purchase/zzb;->zzN(Landroid/os/IBinder;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzr;->zzbM()Lcom/google/android/gms/ads/internal/purchase/zzi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFU:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/purchase/zzi;->zze(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzr;->zzbM()Lcom/google/android/gms/ads/internal/purchase/zzi;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/purchase/zzi;->zzar(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFC:Lcom/google/android/gms/ads/internal/purchase/zzb;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/ads/internal/purchase/zzb;->zzh(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/purchase/zzh;->zzy(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/purchase/zzh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFM:Lcom/google/android/gms/ads/internal/purchase/zzf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/purchase/zzh;->zza(Lcom/google/android/gms/ads/internal/purchase/zzf;)V

    :cond_1
    invoke-static {}, Lcom/google/android/gms/common/stats/zzb;->zzrP()Lcom/google/android/gms/common/stats/zzb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/common/stats/zzb;->zza(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFC:Lcom/google/android/gms/ads/internal/purchase/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/purchase/zzb;->destroy()V

    goto :goto_0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "In-app billing service disconnected."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzin;->zzaJ(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/purchase/zzg;->zzFC:Lcom/google/android/gms/ads/internal/purchase/zzb;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/purchase/zzb;->destroy()V

    return-void
.end method
