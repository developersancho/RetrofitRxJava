package com.sf.retrofitrxjava.Retrofit;


import com.sf.retrofitrxjava.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
