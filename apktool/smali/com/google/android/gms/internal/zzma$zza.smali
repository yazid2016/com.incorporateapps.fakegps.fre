.class final Lcom/google/android/gms/internal/zzma$zza;
.super Landroid/graphics/drawable/Drawable;


# static fields
.field private static final zzakn:Lcom/google/android/gms/internal/zzma$zza;

.field private static final zzako:Lcom/google/android/gms/internal/zzma$zza$zza;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzma$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzma$zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzma$zza;->zzakn:Lcom/google/android/gms/internal/zzma$zza;

    new-instance v0, Lcom/google/android/gms/internal/zzma$zza$zza;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzma$zza$zza;-><init>(Lcom/google/android/gms/internal/zzma$1;)V

    sput-object v0, Lcom/google/android/gms/internal/zzma$zza;->zzako:Lcom/google/android/gms/internal/zzma$zza$zza;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method

.method static synthetic zzqo()Lcom/google/android/gms/internal/zzma$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzma$zza;->zzakn:Lcom/google/android/gms/internal/zzma$zza;

    return-object v0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzma$zza;->zzako:Lcom/google/android/gms/internal/zzma$zza$zza;

    return-object v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
