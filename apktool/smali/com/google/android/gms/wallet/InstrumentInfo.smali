.class public final Lcom/google/android/gms/wallet/InstrumentInfo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private final mVersionCode:I

.field private zzboI:Ljava/lang/String;

.field private zzboJ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzh;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/InstrumentInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->zzboI:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->zzboJ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getInstrumentDetails()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->zzboJ:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstrumentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->zzboI:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->mVersionCode:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/zzh;->zza(Lcom/google/android/gms/wallet/InstrumentInfo;Landroid/os/Parcel;I)V

    return-void
.end method
