# As_KmmApp
kotlin 跨平台项目


Kotlin Multiplatform Mobile(KMM)
目前编写了一个demo:
完成以下两点功能
1.KMM 数据存储在IOS 和Android 都可以实现跨平台工作
2.网络请求跨平台,Android和IOS 这边都可以请求到了


PS :
1.目前我测试了在 Android 端上比较常用的GSON、Glide框架,暂时没有发现可以在common 上使用,目前支持框架有限
2.从使用过程中,KMM 适用于公用的业务逻辑,并不是适用于UI 层面,各自的UI 还得从两端分开编写
