.class Lcom/google/android/gms/internal/zzli$1;
.super Lcom/google/android/gms/internal/zzli$zzc;


# instance fields
.field final synthetic zzacN:Lcom/google/android/gms/internal/zzli;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzli;Lcom/google/android/gms/cast/games/GameManagerClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzli$zzc;-><init>(Lcom/google/android/gms/internal/zzli;Lcom/google/android/gms/cast/games/GameManagerClient;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    const/4 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzli;->zzc(Lcom/google/android/gms/internal/zzli;)Lcom/google/android/gms/cast/Cast$CastApi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzli;->zzb(Lcom/google/android/gms/internal/zzli;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzli;->getNamespace()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/zzli$1$1;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/zzli$1$1;-><init>(Lcom/google/android/gms/internal/zzli$1;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/cast/Cast$CastApi;->setMessageReceivedCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzli;->zzd(Lcom/google/android/gms/internal/zzli;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzli;->zze(Lcom/google/android/gms/internal/zzli;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzli$1;->zzacN:Lcom/google/android/gms/internal/zzli;

    const/16 v1, 0x44c

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzli$1;->zznW()Lcom/google/android/gms/cast/internal/zzo;

    move-result-object v2

    invoke-static {v0, v4, v1, v4, v2}, Lcom/google/android/gms/internal/zzli;->zza(Lcom/google/android/gms/internal/zzli;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/zzo;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzli$1;->zznW()Lcom/google/android/gms/cast/internal/zzo;

    move-result-object v0

    const-wide/16 v2, -0x1

    const/16 v1, 0x8

    invoke-interface {v0, v2, v3, v1, v4}, Lcom/google/android/gms/cast/internal/zzo;->zza(JILjava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
