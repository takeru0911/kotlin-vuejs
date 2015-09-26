import kotlin.browser.document

import vue.*
/**
 * Created by taker on 2015/09/26.
 */

native public fun takeru(): String = noImpl
var hoge: Vue? = null
fun main(args: Array<String>){
    val option = json(
            Pair("el", "#app"),
            Pair("data", json(
                    Pair("takeru", "lksjf")
            ))
    )
    hoge = Vue(option)

    console.log(hoge)

}