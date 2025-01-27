<div align="center">
  <img width="216" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/logo.svg" alt="logo" />
</div>

----

# Enable WebView Debugging [启用 WebView 调试]

[![Kotlin](https://img.shields.io/badge/-Kotlin-7F52FF?style=flat&logo=Kotlin&logoColor=white)](#)
[![Xposed](https://img.shields.io/badge/-Xposed-3DDC84?style=flat&logo=Android&logoColor=white)](#)
[![GitHub Repo stars](https://img.shields.io/github/stars/WankkoRee/EnableWebViewDebugging?label=Github%20Stars&style=flat "GitHub Repo stars")](https://github.com/WankkoRee/EnableWebViewDebugging)
[![GitHub Downloads](https://img.shields.io/github/downloads/WankkoRee/EnableWebViewDebugging/total?label=GitHub%20Downloads&logo=github&style=flat)](https://github.com/WankkoRee/EnableWebViewDebugging/releases)
[![LSPosed Downloads](https://img.shields.io/github/downloads/Xposed-Modules-Repo/cn.wankkoree.xposed.enablewebviewdebugging/total?label=LSPosed%20Downloads&logo=Android&style=flat&labelColor=F48FB1&logoColor=ffffff)](https://modules.lsposed.org/module/cn.wankkoree.xposed.enablewebviewdebugging)

Enable WebView debugging and add vConsole in it. Support WebView, TBS X5, UC U4, Crosswalk(XWalk), XWeb.
>启用 WebView 调试并添加 vConsole，支持 WebView、TBS X5、UC U4、Crosswalk(XWalk)、XWeb。

## Tutorial / 新手指南

- [简体中文](https://github.com/WankkoRee/EnableWebViewDebugging/blob/master/docs/Tutorial_zh-CN.md)

## Contacts / 联络

- Telegram Group: [Enable WebView Debugging > Chat [zh/NSFW]](https://t.me/EnableWebViewDebuggingChat)
- Telegram Channel: [Enable WebView Debugging > UPDATES](https://t.me/EnableWebViewDebugging)
- GitHub Issue: [Issues · WankkoRee/EnableWebViewDebugging](https://github.com/WankkoRee/EnableWebViewDebugging/issues)
- E-Mail: [wkr@wkr.moe](mailto:wkr@wkr.moe)

## ScreenShots / 应用截图

<div align="center">
  <img width="256" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/Screenshot_main.png" />
  <img width="256" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/Screenshot_apps.png" />
  <img width="256" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/Screenshot_app.png" />
  <img width="256" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/Screenshot_rule.png" />
  <img width="256" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/Screenshot_resources.png" />
  <img width="256" src="https://raw.githubusercontent.com/WankkoRee/EnableWebViewDebugging/master/docs/Screenshot_advance.png" />
</div>

## Support Engine / 内核支持情况

| Engine Name | Version | Debugging | vConsole |            Comment             |
|:-----------:|:-------:|:---------:|:--------:|:------------------------------:|
|   WebView   |    X    |     ✅     |    ✅     |                                |
|   TBS X5    |    X    |     ✅     |    ✅     |                                |
|    UC U4    |    X    |     ✅     |    ✅     | 一些阿里系的 App 使用了魔改包，可能无法开启达到预期目标 |
|  Crosswalk  |    X    |     ✅     |    ✅     |                                |
|    XWeb     |    X    |     ✅     |    ✅     |  由 Crosswalk 二改而来的引擎，大概只有微信在用  |

## Repo of Rules / 规则仓库

[WankkoRee/EnableWebViewDebugging-Rules](https://github.com/WankkoRee/EnableWebViewDebugging-Rules)

## To do / 计划

- [ ] 增加注入`Eruda`
- [ ] 增加注入`Chii`

## Credits / 感谢

- [fankes/YukiHookAPI](https://github.com/fankes/YukiHookAPI)
  
  A modern Hook API which we used.
  >本项目所采用的现代化 Hook API。

- [feix760/WebViewDebugHook](https://github.com/feix760/WebViewDebugHook)
  
  Referenced the implementation about WebView debugging.
  >参考了 WebView 调试的相关实现。

- [kooritea/debugwebview](https://github.com/kooritea/debugwebview)

  The inspiration for vConsole injection.
  >vConsole 注入的灵感来源。
