.class Lcom/google/android/gms/common/api/internal/zzh$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zzahC:Lcom/google/android/gms/common/api/internal/zzh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/zzh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zzh$1;->zzahC:Lcom/google/android/gms/common/api/internal/zzh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zzh$1;->zzahC:Lcom/google/android/gms/common/api/internal/zzh;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/zzh;->zzb(Lcom/google/android/gms/common/api/internal/zzh;)Lcom/google/android/gms/common/zzc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/zzh$1;->zzahC:Lcom/google/android/gms/common/api/internal/zzh;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/zzh;->zza(Lcom/google/android/gms/common/api/internal/zzh;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/zzc;->zzal(Landroid/content/Context;)V

    return-void
.end method
