package com.hank.homework

import java.io.File
import java.util.*
import kotlin.collections.HashMap

fun main() {
    var mcDonalds=McDonalds()
    println("您好歡迎光臨")
    println("請選擇您要餐點")
    mcDonalds.menu()
    println("請問需要的什麼餐點")
    mcDonalds.order() }

class McDonalds(){
    fun order(){
        var scanner=Scanner(System.`in`)
        println("請輸入餐點編號")
        var id=scanner.nextInt()
           if (id == 201) {
               println("您點的餐點為${Item("201", "大麥克", 530, 72).printMenu()}")
           } else if (id == 202) {
               println("您點的餐點為${Item("202", "麥克雞塊", 309, 59).printMenu()}")
           } else if (id == 203) {
               println("您點的餐點為${Item("203", "麥香雞", 373, 49).printMenu()}")
           } else {order() }
    }

    fun menu(){
    var menu=HashMap<String,Item>()
    var br=File("mcdonalds.txt").bufferedReader()
    var line=br.readLine()
    while (line != null){
            var token = line.split(",")
            var item =Item(token[0],token[1],Integer.parseInt(token[2]),Integer.parseInt(token[3]))
            menu.put(item.id,item)
            line= br.readLine()
        println(item.printMenu())
        }
    }
}


class Item(var id:String,var name:String,var calorie:Int,var price:Int){
fun printMenu() = "編號:${id}\t餐點:${name}\t卡路里:${calorie}\t價錢:${price}"
}