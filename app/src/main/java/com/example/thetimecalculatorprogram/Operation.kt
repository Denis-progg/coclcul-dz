package com.example.thetimecalculatorprogram

class Operation(var stringOne: String, var stringTwo: String) {
    var strIndexH = stringOne.indexOf("h")
    var stringStrH = stringOne.substring(0, strIndexH).trim()
    var strIntH = stringStrH.toString().toInt()

    //1h34m35s
    var strIndexM = stringOne.indexOf("m")
    var stringStrM = stringOne.substring(strIndexH + 1, strIndexM)
    var strIntM = stringStrM.toString().toInt()

    var strIndexS = stringOne.indexOf("s")
    var stringStrS = stringOne.substring(strIndexM + 1, strIndexS)
    var strIntS = stringStrS.toString().toInt()
    var secH = (strIntH * 60) * 60 // 3600
    var secM = strIntM * 60 // 2040
    var sec = strIntS //35
    var resStringS = secH + secM + sec // 5675


    var strIndexHTwo = stringTwo.indexOf("h")
    var stringStrHTwo = stringTwo.substring(0, strIndexHTwo)
    var strIntHTwo = stringStrHTwo.toString().toInt()

    var strIndexMTwo = stringTwo.indexOf("m")
    var stringStrMTwo = stringTwo.substring(strIndexHTwo + 1, strIndexMTwo)
    var strIntMTwo = stringStrMTwo.toString().toInt()

    var strIndexSTwo = stringTwo.indexOf("s")
    var stringStrSTwo = stringTwo.substring(strIndexMTwo + 1, strIndexSTwo)
    var strIntSTwo = stringStrSTwo.toString().toInt()

    var secHTwo = (strIntHTwo * 60) * 60
    var secMTwo = strIntMTwo * 60
    var secTwo = strIntSTwo
    var resStringSTwo = secHTwo + secMTwo + secTwo

    fun sum(): String {
        var resvrem = resStringS + resStringSTwo//45678
        val hours = resvrem / 3600
        val minutes = (resvrem % 3600) / 60
        val seconds = resvrem % 60
        return "$hours h $minutes m $seconds s"
    }


}