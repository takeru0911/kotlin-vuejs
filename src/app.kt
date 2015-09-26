import kotlin.browser.document
import kotlin.js.internal

import vue.*
/**
 * Created by taker on 2015/09/26.
 */

native public fun takeru(): String = noImpl
@native("window")
native val w: dynamic = noImpl

fun main(args: Array<String>){
    Vue.config.delimiters = arrayOf("{!", "!}")
    val option = json(
            Pair("el", "#app"),
            Pair("data",
                    json(
                            Pair("test", "")
                    )
            ),
            Pair("methods",
                    json(
                            Pair("clickedResetBtn",{
                                w.app.`$data`.test = ""
                            })

            ))
    )

    w.app = Vue(option)
}
