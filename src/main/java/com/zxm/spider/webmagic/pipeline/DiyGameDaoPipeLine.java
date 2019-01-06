package com.zxm.spider.webmagic.pipeline;

import com.zxm.spider.mapper.DiyGameVODAO;
import com.zxm.spider.model.DiyGameVO;
import com.zxm.spider.model.DiyGameVOCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

@Component
public class DiyGameDaoPipeLine  implements Pipeline {

    @Autowired
    DiyGameVODAO diyGameVODAO;
    @Override
    public void process(ResultItems resultItems, Task task) {
        DiyGameVO vo = (DiyGameVO) resultItems.get("leqiubaVO");

        if(null != vo) {

            DiyGameVOCondition condition = new DiyGameVOCondition();
            condition.createCriteria().andGametimeEqualTo(vo.getGametime()).andHostEqualTo(vo.getHost()).andGuestEqualTo(vo.getGuest());
            int cnt = diyGameVODAO.countByCondition(condition);
            if(cnt ==0) {
                vo.setBasicid(223);
                diyGameVODAO.insert(vo);
            }

        }
    }
}
