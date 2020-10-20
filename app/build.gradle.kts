plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    // 版本配置
    compileSdkVersion(AppGradleConfig.compileSdkVersion)
    buildToolsVersion(AppGradleConfig.buildToolsVersion)

    defaultConfig {
        applicationId = AppGradleConfig.applicationId
        minSdkVersion(AppGradleConfig.minSdkVersion)
        targetSdkVersion(AppGradleConfig.targetSdkVersion)
        versionCode = AppGradleConfig.versionCode
        versionName = AppGradleConfig.versionName
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
    implementation(AppDependenciesConfig.kotlin_stdlib)
    implementation(AppDependenciesConfig.core_ktx)
    implementation(AppDependenciesConfig.appcompat)
    implementation(AppDependenciesConfig.material)
    implementation(AppDependenciesConfig.constraintlayout)
}