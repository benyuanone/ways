package com.benyuan.designmodel;

import com.benyuan.designmodel.myinterface.IWaterState;

/**
 * Created by D.chen.g on 2018/4/17.
 * 状态模式-环境
 */
public class WaterContext {
    private IWaterState mIWaterState;

    public IWaterState getIWaterState() {
        return mIWaterState;
    }

    public void setIWaterState(int i) {
        if (i == 0) {
            mIWaterState = new IceWaterState();
            return;
        }

        if (i == 1) {
            mIWaterState = new WarmWaterState();
            return;
        }

        if (i == 2) {
            mIWaterState = new BoilingWaterState();
            return;
        }
    }



}
