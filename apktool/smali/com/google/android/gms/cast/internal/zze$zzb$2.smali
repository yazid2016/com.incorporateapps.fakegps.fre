.class Lcom/google/android/gms/cast/internal/zze$zzb$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzadV:Lcom/google/android/gms/cast/internal/zze;

.field final synthetic zzadX:Lcom/google/android/gms/cast/internal/zze$zzb;

.field final synthetic zzadY:Lcom/google/android/gms/cast/internal/DeviceStatus;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/internal/zze$zzb;Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/internal/DeviceStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/zze$zzb$2;->zzadX:Lcom/google/android/gms/cast/internal/zze$zzb;

    iput-object p2, p0, Lcom/google/android/gms/cast/internal/zze$zzb$2;->zzadV:Lcom/google/android/gms/cast/internal/zze;

    iput-object p3, p0, Lcom/google/android/gms/cast/internal/zze$zzb$2;->zzadY:Lcom/google/android/gms/cast/internal/DeviceStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$zzb$2;->zzadV:Lcom/google/android/gms/cast/internal/zze;

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zze$zzb$2;->zzadY:Lcom/google/android/gms/cast/internal/DeviceStatus;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/internal/DeviceStatus;)V

    return-void
.end method
