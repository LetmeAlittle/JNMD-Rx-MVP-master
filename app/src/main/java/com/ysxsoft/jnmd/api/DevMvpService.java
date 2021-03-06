package com.ysxsoft.jnmd.api;

import com.ysxsoft.jnmd.mvp.bean.BookBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Liang_Lu on 2017/9/1.
 */

public interface DevMvpService {


    @GET(Url.BOOK_CLASSIFY)
    Observable<BookBean> bookClassify();

}
