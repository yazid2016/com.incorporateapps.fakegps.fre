.class Lcom/google/android/gms/cast/internal/zzc$zza;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzadt:Lcom/google/android/gms/cast/internal/zzc;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/internal/zzc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/zzc$zza;->zzadt:Lcom/google/android/gms/cast/internal/zzc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/internal/zzc;Lcom/google/android/gms/cast/internal/zzc$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/zzc$zza;-><init>(Lcom/google/android/gms/cast/internal/zzc;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zzc$zza;->zzadt:Lcom/google/android/gms/cast/internal/zzc;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/cast/internal/zzc;->zzads:Z

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/cast/internal/zzc$zza;->zzadt:Lcom/google/android/gms/cast/internal/zzc;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/cast/internal/zzc;->zzz(J)Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zzc$zza;->zzadt:Lcom/google/android/gms/cast/internal/zzc;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/internal/zzc;->zzW(Z)V

    return-void
.end method
