/*
        Copyright 2019 Gaurav Kumar

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package com.gauravk.bubblenavigation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

@SuppressWarnings("unused")
class BubbleToggleItem {

    private Drawable icon;
    private Drawable shape;
    private String title = "";
    private int colorActive = Color.BLUE;
    private int colorInactive = Color.BLACK;

    private float titleSize;
    private float iconWidth, iconHeight;

    BubbleToggleItem() {
    }

    Drawable getIcon() {
        return icon;
    }

    void setIcon(Drawable icon) {
        this.icon = icon;
    }

    Drawable getShape() {
        return shape;
    }

    void setShape(Drawable shape) {
        this.shape = shape;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getColorActive() {
        return colorActive;
    }

    void setColorActive(int colorActive) {
        this.colorActive = colorActive;
    }

    int getColorInactive() {
        return colorInactive;
    }

    void setColorInactive(int colorInactive) {
        this.colorInactive = colorInactive;
    }

    float getTitleSize() {
        return titleSize;
    }

    void setTitleSize(float titleSize) {
        this.titleSize = titleSize;
    }

    float getIconWidth() {
        return iconWidth;
    }

    void setIconWidth(float iconWidth) {
        this.iconWidth = iconWidth;
    }

    float getIconHeight() {
        return iconHeight;
    }

    void setIconHeight(float iconHeight) {
        this.iconHeight = iconHeight;
    }
}
