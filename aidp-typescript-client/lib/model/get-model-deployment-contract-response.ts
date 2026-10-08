// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Model contract for the query-endpoint playground: input/output signatures and a sample request.
*/
export interface GetModelDeploymentContractResponse {
    /**
    * Model input signature (contract), captured at activation; null if the model has no signature.
    */
    'inputContract'?: string;
    /**
    * Model output signature (contract), captured at activation; null if the model has no signature.
    */
    'outputContract'?: string;
    /**
    * Sample request payload (input example), captured at activation; null if the model has no example.
    */
    'inputExample'?: string;

}

export namespace GetModelDeploymentContractResponse {




    export function getJsonObj(obj: GetModelDeploymentContractResponse): object {
        const jsonObj = {...obj, ...{
            
                'input_contract': obj.inputContract,

                'output_contract': obj.outputContract,

                'input_example': obj.inputExample,

        }};

        delete (jsonObj as Partial<GetModelDeploymentContractResponse>).inputContract;delete (jsonObj as Partial<GetModelDeploymentContractResponse>).outputContract;delete (jsonObj as Partial<GetModelDeploymentContractResponse>).inputExample;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GetModelDeploymentContractResponse): object {
        const jsonObj = {...obj, ...{
            
                'inputContract': (obj as any)["input_contract"],

                'outputContract': (obj as any)["output_contract"],

                'inputExample': (obj as any)["input_example"],

         }};

        delete (jsonObj as any)["input_contract"];delete (jsonObj as any)["output_contract"];delete (jsonObj as any)["input_example"];
        
        return jsonObj;
    }
}
