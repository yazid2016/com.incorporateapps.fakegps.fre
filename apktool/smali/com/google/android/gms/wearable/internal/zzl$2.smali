.class final Lcom/google/android/gms/wearable/internal/zzl$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/internal/zzb$zza;


# instance fields
.field final synthetic zzbrP:[Landroid/content/IntentFilter;


# direct methods
.method constructor <init>([Landroid/content/IntentFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzl$2;->zzbrP:[Landroid/content/IntentFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/common/api/internal/zzq;)V
    .locals 6

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/wearable/internal/zzl$2;->zzbrP:[Landroid/content/IntentFilter;

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/wearable/internal/zzbp;->zza(Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/common/api/internal/zzq;Ljava/lang/String;[Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final bridge synthetic zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/zzq;)V
    .locals 0

    check-cast p3, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/zzl$2;->zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;Lcom/google/android/gms/common/api/internal/zzq;)V

    return-void
.end method
