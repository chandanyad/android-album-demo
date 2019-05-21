package com.album.demo.exceptions

import java.lang.Exception

/**
 * Exception to handle when there is not data found in the Repository
 */
class NoDataFoundException() : Exception("No data found")