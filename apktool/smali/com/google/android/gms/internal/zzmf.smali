.class public final Lcom/google/android/gms/internal/zzmf;
.super Ljava/lang/Object;


# static fields
.field public static final API:Lcom/google/android/gms/common/api/Api;

.field public static final zzUI:Lcom/google/android/gms/common/api/Api$zzc;

.field private static final zzUJ:Lcom/google/android/gms/common/api/Api$zza;

.field public static final zzamA:Lcom/google/android/gms/internal/zzmg;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$zzc;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzmf;->zzUI:Lcom/google/android/gms/common/api/Api$zzc;

    new-instance v0, Lcom/google/android/gms/internal/zzmf$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzmf$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzmf;->zzUJ:Lcom/google/android/gms/common/api/Api$zza;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Common.API"

    sget-object v2, Lcom/google/android/gms/internal/zzmf;->zzUJ:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/internal/zzmf;->zzUI:Lcom/google/android/gms/common/api/Api$zzc;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$zzc;)V

    sput-object v0, Lcom/google/android/gms/internal/zzmf;->API:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/internal/zzmh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzmh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzmf;->zzamA:Lcom/google/android/gms/internal/zzmg;

    return-void
.end method
