package com.kamaljakaria.banking_app_ui

data class Data(
    val Image:Int,
)

fun getAllImage():List<Data>
{
    return listOf<Data>(
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),
        Data(R.drawable.profile_pic),

    )
}
