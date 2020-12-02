package com.humble.annotation.util;

import java.io.File;

/**
 * @author wenlong wang
 * @date 2020/12/2 17:06
 */
public interface Constants {
    String SERVICE_PKG_NAME = "com.humble.router.service";
    String SERVICE_LOADER_INIT = "com.humble.router.remote.init.ServiceLoaderInit";
    String INIT_METHOD = "init";
    String INIT_SERVICE_DIR = SERVICE_PKG_NAME.replace('.', File.separatorChar);
    String INIT_SERVICE_PATH = SERVICE_PKG_NAME.replace('.', '/');
}
