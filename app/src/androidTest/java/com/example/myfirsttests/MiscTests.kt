package com.example.myfirsttests

import android.content.Context
import android.content.pm.PackageInfo
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MiscTests {
    private val appContext: Context? = InstrumentationRegistry.getInstrumentation().targetContext
    private val packageInfo: PackageInfo? = appContext?.packageManager?.getPackageInfo(appContext.packageName, 0)

    @Test
    fun appName_IsCorrect_ReturnsTrue() {
        assertEquals("com.example.myfirsttests", appContext?.packageName)
    }

    @Test
    fun appName_IsIncorrect_ReturnsTrue() {
        assertNotEquals("test", appContext?.packageName)
    }

    @Test
    fun appName_ContextAndPackageInfoNotSame_ReturnsTrue() {
        assertNotSame(appContext?.packageName, packageInfo?.packageName)
    }

    @Test
    fun appVersion_NotNull_ReturnsTrue() {
        assertNotNull(packageInfo?.versionName)
    }
}