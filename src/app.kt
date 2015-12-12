import vue.Vue

@native("window")
val w: dynamic = noImpl

fun main(args: Array<String>) {
  Vue.config.delimiters = arrayOf("{!", "!}")

  val option = json(
          Pair("el", "#app"),
          Pair("data",
                  json(
                          Pair("text", "")
                  )
          ),
          Pair("methods",
                  json(
                          Pair("clickedResetBtn", {
                            w.app.`$data`.text = ""
                          })

                  ))
  )
  w.app = Vue(option)
}
