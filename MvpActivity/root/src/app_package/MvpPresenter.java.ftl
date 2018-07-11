package ${packageName}.mvp.presenter;

import android.content.Context;

import ${packageName}.mvp.contract.${ContractName};
import ${packageName}.mvp.model.${ModelName};
import ${packageName}.mvp.base.BasePresenter;


/**
 * @author ysxsoft
 */

public class ${PresenterName} extends BasePresenter<${ContractName}.${IViewName}, ${ModelName}> implements ${ContractName}.${IPresenterName} {


    public ${PresenterName}(Context mContext, ${ContractName}.${IViewName} mView) {
        super(mContext, mView, new ${ModelName}());
    }

}
