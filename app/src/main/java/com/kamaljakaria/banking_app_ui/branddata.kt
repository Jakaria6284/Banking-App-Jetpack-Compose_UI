package com.kamaljakaria.banking_app_ui

data class branddata(
    val image:Int,
    val name:String,
    val date:String,
    val price:String,
)

fun getAllDataproduct():List<branddata>
{
    return listOf<branddata>(
        branddata(R.drawable.dribble,"Drible","20 january","$6000"),
        branddata(R.drawable.netflix,"Netflix","20 january","$6000"),
        branddata(R.drawable.apple,"Apple","20 january","$6000"),
        branddata(R.drawable.dribble,"Drible","20 january","$6000"),

    branddata(R.drawable.netflix,"Netflix","20 january","$6000"),
    branddata(R.drawable.apple,"Apple","20 january","$6000"),
    branddata(R.drawable.dribble,"Drible","20 january","$6000")

    )
}
