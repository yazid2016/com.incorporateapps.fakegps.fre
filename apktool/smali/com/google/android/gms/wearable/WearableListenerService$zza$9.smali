.class Lcom/google/android/gms/wearable/WearableListenerService$zza$9;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzbrs:Lcom/google/android/gms/wearable/WearableListenerService$zza;

.field final synthetic zzbrz:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$zza;Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$9;->zzbrs:Lcom/google/android/gms/wearable/WearableListenerService$zza;

    iput-object p2, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$9;->zzbrz:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$9;->zzbrz:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$9;->zzbrs:Lcom/google/android/gms/wearable/WearableListenerService$zza;

    iget-object v1, v1, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzbrq:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V

    return-void
.end method