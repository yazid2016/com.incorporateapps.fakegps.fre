.class public final Lcom/google/android/gms/measurement/internal/zzl$zza;
.super Ljava/lang/Object;


# instance fields
.field private final zzSA:Ljava/lang/Object;

.field private final zzSB:Lcom/google/android/gms/internal/zzlz;

.field private zzSC:Ljava/lang/Object;

.field private final zzvs:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzlz;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSB:Lcom/google/android/gms/internal/zzlz;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSA:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzvs:Ljava/lang/String;

    return-void
.end method

.method static zzD(Ljava/lang/String;I)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 1

    invoke-static {p0, p1, p1}, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzo(Ljava/lang/String;II)Lcom/google/android/gms/measurement/internal/zzl$zza;

    move-result-object v0

    return-object v0
.end method

.method static zzN(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 1

    invoke-static {p0, p1, p1}, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzl$zza;

    move-result-object v0

    return-object v0
.end method

.method static zzb(Ljava/lang/String;JJ)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 3

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzl$zza;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzlz;->zza(Ljava/lang/String;Ljava/lang/Long;)Lcom/google/android/gms/internal/zzlz;

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzl$zza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzlz;Ljava/lang/Object;)V

    return-object v0
.end method

.method static zzb(Ljava/lang/String;ZZ)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 3

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzl$zza;

    invoke-static {p0, p2}, Lcom/google/android/gms/internal/zzlz;->zzk(Ljava/lang/String;Z)Lcom/google/android/gms/internal/zzlz;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzl$zza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzlz;Ljava/lang/Object;)V

    return-object v0
.end method

.method static zze(Ljava/lang/String;J)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 1

    invoke-static {p0, p1, p2, p1, p2}, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzb(Ljava/lang/String;JJ)Lcom/google/android/gms/measurement/internal/zzl$zza;

    move-result-object v0

    return-object v0
.end method

.method static zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 2

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzl$zza;

    invoke-static {p0, p2}, Lcom/google/android/gms/internal/zzlz;->zzv(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzlz;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/measurement/internal/zzl$zza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzlz;Ljava/lang/Object;)V

    return-object v0
.end method

.method static zzm(Ljava/lang/String;Z)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 1

    invoke-static {p0, p1, p1}, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzb(Ljava/lang/String;ZZ)Lcom/google/android/gms/measurement/internal/zzl$zza;

    move-result-object v0

    return-object v0
.end method

.method static zzo(Ljava/lang/String;II)Lcom/google/android/gms/measurement/internal/zzl$zza;
    .locals 3

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzl$zza;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzlz;->zza(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/android/gms/internal/zzlz;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzl$zza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzlz;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSC:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSC:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/common/internal/zzd;->zzakE:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzlz;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSB:Lcom/google/android/gms/internal/zzlz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlz;->zzpX()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSA:Ljava/lang/Object;

    goto :goto_0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSC:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSC:Ljava/lang/Object;

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    if-nez p1, :cond_0

    sget-boolean v0, Lcom/google/android/gms/common/internal/zzd;->zzakE:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/zzlz;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSB:Lcom/google/android/gms/internal/zzlz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzlz;->zzpX()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzSA:Ljava/lang/Object;

    goto :goto_0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzl$zza;->zzvs:Ljava/lang/String;

    return-object v0
.end method
