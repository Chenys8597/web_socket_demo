package com.zr.web_socket_demo.config;

import com.zr.tools.basic.config.Properties;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "message")
public class Messages implements Properties {
	
	private Integer expiresIn;
	
	private Integer serverId;
	
	private String cliPrefix;
	
	private String cliCounterPrefix;
	
	private Integer failCount;
	
	private String charset;
	
	private Integer encodedIterations;
	
	private String algorithm;
	
	private String version;
	
	private String staffPrefix;
	
	private String staffCounterPrefix;
	
	private String staffTokenPrefix;
	
	private String staffMenuPrefix;
	
	private String staffLinkPrefix;
	
	private String mobLinkPrefix;
	
	private String linkPrefix;
	
	private String linkTokenPrefix;
	
	private String logName;
	
	private String commons;
	
	private String logClient;

	private String jgAddress;

	private String domain;
	
	private String ice;
	
	private String sessionPrefix;
	
	private String organPrefix;
	
	private String mobMenuPrefix;
	
	private String clientPrefix;
	
	private String idRoleOrgansPrefix;
	
	private String idClientOrgansPrefix;
	
	private Integer connectTimeout;
	
	private Integer requestTimeout;
	
	private Integer connPool;
	
	private Integer defaultMaxRoute;	
	
	public String getMobMenuPrefix() {
		return mobMenuPrefix;
	}

	public void setMobMenuPrefix(String mobMenuPrefix) {
		this.mobMenuPrefix = mobMenuPrefix;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	public String getCliPrefix() {
		return cliPrefix;
	}

	public void setCliPrefix(String cliPrefix) {
		this.cliPrefix = cliPrefix;
	}

	public String getCliCounterPrefix() {
		return cliCounterPrefix;
	}

	public void setCliCounterPrefix(String cliCounterPrefix) {
		this.cliCounterPrefix = cliCounterPrefix;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getJgAddress() {
		return jgAddress;
	}

	public void setJgAddress(String jgAddress) {
		this.jgAddress = jgAddress;
	}

	public Integer getEncodedIterations() {
		return encodedIterations;
	}

	public void setEncodedIterations(Integer encodedIterations) {
		this.encodedIterations = encodedIterations;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStaffPrefix() {
		return staffPrefix;
	}

	public void setStaffPrefix(String staffPrefix) {
		this.staffPrefix = staffPrefix;
	}

	public String getStaffCounterPrefix() {
		return staffCounterPrefix;
	}

	public void setStaffCounterPrefix(String staffCounterPrefix) {
		this.staffCounterPrefix = staffCounterPrefix;
	}

	public String getStaffTokenPrefix() {
		return staffTokenPrefix;
	}

	public void setStaffTokenPrefix(String staffTokenPrefix) {
		this.staffTokenPrefix = staffTokenPrefix;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public void setCommons(String commons) {
		this.commons = commons;
	}

	public void setLogClient(String logClient) {
		this.logClient = logClient;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLogName() {
		return logName;
	}

	public String getCommons() {
		return commons;
	}

	public String getLogClient() {
		return logClient;
	}

	public String getDomain() {
		return domain;
	}

	public Integer getFailCount() {
		return failCount;
	}

	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getLinkPrefix() {
		return linkPrefix;
	}

	public void setLinkPrefix(String linkPrefix) {
		this.linkPrefix = linkPrefix;
	}

	public String getStaffMenuPrefix() {
		return staffMenuPrefix;
	}

	public void setStaffMenuPrefix(String staffMenuPrefix) {
		this.staffMenuPrefix = staffMenuPrefix;
	}

	public String getLinkTokenPrefix() {
		return linkTokenPrefix;
	}

	public void setLinkTokenPrefix(String linkTokenPrefix) {
		this.linkTokenPrefix = linkTokenPrefix;
	}

	public String getSessionPrefix() {
		return sessionPrefix;
	}

	public void setSessionPrefix(String sessionPrefix) {
		this.sessionPrefix = sessionPrefix;
	}

	public String getStaffLinkPrefix() {
		return staffLinkPrefix;
	}

	public void setStaffLinkPrefix(String staffLinkPrefix) {
		this.staffLinkPrefix = staffLinkPrefix;
	}

	public String getOrganPrefix() {
		return organPrefix;
	}

	public void setOrganPrefix(String organPrefix) {
		this.organPrefix = organPrefix;
	}
	
	public String getMobLinkPrefix() {
		return mobLinkPrefix;
	}

	public void setMobLinkPrefix(String mobLinkPrefix) {
		this.mobLinkPrefix = mobLinkPrefix;
	}

	public String getClientPrefix() {
		return clientPrefix;
	}

	public void setClientPrefix(String clientPrefix) {
		this.clientPrefix = clientPrefix;
	}

	public String getIdRoleOrgansPrefix() {
		return idRoleOrgansPrefix;
	}

	public void setIdRoleOrgansPrefix(String idRoleOrgansPrefix) {
		this.idRoleOrgansPrefix = idRoleOrgansPrefix;
	}

	public String getIdClientOrgansPrefix() {
		return idClientOrgansPrefix;
	}

	public void setIdClientOrgansPrefix(String idClientOrgansPrefix) {
		this.idClientOrgansPrefix = idClientOrgansPrefix;
	}

	public Integer getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public Integer getRequestTimeout() {
		return requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	public Integer getConnPool() {
		return connPool;
	}

	public void setConnPool(Integer connPool) {
		this.connPool = connPool;
	}

	public Integer getDefaultMaxRoute() {
		return defaultMaxRoute;
	}

	public void setDefaultMaxRoute(Integer defaultMaxRoute) {
		this.defaultMaxRoute = defaultMaxRoute;
	}
}
