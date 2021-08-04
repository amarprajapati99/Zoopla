package com.bridgelabz.selenium.zoopla.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;

public class Log{

        private static final Logger logger = LogManager.getLogger (Log.class.getName ());

        public static PrintStream info (String message) {
            logger.info (message);
            return null;
        }
    }

