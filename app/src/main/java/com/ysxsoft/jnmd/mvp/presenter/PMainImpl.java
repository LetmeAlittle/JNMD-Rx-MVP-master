package com.ysxsoft.jnmd.mvp.presenter;

import android.content.Context;

import com.ysxsoft.jnmd.mvp.contract.CMain;
import com.ysxsoft.jnmd.mvp.model.MMainImpl;
import com.ysxsoft.jnmd.mvp.base.BasePresenter;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PMainImpl extends BasePresenter<CMain.IVMain, MMainImpl> implements CMain.IPMain {


    public PMainImpl(Context mContext, CMain.IVMain mView) {
        super(mContext, mView, new MMainImpl());
    }

}
