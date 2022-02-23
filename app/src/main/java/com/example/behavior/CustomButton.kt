package com.example.behavior

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import androidx.coordinatorlayout.widget.CoordinatorLayout

class CustomButton:
    androidx.appcompat.widget.AppCompatButton, CoordinatorLayout.AttachedBehavior {

    constructor(context:Context):super(context)
    constructor(context: Context, attributeSet: AttributeSet):super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr:Int):super(context, attributeSet, defStyleAttr)

    override fun getBehavior() = MoveBehavior()
}