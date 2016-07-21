package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet
  implements DataBufferObserver, DataBufferObserver.Observable
{
  private HashSet zzajd = new HashSet();
  
  public final void addObserver(DataBufferObserver paramDataBufferObserver)
  {
    zzajd.add(paramDataBufferObserver);
  }
  
  public final void clear()
  {
    zzajd.clear();
  }
  
  public final boolean hasObservers()
  {
    return !zzajd.isEmpty();
  }
  
  public final void onDataChanged()
  {
    Iterator localIterator = zzajd.iterator();
    while (localIterator.hasNext()) {
      ((DataBufferObserver)localIterator.next()).onDataChanged();
    }
  }
  
  public final void onDataRangeChanged(int paramInt1, int paramInt2)
  {
    Iterator localIterator = zzajd.iterator();
    while (localIterator.hasNext()) {
      ((DataBufferObserver)localIterator.next()).onDataRangeChanged(paramInt1, paramInt2);
    }
  }
  
  public final void onDataRangeInserted(int paramInt1, int paramInt2)
  {
    Iterator localIterator = zzajd.iterator();
    while (localIterator.hasNext()) {
      ((DataBufferObserver)localIterator.next()).onDataRangeInserted(paramInt1, paramInt2);
    }
  }
  
  public final void onDataRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    Iterator localIterator = zzajd.iterator();
    while (localIterator.hasNext()) {
      ((DataBufferObserver)localIterator.next()).onDataRangeMoved(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void onDataRangeRemoved(int paramInt1, int paramInt2)
  {
    Iterator localIterator = zzajd.iterator();
    while (localIterator.hasNext()) {
      ((DataBufferObserver)localIterator.next()).onDataRangeRemoved(paramInt1, paramInt2);
    }
  }
  
  public final void removeObserver(DataBufferObserver paramDataBufferObserver)
  {
    zzajd.remove(paramDataBufferObserver);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.DataBufferObserverSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */