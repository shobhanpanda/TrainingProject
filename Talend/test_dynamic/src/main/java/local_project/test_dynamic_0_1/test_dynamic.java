
package local_project.test_dynamic_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.MDM;
import routines.StringHandling;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 





@SuppressWarnings("unused")

/**
 * Job: test_dynamic Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 6.5.1.20180116_1512
 * @status 
 */
public class test_dynamic implements TalendJob {
	static {System.setProperty("TalendJob.log", "test_dynamic.log");}
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(test_dynamic.class);



	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(DBConnection_ReferDb_AdditionalParams != null){
				
					this.setProperty("DBConnection_ReferDb_AdditionalParams", DBConnection_ReferDb_AdditionalParams.toString());
				
			}
			
			if(DBConnection_ReferDb_Database != null){
				
					this.setProperty("DBConnection_ReferDb_Database", DBConnection_ReferDb_Database.toString());
				
			}
			
			if(DBConnection_ReferDb_Login != null){
				
					this.setProperty("DBConnection_ReferDb_Login", DBConnection_ReferDb_Login.toString());
				
			}
			
			if(DBConnection_ReferDb_Password != null){
				
					this.setProperty("DBConnection_ReferDb_Password", DBConnection_ReferDb_Password.toString());
				
			}
			
			if(DBConnection_ReferDb_Port != null){
				
					this.setProperty("DBConnection_ReferDb_Port", DBConnection_ReferDb_Port.toString());
				
			}
			
			if(DBConnection_ReferDb_Schema != null){
				
					this.setProperty("DBConnection_ReferDb_Schema", DBConnection_ReferDb_Schema.toString());
				
			}
			
			if(DBConnection_ReferDb_Server != null){
				
					this.setProperty("DBConnection_ReferDb_Server", DBConnection_ReferDb_Server.toString());
				
			}
			
			if(bond_no != null){
				
					this.setProperty("bond_no", bond_no.toString());
				
			}
			
			if(row_no != null){
				
					this.setProperty("row_no", row_no.toString());
				
			}
			
			if(user_no != null){
				
					this.setProperty("user_no", user_no.toString());
				
			}
			
			if(Project_AdditionalParams != null){
				
					this.setProperty("Project_AdditionalParams", Project_AdditionalParams.toString());
				
			}
			
			if(Project_Login != null){
				
					this.setProperty("Project_Login", Project_Login.toString());
				
			}
			
			if(Project_Schema != null){
				
					this.setProperty("Project_Schema", Project_Schema.toString());
				
			}
			
			if(Project_Server != null){
				
					this.setProperty("Project_Server", Project_Server.toString());
				
			}
			
			if(Project_Port != null){
				
					this.setProperty("Project_Port", Project_Port.toString());
				
			}
			
			if(Project_Database != null){
				
					this.setProperty("Project_Database", Project_Database.toString());
				
			}
			
			if(Project_Password != null){
				
					this.setProperty("Project_Password", Project_Password.toString());
				
			}
			
		}

public String DBConnection_ReferDb_AdditionalParams;
public String getDBConnection_ReferDb_AdditionalParams(){
	return this.DBConnection_ReferDb_AdditionalParams;
}
public String DBConnection_ReferDb_Database;
public String getDBConnection_ReferDb_Database(){
	return this.DBConnection_ReferDb_Database;
}
public String DBConnection_ReferDb_Login;
public String getDBConnection_ReferDb_Login(){
	return this.DBConnection_ReferDb_Login;
}
public java.lang.String DBConnection_ReferDb_Password;
public java.lang.String getDBConnection_ReferDb_Password(){
	return this.DBConnection_ReferDb_Password;
}
public String DBConnection_ReferDb_Port;
public String getDBConnection_ReferDb_Port(){
	return this.DBConnection_ReferDb_Port;
}
public String DBConnection_ReferDb_Schema;
public String getDBConnection_ReferDb_Schema(){
	return this.DBConnection_ReferDb_Schema;
}
public String DBConnection_ReferDb_Server;
public String getDBConnection_ReferDb_Server(){
	return this.DBConnection_ReferDb_Server;
}
public Integer bond_no;
public Integer getBond_no(){
	return this.bond_no;
}
public Integer row_no;
public Integer getRow_no(){
	return this.row_no;
}
public Integer user_no;
public Integer getUser_no(){
	return this.user_no;
}
public String Project_AdditionalParams;
public String getProject_AdditionalParams(){
	return this.Project_AdditionalParams;
}
public String Project_Login;
public String getProject_Login(){
	return this.Project_Login;
}
public String Project_Schema;
public String getProject_Schema(){
	return this.Project_Schema;
}
public String Project_Server;
public String getProject_Server(){
	return this.Project_Server;
}
public String Project_Port;
public String getProject_Port(){
	return this.Project_Port;
}
public String Project_Database;
public String getProject_Database(){
	return this.Project_Database;
}
public String Project_Password;
public String getProject_Password(){
	return this.Project_Password;
}
	}
	private ContextProperties context = new ContextProperties();
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "test_dynamic";
	private final String projectName = "LOCAL_PROJECT";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				test_dynamic.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(test_dynamic.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tMSSqlConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMSSqlConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tCreateTable_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tCreateTable_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tRowGenerator_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMSSqlOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tRowGenerator_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMSSqlClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMSSqlClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMSSqlInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMSSqlInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMSSqlInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMSSqlInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMSSqlInput_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMSSqlInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMSSqlConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tCreateTable_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tRowGenerator_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tMSSqlClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tMSSqlInput_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tMSSqlInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
		




	
public void tMSSqlConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMSSqlConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tMSSqlConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMSSqlConnection_1", false);
		start_Hash.put("tMSSqlConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tMSSqlConnection_1";

	
		int tos_count_tMSSqlConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMSSqlConnection_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tMSSqlConnection_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tMSSqlConnection_1 = new StringBuilder();
            log4jParamters_tMSSqlConnection_1.append("Parameters:");
                    log4jParamters_tMSSqlConnection_1.append("DRIVER" + " = " + "JTDS");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("HOST" + " = " + "context.DBConnection_ReferDb_Server");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("PORT" + " = " + "context.DBConnection_ReferDb_Port");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("SCHEMA_DB" + " = " + "context.DBConnection_ReferDb_Schema");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("DBNAME" + " = " + "context.DBConnection_ReferDb_Database");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("USER" + " = " + "context.DBConnection_ReferDb_Login");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.DBConnection_ReferDb_Password)).substring(0, 4) + "...");     
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("PROPERTIES" + " = " + "context.DBConnection_ReferDb_AdditionalParams");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("AUTO_COMMIT" + " = " + "true");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                    log4jParamters_tMSSqlConnection_1.append("SHARE_IDENTITY_SETTING" + " = " + "false");
                log4jParamters_tMSSqlConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMSSqlConnection_1 - "  + (log4jParamters_tMSSqlConnection_1) );
    		}
    	}
    	
        new BytesLimit65535_tMSSqlConnection_1().limitLog4jByte();
	

	
			String url_tMSSqlConnection_1 = "jdbc:jtds:sqlserver://" + context.DBConnection_ReferDb_Server ;
		String port_tMSSqlConnection_1 = context.DBConnection_ReferDb_Port;
		String dbname_tMSSqlConnection_1 = context.DBConnection_ReferDb_Database ;
    	if (!"".equals(port_tMSSqlConnection_1)) {
    		url_tMSSqlConnection_1 += ":" + context.DBConnection_ReferDb_Port;
    	}
    	if (!"".equals(dbname_tMSSqlConnection_1)) {
    		
				url_tMSSqlConnection_1 += "//" + context.DBConnection_ReferDb_Database; 
    	}
		url_tMSSqlConnection_1 += ";appName=" + projectName + ";" + context.DBConnection_ReferDb_AdditionalParams;  

	String dbUser_tMSSqlConnection_1 = context.DBConnection_ReferDb_Login;
	
	
		
	final String decryptedPassword_tMSSqlConnection_1 = context.DBConnection_ReferDb_Password; 
		String dbPwd_tMSSqlConnection_1 = decryptedPassword_tMSSqlConnection_1;
	

	java.sql.Connection conn_tMSSqlConnection_1 = null;
	
		
			String driverClass_tMSSqlConnection_1 = "net.sourceforge.jtds.jdbc.Driver";
			java.lang.Class.forName(driverClass_tMSSqlConnection_1);
		
	    		log.debug("tMSSqlConnection_1 - Driver ClassName: "+driverClass_tMSSqlConnection_1+".");
			
	    		log.debug("tMSSqlConnection_1 - Connection attempt to '" + url_tMSSqlConnection_1 + "' with the username '" + dbUser_tMSSqlConnection_1 + "'.");
			
		conn_tMSSqlConnection_1 = java.sql.DriverManager.getConnection(url_tMSSqlConnection_1,dbUser_tMSSqlConnection_1,dbPwd_tMSSqlConnection_1);
	    		log.debug("tMSSqlConnection_1 - Connection to '" + url_tMSSqlConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tMSSqlConnection_1", conn_tMSSqlConnection_1);
	if (null != conn_tMSSqlConnection_1) {
		
			log.debug("tMSSqlConnection_1 - Connection is set auto commit to 'true'.");
			conn_tMSSqlConnection_1.setAutoCommit(true);
	}

	globalMap.put("dbschema_tMSSqlConnection_1", context.DBConnection_ReferDb_Schema);

	globalMap.put("db_tMSSqlConnection_1",  context.DBConnection_ReferDb_Database);

	globalMap.put("conn_tMSSqlConnection_1",conn_tMSSqlConnection_1);
	
	globalMap.put("shareIdentitySetting_tMSSqlConnection_1",  false);

 



/**
 * [tMSSqlConnection_1 begin ] stop
 */
	
	/**
	 * [tMSSqlConnection_1 main ] start
	 */

	

	
	
	currentComponent="tMSSqlConnection_1";

	

 


	tos_count_tMSSqlConnection_1++;

/**
 * [tMSSqlConnection_1 main ] stop
 */
	
	/**
	 * [tMSSqlConnection_1 end ] start
	 */

	

	
	
	currentComponent="tMSSqlConnection_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tMSSqlConnection_1 - "  + ("Done.") );

ok_Hash.put("tMSSqlConnection_1", true);
end_Hash.put("tMSSqlConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tCreateTable_1Process(globalMap);



/**
 * [tMSSqlConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMSSqlConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tMSSqlConnection_1";

	

 



/**
 * [tMSSqlConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMSSqlConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tCreateTable_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tCreateTable_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tCreateTable_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tCreateTable_1", false);
		start_Hash.put("tCreateTable_1", System.currentTimeMillis());
		
	
	currentComponent="tCreateTable_1";

	
		int tos_count_tCreateTable_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tCreateTable_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tCreateTable_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tCreateTable_1 = new StringBuilder();
            log4jParamters_tCreateTable_1.append("Parameters:");
                    log4jParamters_tCreateTable_1.append("DBTYPE" + " = " + "MSSQL");
                log4jParamters_tCreateTable_1.append(" | ");
                    log4jParamters_tCreateTable_1.append("TABLEACTION" + " = " + "CREATE_IF_NOT_EXIST");
                log4jParamters_tCreateTable_1.append(" | ");
                    log4jParamters_tCreateTable_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tCreateTable_1.append(" | ");
                    log4jParamters_tCreateTable_1.append("CONNECTION_MSSQL" + " = " + "tMSSqlConnection_1");
                log4jParamters_tCreateTable_1.append(" | ");
                    log4jParamters_tCreateTable_1.append("TABLE" + " = " + "\"Trade\"");
                log4jParamters_tCreateTable_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tCreateTable_1 - "  + (log4jParamters_tCreateTable_1) );
    		}
    	}
    	
        new BytesLimit65535_tCreateTable_1().limitLog4jByte();

 



/**
 * [tCreateTable_1 begin ] stop
 */
	
	/**
	 * [tCreateTable_1 main ] start
	 */

	

	
	
	currentComponent="tCreateTable_1";

	

    try{
        String tableName_tCreateTable_1 = "Trade";
String dbSchema_tCreateTable_1 = (String)globalMap.get("dbschema_tMSSqlConnection_1");
if(dbSchema_tCreateTable_1 != null && dbSchema_tCreateTable_1.trim().length() != 0) {tableName_tCreateTable_1 = dbSchema_tCreateTable_1 + "].[" + tableName_tCreateTable_1;
}java.sql.Connection conn_tCreateTable_1 = (java.sql.Connection)globalMap.get("conn_tMSSqlConnection_1");
				if(conn_tCreateTable_1 != null) {
					if(conn_tCreateTable_1.getMetaData() != null) {
						
						log.debug("tCreateTable_1 - Uses an existing connection with username '" + conn_tCreateTable_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tCreateTable_1.getMetaData().getURL() + ".");
						
					}
				}
			
            boolean whetherExist_tCreateTable_1 = false;
                java.sql.Statement rsTable_tCreateTable_1 = conn_tCreateTable_1.createStatement();
                try {
                    rsTable_tCreateTable_1.execute("SELECT TOP 1 1 FROM [" +  tableName_tCreateTable_1 + "]" );
                    whetherExist_tCreateTable_1 = true;
                } catch (Exception e){
                    whetherExist_tCreateTable_1 = false;
                }
            rsTable_tCreateTable_1.close();
                if(!whetherExist_tCreateTable_1) {
                    java.sql.Statement stmt_tCreateTable_1 = conn_tCreateTable_1.createStatement();
                        log.info("tCreateTable_1 - Creating table '" + tableName_tCreateTable_1 + "'.");
                    stmt_tCreateTable_1.execute("CREATE TABLE [" + tableName_tCreateTable_1 + "]([TradeID] INT  not null ,[UserName] VARCHAR(255)  ,[ISIN] VARCHAR(255)  ,[TradeType] VARCHAR(255)  ,[TradeDate] DATETIME ,[TradePrice] REAL ,[TradeYield] REAL ,[CounterParty] VARCHAR(255)  ,[AccruedInterest] REAL ,[CleanPrice] REAL ,primary key([TradeID]))");                
                        log.info("tCreateTable_1 - Create table '" + tableName_tCreateTable_1 + "' has succeeded.");
		            
                }
	    		log.debug("tCreateTable_1 - Closing the connection to the database.");
			
        
	    		log.debug("tCreateTable_1 - Connection to the database closed.");
			
        globalMap.put("tCreateTable_1_QUERY", "CREATE TABLE [" + tableName_tCreateTable_1 + "]([TradeID] INT  not null ,[UserName] VARCHAR(255)  ,[ISIN] VARCHAR(255)  ,[TradeType] VARCHAR(255)  ,[TradeDate] DATETIME ,[TradePrice] REAL ,[TradeYield] REAL ,[CounterParty] VARCHAR(255)  ,[AccruedInterest] REAL ,[CleanPrice] REAL ,primary key([TradeID]))");        
    } catch(java.lang.Exception e) {
        globalMap.put("tCreateTable_1_ERROR_MESSAGE",e.getMessage());
        throw new RuntimeException("Creating table failed", e);
    }


 


	tos_count_tCreateTable_1++;

/**
 * [tCreateTable_1 main ] stop
 */
	
	/**
	 * [tCreateTable_1 end ] start
	 */

	

	
	
	currentComponent="tCreateTable_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tCreateTable_1 - "  + ("Done.") );

