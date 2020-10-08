package com.ontappoc.pocmenuV3.menu

import androidx.annotation.IdRes

data class ItemMenu(
    @IdRes var idRes: Int,
    var icon: Int,
    var title: Int
)