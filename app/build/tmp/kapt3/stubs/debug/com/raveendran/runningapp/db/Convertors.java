package com.raveendran.runningapp.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/raveendran/runningapp/db/Convertors;", "", "()V", "fromBitmap", "", "bmp", "Landroid/graphics/Bitmap;", "toBitmap", "byteArray", "app_debug"})
public final class Convertors {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final byte[] fromBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bmp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull()
    byte[] byteArray) {
        return null;
    }
    
    public Convertors() {
        super();
    }
}