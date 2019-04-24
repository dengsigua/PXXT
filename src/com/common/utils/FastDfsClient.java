package com.common.utils;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class FastDfsClient {
	private TrackerClient trackerClient = null;
	private TrackerServer trackerServer = null;
	private StorageServer storageServer = null;
	private StorageClient storageClient = null;
	
	public FastDfsClient(String conf) throws Exception{
		if(conf.contains("classpath:")){
			System.out.println("11111:"+conf);
			System.out.println("22222:"+this.getClass().getResource("/").getPath());
			conf = conf.replace("classpath:", this.getClass().getResource("/").getPath());
			System.out.println("33333:"+conf);
		}
		ClientGlobal.init(conf);
		trackerClient = new TrackerClient();
		trackerServer = trackerClient.getConnection();
		storageServer = null;
		storageClient = new StorageClient(trackerServer, storageServer);
	}
	
	public String[] uploadFile(String filename,String extName,NameValuePair[] metas) throws Exception{
		String[] result = storageClient.upload_appender_file(filename, extName, metas);
		return result;
	}
	public String[] uploadFile(String filename) throws Exception{
		String[] result = storageClient.upload_appender_file(filename, null, null);
		return result;
	}
	public String[] uploadFile(String filename,String extName) throws Exception{
		String[] result = storageClient.upload_appender_file(filename, extName, null);
		return result;
	}
	
	public String[] uploadFile(byte[] file,String extName) throws Exception{
		String[] result = storageClient.upload_appender_file(file, extName, null);
		return result;
	}
}
