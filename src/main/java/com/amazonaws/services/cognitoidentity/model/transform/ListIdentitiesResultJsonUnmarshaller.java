/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidentity.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * List Identities Result JSON Unmarshaller
 */
public class ListIdentitiesResultJsonUnmarshaller implements Unmarshaller<ListIdentitiesResult, JsonUnmarshallerContext> {

    public ListIdentitiesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListIdentitiesResult listIdentitiesResult = new ListIdentitiesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("IdentityPoolId")) {
                listIdentitiesResult.setIdentityPoolId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("Identities")) {
                listIdentitiesResult.setIdentities(new ListUnmarshaller<IdentityDescription>(IdentityDescriptionJsonUnmarshaller.getInstance()).unmarshall(context));
            } else 
            if (name.equals("NextToken")) {
                listIdentitiesResult.setNextToken(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return listIdentitiesResult;
    }

    private static ListIdentitiesResultJsonUnmarshaller instance;
    public static ListIdentitiesResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ListIdentitiesResultJsonUnmarshaller();
        return instance;
    }
}
    