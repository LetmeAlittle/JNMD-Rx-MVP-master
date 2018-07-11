package com.ysxsoft.jnmd.mvp.presenter;

import android.content.Context;

import com.ysxsoft.jnmd.mvp.base.BasePresenter;
import com.ysxsoft.jnmd.mvp.contract.CMusic;
import com.ysxsoft.jnmd.mvp.model.MMusicImpl;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PMusicImpl extends BasePresenter<CMusic.IVMusic, MMusicImpl> implements CMusic.IPMusic {


    public PMusicImpl(Context mContext, CMusic.IVMusic mView) {
        super(mContext, mView, new MMusicImpl());
    }

}
