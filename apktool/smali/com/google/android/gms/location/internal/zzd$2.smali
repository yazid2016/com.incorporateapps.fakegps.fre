.class Lcom/google/android/gms/location/internal/zzd$2;
.super Lcom/google/android/gms/location/internal/zzd$zza;


# instance fields
.field final synthetic zzaOx:Lcom/google/android/gms/location/internal/zzd;

.field final synthetic zzaOy:Lcom/google/android/gms/location/LocationCallback;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/zzd;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zzd$2;->zzaOx:Lcom/google/android/gms/location/internal/zzd;

    iput-object p3, p0, Lcom/google/android/gms/location/internal/zzd$2;->zzaOy:Lcom/google/android/gms/location/LocationCallback;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/zzd$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/zzl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zzd$2;->zza(Lcom/google/android/gms/location/internal/zzl;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/internal/zzl;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/internal/zzd$zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/location/internal/zzd$zzb;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    iget-object v1, p0, Lcom/google/android/gms/location/internal/zzd$2;->zzaOy:Lcom/google/android/gms/location/LocationCallback;

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/location/internal/zzl;->zza(Lcom/google/android/gms/location/LocationCallback;Lcom/google/android/gms/location/internal/zzg;)V

    return-void
.end method
