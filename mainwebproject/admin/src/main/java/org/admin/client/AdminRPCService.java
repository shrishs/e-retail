package org.admin.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("admin")
public interface AdminRPCService extends RemoteService {
  boolean isLogin(String userName,String password) throws IllegalArgumentException;
  boolean addCategory(String categoryName,String description,boolean isParentCategory) throws IllegalArgumentException;
}
