package com.neppplus.kotlingrammar_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {

//          이 안에 적는 코드 - 변수 문법 연습 01

         var myName : String

         myName = "성연진"

            Log.d("문법연습", myName)

         val friendName : String

         friendName = "강여상"
//             friendName = "배호영" -> val이기 때문에 변경 불가능


         Log.d("문법연습01",friendName)

        }

        btnVariable02.setOnClickListener {

//            변수 연습 02

            var myName = "성연진"
            val myBirth = 1994
            var myHeight = 160.5

            myHeight = 160.3

            Log.d("변수연습02", myName)


        }

        btnCondition01.setOnClickListener {

//            조건문 01 버튼 눌리면 실행될 코드

            val userAge = 9

//           나이가 20살 이상인가 -> 로그로 "성인입니다." 문장 출력

            if(userAge>=20){

                Log.d("조건문01","성인입니다.")

            }
            else if (userAge>=17){
//          성인이 아니고, 질문 -> 17살 이상?
                Log.d("조건문01","고등학생입니다.")
            }
            else if(userAge>=14){

//          성인이 아니고, 고등학생도 아닐때 질문 -> 14살 이상인가?

                Log.d("조건문01","중학생입니다.")
            }
            else {

                Log.d("조건문01","초등학생 이거나, 미취학 아동입니다.")
            }

        }
    }
}