ok_Hash.put("tCreateTable_1", true);
end_Hash.put("tCreateTable_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tRowGenerator_1Process(globalMap);



/**
 * [tCreateTable_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tCreateTable_1 finally ] start
	 */

	

	
	
	currentComponent="tCreateTable_1";

	

 



/**
 * [tCreateTable_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tCreateTable_1_SUBPROCESS_STATE", 1);
	}
	


public static class outStruct implements routines.system.IPersistableRow<outStruct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_test_dynamic = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int TradeID;

				public int getTradeID () {
					return this.TradeID;
				}
				
			    public String UserName;

				public String getUserName () {
					return this.UserName;
				}
				
			    public String ISIN;

				public String getISIN () {
					return this.ISIN;
				}
				
			    public String TradeType;

				public String getTradeType () {
					return this.TradeType;
				}
				
			    public java.util.Date TradeDate;

				public java.util.Date getTradeDate () {
					return this.TradeDate;
				}
				
			    public Float TradePrice;

				public Float getTradePrice () {
					return this.TradePrice;
				}
				
			    public Float TradeYield;

				public Float getTradeYield () {
					return this.TradeYield;
				}
				
			    public String CounterParty;

				public String getCounterParty () {
					return this.CounterParty;
				}
				
			    public Float AccruedInterest;

				public Float getAccruedInterest () {
					return this.AccruedInterest;
				}
				
			    public Float CleanPrice;

				public Float getCleanPrice () {
					return this.CleanPrice;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.TradeID;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final outStruct other = (outStruct) obj;
		
						if (this.TradeID != other.TradeID)
							return false;
					

		return true;
    }

	public void copyDataTo(outStruct other) {

		other.TradeID = this.TradeID;
	            other.UserName = this.UserName;
	            other.ISIN = this.ISIN;
	            other.TradeType = this.TradeType;
	            other.TradeDate = this.TradeDate;
	            other.TradePrice = this.TradePrice;
	            other.TradeYield = this.TradeYield;
	            other.CounterParty = this.CounterParty;
	            other.AccruedInterest = this.AccruedInterest;
	            other.CleanPrice = this.CleanPrice;
	            
	}

	public void copyKeysDataTo(outStruct other) {

		other.TradeID = this.TradeID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_test_dynamic.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_test_dynamic.length == 0) {
   					commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_test_dynamic, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_test_dynamic, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_test_dynamic) {

        	try {

        		int length = 0;
		
			        this.TradeID = dis.readInt();
					
					this.UserName = readString(dis);
					
					this.ISIN = readString(dis);
					
					this.TradeType = readString(dis);
					
					this.TradeDate = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TradePrice = null;
           				} else {
           			    	this.TradePrice = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TradeYield = null;
           				} else {
           			    	this.TradeYield = dis.readFloat();
           				}
					
					this.CounterParty = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AccruedInterest = null;
           				} else {
           			    	this.AccruedInterest = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CleanPrice = null;
           				} else {
           			    	this.CleanPrice = dis.readFloat();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.TradeID);
					
					// String
				
						writeString(this.UserName,dos);
					
					// String
				
						writeString(this.ISIN,dos);
					
					// String
				
						writeString(this.TradeType,dos);
					
					// java.util.Date
				
						writeDate(this.TradeDate,dos);
					
					// Float
				
						if(this.TradePrice == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TradePrice);
		            	}
					
					// Float
				
						if(this.TradeYield == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TradeYield);
		            	}
					
					// String
				
						writeString(this.CounterParty,dos);
					
					// Float
				
						if(this.AccruedInterest == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AccruedInterest);
		            	}
					
					// Float
				
						if(this.CleanPrice == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.CleanPrice);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("TradeID="+String.valueOf(TradeID));
		sb.append(",UserName="+UserName);
		sb.append(",ISIN="+ISIN);
		sb.append(",TradeType="+TradeType);
		sb.append(",TradeDate="+String.valueOf(TradeDate));
		sb.append(",TradePrice="+String.valueOf(TradePrice));
		sb.append(",TradeYield="+String.valueOf(TradeYield));
		sb.append(",CounterParty="+CounterParty);
		sb.append(",AccruedInterest="+String.valueOf(AccruedInterest));
		sb.append(",CleanPrice="+String.valueOf(CleanPrice));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(TradeID);
        			
        			sb.append("|");
        		
        				if(UserName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UserName);
            			}
            		
        			sb.append("|");
        		
        				if(ISIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISIN);
            			}
            		
        			sb.append("|");
        		
        				if(TradeType == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeType);
            			}
            		
        			sb.append("|");
        		
        				if(TradeDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeDate);
            			}
            		
        			sb.append("|");
        		
        				if(TradePrice == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradePrice);
            			}
            		
        			sb.append("|");
        		
        				if(TradeYield == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeYield);
            			}
            		
        			sb.append("|");
        		
        				if(CounterParty == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CounterParty);
            			}
            		
        			sb.append("|");
        		
        				if(AccruedInterest == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AccruedInterest);
            			}
            		
        			sb.append("|");
        		
        				if(CleanPrice == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CleanPrice);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(outStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.TradeID, other.TradeID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_test_dynamic = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[0];

	
			    public int TradeID;

				public int getTradeID () {
					return this.TradeID;
				}
				
			    public String UserName;

				public String getUserName () {
					return this.UserName;
				}
				
			    public String TradeType;

				public String getTradeType () {
					return this.TradeType;
				}
				
			    public java.util.Date TradeDate;

				public java.util.Date getTradeDate () {
					return this.TradeDate;
				}
				
			    public Float TradePrice;

				public Float getTradePrice () {
					return this.TradePrice;
				}
				
			    public Float TradeYield;

				public Float getTradeYield () {
					return this.TradeYield;
				}
				
			    public String CounterParty;

				public String getCounterParty () {
					return this.CounterParty;
				}
				
			    public Float AccruedInterest;

				public Float getAccruedInterest () {
					return this.AccruedInterest;
				}
				
			    public Float CleanPrice;

				public Float getCleanPrice () {
					return this.CleanPrice;
				}
				
			    public Integer Traded_bond;

				public Integer getTraded_bond () {
					return this.Traded_bond;
				}
				
			    public Integer User_no;

				public Integer getUser_no () {
					return this.User_no;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_test_dynamic.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_test_dynamic.length == 0) {
   					commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_test_dynamic, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_test_dynamic, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_test_dynamic) {

        	try {

        		int length = 0;
		
			        this.TradeID = dis.readInt();
					
					this.UserName = readString(dis);
					
					this.TradeType = readString(dis);
					
					this.TradeDate = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TradePrice = null;
           				} else {
           			    	this.TradePrice = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TradeYield = null;
           				} else {
           			    	this.TradeYield = dis.readFloat();
           				}
					
					this.CounterParty = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AccruedInterest = null;
           				} else {
           			    	this.AccruedInterest = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CleanPrice = null;
           				} else {
           			    	this.CleanPrice = dis.readFloat();
           				}
					
						this.Traded_bond = readInteger(dis);
					
						this.User_no = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.TradeID);
					
					// String
				
						writeString(this.UserName,dos);
					
					// String
				
						writeString(this.TradeType,dos);
					
					// java.util.Date
				
						writeDate(this.TradeDate,dos);
					
					// Float
				
						if(this.TradePrice == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TradePrice);
		            	}
					
					// Float
				
						if(this.TradeYield == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TradeYield);
		            	}
					
					// String
				
						writeString(this.CounterParty,dos);
					
					// Float
				
						if(this.AccruedInterest == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AccruedInterest);
		            	}
					
					// Float
				
						if(this.CleanPrice == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.CleanPrice);
		            	}
					
					// Integer
				
						writeInteger(this.Traded_bond,dos);
					
					// Integer
				
						writeInteger(this.User_no,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("TradeID="+String.valueOf(TradeID));
		sb.append(",UserName="+UserName);
		sb.append(",TradeType="+TradeType);
		sb.append(",TradeDate="+String.valueOf(TradeDate));
		sb.append(",TradePrice="+String.valueOf(TradePrice));
		sb.append(",TradeYield="+String.valueOf(TradeYield));
		sb.append(",CounterParty="+CounterParty);
		sb.append(",AccruedInterest="+String.valueOf(AccruedInterest));
		sb.append(",CleanPrice="+String.valueOf(CleanPrice));
		sb.append(",Traded_bond="+String.valueOf(Traded_bond));
		sb.append(",User_no="+String.valueOf(User_no));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(TradeID);
        			
        			sb.append("|");
        		
        				if(UserName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UserName);
            			}
            		
        			sb.append("|");
        		
        				if(TradeType == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeType);
            			}
            		
        			sb.append("|");
        		
        				if(TradeDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeDate);
            			}
            		
        			sb.append("|");
        		
        				if(TradePrice == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradePrice);
            			}
            		
        			sb.append("|");
        		
        				if(TradeYield == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeYield);
            			}
            		
        			sb.append("|");
        		
        				if(CounterParty == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CounterParty);
            			}
            		
        			sb.append("|");
        		
        				if(AccruedInterest == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AccruedInterest);
            			}
            		
        			sb.append("|");
        		
        				if(CleanPrice == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CleanPrice);
            			}
            		
        			sb.append("|");
        		
        				if(Traded_bond == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Traded_bond);
            			}
            		
        			sb.append("|");
        		
        				if(User_no == null){
        					sb.append("<null>");
        				}else{
            				sb.append(User_no);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tRowGenerator_1Struct implements routines.system.IPersistableRow<after_tRowGenerator_1Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_test_dynamic = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int TradeID;

				public int getTradeID () {
					return this.TradeID;
				}
				
			    public String UserName;

				public String getUserName () {
					return this.UserName;
				}
				
			    public String TradeType;

				public String getTradeType () {
					return this.TradeType;
				}
				
			    public java.util.Date TradeDate;

				public java.util.Date getTradeDate () {
					return this.TradeDate;
				}
				
			    public Float TradePrice;

				public Float getTradePrice () {
					return this.TradePrice;
				}
				
			    public Float TradeYield;

				public Float getTradeYield () {
					return this.TradeYield;
				}
				
			    public String CounterParty;

				public String getCounterParty () {
					return this.CounterParty;
				}
				
			    public Float AccruedInterest;

				public Float getAccruedInterest () {
					return this.AccruedInterest;
				}
				
			    public Float CleanPrice;

				public Float getCleanPrice () {
					return this.CleanPrice;
				}
				
			    public Integer Traded_bond;

				public Integer getTraded_bond () {
					return this.Traded_bond;
				}
				
			    public Integer User_no;

				public Integer getUser_no () {
					return this.User_no;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.TradeID;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final after_tRowGenerator_1Struct other = (after_tRowGenerator_1Struct) obj;
		
						if (this.TradeID != other.TradeID)
							return false;
					

		return true;
    }

	public void copyDataTo(after_tRowGenerator_1Struct other) {

		other.TradeID = this.TradeID;
	            other.UserName = this.UserName;
	            other.TradeType = this.TradeType;
	            other.TradeDate = this.TradeDate;
	            other.TradePrice = this.TradePrice;
	            other.TradeYield = this.TradeYield;
	            other.CounterParty = this.CounterParty;
	            other.AccruedInterest = this.AccruedInterest;
	            other.CleanPrice = this.CleanPrice;
	            other.Traded_bond = this.Traded_bond;
	            other.User_no = this.User_no;
	            
	}

	public void copyKeysDataTo(after_tRowGenerator_1Struct other) {

		other.TradeID = this.TradeID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_LOCAL_PROJECT_test_dynamic.length) {
				if(length < 1024 && commonByteArray_LOCAL_PROJECT_test_dynamic.length == 0) {
   					commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[1024];
				} else {
   					commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_LOCAL_PROJECT_test_dynamic, 0, length);
			strReturn = new String(commonByteArray_LOCAL_PROJECT_test_dynamic, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_test_dynamic) {

        	try {

        		int length = 0;
		
			        this.TradeID = dis.readInt();
					
					this.UserName = readString(dis);
					
					this.TradeType = readString(dis);
					
					this.TradeDate = readDate(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TradePrice = null;
           				} else {
           			    	this.TradePrice = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TradeYield = null;
           				} else {
           			    	this.TradeYield = dis.readFloat();
           				}
					
					this.CounterParty = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AccruedInterest = null;
           				} else {
           			    	this.AccruedInterest = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.CleanPrice = null;
           				} else {
           			    	this.CleanPrice = dis.readFloat();
           				}
					
						this.Traded_bond = readInteger(dis);
					
						this.User_no = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.TradeID);
					
					// String
				
						writeString(this.UserName,dos);
					
					// String
				
						writeString(this.TradeType,dos);
					
					// java.util.Date
				
						writeDate(this.TradeDate,dos);
					
					// Float
				
						if(this.TradePrice == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TradePrice);
		            	}
					
					// Float
				
						if(this.TradeYield == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TradeYield);
		            	}
					
					// String
				
						writeString(this.CounterParty,dos);
					
					// Float
				
						if(this.AccruedInterest == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AccruedInterest);
		            	}
					
					// Float
				
						if(this.CleanPrice == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.CleanPrice);
		            	}
					
					// Integer
				
						writeInteger(this.Traded_bond,dos);
					
					// Integer
				
						writeInteger(this.User_no,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("TradeID="+String.valueOf(TradeID));
		sb.append(",UserName="+UserName);
		sb.append(",TradeType="+TradeType);
		sb.append(",TradeDate="+String.valueOf(TradeDate));
		sb.append(",TradePrice="+String.valueOf(TradePrice));
		sb.append(",TradeYield="+String.valueOf(TradeYield));
		sb.append(",CounterParty="+CounterParty);
		sb.append(",AccruedInterest="+String.valueOf(AccruedInterest));
		sb.append(",CleanPrice="+String.valueOf(CleanPrice));
		sb.append(",Traded_bond="+String.valueOf(Traded_bond));
		sb.append(",User_no="+String.valueOf(User_no));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(TradeID);
        			
        			sb.append("|");
        		
        				if(UserName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UserName);
            			}
            		
        			sb.append("|");
        		
        				if(TradeType == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeType);
            			}
            		
        			sb.append("|");
        		
        				if(TradeDate == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeDate);
            			}
            		
        			sb.append("|");
        		
        				if(TradePrice == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradePrice);
            			}
            		
        			sb.append("|");
        		
        				if(TradeYield == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TradeYield);
            			}
            		
        			sb.append("|");
        		
        				if(CounterParty == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CounterParty);
            			}
            		
        			sb.append("|");
        		
        				if(AccruedInterest == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AccruedInterest);
            			}
            		
        			sb.append("|");
        		
        				if(CleanPrice == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CleanPrice);
            			}
            		
        			sb.append("|");
        		
        				if(Traded_bond == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Traded_bond);
            			}
            		
        			sb.append("|");
        		
        				if(User_no == null){
        					sb.append("<null>");
        				}else{
            				sb.append(User_no);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tRowGenerator_1Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.TradeID, other.TradeID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tRowGenerator_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tRowGenerator_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;


		tMSSqlInput_1Process(globalMap);
		tMSSqlInput_2Process(globalMap);

		row1Struct row1 = new row1Struct();
outStruct out = new outStruct();





	
	/**
	 * [tMSSqlOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMSSqlOutput_1", false);
		start_Hash.put("tMSSqlOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tMSSqlOutput_1";

	
			if (execStat) {
				if(resourceMap.get("inIterateVComp") == null){
					
						runStat.updateStatOnConnection("out" + iterateId, 0, 0);
					
				}
			} 

		
		int tos_count_tMSSqlOutput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tMSSqlOutput_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tMSSqlOutput_1 = new StringBuilder();
            log4jParamters_tMSSqlOutput_1.append("Parameters:");
                    log4jParamters_tMSSqlOutput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("CONNECTION" + " = " + "tMSSqlConnection_1");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("TABLE" + " = " + "\"Trade\"");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("TABLE_ACTION" + " = " + "DROP_CREATE");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("IDENTITY_INSERT" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("DATA_ACTION" + " = " + "INSERT");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("SPECIFY_IDENTITY_FIELD" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("DIE_ON_ERROR" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("ADD_COLS" + " = " + "[]");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("USE_FIELD_OPTIONS" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("IGNORE_DATE_OUTOF_RANGE" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("ENABLE_DEBUG_MODE" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("SUPPORT_NULL_WHERE" + " = " + "false");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("USE_BATCH_SIZE" + " = " + "true");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                    log4jParamters_tMSSqlOutput_1.append("BATCH_SIZE" + " = " + "10000");
                log4jParamters_tMSSqlOutput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + (log4jParamters_tMSSqlOutput_1) );
    		}
    	}
    	
        new BytesLimit65535_tMSSqlOutput_1().limitLog4jByte();



int nb_line_tMSSqlOutput_1 = 0;
int nb_line_update_tMSSqlOutput_1 = 0;
int nb_line_inserted_tMSSqlOutput_1 = 0;
int nb_line_deleted_tMSSqlOutput_1 = 0;
int nb_line_rejected_tMSSqlOutput_1 = 0;

int deletedCount_tMSSqlOutput_1=0;
int updatedCount_tMSSqlOutput_1=0;
int insertedCount_tMSSqlOutput_1=0;
int rejectedCount_tMSSqlOutput_1=0;
String dbschema_tMSSqlOutput_1 = null;
String tableName_tMSSqlOutput_1 = null;
boolean whetherReject_tMSSqlOutput_1 = false;

java.util.Calendar calendar_tMSSqlOutput_1 = java.util.Calendar.getInstance();
long year1_tMSSqlOutput_1 = TalendDate.parseDate("yyyy-MM-dd","0001-01-01").getTime();
long year2_tMSSqlOutput_1 = TalendDate.parseDate("yyyy-MM-dd","1753-01-01").getTime();
long year10000_tMSSqlOutput_1 = TalendDate.parseDate("yyyy-MM-dd HH:mm:ss","9999-12-31 24:00:00").getTime();
long date_tMSSqlOutput_1;

java.util.Calendar calendar_datetimeoffset_tMSSqlOutput_1 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));


	
java.sql.Connection conn_tMSSqlOutput_1 = null;
String dbUser_tMSSqlOutput_1 = null;
	dbschema_tMSSqlOutput_1 = (String)globalMap.get("dbschema_tMSSqlConnection_1");
	conn_tMSSqlOutput_1 = (java.sql.Connection)globalMap.get("conn_tMSSqlConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Uses an existing connection with username '")  + (conn_tMSSqlOutput_1.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tMSSqlOutput_1.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Connection is set auto commit to '")  + (conn_tMSSqlOutput_1.getAutoCommit())  + ("'.") );
   int batchSize_tMSSqlOutput_1 = 10000;
   int batchSizeCounter_tMSSqlOutput_1=0;

if(dbschema_tMSSqlOutput_1 == null || dbschema_tMSSqlOutput_1.trim().length() == 0) {
    tableName_tMSSqlOutput_1 = "Trade";
} else {
    tableName_tMSSqlOutput_1 = dbschema_tMSSqlOutput_1 + "].[" + "Trade";
}
	int count_tMSSqlOutput_1=0;

            java.sql.Statement stmtDrop_tMSSqlOutput_1 = conn_tMSSqlOutput_1.createStatement();
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Dropping")  + (" table '")  + (tableName_tMSSqlOutput_1)  + ("'.") );
            stmtDrop_tMSSqlOutput_1.execute("DROP TABLE [" + tableName_tMSSqlOutput_1 + "]" );
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Drop")  + (" table '")  + (tableName_tMSSqlOutput_1)  + ("' has succeeded.") );
            stmtDrop_tMSSqlOutput_1.close();
            java.sql.Statement stmtCreate_tMSSqlOutput_1 = conn_tMSSqlOutput_1.createStatement();
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Creating")  + (" table '")  + (tableName_tMSSqlOutput_1)  + ("'.") );
                stmtCreate_tMSSqlOutput_1.execute("CREATE TABLE [" + tableName_tMSSqlOutput_1 + "]([TradeID] INT  not null ,[UserName] VARCHAR(255)  ,[ISIN] VARCHAR(500)   not null ,[TradeType] VARCHAR(255)  ,[TradeDate] DATETIME ,[TradePrice] REAL ,[TradeYield] REAL ,[CounterParty] VARCHAR(255)  ,[AccruedInterest] REAL ,[CleanPrice] REAL ,primary key([TradeID]))");
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Create")  + (" table '")  + (tableName_tMSSqlOutput_1)  + ("' has succeeded.") );
            stmtCreate_tMSSqlOutput_1.close();
        String insert_tMSSqlOutput_1 = "INSERT INTO [" + tableName_tMSSqlOutput_1 + "] ([TradeID],[UserName],[ISIN],[TradeType],[TradeDate],[TradePrice],[TradeYield],[CounterParty],[AccruedInterest],[CleanPrice]) VALUES (?,?,?,?,?,?,?,?,?,?)";
        java.sql.PreparedStatement pstmt_tMSSqlOutput_1 = conn_tMSSqlOutput_1.prepareStatement(insert_tMSSqlOutput_1);

 	boolean isShareIdentity_tMSSqlOutput_1 = globalMap.get("shareIdentitySetting_tMSSqlConnection_1") != null && (Boolean)globalMap.get("shareIdentitySetting_tMSSqlConnection_1") == true;

 



/**
 * [tMSSqlOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
			if (execStat) {
				if(resourceMap.get("inIterateVComp") == null){
					
						runStat.updateStatOnConnection("row1" + iterateId, 0, 0);
					
				}
			} 

		
		int tos_count_tMap_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tMap_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tMap_1 = new StringBuilder();
            log4jParamters_tMap_1.append("Parameters:");
                    log4jParamters_tMap_1.append("LINK_STYLE" + " = " + "AUTO");
                log4jParamters_tMap_1.append(" | ");
                    log4jParamters_tMap_1.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                log4jParamters_tMap_1.append(" | ");
                    log4jParamters_tMap_1.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                log4jParamters_tMap_1.append(" | ");
                    log4jParamters_tMap_1.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "true");
                log4jParamters_tMap_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + (log4jParamters_tMap_1) );
    		}
    	}
    	
        new BytesLimit65535_tMap_1().limitLog4jByte();




// ###############################
// # Lookup's keys initialization
		int count_row1_tMap_1 = 0;
		
		int count_row3_tMap_1 = 0;
		
		int count_row2_tMap_1 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
					globalMap.get( "tHash_Lookup_row2" ))
					;					
					
	

row2Struct row2HashKey = new row2Struct();
row2Struct row2Default = new row2Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_out_tMap_1 = 0;
				
outStruct out_tmp = new outStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tRowGenerator_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tRowGenerator_1", false);
		start_Hash.put("tRowGenerator_1", System.currentTimeMillis());
		
	
	currentComponent="tRowGenerator_1";

	
		int tos_count_tRowGenerator_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tRowGenerator_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tRowGenerator_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tRowGenerator_1 = new StringBuilder();
            log4jParamters_tRowGenerator_1.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("tRowGenerator_1 - "  + (log4jParamters_tRowGenerator_1) );
    		}
    	}
    	
        new BytesLimit65535_tRowGenerator_1().limitLog4jByte();


int nb_line_tRowGenerator_1 = 0;
int nb_max_row_tRowGenerator_1 = context.row_no;


class tRowGenerator_1Randomizer {
	public int getRandomTradeID() {
		
		return Numeric.sequence("s1" ,1 ,1 );
		
	}
	public String getRandomUserName() {
		 
		return "" ;
		
	}
	public String getRandomTradeType() {
		
		String[] TradeTypeTable = new String[] { "Buy","Sell"  };
		java.util.Random randomtRowGenerator_1 = new java.util.Random();
		return TradeTypeTable[randomtRowGenerator_1.nextInt(TradeTypeTable.length)];
		
	}
	public java.util.Date getRandomTradeDate() {
		
		return TalendDate.getCurrentDate();
		
	}
	public Float getRandomTradePrice() {
		 
		return 0.0f ;
		
	}
	public Float getRandomTradeYield() {
		
		return Numeric.convertImpliedDecimalFormat("9V99999",Integer.toString(Numeric.random(0,3000000))) ;
		
	}
	public String getRandomCounterParty() {
		 
		return "" ;
		
	}
	public Float getRandomAccruedInterest() {
		 
		return 0.0f ;
		
	}
	public Float getRandomCleanPrice() {
		 
		return 0.0f ;
		
	}
	public Integer getRandomTraded_bond() {
		
		return Numeric.random(1 ,context.bond_no );
		
	}
	public Integer getRandomUser_no() {
		
		return Numeric.random(1 ,context.user_no );
		
	}
}
	tRowGenerator_1Randomizer randtRowGenerator_1 = new tRowGenerator_1Randomizer();
	
    	log.info("tRowGenerator_1 - Generating records.");
	for (int itRowGenerator_1=0; itRowGenerator_1<nb_max_row_tRowGenerator_1 ;itRowGenerator_1++) {
		row1.TradeID = randtRowGenerator_1.getRandomTradeID();
		row1.UserName = randtRowGenerator_1.getRandomUserName();
		row1.TradeType = randtRowGenerator_1.getRandomTradeType();
		row1.TradeDate = randtRowGenerator_1.getRandomTradeDate();
		row1.TradePrice = randtRowGenerator_1.getRandomTradePrice();
		row1.TradeYield = randtRowGenerator_1.getRandomTradeYield();
		row1.CounterParty = randtRowGenerator_1.getRandomCounterParty();
		row1.AccruedInterest = randtRowGenerator_1.getRandomAccruedInterest();
		row1.CleanPrice = randtRowGenerator_1.getRandomCleanPrice();
		row1.Traded_bond = randtRowGenerator_1.getRandomTraded_bond();
		row1.User_no = randtRowGenerator_1.getRandomUser_no();
		nb_line_tRowGenerator_1++;
		
			log.debug("tRowGenerator_1 - Retrieving the record " + nb_line_tRowGenerator_1 + ".");
		

 



/**
 * [tRowGenerator_1 begin ] stop
 */
	
	/**
	 * [tRowGenerator_1 main ] start
	 */

	

	
	
	currentComponent="tRowGenerator_1";

	

 


	tos_count_tRowGenerator_1++;

/**
 * [tRowGenerator_1 main ] stop
 */

	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

			//row1
			//row1


			
				if(execStat){
					runStat.updateStatOnConnection("row1"+iterateId,1, 1);
				} 
			

		
    			if(log.isTraceEnabled()){
    				log.trace("row1 - " + (row1==null? "": row1.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		
        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
	                        		    	Object exprKeyValue_row3__User_Id = row1.User_no;
	                        		    	if(exprKeyValue_row3__User_Id == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row3HashKey.User_Id = (int)(Integer) exprKeyValue_row3__User_Id;
                        		    		}
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_1) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_1 || !tHash_Lookup_row3.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.User_Id = '" + row3HashKey.User_Id + "'");
								} // G 071
							

							row3Struct row3 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row3Struct fromLookup_row3 = null;
							row3 = row3Default;
										 
							
								 
							
							
								if (tHash_Lookup_row3 !=null && tHash_Lookup_row3.hasNext()) { // G 099
								
							
								
								fromLookup_row3 = tHash_Lookup_row3.next();

							
							
								} // G 099
							
							

							if(fromLookup_row3 != null) {
								row3 = fromLookup_row3;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		row2HashKey.Bond_Id = row1.Traded_bond ;
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.Bond_Id = '" + row2HashKey.Bond_Id + "'");
								} // G 071
							

							row2Struct row2 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row2Struct fromLookup_row2 = null;
							row2 = row2Default;
										 
							
								 
							
							
								if (tHash_Lookup_row2 !=null && tHash_Lookup_row2.hasNext()) { // G 099
								
							
								
								fromLookup_row2 = tHash_Lookup_row2.next();

							
							
								} // G 099
							
							

							if(fromLookup_row2 != null) {
								row2 = fromLookup_row2;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

out = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out'
count_out_tMap_1++;

out_tmp.TradeID = row1.TradeID ;
out_tmp.UserName = row3.UserName ;
out_tmp.ISIN = row2.ISIN ;
out_tmp.TradeType = row1.TradeType ;
out_tmp.TradeDate = row1.TradeDate ;
out_tmp.TradePrice = row1.TradePrice ;
out_tmp.TradeYield = row1.TradeYield ;
out_tmp.CounterParty = row2.Securities_IssuerName ;
out_tmp.AccruedInterest = row1.AccruedInterest ;
out_tmp.CleanPrice = row1.CleanPrice ;
out = out_tmp;
log.debug("tMap_1 - Outputting the record " + count_out_tMap_1 + " of the output table 'out'.");

}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
// Start of branch "out"
if(out != null) { 



	
	/**
	 * [tMSSqlOutput_1 main ] start
	 */

	

	
	
	currentComponent="tMSSqlOutput_1";

	

			//out
			//out


			
				if(execStat){
					runStat.updateStatOnConnection("out"+iterateId,1, 1);
				} 
			

		
    			if(log.isTraceEnabled()){
    				log.trace("out - " + (out==null? "": out.toLogString()));
    			}
    		



        whetherReject_tMSSqlOutput_1 = false;
                    pstmt_tMSSqlOutput_1.setInt(1, out.TradeID);

                    if(out.UserName == null) {
pstmt_tMSSqlOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tMSSqlOutput_1.setString(2, out.UserName);
}

                    if(out.ISIN == null) {
pstmt_tMSSqlOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tMSSqlOutput_1.setString(3, out.ISIN);
}

                    if(out.TradeType == null) {
pstmt_tMSSqlOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tMSSqlOutput_1.setString(4, out.TradeType);
}

                    if(out.TradeDate != null) {
pstmt_tMSSqlOutput_1.setTimestamp(5, new java.sql.Timestamp(out.TradeDate.getTime()));
} else {
pstmt_tMSSqlOutput_1.setNull(5, java.sql.Types.DATE);
}

                    if(out.TradePrice == null) {
pstmt_tMSSqlOutput_1.setNull(6, java.sql.Types.FLOAT);
} else {pstmt_tMSSqlOutput_1.setFloat(6, out.TradePrice);
}

                    if(out.TradeYield == null) {
pstmt_tMSSqlOutput_1.setNull(7, java.sql.Types.FLOAT);
} else {pstmt_tMSSqlOutput_1.setFloat(7, out.TradeYield);
}

                    if(out.CounterParty == null) {
pstmt_tMSSqlOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmt_tMSSqlOutput_1.setString(8, out.CounterParty);
}

                    if(out.AccruedInterest == null) {
pstmt_tMSSqlOutput_1.setNull(9, java.sql.Types.FLOAT);
} else {pstmt_tMSSqlOutput_1.setFloat(9, out.AccruedInterest);
}

                    if(out.CleanPrice == null) {
pstmt_tMSSqlOutput_1.setNull(10, java.sql.Types.FLOAT);
} else {pstmt_tMSSqlOutput_1.setFloat(10, out.CleanPrice);
}


        		pstmt_tMSSqlOutput_1.addBatch();
        		nb_line_tMSSqlOutput_1++;
    		 
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Adding the record ")  + (nb_line_tMSSqlOutput_1)  + (" to the ")  + ("INSERT")  + (" batch.") );
    		  batchSizeCounter_tMSSqlOutput_1++;
    		
            if(!whetherReject_tMSSqlOutput_1) {
            }
            	//////////batch execute by batch size///////
            	class LimitBytesHelper_tMSSqlOutput_1{
            		public int limitBytePart1(int counter,java.sql.PreparedStatement pstmt_tMSSqlOutput_1) throws Exception {
                try {
						
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
						for(int countEach_tMSSqlOutput_1: pstmt_tMSSqlOutput_1.executeBatch()) {
							if(countEach_tMSSqlOutput_1 == -2 || countEach_tMSSqlOutput_1 == -3) {
								break;
							}
							counter += countEach_tMSSqlOutput_1;
						}
						
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
                }catch (java.sql.BatchUpdateException e){
                	
                	int countSum_tMSSqlOutput_1 = 0;
					for(int countEach_tMSSqlOutput_1: e.getUpdateCounts()) {
						counter += (countEach_tMSSqlOutput_1 < 0 ? 0 : countEach_tMSSqlOutput_1);
					}
				
            	    	
            log.error("tMSSqlOutput_1 - "  + (e.getMessage()) );
                		System.err.println(e.getMessage());
                	
               			 }
    				return counter;
            	}
            	
            	public int limitBytePart2(int counter,java.sql.PreparedStatement pstmt_tMSSqlOutput_1) throws Exception {
                try {
                		
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
						for(int countEach_tMSSqlOutput_1: pstmt_tMSSqlOutput_1.executeBatch()) {
							if(countEach_tMSSqlOutput_1 == -2 || countEach_tMSSqlOutput_1 == -3) {
								break;
							}
							counter += countEach_tMSSqlOutput_1;
						}
						
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
                }catch (java.sql.BatchUpdateException e){
                	
                	
					for(int countEach_tMSSqlOutput_1: e.getUpdateCounts()) {
						counter += (countEach_tMSSqlOutput_1 < 0 ? 0 : countEach_tMSSqlOutput_1);
					}
					
            	    	
            log.error("tMSSqlOutput_1 - "  + (e.getMessage()) );
                        System.err.println(e.getMessage());
                	
                		}	
                	return counter;	
            	}
            }
    		if ((batchSize_tMSSqlOutput_1 > 0) && (batchSize_tMSSqlOutput_1 <= batchSizeCounter_tMSSqlOutput_1)) {
    		
    		            
            	    		insertedCount_tMSSqlOutput_1 = new LimitBytesHelper_tMSSqlOutput_1().limitBytePart1(insertedCount_tMSSqlOutput_1,pstmt_tMSSqlOutput_1);
            	    	
    			
			    batchSizeCounter_tMSSqlOutput_1 = 0;
			}
    		

    	////////////commit every////////////
    			

 


	tos_count_tMSSqlOutput_1++;

/**
 * [tMSSqlOutput_1 main ] stop
 */

} // End of branch "out"







	
	/**
	 * [tRowGenerator_1 end ] start
	 */

	

	
	
	currentComponent="tRowGenerator_1";

	

}
globalMap.put("tRowGenerator_1_NB_LINE",nb_line_tRowGenerator_1);
	log.info("tRowGenerator_1 - Generated records count:" + nb_line_tRowGenerator_1 + " .");

 
                if(log.isDebugEnabled())
            log.debug("tRowGenerator_1 - "  + ("Done.") );

ok_Hash.put("tRowGenerator_1", true);
end_Hash.put("tRowGenerator_1", System.currentTimeMillis());




/**
 * [tRowGenerator_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
					if(tHash_Lookup_row2 != null) {
						tHash_Lookup_row2.endGet();
					}
					globalMap.remove( "tHash_Lookup_row2" );

					
					
				
// ###############################      
				log.debug("tMap_1 - Written records count in the table 'out': " + count_out_tMap_1 + ".");





			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		runStat.updateStatOnConnection("row1"+iterateId,2, 0); 
			 	}
			}
		
 
                if(log.isDebugEnabled())
            log.debug("tMap_1 - "  + ("Done.") );

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tMSSqlOutput_1 end ] start
	 */

	

	
	
	currentComponent="tMSSqlOutput_1";

	



                try {
						int countSum_tMSSqlOutput_1 = 0;
						if (pstmt_tMSSqlOutput_1 != null && batchSizeCounter_tMSSqlOutput_1 > 0) {
							
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
							for(int countEach_tMSSqlOutput_1: pstmt_tMSSqlOutput_1.executeBatch()) {
								if(countEach_tMSSqlOutput_1 == -2 || countEach_tMSSqlOutput_1 == -3) {
									break;
								}
								countSum_tMSSqlOutput_1 += countEach_tMSSqlOutput_1;
							}
							
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
						}
            	    	
            	    		insertedCount_tMSSqlOutput_1 += countSum_tMSSqlOutput_1;
            	    	
                }catch (java.sql.BatchUpdateException e){
                	
                	int countSum_tMSSqlOutput_1 = 0;
					for(int countEach_tMSSqlOutput_1: e.getUpdateCounts()) {
						countSum_tMSSqlOutput_1 += (countEach_tMSSqlOutput_1 < 0 ? 0 : countEach_tMSSqlOutput_1);
					}
					
            	    		insertedCount_tMSSqlOutput_1 += countSum_tMSSqlOutput_1;
            	    	
            log.error("tMSSqlOutput_1 - "  + (e.getMessage()) );
                		System.err.println(e.getMessage());
                	
            	}
        if(pstmt_tMSSqlOutput_1 != null) {
			
				pstmt_tMSSqlOutput_1.close();
			
        }


	nb_line_deleted_tMSSqlOutput_1=nb_line_deleted_tMSSqlOutput_1+ deletedCount_tMSSqlOutput_1;
	nb_line_update_tMSSqlOutput_1=nb_line_update_tMSSqlOutput_1 + updatedCount_tMSSqlOutput_1;
	nb_line_inserted_tMSSqlOutput_1=nb_line_inserted_tMSSqlOutput_1 + insertedCount_tMSSqlOutput_1;
	nb_line_rejected_tMSSqlOutput_1=nb_line_rejected_tMSSqlOutput_1 + rejectedCount_tMSSqlOutput_1;
	
        globalMap.put("tMSSqlOutput_1_NB_LINE",nb_line_tMSSqlOutput_1);
        globalMap.put("tMSSqlOutput_1_NB_LINE_UPDATED",nb_line_update_tMSSqlOutput_1);
        globalMap.put("tMSSqlOutput_1_NB_LINE_INSERTED",nb_line_inserted_tMSSqlOutput_1);
        globalMap.put("tMSSqlOutput_1_NB_LINE_DELETED",nb_line_deleted_tMSSqlOutput_1);
        globalMap.put("tMSSqlOutput_1_NB_LINE_REJECTED", nb_line_rejected_tMSSqlOutput_1);
    
	
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tMSSqlOutput_1)  + (" record(s).") );

			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		runStat.updateStatOnConnection("out"+iterateId,2, 0); 
			 	}
			}
		
 
                if(log.isDebugEnabled())
            log.debug("tMSSqlOutput_1 - "  + ("Done.") );

