// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The response object for validating the agent JSON.
*/
export interface ValidateAgentResponse {
    /**
    * true if valid, else false
    */
    'isValidAgent': boolean;
    /**
    * List of validation errors encountered in the diagram.
    */
    'validationError'?: Array<model.ValidationError>;

}

export namespace ValidateAgentResponse {



    export function getJsonObj(obj: ValidateAgentResponse): object {
        const jsonObj = {...obj, ...{
            

                'validationError': obj.validationError ?
                
                obj.validationError.map((item)=>{return model.ValidationError.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ValidateAgentResponse): object {
        const jsonObj = {...obj, ...{
            

                    'validationError': obj.validationError ?
                
                obj.validationError.map((item)=>{return model.ValidationError.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
