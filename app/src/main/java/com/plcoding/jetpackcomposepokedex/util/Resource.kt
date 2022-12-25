package com.plcoding.jetpackcomposepokedex.util

sealed class Resource<T>(val data: T? = null, val message: String? = null) {

    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)

    // not needed in this example project
    // class Loading<T>(data: T? = null) : Resource<T>(data)
}