ok_Hash.put("tMSSqlOutput_1", true);
end_Hash.put("tMSSqlOutput_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tMSSqlClose_1Process(globalMap);



/**
 * [tMSSqlOutput_1 end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row2"); 
				     			
				try{
					
	
	/**
	 * [tRowGenerator_1 finally ] start
	 */

	

	
	
	currentComponent="tRowGenerator_1";

	

 



/**
 * [tRowGenerator_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tMSSqlOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tMSSqlOutput_1";

	



	

 



/**
 * [tMSSqlOutput_1 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tRowGenerator_1_SUBPROCESS_STATE", 1);
	}
	

public void tMSSqlClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMSSqlClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;





	
	/**
	 * [tMSSqlClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMSSqlClose_1", false);
		start_Hash.put("tMSSqlClose_1", System.currentTimeMillis());
		
	
	currentComponent="tMSSqlClose_1";

	
		int tos_count_tMSSqlClose_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMSSqlClose_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tMSSqlClose_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tMSSqlClose_1 = new StringBuilder();
            log4jParamters_tMSSqlClose_1.append("Parameters:");
                    log4jParamters_tMSSqlClose_1.append("CONNECTION" + " = " + "tMSSqlConnection_1");
                log4jParamters_tMSSqlClose_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMSSqlClose_1 - "  + (log4jParamters_tMSSqlClose_1) );
    		}
    	}
    	
        new BytesLimit65535_tMSSqlClose_1().limitLog4jByte();

 



/**
 * [tMSSqlClose_1 begin ] stop
 */
	
	/**
	 * [tMSSqlClose_1 main ] start
	 */

	

	
	
	currentComponent="tMSSqlClose_1";

	



	java.sql.Connection conn_tMSSqlClose_1 = (java.sql.Connection)globalMap.get("conn_tMSSqlConnection_1");
	if(conn_tMSSqlClose_1 != null && !conn_tMSSqlClose_1.isClosed())
	{
                if(log.isDebugEnabled())
            log.debug("tMSSqlClose_1 - "  + ("Closing the connection ")  + ("conn_tMSSqlConnection_1")  + (" to the database.") );
        conn_tMSSqlClose_1.close();
                if(log.isDebugEnabled())
            log.debug("tMSSqlClose_1 - "  + ("Connection ")  + ("conn_tMSSqlConnection_1")  + (" to the database has closed.") );
	}

 


	tos_count_tMSSqlClose_1++;

/**
 * [tMSSqlClose_1 main ] stop
 */
	
	/**
	 * [tMSSqlClose_1 end ] start
	 */

	

	
	
	currentComponent="tMSSqlClose_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tMSSqlClose_1 - "  + ("Done.") );

