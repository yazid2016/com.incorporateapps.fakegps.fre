.class final Lcom/google/android/gms/internal/zzkk$zza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/appindexing/AppIndexApi$ActionResult;


# instance fields
.field private zzUD:Lcom/google/android/gms/internal/zzkk;

.field private zzUE:Lcom/google/android/gms/common/api/PendingResult;

.field private zzUF:Lcom/google/android/gms/appindexing/Action;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzkk;Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/appindexing/Action;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzkk$zza;->zzUD:Lcom/google/android/gms/internal/zzkk;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzkk$zza;->zzUE:Lcom/google/android/gms/common/api/PendingResult;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzkk$zza;->zzUF:Lcom/google/android/gms/appindexing/Action;

    return-void
.end method


# virtual methods
.method public final end(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzkk$zza;->zzUF:Lcom/google/android/gms/appindexing/Action;

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/zzkj;->zza(Lcom/google/android/gms/appindexing/Action;JLjava/lang/String;I)Lcom/google/android/gms/appdatasearch/UsageInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzkk$zza;->zzUD:Lcom/google/android/gms/internal/zzkk;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/appdatasearch/UsageInfo;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/zzkk;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/appdatasearch/UsageInfo;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final getPendingResult()Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzkk$zza;->zzUE:Lcom/google/android/gms/common/api/PendingResult;

    return-object v0
.end method
