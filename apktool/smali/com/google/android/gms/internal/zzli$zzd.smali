.class final Lcom/google/android/gms/internal/zzli$zzd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/games/GameManagerClient$GameManagerInstanceResult;


# instance fields
.field private final zzUX:Lcom/google/android/gms/common/api/Status;

.field private final zzacV:Lcom/google/android/gms/cast/games/GameManagerClient;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/games/GameManagerClient;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzli$zzd;->zzUX:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzli$zzd;->zzacV:Lcom/google/android/gms/cast/games/GameManagerClient;

    return-void
.end method


# virtual methods
.method public final getGameManagerClient()Lcom/google/android/gms/cast/games/GameManagerClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzli$zzd;->zzacV:Lcom/google/android/gms/cast/games/GameManagerClient;

    return-object v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzli$zzd;->zzUX:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
