.class Lcom/google/android/gms/tagmanager/zzw$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzbiF:Ljava/util/List;

.field final synthetic zzbiG:J

.field final synthetic zzbiH:Lcom/google/android/gms/tagmanager/zzw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzw;Ljava/util/List;J)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzw$1;->zzbiH:Lcom/google/android/gms/tagmanager/zzw;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzw$1;->zzbiF:Ljava/util/List;

    iput-wide p3, p0, Lcom/google/android/gms/tagmanager/zzw$1;->zzbiG:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzw$1;->zzbiH:Lcom/google/android/gms/tagmanager/zzw;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzw$1;->zzbiF:Ljava/util/List;

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/zzw$1;->zzbiG:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/tagmanager/zzw;->zza(Lcom/google/android/gms/tagmanager/zzw;Ljava/util/List;J)V

    return-void
.end method
