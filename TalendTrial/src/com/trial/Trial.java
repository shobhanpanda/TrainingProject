package com.trial;

import org.apache.log4j.BasicConfigurator;

import local_project.copy_of_static_data_generator_0_1.Copy_of_Static_Data_Generator;

public class Trial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		Copy_of_Static_Data_Generator c = new Copy_of_Static_Data_Generator();
		c.runJob(args);

	}

}
