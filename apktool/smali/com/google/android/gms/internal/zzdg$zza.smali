.class Lcom/google/android/gms/internal/zzdg$zza;
.super Ljava/lang/Object;


# instance fields
.field private final mValue:Ljava/lang/String;

.field private final zzvs:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdg$zza;->zzvs:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdg$zza;->mValue:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zza;->zzvs:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zza;->mValue:Ljava/lang/String;

    return-object v0
.end method
