.class final Lcom/google/android/gms/maps/GoogleMap$zza;
.super Lcom/google/android/gms/maps/internal/zzb$zza;


# instance fields
.field private final zzaRO:Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzb$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMap$zza;->zzaRO:Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$zza;->zzaRO:Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;

    invoke-interface {v0}, Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;->onCancel()V

    return-void
.end method

.method public final onFinish()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$zza;->zzaRO:Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;

    invoke-interface {v0}, Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;->onFinish()V

    return-void
.end method
