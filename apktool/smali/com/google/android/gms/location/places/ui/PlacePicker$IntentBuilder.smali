.class public Lcom/google/android/gms/location/places/ui/PlacePicker$IntentBuilder;
.super Lcom/google/android/gms/location/places/ui/zza$zza;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "com.google.android.gms.location.places.ui.PICK_PLACE"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/ui/zza$zza;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/PlacePicker$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "gmscore_client_jar_version"

    sget v2, Lcom/google/android/gms/common/GoogleApiAvailability;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public build(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 1

    invoke-super {p0, p1}, Lcom/google/android/gms/location/places/ui/zza$zza;->build(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public setLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/location/places/ui/PlacePicker$IntentBuilder;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/PlacePicker$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "latlng_bounds"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/zzc;->zza(Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;Landroid/content/Intent;Ljava/lang/String;)V

    return-object p0
.end method