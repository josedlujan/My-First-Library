package libproject.com.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MyView extends LinearLayout{
    public MyView(Context context){
        super(context);
        initilize(context);
    }

    public MyView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initilize(context);
    }


    private void initilize(Context context){
        inflate(context,R.layout.myview,this);
    }
}
