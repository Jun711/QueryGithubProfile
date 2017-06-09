package com.jun.querygithubprofile

/**
 * Created by jungoh on 2017-06-08.
 */

import retrofit.http.GET
import retrofit.http.Path
import rx.Observable

/**
 * Created by ahmedrizwan on 15/03/2016.
 *
 */

interface GithubService {
    @GET("users/{username}")
    fun getGithubUser(@Path("username") username: String): Observable<Github>
}