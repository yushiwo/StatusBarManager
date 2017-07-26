### 前言
分别举着色和沉浸的例子，如：试卷预览、首页着色状态栏、直播全屏播放
以上的效果，一般我们统称为沉浸式状态栏。其实，它们还是有区别的。

### 一、两种状态
进行Android开发的我们都应该知道Translucent Bar（透明栏）和Immersive Mode（沉浸模式），两种方式都会对状态栏进行设置。两者的区别，比较直观的一点就是体现在屏幕中的View可点击区域。

+ 状态栏沉浸  
隐藏status bar（状态栏）,使屏幕全屏，让Activity接收所有的（整个屏幕的）触摸事件。如上面所示的直播全屏播放。
+ 状态栏着色  
透明化状态栏，使得布局侵入状态栏的后面，必须启用`fitsSystemWindows`属性来调整布局才不至于被状态栏覆盖。如透明状态栏、与titlebar颜色一致的状态栏。

### 二、如何沉浸
从3.x版本开始, 系统DecorView提供了setSystemUiVisibility方法, 可以通过Flag改更改所谓SystemUI的属性。各个设置的参数含义如下所示：

```
View.SYSTEM_UI_FLAG_VISIBLE Level 14  
默认标记

View.SYSTEM_UI_FLAG_LOW_PROFILE Level 14  
低功耗模式, 会隐藏状态栏图标, 在4.0上可以实现全屏

View.SYSTEM_UI_FLAG_LAYOUT_STABLE Level 16  
保持整个View稳定, 常跟bar 悬浮, 隐藏共用, 使View不会因为SystemUI的变化而做layout

View.SYSTEM_UI_FLAG_FULLSCREEN Level 16  
状态栏隐藏

View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN Level 16  
状态栏上浮于Activity

View.SYSTEM_UI_FLAG_HIDE_NAVIGATION Level 14  
隐藏导航栏, 
=========================================================================
4.0 - 4.3如果使用这个属性,将会导致在下一次touch时候自动show出status跟navigation bar,源于系统clear掉其所有的状态
=========================================================================

View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION Level 16  
导航栏上浮于Activity

View.SYSTEM_UI_FLAG_IMMERSIVE Level 19  
Kitkat新加入的Flag, 沉浸模式, 可以隐藏掉status跟navigation bar, 并且在第一次会弹泡提醒, 它会覆盖掉之前两个隐藏bar的标记, 并且在bar出现的位置滑动可以呼出bar

View.SYSTEM_UI_FLAG_IMMERSIVE_STIKY Level 19  
与上面唯一的区别是, 呼出隐藏的bar后会自动再隐藏掉

```

如何因此和显示状态栏。。。  
如何设置回调监听状态。。。


### 三、如何着色

#### 3.1 两个系统节点
对于状态栏着色，有两个比较关键的系统节点需要关注，分别是4.4和5.0。基于两个系统节点，我们又可以分成三个阶段进行讨论。
+ 4.4以前  
状态栏不支持设置颜色。

+ 4.4 ～ 5.0  
状态栏支持透明效果，但是系统不提供接口进行颜色设置（但是聪明的程序员总能找到替代方式，文章后面会介绍）。

+ 5.0以上  
状态栏不仅支持透明效果，系统也提供接口对状态栏进行颜色设置。

#### 3.2 实现的三种方式
+ 布局设置
+ 代码设置
+ 主题设置（相关坑）

#### 3.3 100分中透明状态栏实现


### 四、着色原理分析

#### 4.1 原理剖析
泓洋文章
#### 4.2 自定义实践


### 兼容性实践尝试（坑）
+ 配置文件
+ 设置不成功回滚（oppo不成功的例子）
+ 尽量覆盖机型的兼容性测试

### 五、总结
在Android项目开发过程中，免不了要和系统栏打交道。以上是作者根据平时项目开发经验、并结合网上查阅的资料对状态栏相关设置进行的总结。希望对大家有帮助，欢迎大家交流讨论～


### 参考文章
1. [Android App 沉浸式状态栏解决方案](http://jaeger.itscoder.com/android/2016/02/15/status-bar-demo.html)
2. [StatusBarUtil 状态栏工具类（实现沉浸式状态栏/变色状态栏）](http://jaeger.itscoder.com/android/2016/03/27/statusbar-util.html)
3. [令人困惑的fitsSystemWindows属性](http://www.jianshu.com/p/5cc3bd23be7b)
4. [what-are-windowinsets](https://stackoverflow.com/questions/33585225/what-are-windowinsets)
5. []()
6. [沉浸式管理：让你的APP更优雅](https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247484516&idx=1&sn=1f31642399dd90bda5afa8664150a2d5&chksm=96cda529a1ba2c3fa47d0fb0e8328a28480c7496e551363d05306c56aadfca8df49baf109db4&mpshare=1&scene=23&srcid=0519RTiUoD1BCbAeAJaUajL5#rd)
7. [使用setSystemUiVisibility适配statusbar和navigationbar](http://www.jianshu.com/p/08ff70c15667)
8. [StatusBarAdapt](https://github.com/CoolThink/StatusBarAdapt)
9. []()
10. [Android SystemBar](http://ltlovezh.com/2016/05/31/Android-SystemBar/)
11. [探索Android半透明状态栏](http://chuansong.me/n/1818688651815)
12. [沉浸式状态栏](http://www.jianshu.com/p/d147608dc27b)
13. [由沉浸式状态栏引发的血案](http://www.jianshu.com/p/140be70b84cd?utm_source=tuicool&utm_medium=referral)
14. [Android开发：Translucent System Bar 的最佳实践](http://www.jianshu.com/p/0acc12c29c1b)