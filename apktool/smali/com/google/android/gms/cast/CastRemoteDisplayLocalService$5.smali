.class Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzaaE:Z

.field final synthetic zzaaz:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->zzaaz:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    iput-boolean p2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->zzaaE:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->zzaaz:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    iget-boolean v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->zzaaE:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->zza(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Z)V

    return-void
.end method
