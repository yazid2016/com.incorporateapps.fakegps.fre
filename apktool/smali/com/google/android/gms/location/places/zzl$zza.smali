.class public abstract Lcom/google/android/gms/location/places/zzl$zza;
.super Lcom/google/android/gms/location/places/zzl$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Api$zzc;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/zzl$zzb;-><init>(Lcom/google/android/gms/common/api/Api$zzc;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zzaV(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->zzbI(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/zzl$zza;->zzaV(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;

    move-result-object v0

    return-object v0
.end method
