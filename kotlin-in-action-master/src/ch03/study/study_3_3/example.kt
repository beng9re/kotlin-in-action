package ch03.study.study_3_3

import Maths.add
import property.*;
import extension.second
import extension.test
import extension.frist as fristNum
import Maths.*;


/*
    open 키워드는 코틀린에서 클래스, 메서드, 프로퍼티 또는 다른 요소를 확장 가능하게 만드는 키워드
    open 키워드가 클래스나 메서드 앞에 붙으면, 이 요소가 다른 클래스에서 상속하거나 재정의(오버라이드)될 수 있음을 나타냅니다.
*/

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {//View 클래스를 상속받는 Button 클래스
    override fun click() = println("Button clicked")
}


fun main(args: Array<String>) {

    /*  확장함수 호출 */
    println("kotlin".fristNum());//수신객체 타입
    println("kotlin".test().fristNum());//확장함수
    println("kotlin".second());//확장함수

    /*  프로퍼티 활용 */
    reportOperationCount();

    /*  임포트와 함수 */
    println(add(1,2));//Math 유틸리티 함수 모두 활용가능
    println("kotlin".test()); //extions test()함수를 임포트해서 가져와서 활용 가능


    /* 클래스의 오버라이드 */
    val view: View = Button()
    view.click(); // Button Clicked

    /* 확장함수 오버라이딩 불가 */
    fun View.showOff() = println("I'm a View!")
    fun Button.showOff() = println("I'm a button!");

    val function: View = Button()
    function.showOff(); // I'm a View!


    //확장 프로퍼티 활용
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}





