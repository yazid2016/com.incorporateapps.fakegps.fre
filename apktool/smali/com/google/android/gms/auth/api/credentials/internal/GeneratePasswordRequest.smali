.class public final Lcom/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final mVersionCode:I

.field private final zzVM:Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/internal/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/auth/api/credentials/PasswordSpecification;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;->zzVM:Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/credentials/internal/zzh;->zza(Lcom/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzmr()Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;->zzVM:Lcom/google/android/gms/auth/api/credentials/PasswordSpecification;

    return-object v0
.end method
