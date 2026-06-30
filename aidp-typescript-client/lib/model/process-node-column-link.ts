// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A source-to-target column link that flows through a process node.
*/
export interface ProcessNodeColumnLink {
    'sourceColumn': model.ProcessNodeColumnDetails;
    'targetColumn': model.ProcessNodeColumnDetails;
    /**
    * Transformation type connecting the source column to the target column.
* 
    */
    'transformation': string;

}

export namespace ProcessNodeColumnLink {




    export function getJsonObj(obj: ProcessNodeColumnLink): object {
        const jsonObj = {...obj, ...{
            
                'sourceColumn': obj.sourceColumn ?
                
                
                model.ProcessNodeColumnDetails.getJsonObj(obj.sourceColumn) : undefined,
                'targetColumn': obj.targetColumn ?
                
                
                model.ProcessNodeColumnDetails.getJsonObj(obj.targetColumn) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ProcessNodeColumnLink): object {
        const jsonObj = {...obj, ...{
            
                    'sourceColumn': obj.sourceColumn ?
                
                
                model.ProcessNodeColumnDetails.getDeserializedJsonObj(obj.sourceColumn) : undefined,
                    'targetColumn': obj.targetColumn ?
                
                
                model.ProcessNodeColumnDetails.getDeserializedJsonObj(obj.targetColumn) : undefined,

         }};

        
        
        return jsonObj;
    }
}
