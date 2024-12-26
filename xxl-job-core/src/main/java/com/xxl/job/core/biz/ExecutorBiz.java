package com.xxl.job.core.biz;

import com.xxl.job.core.biz.model.*;

/**
 * Created by xuxueli on 17/3/1.
 */
public interface ExecutorBiz {

    /**
     * beat
     * @return string
     */
    public ReturnT<String> beat();

    /**
     * idle beat
     *
     * @param idleBeatParam param
     * @return string
     */
    public ReturnT<String> idleBeat(IdleBeatParam idleBeatParam);

    /**
     * run
     * @param triggerParam param
     * @return string
     */
    public ReturnT<String> run(TriggerParam triggerParam);

    /**
     * kill
     * @param killParam param
     * @return string
     */
    public ReturnT<String> kill(KillParam killParam);

    /**
     * log
     * @param logParam param
     * @return result
     */
    public ReturnT<LogResult> log(LogParam logParam);

}
