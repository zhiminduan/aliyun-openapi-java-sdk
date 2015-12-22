/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ChangeJobPriorityRequest;
import com.aliyuncs.exceptions.ClientException;

import java.security.NoSuchAlgorithmException;


public class ChangeJobPriorityRequestMarshaller {

	public static ChangeJobPriorityRequest marshall(ChangeJobPriorityRequest req) {

		String contentString = "";
		if(req._useInteger){
			contentString = "{\"Priority\":"+req.getPriority()+"}";
		}else{
			contentString = "{\"Priority\":\""+req.getPriority()+"\"}";
		}
		try {
			req.setContent(contentString.getBytes(), req.getEncoding(), req.getAcceptFormat());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return req;
	}
}