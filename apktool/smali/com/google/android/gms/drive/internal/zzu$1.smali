.class Lcom/google/android/gms/drive/internal/zzu$1;
.super Lcom/google/android/gms/drive/internal/zzt$zza;


# instance fields
.field final synthetic zzaqT:Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

.field final synthetic zzaqU:Lcom/google/android/gms/drive/internal/zzae;

.field final synthetic zzaqV:Lcom/google/android/gms/drive/internal/zzu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzu;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/internal/AddEventListenerRequest;Lcom/google/android/gms/drive/internal/zzae;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaqV:Lcom/google/android/gms/drive/internal/zzu;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaqT:Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaqU:Lcom/google/android/gms/drive/internal/zzae;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/zzt$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/zzu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzu$1;->zza(Lcom/google/android/gms/drive/internal/zzu;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/drive/internal/zzu;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/zzu;->zzte()Lcom/google/android/gms/drive/internal/zzam;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaqT:Lcom/google/android/gms/drive/internal/AddEventListenerRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzu$1;->zzaqU:Lcom/google/android/gms/drive/internal/zzae;

    const/4 v3, 0x0

    new-instance v4, Lcom/google/android/gms/drive/internal/zzbu;

    invoke-direct {v4, p0}, Lcom/google/android/gms/drive/internal/zzbu;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/zzam;->zza(Lcom/google/android/gms/drive/internal/AddEventListenerRequest;Lcom/google/android/gms/drive/internal/zzao;Ljava/lang/String;Lcom/google/android/gms/drive/internal/zzan;)V

    return-void
.end method
