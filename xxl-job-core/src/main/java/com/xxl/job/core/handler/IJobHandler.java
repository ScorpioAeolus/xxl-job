package com.xxl.job.core.handler;

/**
 * job handler
 *
 * @author xuxueli 2015-12-19 19:06:38
 */
public abstract class IJobHandler {


	/**
	 * execute handler, invoked when executor receives a scheduling request
	 *
	 * @throws Exception exception
	 */
	public abstract void execute() throws Exception;


	/*@Deprecated
	public abstract ReturnT<String> execute(String param) throws Exception;*/

	/**
	 * init handler, invoked when JobThread init
	 *
	 * @throws Exception exception
	 */
	public void init() throws Exception {
		// do something
	}


	/**
	 * destroy handler, invoked when JobThread destroy
	 *
	 * @throws Exception exception
	 */
	public void destroy() throws Exception {
		// do something
	}


}
