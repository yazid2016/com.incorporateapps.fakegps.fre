.class public Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final statusCode:I

.field public final versionCode:I

.field public final zzbsB:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzai;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzai;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->statusCode:I

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;->zzbsB:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzai;->zza(Lcom/google/android/gms/wearable/internal/GetCapabilityResponse;Landroid/os/Parcel;I)V

    return-void
.end method
