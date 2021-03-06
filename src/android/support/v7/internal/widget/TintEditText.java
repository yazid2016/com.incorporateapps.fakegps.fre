package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class TintEditText
  extends EditText
{
  private static final int[] TINT_ATTRS = { 16842964 };
  
  public TintEditText(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TintEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842862);
  }
  
  public TintEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, TINT_ATTRS, paramInt, 0);
    setBackgroundDrawable(paramContext.getDrawable(0));
    paramContext.recycle();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintEditText
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */