.class public final enum Lcom/google/ads/c;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lcom/google/ads/c;

.field public static final enum b:Lcom/google/ads/c;

.field public static final enum c:Lcom/google/ads/c;

.field private static final synthetic d:[Lcom/google/ads/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/ads/c;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v2}, Lcom/google/ads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/ads/c;->a:Lcom/google/ads/c;

    new-instance v0, Lcom/google/ads/c;

    const-string v1, "MALE"

    invoke-direct {v0, v1, v3}, Lcom/google/ads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/ads/c;->b:Lcom/google/ads/c;

    new-instance v0, Lcom/google/ads/c;

    const-string v1, "FEMALE"

    invoke-direct {v0, v1, v4}, Lcom/google/ads/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/ads/c;->c:Lcom/google/ads/c;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/ads/c;

    sget-object v1, Lcom/google/ads/c;->a:Lcom/google/ads/c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/ads/c;->b:Lcom/google/ads/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/ads/c;->c:Lcom/google/ads/c;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/ads/c;->d:[Lcom/google/ads/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/ads/c;
    .locals 1

    const-class v0, Lcom/google/ads/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    return-object v0
.end method

.method public static values()[Lcom/google/ads/c;
    .locals 1

    sget-object v0, Lcom/google/ads/c;->d:[Lcom/google/ads/c;

    invoke-virtual {v0}, [Lcom/google/ads/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/ads/c;

    return-object v0
.end method
