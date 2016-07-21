.class public interface abstract Lcom/google/android/gms/cast/games/GameManagerState;
.super Ljava/lang/Object;


# virtual methods
.method public abstract getApplicationName()Ljava/lang/CharSequence;
.end method

.method public abstract getConnectedControllablePlayers()Ljava/util/List;
.end method

.method public abstract getConnectedPlayers()Ljava/util/List;
.end method

.method public abstract getControllablePlayers()Ljava/util/List;
.end method

.method public abstract getGameData()Lorg/json/JSONObject;
.end method

.method public abstract getGameStatusText()Ljava/lang/CharSequence;
.end method

.method public abstract getGameplayState()I
.end method

.method public abstract getListOfChangedPlayers(Lcom/google/android/gms/cast/games/GameManagerState;)Ljava/util/Collection;
.end method

.method public abstract getLobbyState()I
.end method

.method public abstract getMaxPlayers()I
.end method

.method public abstract getPlayer(Ljava/lang/String;)Lcom/google/android/gms/cast/games/PlayerInfo;
.end method

.method public abstract getPlayers()Ljava/util/Collection;
.end method

.method public abstract getPlayersInState(I)Ljava/util/List;
.end method

.method public abstract hasGameDataChanged(Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method

.method public abstract hasGameStatusTextChanged(Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method

.method public abstract hasGameplayStateChanged(Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method

.method public abstract hasLobbyStateChanged(Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method

.method public abstract hasPlayerChanged(Ljava/lang/String;Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method

.method public abstract hasPlayerDataChanged(Ljava/lang/String;Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method

.method public abstract hasPlayerStateChanged(Ljava/lang/String;Lcom/google/android/gms/cast/games/GameManagerState;)Z
.end method