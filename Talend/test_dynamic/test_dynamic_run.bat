%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/advancedPersistentLookupLib-1.0.jar;../lib/commons-collections-3.2.2.jar;../lib/dom4j-1.6.1.jar;../lib/jboss-serialization.jar;../lib/jtds-1.3.1-patch.jar;../lib/log4j-1.2.15.jar;../lib/log4j-1.2.16.jar;../lib/talend_DB_mssqlUtil-1.2-20171017.jar;../lib/talend_file_enhanced_20070724.jar;../lib/trove.jar;test_dynamic_0_1.jar; local_project.test_dynamic_0_1.test_dynamic --context=wasim %* 