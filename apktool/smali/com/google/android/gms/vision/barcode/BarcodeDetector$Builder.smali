.class public Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;
.super Ljava/lang/Object;


# instance fields
.field private mContext:Landroid/content/Context;

.field private zzbnv:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->mContext:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->zzbnv:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/vision/barcode/BarcodeDetector;
    .locals 3

    new-instance v0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;

    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->zzbnv:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;)V

    new-instance v1, Lcom/google/android/gms/vision/barcode/BarcodeDetector;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;-><init>(Lcom/google/android/gms/vision/barcode/internal/client/zzd;Lcom/google/android/gms/vision/barcode/BarcodeDetector$1;)V

    return-object v1
.end method

.method public setBarcodeFormats(I)Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;->zzbnv:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    iput p1, v0, Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;->zzbnw:I

    return-object p0
.end method
