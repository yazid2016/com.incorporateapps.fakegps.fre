.class Lcom/google/android/gms/location/places/internal/zzj$1;
.super Lcom/google/android/gms/location/places/zzl$zzd;


# instance fields
.field final synthetic zzaQt:Lcom/google/android/gms/location/places/PlaceFilter;

.field final synthetic zzaQu:Lcom/google/android/gms/location/places/internal/zzj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/zzj;Lcom/google/android/gms/common/api/Api$zzc;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/places/PlaceFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/zzj$1;->zzaQu:Lcom/google/android/gms/location/places/internal/zzj;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/zzj$1;->zzaQt:Lcom/google/android/gms/location/places/PlaceFilter;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/zzl$zzd;-><init>(Lcom/google/android/gms/common/api/Api$zzc;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/places/internal/zzk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/zzj$1;->zza(Lcom/google/android/gms/location/places/internal/zzk;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/places/internal/zzk;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/zzl;

    invoke-virtual {p1}, Lcom/google/android/gms/location/places/internal/zzk;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/location/places/zzl;-><init>(Lcom/google/android/gms/location/places/zzl$zzd;Landroid/content/Context;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/zzj$1;->zzaQt:Lcom/google/android/gms/location/places/PlaceFilter;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/places/internal/zzk;->zza(Lcom/google/android/gms/location/places/zzl;Lcom/google/android/gms/location/places/PlaceFilter;)V

    return-void
.end method
