.class final Lcom/google/android/gms/wearable/internal/zzbo$zzq;
.super Lcom/google/android/gms/wearable/internal/zzbo$zzb;


# instance fields
.field private final zzzM:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbo$zzb;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzbo$zzq;->zzzM:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/PutDataResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzx$zza;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/PutDataResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbk;->zzgc(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/PutDataResponse;->zzbsJ:Lcom/google/android/gms/wearable/internal/DataItemParcelable;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzx$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/DataItem;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbo$zzq;->zzX(Ljava/lang/Object;)V

    iget v0, p1, Lcom/google/android/gms/wearable/internal/PutDataResponse;->statusCode:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbo$zzq;->zzzM:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/FutureTask;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    goto :goto_0

    :cond_0
    return-void
.end method
