object Libs {
    // Kotlin基础库
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"

    // Kotlin核心库
    const val CORE_KTX = "androidx.core:core-ktx:1.3.2"

    // Android标准库
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.2.0"

    // legacy
    const val LEGAVY_SUPPORT_V4 = "androidx.legacy:legacy-support-v4:1.0.0"

    // Material Design
    const val MATERAL = "com.google.android.material:material:1.2.1"

    // SwipeRefreshLayout
    const val SWIPEREFRESHLAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"

    // 约束布局
    const val CONSTRAINTLAYOUT = "androidx.constraintlayout:constraintlayout:2.0.2"

    // Jetpack Navigation
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    // Jetpack LiveData
    const val LIFECYCLE_LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
    const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"

    // Retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val OKHTTP3_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.7.2"
}