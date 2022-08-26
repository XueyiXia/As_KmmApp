package com.kmm.app.android.adapter

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.kmm.app.android.R
import com.kmm.app.bean.DataBean


/**
 * @author: xiaxueyi
 * @date: 2022-08-26
 * @time: 09:46
 * @说明: 列表适配器
 */
class LIstAdapter : BaseQuickAdapter<DataBean, BaseViewHolder>(
    R.layout.activity_main_item
) {

    override fun convert(holder: BaseViewHolder, item: DataBean) {
        holder.getView<TextView>(R.id.tv_o).text="中间价格:${item.O} 港币"
        holder.getView<TextView>(R.id.tv_h).text="最高价格:${item.H} 港币"
        holder.getView<TextView>(R.id.tv_c).text="成交价格:${item.C} 港币"
    }
}