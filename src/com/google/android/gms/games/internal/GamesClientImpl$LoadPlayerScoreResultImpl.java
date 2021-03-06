package com.google.android.gms.games.internal;

import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;

final class GamesClientImpl$LoadPlayerScoreResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Leaderboards.LoadPlayerScoreResult
{
  private final LeaderboardScoreEntity zzaEH;
  
  /* Error */
  GamesClientImpl$LoadPlayerScoreResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 12	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 14	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 15	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 19	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:getCount	()I
    //   18: ifle +25 -> 43
    //   21: aload_0
    //   22: aload_1
    //   23: iconst_0
    //   24: invokevirtual 23	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:get	(I)Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //   27: invokeinterface 29 1 0
    //   32: checkcast 31	com/google/android/gms/games/leaderboard/LeaderboardScoreEntity
    //   35: putfield 33	com/google/android/gms/games/internal/GamesClientImpl$LoadPlayerScoreResultImpl:zzaEH	Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;
    //   38: aload_1
    //   39: invokevirtual 37	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:release	()V
    //   42: return
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 33	com/google/android/gms/games/internal/GamesClientImpl$LoadPlayerScoreResultImpl:zzaEH	Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;
    //   48: goto -10 -> 38
    //   51: astore_2
    //   52: aload_1
    //   53: invokevirtual 37	com/google/android/gms/games/leaderboard/LeaderboardScoreBuffer:release	()V
    //   56: aload_2
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	LoadPlayerScoreResultImpl
    //   0	58	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   51	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	38	51	finally
    //   43	48	51	finally
  }
  
  public final LeaderboardScore getScore()
  {
    return zzaEH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadPlayerScoreResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */