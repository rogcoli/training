package com.training;

import java.util.Arrays;
import java.util.List;

import com.training.entity.Appraisee;
import com.training.entity.Appraiser;

public class ConverterUtil {
	
	
	private ConverterUtil() {
		
	}

	public static List<String> getAllUserTypes() {
	
		String appraiseeUserType = new Appraisee().getUserType();
		String appraiserUserType = new Appraiser().getUserType();
	
		return Arrays.asList(appraiseeUserType, appraiserUserType);
	}

}
