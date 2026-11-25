# vibelab-test-deps

VibeLab 提交测试工程 2：**第三方依赖与资源合并用例**。

- 依赖 androidx.appcompat、androidx.constraintlayout、com.google.android.material，全部来自 google() / mavenCentral()
- 使用 ConstraintLayout 布局 + Material 主题与按钮，验证云端资源合并、AAPT2 编译、依赖传递解析
- Gradle wrapper 8.13 / AGP 8.13.2 / compileSdk 35 / targetSdk 35 / minSdk 26 / Java 17
- 包名 `com.tuomimi.vibelab.deps`；无签名配置、无 `local.properties`

用途：确认平台在拉取较多依赖时构建是否稳定。基线工程（vibelab-test-basic）通过而本工程失败时，说明问题集中在依赖拉取或资源合并环节。
