package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat
  extends ListView
{
  public static final int INVALID_POSITION = -1;
  public static final int NO_POSITION = -1;
  private static final int[] STATE_SET_NOTHING = { 0 };
  private Field mIsChildViewEnabled;
  int mSelectionBottomPadding = 0;
  int mSelectionLeftPadding = 0;
  int mSelectionRightPadding = 0;
  int mSelectionTopPadding = 0;
  private ListViewCompat.GateKeeperDrawable mSelector;
  final Rect mSelectorRect = new Rect();
  
  public ListViewCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      mIsChildViewEnabled = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      mIsChildViewEnabled.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    drawSelectorCompat(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawSelectorCompat(Canvas paramCanvas)
  {
    if (!mSelectorRect.isEmpty())
    {
      Drawable localDrawable = getSelector();
      localDrawable.setBounds(mSelectorRect);
      localDrawable.draw(paramCanvas);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    mSelector.setEnabled(true);
    updateSelectorStateCompat();
  }
  
  public int lookForSelectablePosition(int paramInt, boolean paramBoolean)
  {
    ListAdapter localListAdapter = getAdapter();
    int i;
    if ((localListAdapter == null) || (isInTouchMode())) {
      i = -1;
    }
    int j;
    label130:
    do
    {
      do
      {
        return i;
        j = localListAdapter.getCount();
        if (getAdapter().areAllItemsEnabled()) {
          break label130;
        }
        if (paramBoolean)
        {
          i = Math.max(0, paramInt);
          for (;;)
          {
            paramInt = i;
            if (i >= j) {
              break;
            }
            paramInt = i;
            if (localListAdapter.isEnabled(i)) {
              break;
            }
            i += 1;
          }
        }
        i = Math.min(paramInt, j - 1);
        for (;;)
        {
          paramInt = i;
          if (i < 0) {
            break;
          }
          paramInt = i;
          if (localListAdapter.isEnabled(i)) {
            break;
          }
          i -= 1;
        }
        if (paramInt < 0) {
          break;
        }
        i = paramInt;
      } while (paramInt < j);
      return -1;
      if (paramInt < 0) {
        break;
      }
      i = paramInt;
    } while (paramInt < j);
    return -1;
  }
  
  public int measureHeightOfChildrenCompat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt2 = getListPaddingTop();
    paramInt3 = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int i = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 += paramInt3;
      return paramInt2;
    }
    paramInt3 += paramInt2;
    label63:
    int j;
    int m;
    if ((i > 0) && (localObject != null))
    {
      paramInt2 = 0;
      localObject = null;
      int k = 0;
      int n = localListAdapter.getCount();
      j = 0;
      if (j >= n) {
        break label257;
      }
      m = localListAdapter.getItemViewType(j);
      if (m == k) {
        break label259;
      }
      localObject = null;
      k = m;
      label115:
      localObject = localListAdapter.getView(j, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
      if ((localLayoutParams == null) || (height <= 0)) {
        break label224;
      }
      m = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
      label161:
      ((View)localObject).measure(paramInt1, m);
      if (j <= 0) {
        break label265;
      }
      paramInt3 += i;
    }
    label224:
    label257:
    label259:
    label265:
    for (;;)
    {
      paramInt3 = ((View)localObject).getMeasuredHeight() + paramInt3;
      if (paramInt3 >= paramInt4)
      {
        if ((paramInt5 >= 0) && (j > paramInt5) && (paramInt2 > 0) && (paramInt3 != paramInt4)) {
          break;
        }
        return paramInt4;
        i = 0;
        break label63;
        m = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label161;
      }
      if ((paramInt5 >= 0) && (j >= paramInt5)) {
        paramInt2 = paramInt3;
      }
      for (;;)
      {
        j += 1;
        break;
        return paramInt3;
        break label115;
      }
    }
  }
  
  protected void positionSelectorCompat(int paramInt, View paramView)
  {
    Rect localRect = mSelectorRect;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    left -= mSelectionLeftPadding;
    top -= mSelectionTopPadding;
    right += mSelectionRightPadding;
    bottom += mSelectionBottomPadding;
    try
    {
      boolean bool = mIsChildViewEnabled.getBoolean(this);
      if (paramView.isEnabled() != bool)
      {
        paramView = mIsChildViewEnabled;
        if (bool) {
          break label134;
        }
      }
      label134:
      for (bool = true;; bool = false)
      {
        paramView.set(this, Boolean.valueOf(bool));
        if (paramInt != -1) {
          refreshDrawableState();
        }
        return;
      }
      return;
    }
    catch (IllegalAccessException paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  protected void positionSelectorLikeFocusCompat(int paramInt, View paramView)
  {
    boolean bool = true;
    Drawable localDrawable = getSelector();
    int i;
    float f1;
    float f2;
    if ((localDrawable != null) && (paramInt != -1))
    {
      i = 1;
      if (i != 0) {
        localDrawable.setVisible(false, false);
      }
      positionSelectorCompat(paramInt, paramView);
      if (i != 0)
      {
        paramView = mSelectorRect;
        f1 = paramView.exactCenterX();
        f2 = paramView.exactCenterY();
        if (getVisibility() != 0) {
          break label93;
        }
      }
    }
    for (;;)
    {
      localDrawable.setVisible(bool, false);
      DrawableCompat.setHotspot(localDrawable, f1, f2);
      return;
      i = 0;
      break;
      label93:
      bool = false;
    }
  }
  
  protected void positionSelectorLikeTouchCompat(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    positionSelectorLikeFocusCompat(paramInt, paramView);
    paramView = getSelector();
    if ((paramView != null) && (paramInt != -1)) {
      DrawableCompat.setHotspot(paramView, paramFloat1, paramFloat2);
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    mSelector = new ListViewCompat.GateKeeperDrawable(paramDrawable);
    super.setSelector(mSelector);
    Rect localRect = new Rect();
    paramDrawable.getPadding(localRect);
    mSelectionLeftPadding = left;
    mSelectionTopPadding = top;
    mSelectionRightPadding = right;
    mSelectionBottomPadding = bottom;
  }
  
  protected void setSelectorEnabled(boolean paramBoolean)
  {
    mSelector.setEnabled(paramBoolean);
  }
  
  protected boolean shouldShowSelectorCompat()
  {
    return (touchModeDrawsInPressedStateCompat()) && (isPressed());
  }
  
  protected boolean touchModeDrawsInPressedStateCompat()
  {
    return false;
  }
  
  protected void updateSelectorStateCompat()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (shouldShowSelectorCompat())) {
      localDrawable.setState(getDrawableState());
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ListViewCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */