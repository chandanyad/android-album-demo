package com.album.demo.exceptions

import java.lang.Exception

/**
 * Exception to handle when there is any DB exception
 */
class DBException(private val msg: String) : Exception(msg)