.class Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;
.super Lcom/google/android/gms/games/internal/api/SnapshotsImpl$LoadImpl;


# instance fields
.field final synthetic zzaFO:Z

.field final synthetic zzaFQ:Ljava/lang/String;

.field final synthetic zzacQ:Ljava/lang/String;


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;->zza(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;->zzacQ:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;->zzaFQ:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;->zzaFO:Z

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzc(Lcom/google/android/gms/common/api/internal/zza$zzb;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method