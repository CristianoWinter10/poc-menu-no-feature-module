package com.ontappoc.pocmenuV3.menu

import androidx.annotation.IdRes

interface ItemMenuSelectedListener {
    fun onItemSelected(@IdRes item: Int)
}