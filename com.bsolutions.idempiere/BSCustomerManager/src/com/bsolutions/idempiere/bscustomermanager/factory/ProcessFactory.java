/**
 * 
 */
package com.bsolutions.idempiere.bscustomermanager.factory;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import com.bsolutions.idempiere.bscustomermanager.process.Test;

/**
 * @author duyny
 *
 */
public class ProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {

		if (Test.class.getName().equals(className)) {
			return new Test();
		}

		return null;
	}

}
