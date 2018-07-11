package com.ysxsoft.jnmd.mvp.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ysxsoft.jnmd.R;
import com.ysxsoft.jnmd.mvp.base.BaseActivity;
import com.ysxsoft.jnmd.mvp.bean.BookBean;
import com.ysxsoft.jnmd.mvp.contract.CBook;
import com.ysxsoft.jnmd.mvp.presenter.PBookImpl;


/**
 * Created by Liang_Lu on 2017/12/21.
 * V层 用于数据和页面UI展示（Fragment Dialog 同理）
 */

public class BookActivity extends BaseActivity<PBookImpl> implements CBook.IVBook {

    private TextView mTv;
    private Button mBtn;

    @Override
    protected void initView() {
        super.initView();
        mBtn = findViewById(R.id.btn);
        mTv = findViewById(R.id.tv);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.pBook();
            }
        });

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_book;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PBookImpl(mContext, this);
    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void vBookSuccess(BookBean bean) {
        mTv.setText("网络请求成功");
    }

    @Override
    public void vBookError(String reason) {
        mTv.setText(reason);
    }

}
