.class Lcom/google/android/gms/drive/internal/zzy$zze;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/DriveFolder$DriveFolderResult;


# instance fields
.field private final zzUX:Lcom/google/android/gms/common/api/Status;

.field private final zzars:Lcom/google/android/gms/drive/DriveFolder;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveFolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzy$zze;->zzUX:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/zzy$zze;->zzars:Lcom/google/android/gms/drive/DriveFolder;

    return-void
.end method


# virtual methods
.method public getDriveFolder()Lcom/google/android/gms/drive/DriveFolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzy$zze;->zzars:Lcom/google/android/gms/drive/DriveFolder;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzy$zze;->zzUX:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