ok_Hash.put("tMSSqlClose_1", true);
end_Hash.put("tMSSqlClose_1", System.currentTimeMillis());




/**
 * [tMSSqlClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMSSqlClose_1 finally ] start
	 */

	

	
	
	currentComponent="tMSSqlClose_1";

	

 



/**
 * [tMSSqlClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMSSqlClose_1_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_test_dynamic = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int User_Id;

				public int getUser_Id () {
					return this.User_Id;
				}
				
			    public String UserName;

				public String getUserName () {
					return this.UserName;
				}
				
			    public String FirstName;

				public String getFirstName () {
					return this.FirstName;
				}
				
			    public String LastName;

				public String getLastName () {
					return this.LastName;
				}
				
			    public String Password;

				public String getPassword () {
					return this.Password;
				}
				
			    public Boolean Approval;

				public Boolean getApproval () {
					return this.Approval;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.User_Id;
						
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row3Struct other = (row3Struct) obj;
		
						if (this.User_Id != other.User_Id)
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.User_Id = this.User_Id;
	            other.UserName = this.UserName;
	            other.FirstName = this.FirstName;
	            other.LastName = this.LastName;
	            other.Password = this.Password;
	            other.Approval = this.Approval;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.User_Id = this.User_Id;
	            	
	}




	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_test_dynamic) {

        	try {

        		int length = 0;
		
			        this.User_Id = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.User_Id);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.UserName = readString(dis,ois);
					
						this.FirstName = readString(dis,ois);
					
						this.LastName = readString(dis,ois);
					
						this.Password = readString(dis,ois);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Approval = null;
           				} else {
           			    	this.Approval = dis.readBoolean();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.UserName, dos, oos);
					
						writeString(this.FirstName, dos, oos);
					
						writeString(this.LastName, dos, oos);
					
						writeString(this.Password, dos, oos);
					
						if(this.Approval == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeBoolean(this.Approval);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("User_Id="+String.valueOf(User_Id));
		sb.append(",UserName="+UserName);
		sb.append(",FirstName="+FirstName);
		sb.append(",LastName="+LastName);
		sb.append(",Password="+Password);
		sb.append(",Approval="+String.valueOf(Approval));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				sb.append(User_Id);
        			
        			sb.append("|");
        		
        				if(UserName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UserName);
            			}
            		
        			sb.append("|");
        		
        				if(FirstName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FirstName);
            			}
            		
        			sb.append("|");
        		
        				if(LastName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LastName);
            			}
            		
        			sb.append("|");
        		
        				if(Password == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Password);
            			}
            		
        			sb.append("|");
        		
        				if(Approval == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Approval);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.User_Id, other.User_Id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMSSqlInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMSSqlInput_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tAdvancedHash_row3 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row3", false);
		start_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row3";

	
			if (execStat) {
				if(resourceMap.get("inIterateVComp") == null){
					
						runStat.updateStatOnConnection("row3" + iterateId, 0, 0);
					
				}
			} 

		
		int tos_count_tAdvancedHash_row3 = 0;
		
    	class BytesLimit65535_tAdvancedHash_row3{
    		public void limitLog4jByte() throws Exception{
    			
    		}
    	}
    	
        new BytesLimit65535_tAdvancedHash_row3().limitLog4jByte();

			   		// connection name:row3
			   		// source node:tMSSqlInput_1 - inputs:(after_tRowGenerator_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row3,row2) outputs:(out)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
 */



	
	/**
	 * [tMSSqlInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMSSqlInput_1", false);
		start_Hash.put("tMSSqlInput_1", System.currentTimeMillis());
		
	
	currentComponent="tMSSqlInput_1";

	
		int tos_count_tMSSqlInput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMSSqlInput_1 - "  + ("Start to work.") );
    	class BytesLimit65535_tMSSqlInput_1{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tMSSqlInput_1 = new StringBuilder();
            log4jParamters_tMSSqlInput_1.append("Parameters:");
                    log4jParamters_tMSSqlInput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tMSSqlInput_1.append(" | ");
                    log4jParamters_tMSSqlInput_1.append("CONNECTION" + " = " + "tMSSqlConnection_1");
                log4jParamters_tMSSqlInput_1.append(" | ");
                    log4jParamters_tMSSqlInput_1.append("TABLE" + " = " + "\"UserTable\"");
                log4jParamters_tMSSqlInput_1.append(" | ");
                    log4jParamters_tMSSqlInput_1.append("QUERYSTORE" + " = " + "\"\"");
                log4jParamters_tMSSqlInput_1.append(" | ");
                    log4jParamters_tMSSqlInput_1.append("QUERY" + " = " + "\"Select * from UserTable\"");
                log4jParamters_tMSSqlInput_1.append(" | ");
                    log4jParamters_tMSSqlInput_1.append("TRIM_ALL_COLUMN" + " = " + "false");
                log4jParamters_tMSSqlInput_1.append(" | ");
                    log4jParamters_tMSSqlInput_1.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("User_Id")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UserName")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FirstName")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LastName")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Password")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Approval")+"}]");
                log4jParamters_tMSSqlInput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMSSqlInput_1 - "  + (log4jParamters_tMSSqlInput_1) );
    		}
    	}
    	
        new BytesLimit65535_tMSSqlInput_1().limitLog4jByte();
	
    
	
			org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tMSSqlInput_1 = org.talend.designer.components.util.mssql.MSSqlUtilFactory.getMSSqlGenerateTimestampUtil();
			
			java.util.List<String> talendToDBList_tMSSqlInput_1 = new java.util.ArrayList();
			String[] talendToDBArray_tMSSqlInput_1  = new String[]{"FLOAT","NUMERIC","NUMERIC IDENTITY","DECIMAL","DECIMAL IDENTITY","REAL"}; 
			java.util.Collections.addAll(talendToDBList_tMSSqlInput_1, talendToDBArray_tMSSqlInput_1); 
		    int nb_line_tMSSqlInput_1 = 0;
		    java.sql.Connection conn_tMSSqlInput_1 = null;
		        conn_tMSSqlInput_1 = (java.sql.Connection)globalMap.get("conn_tMSSqlConnection_1");
				
				if(conn_tMSSqlInput_1 != null) {
					if(conn_tMSSqlInput_1.getMetaData() != null) {
						
						log.debug("tMSSqlInput_1 - Uses an existing connection with username '" + conn_tMSSqlInput_1.getMetaData().getUserName() + "'. Connection URL: " + conn_tMSSqlInput_1.getMetaData().getURL() + ".");
						
					}
				}
			
			String dbschema_tMSSqlInput_1 = (String)globalMap.get("dbschema_tMSSqlConnection_1");
		    
			java.sql.Statement stmt_tMSSqlInput_1 = conn_tMSSqlInput_1.createStatement();

		    String dbquery_tMSSqlInput_1 = "Select * from UserTable";
			
                log.debug("tMSSqlInput_1 - Executing the query: '"+dbquery_tMSSqlInput_1+"'.");
			

            	globalMap.put("tMSSqlInput_1_QUERY",dbquery_tMSSqlInput_1);
		    java.sql.ResultSet rs_tMSSqlInput_1 = null;

		    try {
		    	rs_tMSSqlInput_1 = stmt_tMSSqlInput_1.executeQuery(dbquery_tMSSqlInput_1);
		    	java.sql.ResultSetMetaData rsmd_tMSSqlInput_1 = rs_tMSSqlInput_1.getMetaData();
		    	int colQtyInRs_tMSSqlInput_1 = rsmd_tMSSqlInput_1.getColumnCount();

		    String tmpContent_tMSSqlInput_1 = null;
		    
		    
		    	log.debug("tMSSqlInput_1 - Retrieving records from the database.");
		    
		    while (rs_tMSSqlInput_1.next()) {
		        nb_line_tMSSqlInput_1++;
		        
							if(colQtyInRs_tMSSqlInput_1 < 1) {
								row3.User_Id = 0;
							} else {
		                          
            if(rs_tMSSqlInput_1.getObject(1) != null) {
                row3.User_Id = rs_tMSSqlInput_1.getInt(1);
            } else {
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tMSSqlInput_1 < 2) {
								row3.UserName = null;
							} else {
	                         		
           		tmpContent_tMSSqlInput_1 = rs_tMSSqlInput_1.getString(2);
            if(tmpContent_tMSSqlInput_1 != null) {
            	if (talendToDBList_tMSSqlInput_1 .contains(rsmd_tMSSqlInput_1.getColumnTypeName(2).toUpperCase(java.util.Locale.ENGLISH))) {
            		row3.UserName = FormatterUtils.formatUnwithE(tmpContent_tMSSqlInput_1);
            	} else {
                	row3.UserName = tmpContent_tMSSqlInput_1;
                }
            } else {
                row3.UserName = null;
            }
		                    }
							if(colQtyInRs_tMSSqlInput_1 < 3) {
								row3.FirstName = null;
							} else {
	                         		
           		tmpContent_tMSSqlInput_1 = rs_tMSSqlInput_1.getString(3);
            if(tmpContent_tMSSqlInput_1 != null) {
            	if (talendToDBList_tMSSqlInput_1 .contains(rsmd_tMSSqlInput_1.getColumnTypeName(3).toUpperCase(java.util.Locale.ENGLISH))) {
            		row3.FirstName = FormatterUtils.formatUnwithE(tmpContent_tMSSqlInput_1);
            	} else {
                	row3.FirstName = tmpContent_tMSSqlInput_1;
                }
            } else {
                row3.FirstName = null;
            }
		                    }
							if(colQtyInRs_tMSSqlInput_1 < 4) {
								row3.LastName = null;
							} else {
	                         		
           		tmpContent_tMSSqlInput_1 = rs_tMSSqlInput_1.getString(4);
            if(tmpContent_tMSSqlInput_1 != null) {
            	if (talendToDBList_tMSSqlInput_1 .contains(rsmd_tMSSqlInput_1.getColumnTypeName(4).toUpperCase(java.util.Locale.ENGLISH))) {
            		row3.LastName = FormatterUtils.formatUnwithE(tmpContent_tMSSqlInput_1);
            	} else {
                	row3.LastName = tmpContent_tMSSqlInput_1;
                }
            } else {
                row3.LastName = null;
            }
		                    }
							if(colQtyInRs_tMSSqlInput_1 < 5) {
								row3.Password = null;
							} else {
	                         		
           		tmpContent_tMSSqlInput_1 = rs_tMSSqlInput_1.getString(5);
            if(tmpContent_tMSSqlInput_1 != null) {
            	if (talendToDBList_tMSSqlInput_1 .contains(rsmd_tMSSqlInput_1.getColumnTypeName(5).toUpperCase(java.util.Locale.ENGLISH))) {
            		row3.Password = FormatterUtils.formatUnwithE(tmpContent_tMSSqlInput_1);
            	} else {
                	row3.Password = tmpContent_tMSSqlInput_1;
                }
            } else {
                row3.Password = null;
            }
		                    }
							if(colQtyInRs_tMSSqlInput_1 < 6) {
								row3.Approval = null;
							} else {
	                         		
            if(rs_tMSSqlInput_1.getObject(6) != null) {
                row3.Approval = rs_tMSSqlInput_1.getBoolean(6);
            } else {
                    row3.Approval = null;
            }
		                    }
					
						log.debug("tMSSqlInput_1 - Retrieving the record " + nb_line_tMSSqlInput_1 + ".");
					





 



/**
 * [tMSSqlInput_1 begin ] stop
 */
	
	/**
	 * [tMSSqlInput_1 main ] start
	 */

	

	
	
	currentComponent="tMSSqlInput_1";

	

 


	tos_count_tMSSqlInput_1++;

