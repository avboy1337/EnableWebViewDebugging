package cn.wankkoree.xposed.enablewebviewdebugging.hook.method

import cn.wankkoree.xposed.enablewebviewdebugging.hook.Main
import com.highcapable.yukihookapi.hook.log.loggerD
import com.highcapable.yukihookapi.hook.log.loggerE
import com.highcapable.yukihookapi.hook.log.loggerI
import com.highcapable.yukihookapi.hook.param.PackageParam
import com.highcapable.yukihookapi.hook.type.java.BooleanType
import com.highcapable.yukihookapi.hook.type.java.StringType

/** Hook XWebPreferences类，实现：
 *
 * xWebPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true)
 *
 * xWebPreferences.setValue(XWalkPreferences.ENABLE_JAVASCRIPT, true)
 **/
fun PackageParam.hookXWebPreferences (
    Class_XWebPreferences: String = "org.xwalk.core.XWalkPreferences",
    Method_setValue: String = "setValue",
) {
    Class_XWebPreferences.hook {
        injectMember {
            allConstructors()
            afterHook {
                val xWebPreferences = instance

                method {
                    name(Method_setValue)
                    param(StringType, BooleanType)
                }.result {
                    onNoSuchMethod {
                        loggerE(msg = "Hook.Method.NoSuchMethod at hookXWebPreferences\uD83D\uDC49<init>\uD83D\uDC49setValue", e = it)
                    }
                }.get(xWebPreferences).let {
                    if (Main.debug) loggerD(msg = "${instanceClass.name} new().setValue(XWalkPreferences.REMOTE_DEBUGGING, true), $packageName, $processName")
                    it.call("remote-debugging", true)
                    if (Main.debug) loggerD(msg = "${instanceClass.name} new().setValue(XWalkPreferences.ENABLE_JAVASCRIPT, true)")
                    it.call("enable-javascript", true)
                }
            }
        }.result {
            onNoSuchMemberFailure {
                loggerE(msg = "Hook.Member.NoSuchMember at hookXWebPreferences\uD83D\uDC49<init>", e = it)
            }
            onHookingFailure {
                loggerE(msg = "Hook.Member.HookFailure at hookXWebPreferences\uD83D\uDC49<init>", e = it)
            }
            onHooked {
                loggerI(msg = "Hook.Member.Ended at hookXWebPreferences\uD83D\uDC49<init> as [$it]")
            }
            onConductFailure { hookParam, it ->
                loggerE(msg = "Hook.Member.ConductFailure at hookXWebPreferences\uD83D\uDC49<init>(${hookParam.args.joinToString(", ")})", e = it)
            }
        }
        injectMember {
            allMethods(Method_setValue)
            beforeHook {
                if (args[0] == "remote-debugging") {
                    if (args[1] != true) {
                        if (Main.debug) loggerD(msg = "${instanceClass.name}.setValue(XWalkPreferences.REMOTE_DEBUGGING, ${args[1]} -> true)")
                        args(1).set(true)
                    }
                } else if (args[0] == "enable-javascript") {
                    if (args[1] != true) {
                        if (Main.debug) loggerD(msg = "${instanceClass.name}.setValue(XWalkPreferences.ENABLE_JAVASCRIPT, ${args[1]} -> true)")
                        args(1).set(true)
                    }
                }
            }
        }.result {
            onNoSuchMemberFailure {
                loggerE(msg = "Hook.Member.NoSuchMember at hookXWebPreferences\uD83D\uDC49setValue", e = it)
            }
            onHookingFailure {
                loggerE(msg = "Hook.Member.HookFailure at hookXWebPreferences\uD83D\uDC49setValue", e = it)
            }
            onHooked {
                loggerI(msg = "Hook.Member.Ended at hookXWebPreferences\uD83D\uDC49setValue as [$it]")
            }
            onConductFailure { hookParam, it ->
                loggerE(msg = "Hook.Member.ConductFailure at hookXWebPreferences\uD83D\uDC49setValue(${hookParam.args.joinToString(", ")})", e = it)
            }
        }
    }.result {
        onHookClassNotFoundFailure {
            loggerE(msg = "Hook.Class.NotFound at hookXWebPreferences\uD83D\uDC49$Class_XWebPreferences", e = it)
        }
        onPrepareHook {
            loggerI(msg = "Hook.Class.Started at hookXWebPreferences\uD83D\uDC49$Class_XWebPreferences")
        }
    }
}