package com.newtube.mobile.ui.playback;

import android.content.Context;

/** Phone player controls shared by the settings page and player overlay. */
public final class PlayerControlsPrefs {
    private static final String PREFS_NAME = "newtube_player_controls";
    private static final String KEY_SPEED_BUTTON = "speed_button";

    private PlayerControlsPrefs() {
    }

    public static boolean isSpeedButtonEnabled(Context context) {
        return context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .getBoolean(KEY_SPEED_BUTTON, true);
    }

    public static void setSpeedButtonEnabled(Context context, boolean enabled) {
        context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .edit().putBoolean(KEY_SPEED_BUTTON, enabled).apply();
    }
}
