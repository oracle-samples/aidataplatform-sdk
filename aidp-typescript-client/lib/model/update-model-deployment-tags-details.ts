// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details of the model deployment tags to update.
*/
export interface UpdateModelDeploymentTagsDetails {
    /**
    * ID of the deployment.
    */
    'deploymentId': string;
    /**
    * Model deployment tags to set.
    */
    'setTags'?: Array<model.ModelDeploymentTag>;
    /**
    * Model deployment tags to delete.
    */
    'deleteTags'?: Array<model.ModelDeploymentTagKey>;

}

export namespace UpdateModelDeploymentTagsDetails {




    export function getJsonObj(obj: UpdateModelDeploymentTagsDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,

                'set_tags': obj.setTags ?
                
                obj.setTags.map((item)=>{return model.ModelDeploymentTag.getJsonObj(item)})
                
                 : undefined,
                'delete_tags': obj.deleteTags ?
                
                obj.deleteTags.map((item)=>{return model.ModelDeploymentTagKey.getJsonObj(item)})
                
                 : undefined,
        }};

        delete (jsonObj as Partial<UpdateModelDeploymentTagsDetails>).deploymentId;delete (jsonObj as Partial<UpdateModelDeploymentTagsDetails>).setTags;delete (jsonObj as Partial<UpdateModelDeploymentTagsDetails>).deleteTags;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateModelDeploymentTagsDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],

                    'setTags': (obj as any)["set_tags"] ?
                
                (obj as any)["set_tags"].map((item: any)=>{return model.ModelDeploymentTag.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'deleteTags': (obj as any)["delete_tags"] ?
                
                (obj as any)["delete_tags"].map((item: any)=>{return model.ModelDeploymentTagKey.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        delete (jsonObj as any)["deployment_id"];delete (jsonObj as any)["set_tags"];delete (jsonObj as any)["delete_tags"];
        
        return jsonObj;
    }
}
