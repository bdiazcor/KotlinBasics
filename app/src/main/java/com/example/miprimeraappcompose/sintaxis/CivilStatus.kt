package com.example.miprimeraappcompose.sintaxis

sealed class CivilStatus {
    object Single : CivilStatus()
    object Married : CivilStatus()
    object Divorced : CivilStatus()
    object Widowed : CivilStatus()
}