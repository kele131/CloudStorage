package com.itcast.cloudstorage.net;

import android.os.Bundle;
/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：CloudStorage
 * Package_Name：com.itcast.cloudstorage
 * Version：1.0
 * time：2016/2/15 14:33
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public interface IDataCallBack {

	public void handleServiceResult(int requestCode, int errCode, Object data,
									Bundle session);
}