/**
 * [tMSSqlInput_1 main ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

			//row3
			//row3


			
				if(execStat){
					runStat.updateStatOnConnection("row3"+iterateId,1, 1);
				} 
			

		
    			if(log.isTraceEnabled()){
    				log.trace("row3 - " + (row3==null? "": row3.toLogString()));
    			}
    		


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.User_Id = row3.User_Id;
				
				row3_HashRow.UserName = row3.UserName;
				
				row3_HashRow.FirstName = row3.FirstName;
				
				row3_HashRow.LastName = row3.LastName;
				
				row3_HashRow.Password = row3.Password;
				
				row3_HashRow.Approval = row3.Approval;
				
			tHash_Lookup_row3.put(row3_HashRow);
			
            




 


	tos_count_tAdvancedHash_row3++;

/**
 * [tAdvancedHash_row3 main ] stop
 */



	
	/**
	 * [tMSSqlInput_1 end ] start
	 */

	

	
	
	currentComponent="tMSSqlInput_1";

	

	}
}finally{
	stmt_tMSSqlInput_1.close();

}
globalMap.put("tMSSqlInput_1_NB_LINE",nb_line_tMSSqlInput_1);
	    		log.debug("tMSSqlInput_1 - Retrieved records count: "+nb_line_tMSSqlInput_1 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMSSqlInput_1 - "  + ("Done.") );

ok_Hash.put("tMSSqlInput_1", true);
end_Hash.put("tMSSqlInput_1", System.currentTimeMillis());




/**
 * [tMSSqlInput_1 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

tHash_Lookup_row3.endPut();

			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		runStat.updateStatOnConnection("row3"+iterateId,2, 0); 
			 	}
			}
		
 

ok_Hash.put("tAdvancedHash_row3", true);
end_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());




/**
 * [tAdvancedHash_row3 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMSSqlInput_1 finally ] start
	 */

	

	
	
	currentComponent="tMSSqlInput_1";

	

 



/**
 * [tMSSqlInput_1 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMSSqlInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_LOCAL_PROJECT_test_dynamic = new byte[0];
    static byte[] commonByteArray_LOCAL_PROJECT_test_dynamic = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer Bond_Id;

				public Integer getBond_Id () {
					return this.Bond_Id;
				}
				
			    public String ISIN;

				public String getISIN () {
					return this.ISIN;
				}
				
			    public String Securities_IssuerName;

				public String getSecurities_IssuerName () {
					return this.Securities_IssuerName;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.Bond_Id == null) ? 0 : this.Bond_Id.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row2Struct other = (row2Struct) obj;
		
						if (this.Bond_Id == null) {
							if (other.Bond_Id != null)
								return false;
						
						} else if (!this.Bond_Id.equals(other.Bond_Id))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.Bond_Id = this.Bond_Id;
	            other.ISIN = this.ISIN;
	            other.Securities_IssuerName = this.Securities_IssuerName;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.Bond_Id = this.Bond_Id;
	            	
	}



	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_LOCAL_PROJECT_test_dynamic) {

        	try {

        		int length = 0;
		
						this.Bond_Id = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.Bond_Id,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.ISIN = readString(dis,ois);
					
						this.Securities_IssuerName = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.ISIN, dos, oos);
					
						writeString(this.Securities_IssuerName, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("Bond_Id="+String.valueOf(Bond_Id));
		sb.append(",ISIN="+ISIN);
		sb.append(",Securities_IssuerName="+Securities_IssuerName);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(Bond_Id == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Bond_Id);
            			}
            		
        			sb.append("|");
        		
        				if(ISIN == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ISIN);
            			}
            		
        			sb.append("|");
        		
        				if(Securities_IssuerName == null){
        					sb.append("<null>");
        				}else{
            				sb.append(Securities_IssuerName);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.Bond_Id, other.Bond_Id);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMSSqlInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMSSqlInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {

			String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
			boolean resumeIt = currentMethodName.equals(resumeEntryMethodName);
			if( resumeEntryMethodName == null || resumeIt || globalResumeTicket){//start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tAdvancedHash_row2 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row2", false);
		start_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row2";

	
			if (execStat) {
				if(resourceMap.get("inIterateVComp") == null){
					
						runStat.updateStatOnConnection("row2" + iterateId, 0, 0);
					
				}
			} 

		
		int tos_count_tAdvancedHash_row2 = 0;
		
    	class BytesLimit65535_tAdvancedHash_row2{
    		public void limitLog4jByte() throws Exception{
    			
    		}
    	}
    	
        new BytesLimit65535_tAdvancedHash_row2().limitLog4jByte();

			   		// connection name:row2
			   		// source node:tMSSqlInput_2 - inputs:(after_tRowGenerator_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row3,row2) outputs:(out)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
 */



	
	/**
	 * [tMSSqlInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMSSqlInput_2", false);
		start_Hash.put("tMSSqlInput_2", System.currentTimeMillis());
		
	
	currentComponent="tMSSqlInput_2";

	
		int tos_count_tMSSqlInput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMSSqlInput_2 - "  + ("Start to work.") );
    	class BytesLimit65535_tMSSqlInput_2{
    		public void limitLog4jByte() throws Exception{
    			
            StringBuilder log4jParamters_tMSSqlInput_2 = new StringBuilder();
            log4jParamters_tMSSqlInput_2.append("Parameters:");
                    log4jParamters_tMSSqlInput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                log4jParamters_tMSSqlInput_2.append(" | ");
                    log4jParamters_tMSSqlInput_2.append("CONNECTION" + " = " + "tMSSqlConnection_1");
                log4jParamters_tMSSqlInput_2.append(" | ");
                    log4jParamters_tMSSqlInput_2.append("TABLE" + " = " + "\"Bond\"");
                log4jParamters_tMSSqlInput_2.append(" | ");
                    log4jParamters_tMSSqlInput_2.append("QUERYSTORE" + " = " + "\"\"");
                log4jParamters_tMSSqlInput_2.append(" | ");
                    log4jParamters_tMSSqlInput_2.append("QUERY" + " = " + "\"select bond_id, ISIN, (select Securities_IssuerName from Bond where bond_id=(a.bond_id+(SELECT CAST(RAND() * 249 AS INT) AS [RandomNumber]))%250 ) as Securities_IssuerName from Bond a;\"");
                log4jParamters_tMSSqlInput_2.append(" | ");
                    log4jParamters_tMSSqlInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                log4jParamters_tMSSqlInput_2.append(" | ");
                    log4jParamters_tMSSqlInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("Bond_Id")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ISIN")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("Securities_IssuerName")+"}]");
                log4jParamters_tMSSqlInput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMSSqlInput_2 - "  + (log4jParamters_tMSSqlInput_2) );
    		}
    	}
    	
        new BytesLimit65535_tMSSqlInput_2().limitLog4jByte();
	
    
	
			org.talend.designer.components.util.mssql.MSSqlGenerateTimestampUtil mssqlGTU_tMSSqlInput_2 = org.talend.designer.components.util.mssql.MSSqlUtilFactory.getMSSqlGenerateTimestampUtil();
			
			java.util.List<String> talendToDBList_tMSSqlInput_2 = new java.util.ArrayList();
			String[] talendToDBArray_tMSSqlInput_2  = new String[]{"FLOAT","NUMERIC","NUMERIC IDENTITY","DECIMAL","DECIMAL IDENTITY","REAL"}; 
			java.util.Collections.addAll(talendToDBList_tMSSqlInput_2, talendToDBArray_tMSSqlInput_2); 
		    int nb_line_tMSSqlInput_2 = 0;
		    java.sql.Connection conn_tMSSqlInput_2 = null;
		        conn_tMSSqlInput_2 = (java.sql.Connection)globalMap.get("conn_tMSSqlConnection_1");
				
				if(conn_tMSSqlInput_2 != null) {
					if(conn_tMSSqlInput_2.getMetaData() != null) {
						
						log.debug("tMSSqlInput_2 - Uses an existing connection with username '" + conn_tMSSqlInput_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tMSSqlInput_2.getMetaData().getURL() + ".");
						
					}
				}
			
			String dbschema_tMSSqlInput_2 = (String)globalMap.get("dbschema_tMSSqlConnection_1");
		    
			java.sql.Statement stmt_tMSSqlInput_2 = conn_tMSSqlInput_2.createStatement();

		    String dbquery_tMSSqlInput_2 = "select bond_id, ISIN, (select Securities_IssuerName from Bond where bond_id=(a.bond_id+(SELECT CAST(RAND() * 249 AS INT) AS [RandomNumber]))%250 ) as Securities_IssuerName from Bond a;";
			
                log.debug("tMSSqlInput_2 - Executing the query: '"+dbquery_tMSSqlInput_2+"'.");
			

            	globalMap.put("tMSSqlInput_2_QUERY",dbquery_tMSSqlInput_2);
		    java.sql.ResultSet rs_tMSSqlInput_2 = null;

		    try {
		    	rs_tMSSqlInput_2 = stmt_tMSSqlInput_2.executeQuery(dbquery_tMSSqlInput_2);
		    	java.sql.ResultSetMetaData rsmd_tMSSqlInput_2 = rs_tMSSqlInput_2.getMetaData();
		    	int colQtyInRs_tMSSqlInput_2 = rsmd_tMSSqlInput_2.getColumnCount();

		    String tmpContent_tMSSqlInput_2 = null;
		    
		    
		    	log.debug("tMSSqlInput_2 - Retrieving records from the database.");
		    
		    while (rs_tMSSqlInput_2.next()) {
		        nb_line_tMSSqlInput_2++;
		        
							if(colQtyInRs_tMSSqlInput_2 < 1) {
								row2.Bond_Id = null;
							} else {
		                          
            if(rs_tMSSqlInput_2.getObject(1) != null) {
                row2.Bond_Id = rs_tMSSqlInput_2.getInt(1);
            } else {
                    row2.Bond_Id = null;
            }
		                    }
							if(colQtyInRs_tMSSqlInput_2 < 2) {
								row2.ISIN = null;
							} else {
	                         		
           		tmpContent_tMSSqlInput_2 = rs_tMSSqlInput_2.getString(2);
            if(tmpContent_tMSSqlInput_2 != null) {
            	if (talendToDBList_tMSSqlInput_2 .contains(rsmd_tMSSqlInput_2.getColumnTypeName(2).toUpperCase(java.util.Locale.ENGLISH))) {
            		row2.ISIN = FormatterUtils.formatUnwithE(tmpContent_tMSSqlInput_2);
            	} else {
                	row2.ISIN = tmpContent_tMSSqlInput_2;
                }
            } else {
                row2.ISIN = null;
            }
		                    }
							if(colQtyInRs_tMSSqlInput_2 < 3) {
								row2.Securities_IssuerName = null;
							} else {
	                         		
           		tmpContent_tMSSqlInput_2 = rs_tMSSqlInput_2.getString(3);
            if(tmpContent_tMSSqlInput_2 != null) {
            	if (talendToDBList_tMSSqlInput_2 .contains(rsmd_tMSSqlInput_2.getColumnTypeName(3).toUpperCase(java.util.Locale.ENGLISH))) {
            		row2.Securities_IssuerName = FormatterUtils.formatUnwithE(tmpContent_tMSSqlInput_2);
            	} else {
                	row2.Securities_IssuerName = tmpContent_tMSSqlInput_2;
                }
            } else {
                row2.Securities_IssuerName = null;
            }
		                    }
					
						log.debug("tMSSqlInput_2 - Retrieving the record " + nb_line_tMSSqlInput_2 + ".");
					





 



/**
 * [tMSSqlInput_2 begin ] stop
 */
	
	/**
	 * [tMSSqlInput_2 main ] start
	 */

	

	
	
	currentComponent="tMSSqlInput_2";

	

 


	tos_count_tMSSqlInput_2++;

/**
 * [tMSSqlInput_2 main ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

			//row2
			//row2


			
				if(execStat){
					runStat.updateStatOnConnection("row2"+iterateId,1, 1);
				} 
			

		
    			if(log.isTraceEnabled()){
    				log.trace("row2 - " + (row2==null? "": row2.toLogString()));
    			}
    		


			   
			   

					row2Struct row2_HashRow = new row2Struct();
		   	   	   
				
				row2_HashRow.Bond_Id = row2.Bond_Id;
				
				row2_HashRow.ISIN = row2.ISIN;
				
				row2_HashRow.Securities_IssuerName = row2.Securities_IssuerName;
				
			tHash_Lookup_row2.put(row2_HashRow);
			
            




 


	tos_count_tAdvancedHash_row2++;

/**
 * [tAdvancedHash_row2 main ] stop
 */



	
	/**
	 * [tMSSqlInput_2 end ] start
	 */

	

	
	
	currentComponent="tMSSqlInput_2";

	

	}
}finally{
	stmt_tMSSqlInput_2.close();

}
globalMap.put("tMSSqlInput_2_NB_LINE",nb_line_tMSSqlInput_2);
	    		log.debug("tMSSqlInput_2 - Retrieved records count: "+nb_line_tMSSqlInput_2 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMSSqlInput_2 - "  + ("Done.") );

ok_Hash.put("tMSSqlInput_2", true);
end_Hash.put("tMSSqlInput_2", System.currentTimeMillis());




/**
 * [tMSSqlInput_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

tHash_Lookup_row2.endPut();

			if(execStat){
				if(resourceMap.get("inIterateVComp") == null || !((Boolean)resourceMap.get("inIterateVComp"))){
			 		runStat.updateStatOnConnection("row2"+iterateId,2, 0); 
			 	}
			}
		
 

ok_Hash.put("tAdvancedHash_row2", true);
end_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());




/**
 * [tAdvancedHash_row2 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMSSqlInput_2 finally ] start
	 */

	

	
	
	currentComponent="tMSSqlInput_2";

	

 



/**
 * [tMSSqlInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMSSqlInput_2_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };



    private PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";

    public static void main(String[] args){
        final test_dynamic test_dynamicClass = new test_dynamic();

        int exitCode = test_dynamicClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'test_dynamic' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";

        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }

	        if(!"".equals(log4jLevel)){
				if("trace".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.OFF);
				}
				org.apache.log4j.Logger.getRootLogger().setLevel(log.getLevel());
    	    }
        	log.info("TalendJob: 'test_dynamic' - Start.");
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = test_dynamic.class.getClassLoader().getResourceAsStream("local_project/test_dynamic_0_1/contexts/"+contextStr+".properties");
            if(isDefaultContext && inContext ==null) {

            } else {
                if (inContext!=null) {
                    //defaultProps is in order to keep the original context value
                    defaultProps.load(inContext);
                    inContext.close();
                    context = new ContextProperties(defaultProps);
                }else{
                    //print info and job continue to run, for case: context_param is not empty.
                    System.err.println("Could not find the context " + contextStr);
                }
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
				    context.setContextType("DBConnection_ReferDb_AdditionalParams", "id_String");
				
                context.DBConnection_ReferDb_AdditionalParams=(String) context.getProperty("DBConnection_ReferDb_AdditionalParams");
				    context.setContextType("DBConnection_ReferDb_Database", "id_String");
				
                context.DBConnection_ReferDb_Database=(String) context.getProperty("DBConnection_ReferDb_Database");
				    context.setContextType("DBConnection_ReferDb_Login", "id_String");
				
                context.DBConnection_ReferDb_Login=(String) context.getProperty("DBConnection_ReferDb_Login");
				    context.setContextType("DBConnection_ReferDb_Password", "id_Password");
				
            		String pwd_DBConnection_ReferDb_Password_value = context.getProperty("DBConnection_ReferDb_Password");
            		context.DBConnection_ReferDb_Password = null;
            		if(pwd_DBConnection_ReferDb_Password_value!=null) {
            			if(context_param.containsKey("DBConnection_ReferDb_Password")) {//no need to decrypt if it come from program argument or parent job runtime
            				context.DBConnection_ReferDb_Password = pwd_DBConnection_ReferDb_Password_value;
            			} else if (!pwd_DBConnection_ReferDb_Password_value.isEmpty()) {
            				try {
            					context.DBConnection_ReferDb_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_DBConnection_ReferDb_Password_value);
            					context.put("DBConnection_ReferDb_Password",context.DBConnection_ReferDb_Password);
            				} catch (java.lang.RuntimeException e) {
            					//do nothing
            				}
            			}
            		}
				    context.setContextType("DBConnection_ReferDb_Port", "id_String");
				
                context.DBConnection_ReferDb_Port=(String) context.getProperty("DBConnection_ReferDb_Port");
				    context.setContextType("DBConnection_ReferDb_Schema", "id_String");
				
                context.DBConnection_ReferDb_Schema=(String) context.getProperty("DBConnection_ReferDb_Schema");
				    context.setContextType("DBConnection_ReferDb_Server", "id_String");
				
                context.DBConnection_ReferDb_Server=(String) context.getProperty("DBConnection_ReferDb_Server");
				    context.setContextType("bond_no", "id_Integer");
				
             try{
                 context.bond_no=routines.system.ParserUtils.parseTo_Integer (context.getProperty("bond_no"));
             }catch(NumberFormatException e){
                 context.bond_no=null;
              }
				    context.setContextType("row_no", "id_Integer");
				
             try{
                 context.row_no=routines.system.ParserUtils.parseTo_Integer (context.getProperty("row_no"));
             }catch(NumberFormatException e){
                 context.row_no=null;
              }
				    context.setContextType("user_no", "id_Integer");
				
             try{
                 context.user_no=routines.system.ParserUtils.parseTo_Integer (context.getProperty("user_no"));
             }catch(NumberFormatException e){
                 context.user_no=null;
              }
				    context.setContextType("Project_AdditionalParams", "id_String");
				
                context.Project_AdditionalParams=(String) context.getProperty("Project_AdditionalParams");
				    context.setContextType("Project_Login", "id_String");
				
                context.Project_Login=(String) context.getProperty("Project_Login");
				    context.setContextType("Project_Schema", "id_String");
				
                context.Project_Schema=(String) context.getProperty("Project_Schema");
				    context.setContextType("Project_Server", "id_String");
				
                context.Project_Server=(String) context.getProperty("Project_Server");
				    context.setContextType("Project_Port", "id_String");
				
                context.Project_Port=(String) context.getProperty("Project_Port");
				    context.setContextType("Project_Database", "id_String");
				
                context.Project_Database=(String) context.getProperty("Project_Database");
				    context.setContextType("Project_Password", "id_String");
				
                context.Project_Password=(String) context.getProperty("Project_Password");
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }


        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("DBConnection_ReferDb_AdditionalParams")) {
                context.DBConnection_ReferDb_AdditionalParams = (String) parentContextMap.get("DBConnection_ReferDb_AdditionalParams");
            }if (parentContextMap.containsKey("DBConnection_ReferDb_Database")) {
                context.DBConnection_ReferDb_Database = (String) parentContextMap.get("DBConnection_ReferDb_Database");
            }if (parentContextMap.containsKey("DBConnection_ReferDb_Login")) {
                context.DBConnection_ReferDb_Login = (String) parentContextMap.get("DBConnection_ReferDb_Login");
            }if (parentContextMap.containsKey("DBConnection_ReferDb_Password")) {
                context.DBConnection_ReferDb_Password = (java.lang.String) parentContextMap.get("DBConnection_ReferDb_Password");
            }if (parentContextMap.containsKey("DBConnection_ReferDb_Port")) {
                context.DBConnection_ReferDb_Port = (String) parentContextMap.get("DBConnection_ReferDb_Port");
            }if (parentContextMap.containsKey("DBConnection_ReferDb_Schema")) {
                context.DBConnection_ReferDb_Schema = (String) parentContextMap.get("DBConnection_ReferDb_Schema");
            }if (parentContextMap.containsKey("DBConnection_ReferDb_Server")) {
                context.DBConnection_ReferDb_Server = (String) parentContextMap.get("DBConnection_ReferDb_Server");
            }if (parentContextMap.containsKey("bond_no")) {
                context.bond_no = (Integer) parentContextMap.get("bond_no");
            }if (parentContextMap.containsKey("row_no")) {
                context.row_no = (Integer) parentContextMap.get("row_no");
            }if (parentContextMap.containsKey("user_no")) {
                context.user_no = (Integer) parentContextMap.get("user_no");
            }if (parentContextMap.containsKey("Project_AdditionalParams")) {
                context.Project_AdditionalParams = (String) parentContextMap.get("Project_AdditionalParams");
            }if (parentContextMap.containsKey("Project_Login")) {
                context.Project_Login = (String) parentContextMap.get("Project_Login");
            }if (parentContextMap.containsKey("Project_Schema")) {
                context.Project_Schema = (String) parentContextMap.get("Project_Schema");
            }if (parentContextMap.containsKey("Project_Server")) {
                context.Project_Server = (String) parentContextMap.get("Project_Server");
            }if (parentContextMap.containsKey("Project_Port")) {
                context.Project_Port = (String) parentContextMap.get("Project_Port");
            }if (parentContextMap.containsKey("Project_Database")) {
                context.Project_Database = (String) parentContextMap.get("Project_Database");
            }if (parentContextMap.containsKey("Project_Password")) {
                context.Project_Password = (String) parentContextMap.get("Project_Password");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("DBConnection_ReferDb_Password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();




this.globalResumeTicket = true;//to run tPreJob




this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tMSSqlConnection_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tMSSqlConnection_1) {
globalMap.put("tMSSqlConnection_1_SUBPROCESS_STATE", -1);

e_tMSSqlConnection_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : test_dynamic");
        }





if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;
    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tMSSqlConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tMSSqlConnection_1", globalMap.get("conn_tMSSqlConnection_1"));







        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        }else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		}

    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     163804 characters generated by Talend Data Integration 
 *     on the August 29, 2018 3:52:10 PM IST
 ************************************************************************************************/