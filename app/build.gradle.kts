plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("kotlin-android")
}

android {
    // 版本配置
    compileSdkVersion(Versions.COMPILE_SDK)
    buildToolsVersion(Versions.BUILD_TOOL)

    defaultConfig {
        applicationId = Versions.APPLICATION_ID
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
    }

    // 签名类型
    signingConfigs {
        register("release") {
            // 别名
            keyAlias("wanandroid")
            // 别名密码
            keyPassword("wanandroid")
            // 签名路径
            storeFile(file("wanandroid.jks"))
            // 签名密码
            storePassword("wanandroid")
        }
    }

    // 编译类型
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }

        getByName("release") {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // 输出类型
    android.applicationVariants.all {
        val buildTypeName = buildType.name
        outputs.all {
            if (this is com.android.build.gradle.internal.api.ApkVariantOutputImpl) {
                this.outputFileName =
                    "app_${defaultConfig.versionCode}_v${defaultConfig.versionName}_$buildTypeName.apk"
            }
        }
    }

    // 编译操作
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    // Kotlin
    implementation(Libs.KOTLIN_STDLIB)
    implementation(Libs.CORE_KTX)
    // AppCompat
    implementation(Libs.APPCOMPAT)
    // legacy
    implementation(Libs.LEGAVY_SUPPORT_V4)
    // Material Design
    implementation(Libs.MATERAL)
    // SwipeRefreshLayout
    implementation(Libs.SWIPEREFRESHLAYOUT)
    // ConstraintLayout
    implementation(Libs.CONSTRAINTLAYOUT)
    // Navigation
    implementation(Libs.NAVIGATION_FRAGMENT_KTX)
    implementation(Libs.NAVIGATION_UI_KTX)
    // LiveData
    implementation(Libs.LIFECYCLE_LIVEDATA_KTX)
    implementation(Libs.LIFECYCLE_VIEWMODEL_KTX)
}