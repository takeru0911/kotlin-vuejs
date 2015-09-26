package vue
/**
 * Created by taker on 2015/09/26.
 */

import org.w3c.dom.HTMLElement
import kotlin.js;

@native("Vue")
class Vue (options: Any?){
    native var paramAttributes: Array<Any> = noImpl
    native var template: String = noImpl
    native var replace: Boolean = noImpl
    native var created: VueCallback = noImpl
    native var beforeCompile: VueCallback = noImpl
    native var compiled: VueCallback = noImpl
    native var ready: VueCallback = noImpl
    native var attached: VueCallback = noImpl
    native var detached: VueCallback = noImpl
    native var beforeDestroy: VueCallback = noImpl
    native var destroyed: VueCallback = noImpl
    native var inherit: Boolean = noImpl
    native var mixins: Array<Any> = noImpl
    native var name: String = noImpl
    @native("\$el")
    native var `$el`: HTMLElement = noImpl
    @native("\$parent")
    native var `$parent`: Vue = noImpl
    @native("\$root")
    native var `$root`: Vue = noImpl
    @native("\$watch")
    native fun `$watch`(expression: String, callback: VueCallback, deep: Boolean?, immediate: Boolean?):Unit = noImpl
    @native("\$get")
    native fun `$get`(expressopn: String): dynamic = noImpl
    @native("\$set")
    native fun `$set`(keypath: String, value: Any): Unit = noImpl
    @native("\$add")
    native fun `$add`(keypath: String, value: Any): Unit = noImpl
    @native("\$delete")
    native fun `$delete`(keypath: String):Unit = noImpl
    @native("\$eval")
    native fun `$eval`(expression: String): dynamic = noImpl
    @native("\$interpolate")
    native fun `$interpolate`(templateString: String): String = noImpl
    @native("\$log")
    native fun `$log`(keypath: String?): Unit = noImpl
    @native("\$dispatch")
    native fun `$dispatch`(evant: String, args: Any?): Vue = noImpl
    @native("\$broadcast")
    native fun `$broadcast`(evant: String, args: Any?): Vue = noImpl
    @native("\$emit")
    native fun `$emit`(event: String, args: Any?): Vue = noImpl
    @native("\$on")
    native fun `$on`(event: String, callback: Any): Vue = noImpl
    @native("\$once")
    native fun `$once`(event: String, callback: Any): Vue = noImpl
    @native("\$off")
    native fun `$off`(event: String?, callback: Any?): Vue = noImpl
    @native("\$appendTo")
    native fun `$appendTo`(element: Any, callback: Any?): Vue = noImpl
    @native("\$prependTo")
    native fun `$prependTo`(element: Any, callback: Any?): Vue = noImpl
    @native("\$before")
    native fun `$before`(element: Any, callback: Any?): Vue = noImpl
    @native("\$after")
    native fun `$after`(element: Any, callback: Any?): Vue = noImpl
    @native("\$remove")
    native fun `$remove`(callback: Any?): Vue = noImpl
    @native("\$mount")
    native fun `$mount`(element: Any?): Vue = noImpl
    @native("\$destroy")
    native fun `$destroy`(remove: Boolean?): Unit = noImpl
    @native("\$compile")
    native fun `$compile`(element: HTMLElement): VueCallback = noImpl
    @native("\$addChild")
    native fun `$addChild`(options: Any?, constructor: Any?): Vue = noImpl
    native fun _init(options: Any): Unit = noImpl
    native fun _cleanup(): Unit = noImpl
    companion object {
        var config: VueConfig = noImpl
        fun extend(options: Any): Vue = noImpl
        fun directive(id: String, definition: Any?): Unit = noImpl
        fun filter(id: String, definition: FilterCallback?): Unit = noImpl
        fun component(id: String, definition: Vue): Unit = noImpl
        fun transition(id: String, definition: Any?): Unit = noImpl
        fun partial(id: String, definition: String?): Unit = noImpl
        fun nextTick(callback: Any): Unit = noImpl
        fun require(module: String): Unit = noImpl
        fun use(plugin: Any, args: Any?): Vue = noImpl
    }
}



@native("VueConfig")
class VueConfig {
    var prefix: String = noImpl
    var debug: Boolean = noImpl
    var silent: Boolean = noImpl
    var proto: Boolean = noImpl
    var interpolate: Boolean = noImpl
    var async: Boolean = noImpl
    var delimiters: Array<String> = noImpl
}


interface ValueCallback {
    native fun apply(newValue: Any, oldValue: Any): Unit = noImpl
}

interface VueCallback {
    native fun apply(): Unit = noImpl
}

interface FilterCallback {
    native fun apply(value: Any, begin: Any?, end: Any?): Any = noImpl
}

