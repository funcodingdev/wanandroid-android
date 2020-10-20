/**
 * gradle常量
 */
object GradleConfig {
    const val gradle_version = "4.1.0"

    const val kotlin_version = "1.4.10"
}

object AppGradleConfig {
    // 依赖版本
    const val compileSdkVersion = 30

    // 编译工具版本
    const val buildToolsVersion = "30.0.1"

    // 应用包名
    const val applicationId = "cn.funcoding.wanandroid.android"

    // 最小支持Sdk版本
    const val minSdkVersion = 21

    // 当前基于Sdk版本
    const val targetSdkVersion = 30

    // 版本编码
    const val versionCode = 1

    // 版本名称
    const val versionName = "1.0"
}

object AppDependenciesConfig {
    // Kotlin基础库
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${GradleConfig.kotlin_version}"

    // Kotlin核心库
    const val core_ktx = "androidx.core:core-ktx:1.3.2"

    // Android标准库
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"

    // Material Design
    const val material = "com.google.android.material:material:1.2.1"

    // 约束布局
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.2"
}