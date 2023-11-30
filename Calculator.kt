package com.example.subject

fun main() {
    Calculator().chooseOperator()
}

class Calculator() {

    fun chooseOperator(){
        print("연산자를 고르세요(+,-,*,/): ")
        var operator = readln()
        if(operator=="+"){
            add()
        }
        else if(operator=="-"){
            substract()
        }
        else if(operator=="*"){
            mutiply()
        }
        else{
            divide()
        }
    }

    fun divide(){

        fun dividing(){
            println("나눗셈 시작!")
            print("수 입력: ")
            var num = readln().toInt()
            print("수 입력: ")
            var num2 = readln().toInt()
            println("$num / $num2 = ${num/num2}")
        }

        dividing()

        print("다시 하기(yes or no): ")
        var retry = readln()

        if (retry=="yes"||retry=="Yes"){
            dividing()
        }

    }

    fun mutiply() {

        fun mutiplying(){
            println("곱셈 시작!")
            print("수 입력: ")
            var num = readln().toInt()
            print("수 입력: ")
            var num2 = readln().toInt()
            println("$num * $num2 = ${num*num2}")
        }

        mutiplying()

        print("다시 하기(yes or no): ")
        var retry = readln()

        if (retry=="yes"||retry=="Yes"){
            mutiplying()
        }
    }
    fun substract() {

        fun substracting(){
            println("뺄셈 시작!")
            print("수 입력: ")
            var num = readln().toInt()
            print("수 입력: ")
            var num2 = readln().toInt()
            println("$num - $num2 = ${num-num2}")
        }

        substracting()

        print("다시 하기(yes or no): ")
        var retry = readln()

        if (retry=="yes"||retry=="Yes"){
            substracting()
        }
    }
    fun add() {
        fun adding(){
            println("덧셈 시작!")
            print("수 입력: ")
            var num = readln().toInt()
            print("수 입력: ")
            var num2 = readln().toInt()
            println("$num + $num2 = ${num+num2}")
        }

        adding()

        print("다시 하기(yes or no): ")
        var retry = readln()

        if (retry=="yes"||retry=="Yes"){
            adding()
        }
    }
}